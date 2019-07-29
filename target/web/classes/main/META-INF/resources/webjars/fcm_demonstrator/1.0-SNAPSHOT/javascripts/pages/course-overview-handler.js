"use strict";

var KTDashboard = function() {
	var activity_doughnut = function() {        
        var config = {
            type: 'pie',
            data: {
                datasets: [{
                    data: [
                        12, 8, 25, 30
                    ],
                    backgroundColor: [
                    	'rgba(255, 99, 132, 0.5)',
                        'rgba(54, 162, 235, 0.2)',
                        'rgba(255, 206, 86, 0.2)',
                        'rgba(75, 192, 192, 0.2)'
                    ],
                    borderColor: [
                        'rgba(255,99,132,1)',
                        'rgba(54, 162, 235, 1)',
                        'rgba(255, 206, 86, 1)',
                        'rgba(75, 192, 192, 1)'
                    ],
                    borderWidth: 1
                }],
                labels: [
                    'Forum',
                    'Resource',
                    'Assignment',
                    'Quiz'
                ]
            },
            options: {
                cutoutPercentage: 40,
                legend: {
                    display: true,
                    position: 'right',
                },
               
                tooltips: {
                    enabled: true,
                    intersect: false,
                    mode: 'nearest',
                    bodySpacing: 5,
                    yPadding: 10,
                    xPadding: 10, 
                    caretPadding: 0,
                    displayColors: false,
                    backgroundColor: '#000000',
                    titleFontColor: '#ffffff', 
                    cornerRadius: 4,
                    footerSpacing: 0,
                    titleSpacing: 0
                }
        	}
        };
	
	    var ctx = $('#kt-activity-chart')[0].getContext('2d');
	    var doughnut= new Chart(ctx, config);
	}
	
	var interaction_plot= function(){
		var ctx = document.getElementById("kt_interactions_chart");
        var config = {
            type: 'line',
            data: {
                labels: ["05-04-2019", "06-04-2019", "07-04-2019", "08-04-2019", "09-04-2019", "10-04-2019", "11-04-2019"],
                datasets: [{
                    label: "",
                    borderColor: '#5867DD',
                    pointBackgroundColor: '#5867DD',
                    backgroundColor: [
                        'rgba(122, 137, 250, 0.2)',
                    ],
                    data: [
                        20, 35, 14, 22, 19, 30, 13
                    ],

                }]
            },
            options: {
                responsive: true,
                maintainAspectRatio: false,
                legend: false,
                scales: {
                    xAxes: [{
                        display: true,
                        scaleLabel: {
                            display: false,
                            labelString: 'Days'
                        },
                        gridLines: {
                            color: KTApp.getBaseColor('shape', 2),
                            drawTicks: false,
                            borderDash: [3, 4],
                        },
                        ticks: {
                            display: true,
                            beginAtZero: true,
                            fontColor: KTApp.getBaseColor('shape', 3),
                            fontSize: 13,
                            padding: 10
                        }
                    }],
                    yAxes: [{
                        display: true,
                        scaleLabel: {
                            display: false,
                            labelString: 'Value'
                        },
                        gridLines: {
                            color: KTApp.getBaseColor('shape', 2),
                            drawTicks: false,
                            borderDash: [3, 4],
                        },
                        ticks: {                           
                            stepSize: 10,
                            display: true,
                            beginAtZero: true,
                            fontColor: KTApp.getBaseColor('shape', 3),
                            fontSize: 13,
                            padding: 10
                        }
                    }]
                },
                title: {
                    display: false
                },
                hover: {
                    mode: 'index'
                },
                tooltips: {
                    enabled: true,
                    intersect: false,
                    mode: 'nearest',
                    bodySpacing: 5,
                    yPadding: 10,
                    xPadding: 10, 
                    caretPadding: 0,
                    displayColors: false,
                    backgroundColor: "#000000",
                    titleFontColor: '#ffffff', 
                    cornerRadius: 4,
                    footerSpacing: 0,
                    titleSpacing: 0
                },
                elements: {
                    line: {
                        tension: 0.0000001
                    },
                    point: {
                        radius: 4,
                        borderWidth: 4
                    }
                },
                layout: {
                    padding: {
                        left: 0,
                        right: 0,
                        top: 5,
                        bottom: 5
                    }
                }
            }
        }

        var chart = new Chart(ctx, config);
	}
	
	var quiz_plot= function(){
		var ctx = document.getElementById("kt_quiz_chart");
        var config = {
            type: 'line',
            data: {
                labels: ["Quiz 1", "Quiz 2", "Quiz 3"],
                datasets: [{
                    label: "",
                    fill: false,
                    borderColor: '#5867DD',
                    pointBackgroundColor: '#5867DD',
                    data: [
                        68, 90,63.6
                    ]
                }]
            },
            options: {
                responsive: true,
                maintainAspectRatio: false,
                legend: false,
                scales: {
                    xAxes: [{
                        display: true,
                        scaleLabel: {
                            display: false,
                            labelString: 'Days'
                        },
                        gridLines: {
                            drawTicks: false, 
                        },
                        ticks: {
                            display: true,
                            beginAtZero: true,
                            fontColor: KTApp.getBaseColor('shape', 3),
                            fontSize: 13,
                            padding: 10
                        }
                    }],
                    yAxes: [{
                        display: true,
                        scaleLabel: {
                            display: false,
                            labelString: 'Value'
                        },
                        gridLines: {
                            color: KTApp.getBaseColor('shape', 2),
                            drawTicks: false,
                            
                        },
                        ticks: {                           
                            stepSize: 22.5,
                            display: true,
                            beginAtZero: true,
                            fontColor: KTApp.getBaseColor('shape', 3),
                            fontSize: 13,
                            padding: 10
                        }
                    }]
                },
                title: {
                    display: false
                },
                hover: {
                    mode: 'index'
                },
                tooltips: {
                    enabled: true,
                    intersect: false,
                    mode: 'nearest',
                    bodySpacing: 5,
                    yPadding: 10,
                    xPadding: 10, 
                    caretPadding: 0,
                    displayColors: false,
                    backgroundColor: "#000000",
                    titleFontColor: '#ffffff', 
                    cornerRadius: 4,
                    footerSpacing: 0,
                    titleSpacing: 0
                },
                elements: {
                    line: {
                        tension: 0.0000001
                    },
                    point: {
                        radius: 4,
                        borderWidth: 2
                    }
                },
                layout: {
                    padding: {
                        left: 0,
                        right: 0,
                        top: 5,
                        bottom: 5
                    }
                }
            }
        }

        var chart = new Chart(ctx, config);

	}
	
	var course_interactions_plot= function(){
        var rawData = [[5, 0], [15, 1],[35, 2],[20, 3],[25, 4]];
        var dataSet = [{ label: "Users Platform Activity", data: rawData, color: '#5867DD' }];
        var ticks = [[0, "Never"], [1, "Little"], [2, "Med."], [3, "Quite"], [4, "Active"]];
 
        var options = {
            series: {
                bars: {
                    show: true
                }
            },
            bars: {
                align: "center",
                barWidth: 0.8,
                horizontal: true,
                fillColor: { colors: [{ opacity: 1 }, { opacity: 1}] },
                lineWidth: 1
            },
            xaxis: {
                axisLabel: "Platform Interactions (sec.)",
                axisLabelFontSizePixels: 12,
                axisLabelPadding: 10,
                max:100
            },
            yaxis : {
                axisLabel: "Activity",
                ticks: ticks,
             
            },
            legend: {
                noColumns: 0,
                position: "ne"
            },
            grid: {
                hoverable: true,
                borderWidth: 2
            }
        };
        
        $.plot($("#kt-courseinteractions-plot"), dataSet, options);
        $(document).ready(function(){
            $("#kt-courseinteractions-plot").UseTooltip();
        });
        
        var previousPoint = null, previousLabel = null;

        $.fn.UseTooltip = function () {
            $(this).bind("plothover", function (event, pos, item) {
                if (item) {
                    if ((previousLabel != item.series.label) ||  (previousPoint != item.dataIndex)) {
                        previousPoint = item.dataIndex;
                        previousLabel = item.series.label;
                        $("#tooltip").remove();

                        var x = item.datapoint[0];
                        var y = item.datapoint[1];
                        
                        showTooltip(item.pageX,
                            item.pageY,
                            "black",
                            "<strong>" + item.series.yaxis.ticks[y].label + "</strong>: "+ x +"%"
                        );                
                    }
                } else {
                    $("#tooltip").remove();
                    previousPoint = null;
                }
            });
        };

        function showTooltip(x, y, color, contents) {
            $('<div id="tooltip">' + contents + '</div>').css({
                position: 'absolute',
                display: 'none',
                top: y - 10,
                left: x + 10,
                border: '1px solid ' + color,
                padding: '3px',
                'font-size': '9px',
                'border-radius': '5px',
                'background-color': '#fff',
                'font-family': 'Verdana, Arial, Helvetica, Tahoma, sans-serif',
                opacity: 0.9
            }).appendTo("body").fadeIn(200);
        }
        
        
        $('.flot-y-axis').css({
        	'left':'-30px',
        	'top': '-7px'
        });
	}
	

	return {  
	    init: function() {
	        // init charts
	    	activity_doughnut(); 
	    	interaction_plot();
	    	quiz_plot();
	    	course_interactions_plot();
	    }
	};
}();


