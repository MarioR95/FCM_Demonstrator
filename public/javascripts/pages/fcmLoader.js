var standardSet = [
    {id: 2, value: 0.3, label: 'Motivation', title: 0.0, color:'#FFE6CC'},
    {id: 3, value: 0.3, label: 'Engagement', title: 0.1, color:'#FFE6CC'},
    {id: 4, value: 0.3, label: 'Intrinsic Motivation', title: 0.2, color:'#FFF8F2'},
    {id: 5, value: 0.3, label: 'Estrinsic Motivation', title: 0.3, color:'#FFF8F2'},
    {id: 6, value: 0.3, label: 'Social Motivation', title: 0.4, color:'#FFF8F2'},
    {id: 7, value: 0.3, label: 'Forum Activities', title: 0.5, color:'#FFEFE3'},
    {id: 8, value: 0.3, label: 'Last Forum Activities', title: 0.6, color:'#FFF8F2'},
    {id: 9, value: 0.3, label: 'N Posts', title: 0.7, color:'#FFF8F2'},
    {id: 10, value: 0.3, label: 'Week Session', title: 0.1, color:'#FFEFE3'},
    {id: 11, value: 0.3, label: 'N Chapters', title: 0.1, color:'#FFF8F2'},
    {id: 12, value: 0.3, label: 'N Play Videos', title: 0.1, color:'#FFF8F2'},
    {id: 13, value: 0.3, label: '% Video Completed', title: 0.1, color:'#FFF8F2'},
    {id: 14, value: 0.3, label: 'Last Lesson', title: 0.1, color:'#FFF8F2'},
    {id: 15, value: 0.3, label: 'Last Event', title: 0.1, color:'#FFF8F2'},
    {id: 16, value: 0.3, label: 'Assignment', title: 0.1, color:'#FFEFE3'},
    {id: 17, value: 0.3, label: 'Interactions', title: 0.1, color:'#FFEFE3'},
    {id: 18, value: 0.3, label: 'Tasks Done', title: 0.1, color:'#FFF8F2'}
    ];

var edgesDefinition =[
    {from: 4, to: 2, value: 0.625, title: "0.625"},
    {from: 5, to: 2, value: 0.875, title: "0.875"},
    {from: 6, to: 2, value: 0.25, title: "0.25"},
    {from: 8, to: 7, value: 0.375, title: "0.375"},
    {from: 9, to: 7, value: 0.50, title: "0.50"},
    {from: 7, to: 2, value: 0.375, title: "0.375"},
    {from: 9, to: 10, value: 0.25, title: "0.25"},
    {from: 11, to: 10, value: 0.50, title: "0.50"},
    {from: 12, to: 10, value: 0.50, title: "0.50"},
    {from: 10, to: 17, value: 0.50, title: "0.50"},
    {from: 13, to: 17, value: 0.625, title: "0.625"},
    {from: 14, to: 17, value: 0.25, title: "0.25"},
    {from: 15, to: 17, value: 0.750, title: "0.750"},
    {from: 18, to: 16, value: 0.750, title: "0.750"},
    {from: 16, to: 3, value: 0.50, title: "0.50"},
    {from: 17, to: 3, value: 0.50, title: "0.50"},
    {from: 7, to: 3, value: 0.625, title: "0.625"},
    ];

//Array containing the data retrieved form DB
var toShow = [];

//Index corresponding to the actual dataset from Array
var indexToShow = 0;


var options = {
	       
   physics:{
       stabilization: true,
   },

   interaction:{
	 zoomView: false,  
   },
   nodes: {
        font:{
            size: 15,
            strokeWidth:3, 
            strokeColor:"#ffffff"
        },
        shape: 'dot',
        scaling: {
            min:10,
            max:50
          }
   },

   edges: {
        arrows:{
            to : true
        },
        scaling: {
            min:1,
            max:5
          }
   }

};



var data;
var nodes;
   
