"use strict";

// Class definition
var KTFlotcharts = function() {

	var retention_plot = function() {
	
		var mot = [
			[0, 0.0],
			[1, 0.8],
			[2, 0.87],
			[3, 0.7],
			[4, 0.6],
			[5, 0.8],
		];
		var eng = [
			[0, 0.0],
			[1, 0.65],
			[2, 0.7],
			[3, 0.9],
			[4, 0.85],
			[5, 0.77],
		];

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
				ticks: [[0,'05/04/2019'], [1,'12/04/2019'], [2,'19/04/2019'], [3,'26/04/2019'], [4,'02/05/2019'], [5,'09/05/2019']],
				tickDecimals: 0,
				tickColor: "#eee",
			},
			yaxis: {
				ticks: 5,
				tickDecimals: 1,
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

					showTooltip(item.pageX, item.pageY, item.series.label + " = " + y);
				}
			} else {
				$("#tooltip").remove();
				previousPoint = null;
			}
		});
	}

	
	return {
		// public functions
		init: function() {
			retention_plot();
		}
	};
}();

jQuery(document).ready(function() {
	//Get URL
	$.urlParam = function(name){
		var results = new RegExp('[\?&]' + name + '=([^&#]*)').exec(window.location.href);
		return results[1] || 0;
	}
	
	//GET THE STUDENT ID
	
	var jqxhr= $.ajax({
		type: "GET",
		url : "/fetchStudentStats",
		data : "courseID="+$.urlParam('courseID')+"&studentID=MHxPC130262720",
        contentType: "application/json; charset=utf-8",
		dataType: "json",
		success: function(data){
			console.log(data)
		}
	});
	
	
	KTFlotcharts.init();
});