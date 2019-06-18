"use strict";

var FcmLoader = function(){
	
	
	function init(){
		//Singleton
		
		//Private methods and variables
		var data1 = [
	        {id: 2, value: 0.3, label: 'Motivation', title: 0.0},
	        {id: 3, value: 0.3, label: 'Engagement', title: 0.1},
	        {id: 4, value: 0.3, label: 'Intrinsic Motivation', title: 0.2},
	        {id: 5, value: 0.3, label: 'Estrinsic Motivation', title: 0.3},
	        {id: 6, value: 0.3, label: 'Social Motivation', title: 0.4},
	        {id: 7, value: 0.3, label: 'Forum Activities', title: 0.5},
	        {id: 8, value: 0.3, label: 'Last Forum Activities', title: 0.6},
	        {id: 9, value: 0.3, label: 'N Posts', title: 0.7},
	        {id: 10, value: 0.3, label: 'Week Session', title: 0.1},
	        {id: 11, value: 0.3, label: 'N Chapters', title: 0.1},
	        {id: 12, value: 0.3, label: 'N Play Videos', title: 0.1},
	        {id: 13, value: 0.3, label: '% Video Completed', title: 0.1},
	        {id: 14, value: 0.3, label: 'Last Lesson', title: 0.1},
	        {id: 15, value: 0.3, label: 'Last Event', title: 0.1},
	        {id: 16, value: 0.3, label: 'Assignment', title: 0.1},
	        {id: 17, value: 0.3, label: 'Interactions', title: 0.1},
	        {id: 18, value: 0.3, label: 'Tasks Done', title: 0.1}
	        ];
		
		var edgesDefinition = [
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
		
		var options = {
			       
			       physics:{
			           stabilization: true,
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
		
		
		var container;
		var nodes;
		var edges;
		var data;
		var network;
		
		return {
			//public method and variables
			 container : document.getElementById('fcm'),
			
			 nodes : new vis.Dataset(data1),
			 edges : new vis.Dataset(edgesDefinition),
			
			 data : {
				nodes : nodes,
				edges: edges
			},
			
			 network : new vis.Network(container, data, options)
			
		};
	
	
	return {
        // get the singleton instance
        init()
    };
	
}();

jQuery(document).ready(function() {    
    FcmLoader.init();
});