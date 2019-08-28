//Class definition
var FeedbackDatatable = function(){
	
	var fill_datatable= function(data){
		var i;
		for(i = 0; i < data.length; i++){
			
			var icon;
			var color;
			
			switch (data[i].type) {
			  case 0:
				  icon = "fas fa-exclamation-triangle";
				  color = "danger";
				break;
			  case 1:
				  icon = "fas fa-bell";
				  color = "warning";
			    break;
			  case 2:
				  icon = "fas fa-thumbs-up";
				  color = "brand";
			    break;
			  case 3:
				  icon = "fas fa-rocket";
				  color = "success";
			    break;
			}
			
			
			$("#feedback_list").append(
				"<div class='kt-widget4__item'>"+
				"	<span class='kt-widget4__icon'>"+
				"		<i class='"+icon+" kt-font-"+color+"'></i>"+
				"	</span>"+
				"	<a href='#' class='kt-widget4__title kt-widget4__title--light'>"+
				"		<span"+
				"		class='kt-widget4__number kt-font-dark'>"+data[i].feedbackDate+": </span>"+data[i].content+
				"	</a>"+
				"	<div class='dropdown dropright'>"+
				"		<button type='button' class='btn btn-hover-info btn-elevate-hover btn-icon btn-sm btn-icon-md' data-toggle='dropdown' aria-haspopup='true' aria-expanded='false'>"+
				"			<i class='flaticon-more-1'></i>"+
				"		</button>"+
				"		<div class='dropdown-menu dropdown-menu-left' x-placement='top-start' style='position: absolute; will-change: transform; top: 0px; left: 0px; transform: translate3d(-149px, 33px, 0px);'>"+
				"			<a class='dropdown-item' href='#'><i class='fas fa-search'></i> View</a>"+
				"		</div>"+
				"	</div>"+
				"</div>"
			);
		}
			
	}
	
	
	return {
		// public functions
		init: function(data) {
			fill_datatable(data);
		}
	};
	
}();


jQuery(document).ready(function() {
	//Get URL
	
	var userId = document.getElementById("loggedUser").value;
	
	$.urlParam = function(name){
		var results = new RegExp('[\?&]' + name + '=([^&#]*)').exec(window.location.href);
		return results[1] || 0;
	}
		
	$.ajax({
		type: "GET",
		url : "/fetchFeedback",
		data :  "userId="+userId,
        contentType: "application/json; charset=utf-8",
		dataType: "json",
		success: function(data){
			//Datatable
			console.log("feedback "+data);
			FeedbackDatatable.init(data);
		},
		error: function(err){
			console.log(err)
		}
	});
	
	
});