$(function() {
    KTDashboard.init();
});


function interaction_plot_1(){
	$("#kt_interactions_chart").remove();
	$("#interaction-container").append("<canvas id='kt_interactions_chart' width='485' height='162' class='chartjs-render-monitor' style='display: block; height: 200px; width: 500px; margin: 0 auto;'></canvas>");
	var ctx = document.getElementById("kt_interactions_chart");
    var config = {
        type: 'line',
        data: {
            labels: ["05-04-2019", "06-04-2019", "07-04-2019", "08-04-2019", "09-04-2019", "10-04-2019", "11-04-2019"],
            datasets: [{
                label: "",
                borderColor: '#5867DD',
                pointBackgroundColor: '#5867DD',
                backgroundColor: [
                    'rgba(122, 137, 250, 0.2)',
                ],
                data: [
                    20, 35, 14, 22, 19, 30, 13
                ],

            }]
        },
        options: {
            responsive: true,
            maintainAspectRatio: false,
            legend: false,
            scales: {
                xAxes: [{
                    display: true,
                    scaleLabel: {
                        display: false,
                        labelString: 'Days'
                    },
                    gridLines: {
                        color: KTApp.getBaseColor('shape', 2),
                        drawTicks: false,
                        borderDash: [3, 4],
                    },
                    ticks: {
                        display: true,
                        beginAtZero: true,
                        fontColor: KTApp.getBaseColor('shape', 3),
                        fontSize: 13,
                        padding: 10
                    }
                }],
                yAxes: [{
                    display: true,
                    scaleLabel: {
                        display: false,
                        labelString: 'Value'
                    },
                    gridLines: {
                        color: KTApp.getBaseColor('shape', 2),
                        drawTicks: false,
                        borderDash: [3, 4],
                    },
                    ticks: {                           
                        stepSize: 10,
                        display: true,
                        beginAtZero: true,
                        fontColor: KTApp.getBaseColor('shape', 3),
                        fontSize: 13,
                        padding: 10
                    }
                }]
            },
            title: {
                display: false
            },
            hover: {
                mode: 'index'
            },
            tooltips: {
                enabled: true,
                intersect: false,
                mode: 'nearest',
                bodySpacing: 5,
                yPadding: 10,
                xPadding: 10, 
                caretPadding: 0,
                displayColors: false,
                backgroundColor: "#000000",
                titleFontColor: '#ffffff', 
                cornerRadius: 4,
                footerSpacing: 0,
                titleSpacing: 0
            },
            elements: {
                line: {
                    tension: 0.0000001
                },
                point: {
                    radius: 4,
                    borderWidth: 4
                }
            },
            layout: {
                padding: {
                    left: 0,
                    right: 0,
                    top: 5,
                    bottom: 5
                }
            }
        }
    }

    var chart = new Chart(ctx, config);
}

