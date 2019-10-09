//Class definition
var Datatable = function(){
	
	var jsonArray;
	
	var subTable = function(e){
		
		var status,statusColor;
		var type,typeColor
		var efficacy,efficacyColor;
		
		switch (e.data.type) {
		  case 0:
			  type = "Danger";
			  typeColor = "danger";
			break;
		  case 1:
			  type = "Warning";
			  typeColor = "warning"; 
		    break;
		  case 2:
			  type = "Renforce";
			  typeColor = "brand";
		    break;
		  case 3:
			  type = "Success";
			  typeColor = "success";
		    break;
		   default:
			   type = " - ";
		   	   typeColor = "dark"
		    break;
		}
		
		switch (e.data.efficacy) {
		  case 0:
			  efficacy = "Negative";
			  efficacyColor = "danger";
			break;
		  case 1:
			  efficacy = "Neutral";
			  efficacyColor = "brand"; 
		    break;
		  case 2:
			  efficacy = "Positive";
			  efficacyColor = "success";
		    break;
		  default:
			  efficacy = " - ";
		  	  efficacyColor = "dark"
		    break;
		}
		
		if(e.data.status == 0){
			  status = "Not Sent";
			  statusColor = "danger";
		 }
		 else{
			  status = "Sent";
			  statusColor = "success";
		 }
		
		if(e.data.type >= 0 && e.data.type <= 3){
		
			$(e.subTable).html(
					"<table class='table' style='width: 30%; text-align: center'>" +
						"<tr>" +
							"<th colspan=2 style='text-align:center'>Feedback Details</td>" +
						"</tr>" +
						"<tr>" +
							"<td>Type</td>" +
							"<td><span class='kt-badge kt-badge--"+typeColor+" kt-badge--inline kt-badge--pill'>"+type+"</span></td>" +
						"</tr>" +
						"<tr>" +
							"<td>Status</td>" +
							"<td><span class='kt-badge kt-badge--"+statusColor+" kt-badge--inline kt-badge--pill'>"+status+"</span></td>" +
						"</tr>" +
						"<tr>" +
							"<td>Feedback Efficacy</td>" +
							"<td><span class='kt-badge kt-badge--"+efficacyColor+" kt-badge--inline kt-badge--pill'>"+efficacy+"</span></td>" +
						"</tr>" +
					"</table>");
		}
	}
	
	var createJson = function(eng, mot, startDate, dates, n_samples,courseLife,feedback){
	
		var i;
		
		var toJson = '['; 
		
		for(i = 0; i < n_samples; i++){
			var x = '{ '+
						'"id":'+(i+1)+','+
						'"weekOfMeasure":'+(i+1)+','+
						'"start":"'+(i == 0 ? startDate : dates[i-1])+'",'+
						'"end":"'+dates[i]+'",'+
						'"motivation":'+Number(mot[i]).toFixed(2)+','+
						'"engagement":'+Number(eng[i]).toFixed(2)+','+
						'"type":'+feedback[i].type+','+
						'"status":'+feedback[i].status+','+
						'"efficacy":'+feedback[i].efficacy+''+
						'}'+(i != (courseLife-1) ? "," : "")+'';
			toJson+=x;
			
		}
		
		if(n_samples < courseLife){
			var x = '{ '+
				'"id":'+(n_samples+1)+','+
				'"weekOfMeasure":'+(n_samples+1)+','+
				'"start":"'+(i== 0 ? startDate : dates[n_samples-1])+'",'+
				'"end": "-",'+
				'"motivation": 0 ,'+
				'"engagement": 0 ,'+
				'"type": -1 ,'+
				'"status": 0 ,'+
				'"efficacy": -1'+
				'}';
			
			toJson+=x;
		}
		
		toJson+= ']';	
		
		return JSON.parse(toJson);
	
	}
	
	var fill_datatable = function(eng, mot, startDate, dates, n_samples,courseLife,feedback){
		
		jsonArray = createJson(eng, mot, startDate, dates, n_samples,courseLife,feedback);
		
		var datatable = $('#feedbackDatatable').KTDatatable({
			// datasource definition
			data: {
				type: 'local',
				source: jsonArray,
				pageSize: 5, // display 20 records per page
			},

			// layout definition
			layout: {
				scroll: false,
				height: null,
				footer: false,
				
				icons: {
					rowDetail: {
						  expand: 'fa fa-caret-down',
						  collapse: 'fa fa-caret-right pulse'
						}
				}
				
			},

			sortable: false,

			filterable: false,

			pagination: false,

			detail: {
				title: 'Load sub table',
				content: subTable,
			},
			
			rows:{
				
				afterTemplate: function (row, content, index) {
					
					row.find("#measure"+(index+1)).click(function(){
						//GET NEW MEASUREMENTS
						executeMap(index);
						
	
					});
					
					row.find("#view"+(index+1)).click(function(){
						fillMap(index+1, (index == 0 ? startDate : dates[index-1]), dates[index]);
						getWeekMeasure((index+1), 1);
					});
					
					
					row.find("#send"+(index+1)).click(function() {
						var endDate= content.end;
						
				   		//Get URL
				   		$.urlParam = function(name){
				   			var results = new RegExp('[\?&]' + name + '=([^&#]*)').exec(window.location.href);
				   			return results[1] || 0;
				   		}
				   		$.ajax({
							type : "GET",
							url : "/feedbackChoice",
							data : "courseId="+$.urlParam('courseId')+"&userId="+$.urlParam('userId')+"&weekNumber="+(index+1)+"&mot=" + mot[index] + "&eng=" + eng[index],
							contentType : "application/json; charset=utf-8",
							dataType : "json",
							success : function(data) {

								var ACTION_PARAM='';
								var FEEDBACK_PARAM='';
								var FEEDBACK_DESC='';
								var currentMeasures= data['currentMeasures'];
								var keys= Object.keys(data)
								$('.kt-wizard-v2__nav-items').empty();
								$('#feedback_prediction_container').empty();
								
								for(i=0; i<data.numActions; i++){
									$('.kt-wizard-v2__nav-items').append(
											"<a class='kt-wizard-v2__nav-item' id='el-"+i+"' href='#'>" +
											"	<div class='kt-wizard-v2__nav-body'>" +
											"		<div class='kt-wizard-v2__nav-icon'>" +
											"			<i class='flaticon-globe'></i>" +
											"		</div>" +
											"		<div class='kt-wizard-v2__nav-label'>" +
											"			<div class='kt-wizard-v2__nav-label-title'>"+keys[i]+"</div>" +
											"			<div class='kt-wizard-v2__nav-label-desc'>"+data[keys[i]][i].actionDescription+"</div>" +
											"			<input class='input_actionId' type='hidden' value='"+data[keys[i]][i].actionGroupId+"'/> "+
											"		</div>" +
											"	</div>" +
											"</a>");
								}
								

						    	//HANDLE ACTONS LIST
								$('.kt-wizard-v2__nav-item').on('click', function(){
									$(this).attr("data-ktwizard-state", "current");
									var el_id= $(this).attr('id');
									$(".kt-wizard-v2__nav-item:not(#"+el_id+")").each(function(){
										$(this).attr("data-ktwizard-state", "pending");
									});
									var label_name= $(this).find('.kt-wizard-v2__nav-label-title').html();
									var actionId= $(this).find('.input_actionId').attr('value');
									
									ACTION_PARAM = "&actionId="+actionId;
									
									var actions= data[label_name];
									$('#actions-container').empty();
									for(i=0; i<actions.length; i++){
										$('#actions-container').append(
												"<a class='kt-notification-v2__item kt-feedback__item' id='act-el-"+i+"' href='javascript:;'>" +
												"	<div class='kt-notification-v2__item-icon'>" +
												"		<i class='flaticon2-box kt-font-danger'></i>" +
												"	</div>" +
												"	<div class='kt-notification-v2__itek-wrapper'>" +
												"		<div class='kt-notification-v2__item-title'>"+actions[i].action+"</div>" +
												"		<div class='kt-notification-v2__item-desc'>"+actions[i].description+"</div>" +
												"	</div>" +
												"</a>")
				                       
									}
									
									//PREVIEW PAGE
									$('#action_input').attr('placeholder', label_name);
									
									//SET BEHAVIOR TO FEEDBACK ANCHORS
									$('.kt-feedback__item').click(function(){
										$(this).css("background-color", "#F4F6F9");
										var label_name= $(this).find('.kt-notification-v2__item-title').html();
										var label_desc= $(this).find('.kt-notification-v2__item-desc').html();
										FEEDBACK_PARAM = "&feedback="+label_name;
										FEEDBACK_DESC = "&description="+label_desc;
										$('#feedback_input').attr('placeholder', label_name);
									})
									
									$('.kt-feedback__item').blur(function(){
										$(this).css("background-color", "#ffffff");
									})
									
									
									$.ajax({
										type: "GET",
										url : "/feedbackPrediction",
										data : "actionId="+actions[0].actionGroupId,
								        contentType: "application/json; charset=utf-8",
										dataType: "json",
										success: function(data){
											const c7= "Forum Activities";
											const c16= "Assignment";
											const c17= "Interaction";
											
											var improvements = data['improvements']; 
											$('#feedback_prediction_container').empty();
											$('#prediction_content').empty();
											for(i=0; i<improvements.length; i++){
												var perc_improvement= improvements[i].improvement*100;
												var perc_currentMeasure= 0;
												if(improvements[i].concept == 'Forum Activities')
													perc_currentMeasure= currentMeasures['c7']*100
												if(improvements[i].concept == 'Assignment')
													perc_currentMeasure= currentMeasures['c16']*100
												if(improvements[i].concept == 'Interaction')
													perc_currentMeasure= currentMeasures['c17']*100
												//FIRST PAGE
												$('#feedback_prediction_container').append(
														"<div class='kt-notification-v2__item'>" +
														"	<div class='kt-notification-v2__itek-wrapper' style='width:70%'>" +
														"		<div class='kt-notification-v2__item-title'>"+improvements[i].concept+"</div>"+
														"		<div class='kt-notification-v2__item-desc'>" +improvements[i].description+"</div>"+
														"	</div>" +
														"	<div class='progress' style='height: 25px; width:200px'>" +
														"		<div class='progress-bar' role='progressbar' style='width:"+perc_currentMeasure+"%; height: 25px; vertical-align: middle;' aria-valuenow='"+perc_currentMeasure+"' aria-valuemin='0' aria-valuemax='100'><h6 style='margin:0'>"+((perc_currentMeasure/100) >= 0.1 ? (perc_currentMeasure/100) : '')+"</h6></div>" +
														"		<div class='progress-bar' role='progressbar' style='width:"+(perc_currentMeasure < 80 ? perc_improvement : (100-perc_currentMeasure))+"%; height: 25px; vertical-align: middle; background-color:green;' aria-valuenow='"+(perc_currentMeasure < 80 ? perc_improvement : (100-perc_currentMeasure))+"' aria-valuemin='0' aria-valuemax='100'><h6 style='margin:0; background-color: green'>"+(perc_currentMeasure < 80 ? perc_improvement/100 : (100-perc_currentMeasure)/100)+"</h6></div>" +
														"	</div>" +
														"	<i class='flaticon2-arrow-up' style='margin:1%; color:green;'> </i>" +
														"</div>")
											    //REVIEW PAGE
												$('#prediction_content').append(
														"<div class='kt-notification-v2__item'>" +
														"	<div class='kt-notification-v2__itek-wrapper' style='width:70%'>" +
														"		<div class='kt-notification-v2__item-title'>"+improvements[i].concept+"</div>"+
														"		<div class='kt-notification-v2__item-desc'>" +improvements[i].description+"</div>"+
														"	</div>" +
														"	<div class='progress' style='height: 25px; width:200px'>" +
														"		<div class='progress-bar' role='progressbar' style='width:"+perc_currentMeasure+"%; height: 25px; vertical-align: middle;' aria-valuenow='"+perc_currentMeasure+"' aria-valuemin='0' aria-valuemax='100'><h6 style='margin:0'>"+((perc_currentMeasure/100) >= 0.1 ? (perc_currentMeasure/100) : '')+"</h6></div>" +
														"		<div class='progress-bar' role='progressbar' style='width:"+(perc_currentMeasure < 80 ? perc_improvement : (100-perc_currentMeasure))+"%; height: 25px; vertical-align: middle; background-color:green;' aria-valuenow='"+(perc_currentMeasure < 80 ? perc_improvement : (100-perc_currentMeasure))+"' aria-valuemin='0' aria-valuemax='100'><h6 style='margin:0; background-color: green'>"+(perc_currentMeasure < 80 ? perc_improvement/100 : (100-perc_currentMeasure)/100)+"</h6></div>" +
														"	</div>" +
														"	<i class='flaticon2-arrow-up' style='margin:1%; color:green;'> </i>" +
														"</div>")
											
											}
											
			
										},
										
										error: function(err){
											console.log(err)
										}
									});
									
								});
								
								$.urlParam = function(name){
						   			var results = new RegExp('[\?&]' + name + '=([^&#]*)').exec(window.location.href);
						   			return results[1] || 0;
						   		}

							 
							    // bind to the form's submit event 
							    $('.btn-success[data-ktwizard-type=action-submit]').click(function() { 
							    	
							    	if($('#action_input').attr('placeholder') != "" && $('#feedback_input').attr('placeholder') != ""){
							    		$.ajax({
							    			type: "GET",
							    			url: "/sendFeedback",
							    			data : "courseId="+$.urlParam('courseId')+"&userId="+$.urlParam('userId')+ACTION_PARAM+FEEDBACK_DESC+"&date="+endDate,
							    	        contentType: "application/json; charset=utf-8",
							    			dataType: "json",
							    			success: function(data){
							    				console.log("ajaxFeedback",data);
							    				location.reload();
							    			},
							    			error: function(err){
							    				console.log("error",err)
							    			}
							    		}); 
							    	}
							    }); 
								
							},
							error : function(err) {
								console.log(err)
							}
						})
					});

					
					
				}
			},

			// columns definition
			columns: [
				{
					field: 'id',
					title: 'Feedback Details',
					textAlign: "center",
				}, {
					field: 'weekOfMeasure',
					title: 'WeekOfMeasure',
					textAlign: "center",
				},{
					field: 'start',
					title: 'Start',
					textAlign: "center",
				}, {
					field: 'end',
					title: 'End',
					textAlign: "center",
				}, {
					field: 'motivation',
					title: 'Motivation',
					textAlign: "center",
				}, {
					field: 'engagement',
					title: 'Engagement',
					textAlign: "center",
				},{
					field: 'Actions',
					width: 130,
					title: 'Actions',
					sortable: false,
					overflow: 'visible',
					template: function(row) {
						
						var i = row.weekOfMeasure-1;
						  
						var feedStatus;
						  
						if(i>0)
							feedStatus = feedback[i-1].status;
						  
						else
							feedStatus = 1;
						
						var components = "<a id='measure"+(i+1)+"' class='dropdown-item "+(feedStatus == 0  ? 'disabled' : "")+"' href='#feedbackDatatable'><i class='flaticon-cogwheel-2'></i> Get Measure</a>";
						
						if(row.end != '-'){
							
							components = "";
							//adding the sending part
							components += "<a id='send"+(i+1)+"'class='dropdown-item "+(feedback[i].status == 1 ? 'disabled' : "")+"' data-toggle='modal' href='#kt_modal_4'><i class='flaticon-paper-plane-1'></i> Send Feedback</a>";
	                        //adding the viewing part
							components += "<a id='view"+(i+1)+"' class='dropdown-item' href='#fcm-header'><i class='flaticon-earth-globe'></i> See on Map</a>";
						}
						  
						  
						return  "<div class='dropdown'>"+
	                      "<a href='javascript:;' class='btn btn-sm btn-clean btn-icon btn-icon-md' data-toggle='dropdown'>"+
	                          "<i class='la la-ellipsis-h'></i>"+
	                      "</a>"+
	                      "<div class='dropdown-menu dropdown-menu-right'>"+components+
	                      "</div>";
					},
				}],
		});
	}
	
	
	return {
		// public functions
		  init: function(data) {
			   if(data != 'undefined'){
				   var eng_data = [];
				   var mot_data = [];
				   var dates = [];
				   var feedback = [];
				   var n_samples= data[0].length;
				   var courseLife = data[1];
				   var startDate = data[2];
			 	   for(var i=0; i<n_samples; i++){
					    dates[i]= data[0][i].date;
					    eng_data[i] = data[0][i].c2;
					    mot_data[i] = data[0][i].c3;
					    feedback[i] = data[3][i];
				   }
				   fill_datatable(eng_data, mot_data, startDate, dates, n_samples,courseLife,feedback);
			   } 
		  }
	};
}();


jQuery(document).ready(function() {
	//Get URL
	$.urlParam = function(name){
		var results = new RegExp('[\?&]' + name + '=([^&#]*)').exec(window.location.href);
		return results[1] || 0;
	}
	
	$("#kt-subheader-user-info").html(""+$.urlParam('name')+" "+$.urlParam('surname')+", "+$.urlParam('userId'));
	
	$.ajax({
		type: "GET",
		url : "/fetchStudentRecords",
		data : "courseId="+$.urlParam('courseId')+"&userId="+$.urlParam('userId'),
        contentType: "application/json; charset=utf-8",
		dataType: "json",
		success: function(data){
			//Datatable
			Datatable.init(data);
			
		},
		error: function(err){
			console.log(err)
		}
	});
	
	
});