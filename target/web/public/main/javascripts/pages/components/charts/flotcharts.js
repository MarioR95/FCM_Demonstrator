"use strict";

// Class definition
var KTFlotcharts = function() {

	var retention_plot = function(eng_data, mot_data,startDate, measurement_dates, n_samples) {
	
		var mot = [,];
		var eng = [,];
		var dates= [,];
		
		mot[0]= [0, 0.0];
		eng[0]= [0, 0.0];
		dates[0]= [0, startDate]; 
		
		for(var index=0; index<n_samples; index++){
			mot[index+1]= [index+1, mot_data[index]];
			eng[index+1]= [index+1, eng_data[index]];
			dates[index+1]= [index+1, measurement_dates[index]];
		}
		
		var plot = $.plot($("#kt_flotcharts"), [{
			data: mot,
			label: "Motivation",
			lines: {
				lineWidth: 1,
			},
			shadowSize: 0

		}, {
			data: eng,
			label: "Engagement",
			lines: {
				lineWidth: 1,
			},
			shadowSize: 0
		}], {
			series: {
				lines: {
					show: true,
					lineWidth: 2,
					fill: true,
					fillColor: {
						colors: [{
							opacity: 0.05
						}, {
							opacity: 0.01
						}]
					}
				},
				points: {
					show: true,
					radius: 3,
					lineWidth: 1
				},
				shadowSize: 2
			},
			grid: {
				hoverable: true,
				clickable: true,
				tickColor: "#eee",
				borderColor: "#eee",
				borderWidth: 1
			},
			colors: [KTApp.getStateColor("brand"), KTApp.getStateColor("danger")],
			xaxis: {
				ticks: dates,
				tickDecimals: 0,
				tickColor: "#eee",
			},
			yaxis: {
				ticks: 5,
				tickDecimals: 1,
				max:1.0,
				tickColor: "#eee",
			}
		});
		
		function showTooltip(x, y, contents) {
			$('<div id="tooltip">' + contents + '</div>').css({
				position: 'absolute',
				display: 'none',
				top: y + 5,
				left: x + 15,
				border: '1px solid #333',
				padding: '4px',
				color: '#fff',
				'border-radius': '3px',
				'background-color': '#333',
				opacity: 0.80
			}).appendTo("body").fadeIn(200);
		}

		var previousPoint = null;
		$("#kt_flotcharts").bind("plothover", function(event, pos, item) {
			$("#x").text(pos.x.toFixed(2));
			$("#y").text(pos.y.toFixed(2));

			if (item) {
				if (previousPoint != item.dataIndex) {
					previousPoint = item.dataIndex;

					$("#tooltip").remove();
					var x = item.datapoint[0].toFixed(2),
						y = item.datapoint[1].toFixed(2);

					showTooltip(item.pageX, item.pageY, item.series.label.substring(0,3) + " = " + y);
				}
			} else {
				$("#tooltip").remove();
				previousPoint = null;
			}
		});
	}

	var init_plot= function(startDate){
		var mot = [,];
		var eng = [,];
		var dates= [,];
				
		var plot = $.plot($("#kt_flotcharts"), [{
			data: mot,
			label: "Motivation",
			lines: {
				lineWidth: 1,
			},
			shadowSize: 0

		}, {
			data: eng,
			label: "Engagement",
			lines: {
				lineWidth: 1,
			},
			shadowSize: 0
		}], {
			series: {
				lines: {
					show: true,
					lineWidth: 2,
					fill: true,
					fillColor: {
						colors: [{
							opacity: 0.05
						}, {
							opacity: 0.01
						}]
					}
				},
				points: {
					show: true,
					radius: 3,
					lineWidth: 1
				},
				shadowSize: 2
			},
			grid: {
				hoverable: true,
				clickable: true,
				tickColor: "#eee",
				borderColor: "#eee",
				borderWidth: 1
			},
			colors: [KTApp.getStateColor("brand"), KTApp.getStateColor("danger")],
			xaxis: {
				ticks: dates,
				tickDecimals: 0,
				tickColor: "#eee",
			},
			yaxis: {
				ticks: 5,
				tickDecimals: 1,
				max: 1.0,
				min: 0.0,
				tickColor: "#eee",
			}
		});
		
		function showTooltip(x, y, contents) {
			$('<div id="tooltip">' + contents + '</div>').css({
				position: 'absolute',
				display: 'none',
				top: y + 5,
				left: x + 15,
				border: '1px solid #333',
				padding: '4px',
				color: '#fff',
				'border-radius': '3px',
				'background-color': '#333',
				opacity: 0.80
			}).appendTo("body").fadeIn(200);
		}

		var previousPoint = null;
		$("#kt_flotcharts").bind("plothover", function(event, pos, item) {
			$("#x").text(pos.x.toFixed(2));
			$("#y").text(pos.y.toFixed(2));

			if (item) {
				if (previousPoint != item.dataIndex) {
					previousPoint = item.dataIndex;

					$("#tooltip").remove();
					var x = item.datapoint[0].toFixed(2),
						y = item.datapoint[1].toFixed(2);

					showTooltip(item.pageX, item.pageY, item.series.label.substring(0,3) + " = " + y);
				}
			} else {
				$("#tooltip").remove();
				previousPoint = null;
			}
		});
	}
	
	return {
		// public functions
		init: function(data) {
			//console.log(data);
			var eng_data= [];
			var mot_data= [];
			var dates= [];
			var startDate= data[1];
			
			if(data[0].length > 0){
				var n_samples= data[0].length;

				for(var i=0; i<n_samples; i++){
					dates[i]= data[0][i].date;
					eng_data[i]= data[0][i].c2;
					mot_data[i]= data[0][i].c3;
					//console.log("eng: "+eng_data[i]+", mot: "+mot_data[i]+", date: "+dates[i]);
				}
				
				retention_plot(eng_data, mot_data,startDate, dates, n_samples);
			}else{
				init_plot(startDate);
			}
			
		}, 
	
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
		url : "/fetchStudentStats",
		data : "courseId="+$.urlParam('courseId')+"&userId="+$.urlParam('userId'),
        contentType: "application/json; charset=utf-8",
		dataType: "json",
		success: function(data){
			//Chart plot
			KTFlotcharts.init(data);

		},
		error: function(err){
			console.log(err)
		}
	});
	
	
});