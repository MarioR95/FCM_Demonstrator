//Class definition
var Datatable = function(){

	
	var fill_datatable= function(n_members, emails, ids, names, surnames, lastEvents, status){
		
		for(var i=0; i<n_members; i++){
			
			var color;
			if(status[ids[i]] == "dropped")
				color = "danger";
			else if(status[ids[i]] == "warning")
				color = "warning";
			else
				color = "success";
			
			$("#tbody-members").append(
			"<tr>"+
		    "  	<th scope='row'>"+(i+1)+"</th>"+
		    "  	<td>"+names[i]+"</td>"+
		    "  	<td>"+surnames[i]+"</td>"+
		    "  	<td>"+ids[i]+"</td>"+
		    "	<td><span class='kt-badge kt-badge--"+color+"  kt-badge--inline kt-badge--pill'>"+status[ids[i]]+"</span></td>"+
		    "  	<td>"+lastEvents[i]+"</td>"+
		    "  	<td>"+
			"      	<div class='dropdown dropright'>"+
            "            <button type='button' class='btn btn-hover-info btn-elevate-hover btn-icon btn-sm btn-icon-md' data-toggle='dropdown' aria-haspopup='true' aria-expanded='false'>"+
            "                <i class='flaticon-more-1'></i>"+
            "            </button>"+
            "            <div class='dropdown-menu dropdown-menu-left' x-placement='top-start' style='position: absolute; will-change: transform; top: 0px; left: 0px; transform: translate3d(-149px, 33px, 0px);'>"+
            "                <a class='dropdown-item' href='#'><i class='flaticon-profile-1'></i> Details</a>"+
            "                <a class='dropdown-item' href='/studentStats?courseId=HarvardX/CB22x/2013_Spring&name="+names[i]+"&surname="+surnames[i]+"&userId="+ids[i]+"' ><i class='flaticon-analytics'></i> Stats</a>"+
            "                <div class='dropdown-divider'></div>"+
            "                <a class='dropdown-item kt-font-danger' href='#'><i class='flaticon-delete kt-font-danger'></i> Delete</a>"+
            "            </div>"+
            "    	</div>"+
            "	</td>"+
	    	"</tr>");
		}
			
	}
	
	
	return {
		// public functions
		init: function(members, membersStatus) {
			var n_members= members.length;
			var emails= [];
			var names = [];
			var surnames = [];
			var ids= [];
			var lastEvents= [];
			var status = membersStatus;
			
			for(var i=0; i<n_members; i++){
				emails[i]= members[i][0];
				ids[i]= members[i][1];
				names[i]= members[i][2];
				surnames[i]= members[i][3];
				lastEvents[i]= members[i][4];
			}	
			
			fill_datatable(n_members, emails, ids, names, surnames, lastEvents,status);
		}
	};
	
}();


jQuery(document).ready(function() {
	//Get URL
	$.urlParam = function(name){
		var results = new RegExp('[\?&]' + name + '=([^&#]*)').exec(window.location.href);
		return results[1] || 0;
	}
	
	//RETRIEVE ALL MEMBERS
	$.ajax({
		type: "GET",
		url : "/courseMembers",
		data : "courseId="+$.urlParam('courseId'),
        contentType: "application/json; charset=utf-8",
		dataType: "json",
		success: function(data){
			var members = data
			//GET THE MEMBER'S STATUS
			$.ajax({
				type: "GET",
				url : "/retrieveStudentsStatus",
				data : "courseId="+$.urlParam('courseId'),
		        contentType: "application/json; charset=utf-8",
				dataType: "json",
				success: function(membersStatus){
					Datatable.init(members, membersStatus);
				},
				error: function(err){
					console.log(err)
				}
			});		
		},
		error: function(err){
			console.log(err)
		}
	});
	
	
});