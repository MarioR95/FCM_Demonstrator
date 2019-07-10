
var KTDashboard = function() {
	var activity_doughnut = function() {        
	        if (!KTUtil.getByID('kt-activity-chart')) {
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
	                        35, 30, 35
	                    ],
	                    backgroundColor: [
	                        KTApp.getStateColor('success'),
	                        KTApp.getStateColor('danger'),
	                        KTApp.getStateColor('brand'),
	                        KTApp.getStateColor('info')
	                    ]
	                }],
	                labels: [
	                    'Forum',
	                    'Resource',
	                    'Assignment',
	                    'Quiz'
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
	
        var ctx = KTUtil.getByID('kt-activity-chart').getContext('2d');
        var myDoughnut = new Chart(ctx, config);
    }
	  return {
	       
	        init: function() {
	            // init charts
	        	activity_doughnut();
	            
	            // demo loading
	            var loading = new KTDialog({'type': 'loader', 'placement': 'top center', 'message': 'Loading ...'});
	            loading.show();

	            setTimeout(function() {
	                loading.hide();
	            }, 3000);
	        }
	    };
	}();

	// Class initialization on page load
	jQuery(document).ready(function() {
	    KTDashboard.init();
	});