"use strict";

// Class definition
var KTMorrisChartsDemo = function() {

    // Private functions  
    var demo1 = function() {
        // LINE CHART
        new Morris.Line({
            // ID of the element in which to draw the chart.
            element: 'kt_morris_1',
            // Chart data records -- each entry in this array corresponds to a point on
            // the chart.
            data: [{
                    y: '2006',
                    a: 100,
                    b: 90
                },
                {
                    y: '2007',
                    a: 75,
                    b: 65
                },
                {
                    y: '2008',
                    a: 50,
                    b: 40
                },
                {
                    y: '2009',
                    a: 75,
                    b: 65
                },
                {
                    y: '2010',
                    a: 50,
                    b: 40
                },
                {
                    y: '2011',
                    a: 75,
                    b: 65
                },
                {
                    y: '2012',
                    a: 100,
                    b: 90
                }
            ],
            // The name of the data record attribute that contains x-values.
            xkey: 'y',
            // A list of names of data record attributes that contain y-values.
            ykeys: ['a', 'b'],
            // Labels for the ykeys -- will be displayed when you hover over the
            // chart.
            labels: ['Values A', 'Values B'],
            lineColors: ['#6e4ff5', '#f6aa33']
        });
    }

    var demo2 = function() {
        // AREA CHART
        new Morris.Area({
            element: 'kt_morris_2',
            data: [{
                    y: '2006',
                    a: 100,
                    b: 90
                },
                {
                    y: '2007',
                    a: 75,
                    b: 65
                },
                {
                    y: '2008',
                    a: 50,
                    b: 40
                },
                {
                    y: '2009',
                    a: 75,
                    b: 65
                },
                {
                    y: '2010',
                    a: 50,
                    b: 40
                },
                {
                    y: '2011',
                    a: 75,
                    b: 65
                },
                {
                    y: '2012',
                    a: 100,
                    b: 90
                }
            ],
            xkey: 'y',
            ykeys: ['a', 'b'],
            labels: ['Series A', 'Series B'],
            lineColors: ['#de1f78', '#c7d2e7'],
            pointFillColors: ['#fe3995','#e6e9f0']
        });
    }

    var demo3 = function() {
        // BAR CHART
        var chart= new Morris.Bar({
            element: 'kt_morris_3',
            data: [{
                    y: 'Algorithms',
                    a: 80, //ASSIGMENT
                    b: 90,	//FORUM
                    c: 49,	//MULTIMEDIA
                    d: 68	//QUIZ
                },
                {
                    y: 'Data Structures',
                    a: 75,
                    b: 35,
                    c: 50,	
                    d: 83	
                },
            ],
            xkey: 'y',
            ykeys: ['a', 'b', 'c', 'd'],
            labels: ['Assignment', 'Forum', 'Multimedia', 'Quiz'],
            barColors: ['#FFB822', '#34BFA3', '#5D78FF', '#FD3995'],
        	ymax:100
        });
        
        chart.options.labels.forEach(function(label, i) {
	        var legendItem = $('<span></span>').text(label).prepend('<span>&nbsp;</span>');
	        legendItem.find('span')
	          .css('backgroundColor', chart.options.barColors[i])
	          .css('width', '15px')
	          .css('height', '15px')
	          .css('display', 'inline-block')
	          .css('margin', '5px')
	        $('#legend-bar').append(legendItem)
    	});
    }

    var demo4 = function() {
        // PIE CHART
        new Morris.Donut({
            element: 'kt_morris_4',
            data: [{
                    label: "Download Sales",
                    value: 12
                },
                {
                    label: "In-Store Sales",
                    value: 30
                },
                {
                    label: "Mail-Order Sales",
                    value: 20

                }
            ],
            colors: ['#593ae1', '#6e4ff5', '#9077fb']
        });
    }

    return {
        // public functions
        init: function() {
            //demo1();
            //demo2();
            demo3();
            //demo4();
        }
    };
}();

jQuery(document).ready(function() {
    KTMorrisChartsDemo.init();
});