var EMAIL_INDEX= 0;
var USERID_INDEX= 1;
var NAME_INDEX= 2;
var SURNAME_INDEX= 3;
var LASTEVENT_INDEX= 4;


//Class definition
var DatatableStudents = function(){	
	
	var fill_datatable= function(n_members, emails, ids, names, surnames, lastEvents){

		var id = document.getElementById("loggedUser").value;
		
		var i = 0;
		
		while(i < n_members){
			
			var toAppend = "<div class='row'>";
			
			for(var j = 0; j < 6 && i < n_members; j++){
				
				if(id.localeCompare(ids[i])!=0){
						toAppend = toAppend.concat(
								"<div class='col-xl-2'>" +
									"<div class='kt-portlet kt-portlet--height-fluid'>" +
										"<div class='kt-portlet__head kt-portlet__head--noborder'>" +
											"<div class='kt-portlet__head-label'>" +
											"</div>" +
										"</div>" +
										"<div class='kt-portlet__body kt-portlet__body--fit-y'>" +
											"<div class='kt-widget kt-widget--user-profile-4'>" +
												"<div class='kt-widget__head'>" +
													"<div class='kt-widget__media'>" +
														"<img class='kt-widget__img kt-hidden-' src='assets/images/users/300_2"+i+".jpg' alt='image'>" +
														"<div class='kt-widget__pic kt-widget__pic--danger kt-font-danger kt-font-boldest kt-hidden'>" +
														names[i][0] + ' ' + surnames[i][0] +
														"</div>" +
													"</div>" +
												"<div class='kt-widget__content'>" +
													"<div class='kt-widget__section'>" +
														"<a href='#' class='kt-widget__username'>" +
															names[i] + ' ' + surnames[i] +
														"</a>" +
														"<div class='kt-widget__button'>" +
															"<div class='kt-widget__button'>" +
																"<button type='button' class='btn btn-outline-hover-brand btn-icon'><i class='far fa-comment-dots'></i></button>" +
															"</div>" +
															"<div class='kt-widget__action'>" +
															"</div>" +
														"</div>" +
													"</div>" +
												"</div>" +
											"</div>" +
										"</div>" +
									"</div>" +
								"</div>" +
							"</div>"		
						);
				}
				
				i++;
			}
			
			toAppend = toAppend.concat("</div>");
			$("#students-list").append(toAppend);
			
		}
			
	}
	
	
	return {
		// public functions
		init: function(data) {
			var n_members= data.length;
			var emails= [];
			var names = [];
			var surnames = [];
			var ids= [];
			var lastEvents= [];
			console.log(data)
			for(var i=0; i<n_members; i++){
				emails[i]= data[i][EMAIL_INDEX];
				ids[i]= data[i][USERID_INDEX];
				names[i]= data[i][NAME_INDEX];
				surnames[i]= data[i][SURNAME_INDEX];
				lastEvents[i]= data[i][LASTEVENT_INDEX];
			}
			fill_datatable(n_members, emails, ids, names, surnames, lastEvents);
		}
	};
	
}();


jQuery(document).ready(function() {
	//Get URL
	
	$.urlParam = function(name){
		var results = new RegExp('[\?&]' + name + '=([^&#]*)').exec(window.location.href);
		return results[1] || 0;
	}
		
	$.ajax({
		type: "GET",
		url : "/courseMembers",
		data : "courseId="+$.urlParam('courseId'),
        contentType: "application/json; charset=utf-8",
		dataType: "json",
		success: function(data){
			//Datatable
			DatatableStudents.init(data);
		},
		error: function(err){
			console.log(err)
		}
	});
	
	
});