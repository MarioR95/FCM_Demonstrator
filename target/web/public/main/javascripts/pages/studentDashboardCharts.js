"use strict";

var KTDashboard = function() {
	
    var coursesProgress = function() {
        var chartContainer = KTUtil.getByID('kt_courses_progress');

        if (!chartContainer) {
            return;
        }

        var chartData = {
            labels: ["Algorithm", "Data Structures","M. Analysis II"],
            datasets: [{
                data: [
                    40, 25, 65,
                ],
                backgroundColor : [
                	KTApp.getStateColor('warning'), KTApp.getStateColor('danger'), KTApp.getStateColor('success')
                  ]
            }]
        }; 

        var chart = new Chart(chartContainer, {
            type: 'horizontalBar',
            data: chartData,
            options: {
            	title:{
    				display: false,
    			},

    			legend:{
    				display: false
    			},

    			layout:{
    				padding:{
    					left:0,
    					right:0,
    					bottom:0,
    					top:0
    				}
    			},
    			tooltips:{
    				enabled:true
    			},

    			scales: {
                	yAxes: [{
                		gridLines: {
                            display:false
                        },
                    	ticks: {
                        	beginAtZero:true
                    	}
                	}],
                	
                	xAxes: [{
                		gridLines: {
                            display:false
                        },
                		ticks:{
                			suggestedMax: 100
                		}
                	}]
            	}
            }
        });
    }

    var coursesScore = function() {
        var chartContainer = KTUtil.getByID('kt_courses_score');

        if (!chartContainer) {
            return;
        }

        var chartData = {
            labels: ["Algorithm", "Data Structures","M. Analysis II"],
            datasets: [{
                //label: 'Dataset 1',
                backgroundColor: KTApp.getStateColor('brand'),
                data: [
                    28, 22, 24
                ]
            }]
        };

        var chart = new Chart(chartContainer, {
            type: 'bar',
            data: chartData,
            options: {
            	title:{
    				display: false,
    			},

    			legend:{
    				display: false
    			},

    			layout:{
    				padding:{
    					left:0,
    					right:0,
    					bottom:0,
    					top:0
    				}
    			},
    			tooltips:{
    				enabled:true
    			},

    			scales: {
                	yAxes: [{
                		gridLines: {
                            display:false
                        },
                    	ticks: {
                        	beginAtZero:true
                    	}
                	}],
                	
                	xAxes: [{
                		barPercentage: 0.4,
                		gridLines: {
                            display:false
                        },
                		ticks:{
                			suggestedMax: 100
                		}
                	}]
            	}
            }
        });
    }

    var forumActivities = function() {        
        if (!KTUtil.getByID('kt_forum_activities')) {
            return;
        }

        var randomScalingFactor = function() {
            return Math.round(Math.random() * 100);
        };

        var config = {
            type: 'doughnut',
            data: {
                datasets: [{
                    data: [
                        55, 17, 28
                    ],
                    backgroundColor: [
                        KTApp.getStateColor('success'),
                        KTApp.getStateColor('danger'),
                        KTApp.getStateColor('brand')
                    ]
                }],
                labels: [
                    '% Post replyed',
                    '% Own post liked',
                    '% Own post shared'
                ]
            },
            options: {
                cutoutPercentage: 75,
                responsive: true,
                maintainAspectRatio: false,
                legend: {
                    display: false,
                    position: 'top',
                },
                title: {
                    display: false,
                    text: 'Technology'
                },
                animation: {
                    animateScale: true,
                    animateRotate: true
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
                    backgroundColor: KTApp.getStateColor('brand'),
                    titleFontColor: '#ffffff', 
                    cornerRadius: 4,
                    footerSpacing: 0,
                    titleSpacing: 0
                }
            }
        };

        var ctx = KTUtil.getByID('kt_forum_activities').getContext('2d');
        var myDoughnut = new Chart(ctx, config);
    }

    
	return {  
	    init: function() {
	        // init charts
	    	coursesProgress();
	    	coursesScore();
	    	forumActivities();
	    }
	};
}();


jQuery(document).ready(function() {
	KTDashboard.init();
});
