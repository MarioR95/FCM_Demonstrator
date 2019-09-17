//Class definition
var Datatable = function(){
	
	var URL="";
	var PATH_REQUEST= "sendFeedback";
	var ACTION_PARAM= "";
	var FEEDBACK_PARAM= "?feedback=";
	var SEPARATOR = "?";
	
	var fill_datatable= function(eng, mot, startDate, dates, n_samples,courseLife,feedback){
		
		/*Feedback association number
		 * Status:
		 * 0 - Not Sent
		 * 1 - Sent
		 * 
		 * Type:
		 *-1 - NA
		 * 0 - Danger
		 * 1 - Warning
		 * 2 - Renforce
		 * 3 - Success*/
		
		  var i;
		  
		  for( i=0; i<n_samples; i++){
			  
			  var type;
			  var status;
			  var statusColor;
			  var tmp_eng= eng[i]
			  var tmp_mot= mot[i]
			  
			  switch (feedback[i].type) {
				  case 0:
					  type = "Danger";
					break;
				  case 1:
					  type = "Warning";
				    break;
				  case 2:
					  type = "Renforce";
				    break;
				  case 3:
					  type = "Success";
				    break;
				   default:
					   type = "NA";
				    break;
				}
			  
			  if(feedback[i].status == 0){
				  status = "Not Sent";
				  statusColor = "warning";
			  }
			  else{
				  status = "Sent";
				  statusColor = "success";
			  }
			  
		   $(".tbody-dark").append(
			   "<tr>"+
			        " <th scope='row'>"+(i+1)+"</th>"+
			        " <td>"+(i== 0 ? startDate : dates[i-1])+"</td>"+
			        " <td>"+dates[i]+"</td>"+
			        " <td>"+Number(mot[i]).toFixed(2)+"</td>"+
			        " <td>"+Number(eng[i]).toFixed(2)+"</td>"+
			        " <td>"+type+"</td>"+
			        " <td class='kt-font-"+statusColor+"'>"+status+"</td>"+
			        " <td>"+
			      "    <div class='dropdown dropright'>"+
			         "         <button type='button' class='btn btn-hover-info btn-elevate-hover btn-icon btn-sm btn-icon-md' data-toggle='dropdown' aria-haspopup='true' aria-expanded='false'>"+
			         "             <i class='flaticon-more-1'></i>"+
			         "          </button>"+
			         "          <div class='dropdown-menu dropdown-menu-left' x-placement='top-start' style='position: absolute; will-change: transform; top: 0px; left: 0px; transform: translate3d(-149px, 33px, 0px);'>"+
			         "             <a class='dropdown-item disabled' href='#tbody-measures'><i class='flaticon-cogwheel-2'></i> Compute Feedback</a>"+
			         "             <a id='send_fdbk_btn' class='dropdown-item "+(feedback[i].status == 1 ? 'disabled' : "")+"' data-toggle='modal' href='#kt_modal_4'><i class='flaticon-paper-plane-1'></i> Send Feedback</a>"+
			         "             <a class='dropdown-item' href='#fcm-header' onclick='fillMap("+(i+1)+",\""+(i == 0 ? startDate : dates[i-1])+"\",\""+dates[i]+"\"); getWeekMeasure("+(i+1)+", 1)'><i class='flaticon-earth-globe'></i> See on Map</a>"+
			         "          </div>"+
			         "  </div>"+
			      " </td>"+
			   "</tr>");
		   
		   
		   
		   	$("#send_fdbk_btn").click(function() {
		   		//Get URL
		   		$.urlParam = function(name){
		   			var results = new RegExp('[\?&]' + name + '=([^&#]*)').exec(window.location.href);
		   			return results[1] || 0;
		   		}
		   		$.ajax({
					type : "GET",
					url : "/feedbackChoice",
					data : "courseId="+$.urlParam('courseId')+"&userId="+$.urlParam('userId')+"&weekNumber="+i+"&mot=" + tmp_mot + "&eng=" + tmp_eng,
					contentType : "application/json; charset=utf-8",
					dataType : "json",
					success : function(data) {
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
							
							ACTION_PARAM = "?actionType="+label_name;
							
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
								FEEDBACK_PARAM = "?feedback="+label_name;
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
												"		<div class='progress-bar' role='progressbar' style='width:"+perc_currentMeasure+"%; height: 25px; vertical-align: middle;' aria-valuenow='"+perc_currentMeasure+"' aria-valuemin='0' aria-valuemax='100'><h6 style='margin:0'>"+(perc_currentMeasure/100)+"</h6></div>" +
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
												"		<div class='progress-bar' role='progressbar' style='width:"+perc_currentMeasure+"%; height: 25px; vertical-align: middle;' aria-valuenow='"+perc_currentMeasure+"' aria-valuemin='0' aria-valuemax='100'><h6 style='margin:0'>"+(perc_currentMeasure/100)+"</h6></div>" +
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
						
					},
					error : function(err) {
						console.log(err)
					}
				})
			})

		  }
		  
		  if(i<courseLife){
			  
			  var func = "executeMap("+(i+1)+")";
			  
			  var feedStatus;
			  
			  if(i>0)
				  feedStatus = feedback[i-1].status;
			  
			  else
				  feedStatus = 1;
			  
			  			  
		   $(".tbody-dark").append(
		     "<tr>"+
		          " <th scope='row'>"+(i+1)+"</th>"+
		          " <td>"+(i== 0 ? startDate : dates[i-1])+"</td>"+
		          " <td> - </td>"+
		          " <td> 0 </td>"+
		          " <td> 0 </td>"+
		          " <td>NA</td>"+
		          " <td class='kt-font-danger'>Not generated</td>"+
		          " <td>"+
		        "    <div class='dropdown dropright'>"+
		           "         <button type='button' class='btn btn-hover-info btn-elevate-hover btn-icon btn-sm btn-icon-md' data-toggle='dropdown' aria-haspopup='true' aria-expanded='false'>"+
		           "             <i class='flaticon-more-1'></i>"+
		           "          </button>"+
		           "          <div class='dropdown-menu dropdown-menu-left' x-placement='top-start' style='position: absolute; will-change: transform; top: 0px; left: 0px; transform: translate3d(-149px, 33px, 0px);'>"+
		           "             <a class='dropdown-item "+(feedStatus == 0  ? 'disabled' : "")+"' href='#tbody-measures' onclick='"+func+"'><i class='flaticon-cogwheel-2'></i> Compute Feedback</a>"+
		           "          </div>"+
		           "  </div>"+
		        " </td>"+
		     "</tr>");

		}
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
					    //console.log("eng: "+eng_data[i]+", mot: "+mot_data[i]+", date: "+dates[i]);
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