function interaction_plot_2(){
	$("#kt_interactions_chart").remove();
	$("#interaction-container").append("<canvas id='kt_interactions_chart' width='485' height='162' class='chartjs-render-monitor' style='display: block; height: 200px; width: 500px; margin: 0 auto;'></canvas>");
	var ctx = document.getElementById("kt_interactions_chart");
    var config = {
        type: 'line',
        data: {
            labels: ["05-04-2019", "06-04-2019", "07-04-2019", "08-04-2019", "09-04-2019", "10-04-2019", "11-04-2019"],
            datasets: [{
                label: "",
                borderColor: '#5867DD',
                pointBackgroundColor: '#5867DD',
                backgroundColor: [
                    'rgba(122, 137, 250, 0.2)',
                ],
                data: [
                    45, 30, 22, 27, 19, 24, 11
                ],

            }]
        },
        options: {
            responsive: true,
            maintainAspectRatio: false,
            legend: false,
            scales: {
                xAxes: [{
                    display: true,
                    scaleLabel: {
                        display: false,
                        labelString: 'Days'
                    },
                    gridLines: {
                        color: KTApp.getBaseColor('shape', 2),
                        drawTicks: false,
                        borderDash: [3, 4],
                    },
                    ticks: {
                        display: true,
                        beginAtZero: true,
                        fontColor: KTApp.getBaseColor('shape', 3),
                        fontSize: 13,
                        padding: 10
                    }
                }],
                yAxes: [{
                    display: true,
                    scaleLabel: {
                        display: false,
                        labelString: 'Value'
                    },
                    gridLines: {
                        color: KTApp.getBaseColor('shape', 2),
                        drawTicks: false,
                        borderDash: [3, 4],
                    },
                    ticks: {                           
                        stepSize: 10,
                        display: true,
                        beginAtZero: true,
                        fontColor: KTApp.getBaseColor('shape', 3),
                        fontSize: 13,
                        padding: 10
                    }
                }]
            },
            title: {
                display: false
            },
            hover: {
                mode: 'index'
            },
            tooltips: {
                enabled: true,
                intersect: false,
                mode: 'nearest',
                bodySpacing: 5,
                yPadding: 10,
                xPadding: 10, 
                caretPadding: 0,
                displayColors: false,
                backgroundColor: "#000000",
                titleFontColor: '#ffffff', 
                cornerRadius: 4,
                footerSpacing: 0,
                titleSpacing: 0
            },
            elements: {
                line: {
                    tension: 0.0000001
                },
                point: {
                    radius: 4,
                    borderWidth: 4
                }
            },
            layout: {
                padding: {
                    left: 0,
                    right: 0,
                    top: 5,
                    bottom: 5
                }
            }
        }
    }

    var chart = new Chart(ctx, config);
}