function fillMap(weekNumber, startDate, endDate){

	$("#fcm_container").show();
	$("#head-table-measurement").html("Week "+weekNumber+" <small>Start: "+startDate+", End: "+endDate+"</small>")

	var container = document.getElementById('fcm');
	
	nodes = new vis.DataSet(standardSet);
	var edges = new vis.DataSet(edgesDefinition);
	
	data = {
	        nodes: nodes,
	        edges: edges
	    };
	
	var network = new vis.Network(container, data, options);
}
	



function update(){
	nodes.update(toShow[indexToShow])
}

function nextDataset(){
	if(indexToShow < toShow.length-1){
		indexToShow++;
		update();
		$("#prev").attr("disabled", false);
	}else{
		$("#next").attr("disabled", true);
	}
}

function prevDataset(){
	
	if(indexToShow > 0){
		indexToShow--;
		update();
		$("#next").attr("disabled", false);
	}else{
		$("#prev").attr("disabled", true);
	}
}


function executeMap(weekNumber){
	
	var jqxhr=$.ajax({
			type: "GET",
			url : "/executeMap",
			data : "courseId="+$.urlParam('courseId')+"&userId="+$.urlParam('userId')+"&weekNumber="+weekNumber,
			contentType: "application/json; charset=utf-8",
			dataType: "text",
	});
	
	jqxhr.done(function(response){
		//location.reload();
	});
	
	jqxhr.fail(function(response){
		console.log(response);
	});
	
}

function getWeekMeasure(weekNumber){
	
	var jqxhr=$.ajax({
		type: "GET",
		url : "/fetchStudentMeasurements",
		data : "courseId="+$.urlParam('courseId')+"&userId="+$.urlParam('userId')+"&weekNumber="+weekNumber,
		contentType: "application/json; charset=utf-8",
		dataType: "json",
	});
	
	
	jqxhr.done(function(response){

		console.log(response.length);
			
		toShow = [];
		indexToShow = 0;
		
		for(var i = 0; i < response.length; i++){
			var tmpDataset = [
				{id: 2, value: response[i].c2, label: 'Motivation', title: response[i].c2, color:'#FFE6CC'},
			    {id: 3, value: response[i].c3, label: 'Engagement', title: response[i].c3, color:'#FFE6CC'},
			    {id: 4, value: response[i].c4, label: 'Intrinsic Motivation', title: response[i].c4, color:'#FFF8F2'},
			    {id: 5, value: response[i].c5, label: 'Estrinsic Motivation', title: response[i].c5, color:'#FFF8F2'},
			    {id: 6, value: response[i].c6, label: 'Social Motivation', title: response[i].c6, color:'#FFF8F2'},
			    {id: 7, value: response[i].c7, label: 'Forum Activities', title: response[i].c7, color:'#FFEFE3'},
			    {id: 8, value: response[i].c8, label: 'Last Forum Activities', title: response[i].c8, color:'#FFF8F2'},
			    {id: 9, value: response[i].c9, label: 'N Posts', title: response[i].c9, color:'#FFF8F2'},
			    {id: 10, value: response[i].c10, label: 'Week Session', title: response[i].c10, color:'#FFEFE3'},
			    {id: 11, value: response[i].c11, label: 'N Chapters', title: response[i].c11, color:'#FFF8F2'},
			    {id: 12, value: response[i].c12, label: 'N Play Videos', title: response[i].c12, color:'#FFF8F2'},
			    {id: 13, value: response[i].c13, label: '% Video Completed', title: response[i].c13, color:'#FFF8F2'},
			    {id: 14, value: response[i].c14, label: 'Last Lesson', title: response[i].c14, color:'#FFF8F2'},
			    {id: 15, value: response[i].c15, label: 'Last Event', title: response[i].c15, color:'#FFF8F2'},
			    {id: 16, value: response[i].c16, label: 'Assignment', title: response[i].c16, color:'#FFEFE3'},
			    {id: 17, value: response[i].c17, label: 'Interactions', title: response[i].c17, color:'#FFEFE3'},
			    {id: 18, value: response[i].c18, label: 'Tasks Done', title: response[i].c18, color:'#FFF8F2'}
			];
			
			toShow.push(tmpDataset);
		}
		
		update();
		
	});
	
	jqxhr.fail(function(err){
		console.log(err);
	})
}