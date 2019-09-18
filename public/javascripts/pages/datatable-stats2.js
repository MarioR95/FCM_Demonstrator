'use strict';
// Class definition
var DatatableRow = function() {
	// Private functions
	
	var subTable = function(e){
		
		var status,statusColor;
		var type,typeColor
		var efficacy,efficacyColor;
		
		switch (e.data.type) {
		  case 0:
			  type = "Danger";
			  typeColor = "danger";
			break;
		  case 1:
			  type = "Warning";
			  typeColor = "warning"; 
		    break;
		  case 2:
			  type = "Renforce";
			  typeColor = "brand";
		    break;
		  case 3:
			  type = "Success";
			  typeColor = "success";
		    break;
		   default:
			   type = "NA";
		   	   typeColor = "Dark"
		    break;
		}
		
		switch (e.data.efficacy) {
		  case -1:
			  efficacy = "Negative";
			  efficacyColor = "danger";
			break;
		  case 0:
			  efficacy = "Neutral";
			  efficacyColor = "brand"; 
		    break;
		  case 1:
			  efficacy = "Positive";
			  efficacyColor = "success";
		    break;
		}
		
		if(e.data.status == 0){
			  status = "Not Sent";
			  statusColor = "warning";
		 }
		 else{
			  status = "Sent";
			  statusColor = "success";
		 }
		
		
		
		$(e.subTable).html(
				"<table class='table' style='width: 15%'>" +
					"<tr>" +
						"<td>Type</td>" +
						"<td class='kt-font-"+typeColor+"'>"+type+"</td>" +
					"</tr>" +
					"<tr>" +
						"<td>Status</td>" +
						"<td class='kt-font-"+statusColor+"'>"+status+"</td>" +
					"</tr>" +
					"<tr>" +
						"<td>Feedback Efficacy</td>" +
						"<td class='kt-font-"+efficacyColor+"'>"+efficacy+"</td>" +
					"</tr>" +
				"</table>");
	}

	// demo initializer
	var mainTableInit = function() {

		var dataJSONArray = JSON.parse(
			'[{"id":1,"weekOfMeasure":1, "start":"22-09-1994", "end":"01-10-1994","motivation": 0.25,"engagement": 0.25, "type":3, "status": 0, "efficacy": 1, "actionId": "gamification" }]');
			
		var datatable = $('#feedbackDatatable').KTDatatable({
			// datasource definition
			data: {
				type: 'local',
				source: dataJSONArray,
				pageSize: 5, // display 20 records per page
			},

			// layout definition
			layout: {
				scroll: false,
				height: null,
				footer: false,
			},

			sortable: false,

			filterable: false,

			pagination: false,

			detail: {
				title: 'Load sub table',
				content: subTable,
			},

			// columns definition
			columns: [
				{
					field: 'id',
					title: '',
					width: 10,
				}, {
					field: 'weekOfMeasure',
					title: 'WeekOfMeasure',
					textAlign: "center",
				},{
					field: 'start',
					title: 'Start',
					textAlign: "center",
				}, {
					field: 'end',
					title: 'End',
					textAlign: "center",
				}, {
					field: 'motivation',
					title: 'Motivation',
					textAlign: "center",
				}, {
					field: 'engagement',
					title: 'Engagement',
					textAlign: "center",
				},{
					field: 'Actions',
					width: 130,
					title: 'Actions',
					sortable: false,
					overflow: 'visible',
					template: function() {
						return '\
		                  <div class="dropdown">\
		                      <a href="javascript:;" class="btn btn-sm btn-clean btn-icon btn-icon-md" data-toggle="dropdown">\
		                          <i class="la la-ellipsis-h"></i>\
		                      </a>\
		                      <div class="dropdown-menu dropdown-menu-right">\
		                          <a class="dropdown-item" href="#"><i class="la la-edit"></i> Edit Details</a>\
		                          <a class="dropdown-item" href="#"><i class="la la-leaf"></i> Update Status</a>\
		                          <a class="dropdown-item" href="#"><i class="la la-print"></i> Generate Report</a>\
		                      </div>\
		                  </div>\
		                  <a href="javascript:;" class="btn btn-sm btn-clean btn-icon btn-icon-md" title="Edit details">\
		                      <i class="la la-edit"></i>\
		                  </a>\
		                  <a href="javascript:;" class="btn btn-sm btn-clean btn-icon btn-icon-md" title="Delete">\
		                      <i class="la la-trash"></i>\
		                  </a>\
		              ';
					},
				}],
		});

		$('#kt_form_status').on('change', function() {
			datatable.search($(this).val().toLowerCase(), 'Status');
		});

		$('#kt_form_type').on('change', function() {
			datatable.search($(this).val().toLowerCase(), 'Type');
		});

		$('#kt_form_status,#kt_form_type').selectpicker();

	};

	return {
		// Public functions
		init: function() {
			// init dmeo
			mainTableInit();
		},
	};
}();

jQuery(document).ready(function() {
	DatatableRow.init();
});