function interaction_plot_3(){
	$("#kt_interactions_chart").remove();
	$("#interaction-container").append("<canvas id='kt_interactions_chart' width='485' height='162' class='chartjs-render-monitor' style='display: block; height: 200px; width: 500px; margin: 0 auto;'></canvas>");
	var ctx = document.getElementById("kt_interactions_chart");
    var config = {
        type: 'line',
        data: {
            labels: ["05-04-2019", "06-04-2019", "07-04-2019", "08-04-2019", "09-04-2019", "10-04-2019", "11-04-2019"],
            datasets: [{
                label: "",
                borderColor: '#5867DD',
                pointBackgroundColor: '#5867DD',
                backgroundColor: [
                    'rgba(122, 137, 250, 0.2)',
                ],
                data: [
                    40, 35, 27, 19, 30, 11, 20
                ],

            }]
        },
        options: {
            responsive: true,
            maintainAspectRatio: false,
            legend: false,
            scales: {
                xAxes: [{
                    display: true,
                    scaleLabel: {
                        display: false,
                        labelString: 'Days'
                    },
                    gridLines: {
                        color: KTApp.getBaseColor('shape', 2),
                        drawTicks: false,
                        borderDash: [3, 4],
                    },
                    ticks: {
                        display: true,
                        beginAtZero: true,
                        fontColor: KTApp.getBaseColor('shape', 3),
                        fontSize: 13,
                        padding: 10
                    }
                }],
                yAxes: [{
                    display: true,
                    scaleLabel: {
                        display: false,
                        labelString: 'Value'
                    },
                    gridLines: {
                        color: KTApp.getBaseColor('shape', 2),
                        drawTicks: false,
                        borderDash: [3, 4],
                    },
                    ticks: {                           
                        stepSize: 10,
                        display: true,
                        beginAtZero: true,
                        fontColor: KTApp.getBaseColor('shape', 3),
                        fontSize: 13,
                        padding: 10
                    }
                }]
            },
            title: {
                display: false
            },
            hover: {
                mode: 'index'
            },
            tooltips: {
                enabled: true,
                intersect: false,
                mode: 'nearest',
                bodySpacing: 5,
                yPadding: 10,
                xPadding: 10, 
                caretPadding: 0,
                displayColors: false,
                backgroundColor: "#000000",
                titleFontColor: '#ffffff', 
                cornerRadius: 4,
                footerSpacing: 0,
                titleSpacing: 0
            },
            elements: {
                line: {
                    tension: 0.0000001
                },
                point: {
                    radius: 4,
                    borderWidth: 4
                }
            },
            layout: {
                padding: {
                    left: 0,
                    right: 0,
                    top: 5,
                    bottom: 5
                }
            }
        }
    }

    var chart = new Chart(ctx, config);
}
