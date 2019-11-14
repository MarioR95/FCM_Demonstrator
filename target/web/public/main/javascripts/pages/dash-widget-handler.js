function retention_1(){
	$("#kt-retention-plot").remove();
	$("#kt-retention-container").append("<canvas id='kt-retention-plot' width='485' height='180' class='chartjs-render-monitor' style='display: block; height: 200px; width: 500px; margin: 0 auto;'></canvas>");   	
	var ctx= $('#kt-retention-plot');

	var data = {
	  labels: ["Algorithms", "Data Structures"],
	  datasets: [{
	    label: "Mot",
	    backgroundColor: KTApp.getStateColor("brand"),
	    data: [0.7, 0.8]
	  }, {
	    label: "Eng",
	    backgroundColor: KTApp.getStateColor("danger"),
	    data: [0.57, 0.64]
	  }]
	};

	var myBarChart = new Chart(ctx, {
	  type: 'horizontalBar',
	  data: data,
	  options: {
	    barValueSpacing: 20,
	    scales: {
	      xAxes: [{
	        ticks: {
	          min: 0,
	          max: 1
	        }
	      }]
	    }
	  }
	
	});
}


function retention_2(){	
	$("#kt-retention-plot").remove();
	$("#kt-retention-container").append("<canvas id='kt-retention-plot' width='485' height='180' class='chartjs-render-monitor' style='display: block; height: 200px; width: 500px; margin: 0 auto;'></canvas>");
	var ctx= $('#kt-retention-plot');

	var data = {
	  labels: ["Algorithms", "Data Structures"],
	  datasets: [{
	    label: "Mot",
	    backgroundColor: KTApp.getStateColor("brand"),
	    data: [0.64, 0.76]
	  }, {
	    label: "Eng",
	    backgroundColor: KTApp.getStateColor("danger"),
	    data: [0.60, 0.72]
	  }]
	};

	var myBarChart = new Chart(ctx, {
	  type: 'horizontalBar',
	  data: data,
	  options: {
	    barValueSpacing: 20,
	    scales: {
	      xAxes: [{
	        ticks: {
	          min: 0,
	          max: 1
	        }
	      }]
	    }
	  }
	
	});
}


function retention_3(){	
	$("#kt-retention-plot").remove();
	$("#kt-retention-container").append("<canvas id='kt-retention-plot' width='485' height='180' class='chartjs-render-monitor' style='display: block; height: 200px; width: 500px; margin: 0 auto;'></canvas>");
	var ctx= $('#kt-retention-plot');

	var data = {
	  labels: ["Algorithms", "Data Structures"],
	  datasets: [{
	    label: "Mot",
	    backgroundColor: KTApp.getStateColor("brand"),
	    data: [0.78, 0.45]
	  }, {
	    label: "Eng",
	    backgroundColor: KTApp.getStateColor("danger"),
	    data: [0.74, 0.67]
	  }]
	};

	var myBarChart = new Chart(ctx, {
	  type: 'horizontalBar',
	  data: data,
	  options: {
	    barValueSpacing: 20,
	    scales: {
	      xAxes: [{
	        ticks: {
	          min: 0,
	          max: 1
	        }
	      }]
	    }
	  }
	
	});
}





function interaction_plot_1() {
	$("#kt_courses_interactions_chart").remove();
	$("#courses-interaction-container").append("<canvas id='kt_courses_interactions_chart' width='485' height='300' class='chartjs-render-monitor' style='display: block; height: 200px; width: 500px; margin: 0 auto;'></canvas>");
	var config = {
		  type: 'line',
		  data: {
		    labels: ['05-04-2019', '06-04-2019', '07-04-2019', '08-04-2019', '09-04-2019','10-04-2019','11-04-2019'],
		    datasets: [{
		      label: 'Algorithms',
		      data: [32, 24, 18, 56, 33, 41, 29],
		      borderColor: 'rgb(122, 137, 250)',
	    	  backgroundColor: 'rgba(122, 137, 250, 0.2)',
	    	  lineTension: 0
		    }, {
		      label: 'Data Structures',
		      data: [, , ,23, 14, 46, 19],
		      borderColor: '#FD3995',
	    	  backgroundColor: 'rgba(253,57,149,0.2)',
	    	  lineTension: 0
		    }]
		  },
		  options: {
		    spanGaps: true,
		    responsive: true,
		    tooltips: {
		      mode: 'index',
		      intersect: false,
		      callbacks: {
	                label: function(tooltipItem, data) {
	                    return data.datasets[tooltipItem.datasetIndex].label+": "+tooltipItem.yLabel+"%";
	                }
	            }
		    },
		    hover: {
		      mode: 'nearest',
		      intersect: true
		    },
		    scales: {
		      xAxes: [{
		        display: true,
		        scaleLabel: {
		          display: true,
		        }
		      }],
		      yAxes: [{
		        display: true,
		        scaleLabel: {
		          display: true,
		        },
		        ticks: {
		        	min:0,
		        	max: 100
	            }
		      }]
		    }
		  },

		};
    	
    	var ctx= $('#kt_courses_interactions_chart');
        var chart = new Chart(ctx, config);
}


