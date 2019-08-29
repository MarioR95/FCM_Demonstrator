//Class definition
var Datatable = function(){
	
	var fill_datatable= function(eng, mot, startDate, dates, n_samples,courseLife){
		  var i;
		  for( i=0; i<n_samples; i++){
		   $(".tbody-dark").append(
		   "<tr>"+
		        " <th scope='row'>"+(i+1)+"</th>"+
		        " <td>"+(i== 0 ? startDate : dates[i-1])+"</td>"+
		        " <td>"+dates[i]+"</td>"+
		        " <td>"+Number(eng[i]).toFixed(2)+"</td>"+
		        " <td>"+Number(mot[i]).toFixed(2)+"</td>"+
		        " <td>Type1</td>"+
		        " <td class='kt-font-warning'>Not Sent</td>"+
		        " <td>"+
		      "    <div class='dropdown dropright'>"+
		         "         <button type='button' class='btn btn-hover-info btn-elevate-hover btn-icon btn-sm btn-icon-md' data-toggle='dropdown' aria-haspopup='true' aria-expanded='false'>"+
		         "             <i class='flaticon-more-1'></i>"+
		         "          </button>"+
		         "          <div class='dropdown-menu dropdown-menu-left' x-placement='top-start' style='position: absolute; will-change: transform; top: 0px; left: 0px; transform: translate3d(-149px, 33px, 0px);'>"+
		         "             <a class='dropdown-item disabled' href='#tbody-measures'><i class='flaticon-cogwheel-2'></i> Compute Feedback</a>"+
		         "             <a class='dropdown-item' data-toggle='modal' href='#kt_modal_4'><i class='flaticon-paper-plane-1'></i> Send Feedback</a>"+
		         "             <a class='dropdown-item' href='#fcm-header' onclick='fillMap("+(i+1)+",\""+(i == 0 ? startDate : dates[i-1])+"\",\""+dates[i]+"\"); getWeekMeasure("+(i+1)+", 1)'><i class='flaticon-earth-globe'></i> See on Map</a>"+
		         "             <div class='dropdown-divider'></div>"+
		         "             <a class='dropdown-item kt-font-danger' href='#'><i class='flaticon-delete kt-font-danger'></i> Delete</a>"+
		         "          </div>"+
		         "  </div>"+
		      " </td>"+
		   "</tr>");
		  }
		  if(i<courseLife){
		   $(".tbody-dark").append(
		     "<tr>"+
		          " <th scope='row'>"+(i+1)+"</th>"+
		          " <td>"+(i== 0 ? startDate : dates[i-1])+"</td>"+
		          " <td> - </td>"+
		          " <td> 0 </td>"+
		          " <td> 0 </td>"+
		          " <td>Type1</td>"+
		          " <td class='kt-font-danger'>Not generated</td>"+
		          " <td>"+
		        "    <div class='dropdown dropright'>"+
		           "         <button type='button' class='btn btn-hover-info btn-elevate-hover btn-icon btn-sm btn-icon-md' data-toggle='dropdown' aria-haspopup='true' aria-expanded='false'>"+
		           "             <i class='flaticon-more-1'></i>"+
		           "          </button>"+
		           "          <div class='dropdown-menu dropdown-menu-left' x-placement='top-start' style='position: absolute; will-change: transform; top: 0px; left: 0px; transform: translate3d(-149px, 33px, 0px);'>"+
		           "             <a class='dropdown-item' href='#tbody-measures' onclick='executeMap("+(i+1)+")'><i class='flaticon-cogwheel-2'></i> Compute Feedback</a>"+
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
				   var eng_data= [];
				   var mot_data= [];
				   var dates= [];
				   var n_samples= data[0].length;
				   var courseLife = data[1];
				   var startDate= data[2];
				 	   for(var i=0; i<n_samples; i++){
					    dates[i]= data[0][i].date;
					    eng_data[i]= data[0][i].c2;
					    mot_data[i]= data[0][i].c3;
					    //console.log("eng: "+eng_data[i]+", mot: "+mot_data[i]+", date: "+dates[i]);
				   }
				   
				   fill_datatable(eng_data, mot_data, startDate, dates, n_samples,courseLife);
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