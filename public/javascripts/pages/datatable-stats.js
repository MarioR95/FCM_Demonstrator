//Class definition
var Datatable = function(){
	
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
		  console.log
		  for( i=0; i<n_samples; i++){
			  
			  var type;
			  var status;
			  var statusColor;
			  
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
		        " <td>"+Number(eng[i]).toFixed(2)+"</td>"+
		        " <td>"+Number(mot[i]).toFixed(2)+"</td>"+
		        " <td>"+type+"</td>"+
		        " <td class='kt-font-"+statusColor+"'>"+status+"</td>"+
		        " <td>"+
		      "    <div class='dropdown dropright'>"+
		         "         <button type='button' class='btn btn-hover-info btn-elevate-hover btn-icon btn-sm btn-icon-md' data-toggle='dropdown' aria-haspopup='true' aria-expanded='false'>"+
		         "             <i class='flaticon-more-1'></i>"+
		         "          </button>"+
		         "          <div class='dropdown-menu dropdown-menu-left' x-placement='top-start' style='position: absolute; will-change: transform; top: 0px; left: 0px; transform: translate3d(-149px, 33px, 0px);'>"+
		         "             <a class='dropdown-item disabled' href='#tbody-measures'><i class='flaticon-cogwheel-2'></i> Compute Feedback</a>"+
		         "             <a class='dropdown-item "+(feedback[i].status == 1 ? 'disabled' : "")+"' href='#tbody-measures'><i class='flaticon-paper-plane-1'></i> Send Feedback</a>"+
		         "             <a class='dropdown-item disabled' href='#fcm-header' onclick='fillMap("+(i+1)+",\""+(i == 0 ? startDate : dates[i-1])+"\",\""+dates[i]+"\"); getWeekMeasure("+(i+1)+", 1)'><i class='flaticon-earth-globe'></i> See on Map</a>"+
		         "          </div>"+
		         "  </div>"+
		      " </td>"+
		   "</tr>");
		  }
		  if(i<courseLife){
			  
			  //checkFeedbackStatus(feedback[i-1].status);
			  
			  //console.log(prevStatus);
			  
			  var func;
			  
			  if(feedback[i-1].status == 0){
				  func = 'alert("Operation Denied!")';
			  }
			  
			  else{
				  func = "executeMap("+(i+1)+")";
			  }
			  
			  console.log("Function = "+func);
			  
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
		           "             <a class='dropdown-item "+(feedback[i-1].status == 0 ? 'disabled' : "")+"' href='#tbody-measures' onclick='"+func+"'><i class='flaticon-cogwheel-2'></i> Compute Feedback</a>"+
		           "             <a class='dropdown-item disabled' href='#tbody-measures'><i class='flaticon-paper-plane-1'></i> Send Feedback</a>"+
		           "            <a class='dropdown-item disabled' href='#fcm-header'><i class='flaticon-earth-globe'></i> See on Map</a>"+
		           "             <div class='dropdown-divider'></div>"+
		           "             <a class='dropdown-item kt-font-danger' href='#'><i class='flaticon-delete kt-font-danger'></i> Delete</a>"+
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