function interaction_plot_2() {
	$("#kt_courses_interactions_chart").remove();
	$("#courses-interaction-container").append("<canvas id='kt_courses_interactions_chart' width='485' height='300' class='chartjs-render-monitor' style='display: block; height: 200px; width: 500px; margin: 0 auto;'></canvas>");
	var config = {
		  type: 'line',
		  data: {
		    labels: ['12-04-2019', '13-04-2019', '14-04-2019', '15-04-2019', '16-04-2019','17-04-2019','18-04-2019'],
		    datasets: [{
		      label: 'Algorithms',
		      data: [37, 26, 23, 56, 64, 36, 77],
		      borderColor: 'rgb(122, 137, 250)',
	    	  backgroundColor: 'rgba(122, 137, 250, 0.2)',
	    	  lineTension: 0
		    }, {
		      label: 'Data Structures',
		      data: [55,45 ,25 ,77, 33, 85, 68],
		      borderColor: '#FD3995',
	    	  backgroundColor: 'rgba(253,57,149,0.2)',
	    	  lineTension: 0
		    }]
		  },
		  options: {
		    spanGaps: true,
		    responsive: true,
		    tooltips: {
		      mode: 'index',
		      intersect: false,
		      callbacks: {
	                label: function(tooltipItem, data) {
	                    return data.datasets[tooltipItem.datasetIndex].label+": "+tooltipItem.yLabel+"%";
	                }
	            }
		    },
		    hover: {
		      mode: 'nearest',
		      intersect: true
		    },
		    scales: {
		      xAxes: [{
		        display: true,
		        scaleLabel: {
		          display: true,
		        }
		      }],
		      yAxes: [{
		        display: true,
		        scaleLabel: {
		          display: true,
		        },
		        ticks: {
		        	min:0,
		        	max: 100
	            }
		      }]
		    }
		  },

		};
    	
    	var ctx= $('#kt_courses_interactions_chart');
        var chart = new Chart(ctx, config);
}


function interaction_plot_3() {
	$("#kt_courses_interactions_chart").remove();
	$("#courses-interaction-container").append("<canvas id='kt_courses_interactions_chart' width='485' height='300' class='chartjs-render-monitor' style='display: block; height: 200px; width: 500px; margin: 0 auto;'></canvas>");
	var config = {
		  type: 'line',
		  data: {
		    labels: ['19-04-2019', '20-04-2019', '21-04-2019', '22-04-2019', '23-04-2019','24-04-2019','25-04-2019'],
		    datasets: [{
		      label: 'Algorithms',
		      data: [77, 46, 88, 46, 83, 31, 89],
		      borderColor: 'rgb(122, 137, 250)',
	    	  backgroundColor: 'rgba(122, 137, 250, 0.2)',
	    	  lineTension: 0
		    }, {
		      label: 'Data Structures',
		      data: [89, 53,67 ,83, 34, 76, 69],
		      borderColor: '#FD3995',
	    	  backgroundColor: 'rgba(253,57,149,0.2)',
	    	  lineTension: 0
		    }]
		  },
		  options: {
		    spanGaps: true,
		    responsive: true,
		    tooltips: {
		      mode: 'index',
		      intersect: false,
		      callbacks: {
	                label: function(tooltipItem, data) {
	                    return data.datasets[tooltipItem.datasetIndex].label+": "+tooltipItem.yLabel+"%";
	                }
	            }
		    },
		    hover: {
		      mode: 'nearest',
		      intersect: true
		    },
		    scales: {
		      xAxes: [{
		        display: true,
		        scaleLabel: {
		          display: true,
		        }
		      }],
		      yAxes: [{
		        display: true,
		        scaleLabel: {
		          display: true,
		        },
		        ticks: {
		        	min:0,
		        	max: 100
	            }
		      }]
		    }
		  },

		};
    	
    	var ctx= $('#kt_courses_interactions_chart');
        var chart = new Chart(ctx, config);
}