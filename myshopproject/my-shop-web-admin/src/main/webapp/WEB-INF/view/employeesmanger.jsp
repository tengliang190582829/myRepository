<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!--引入jsp标签，用于加载后台返回的数据 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Employees Manager</title>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no"
	name="viewport" />
<!-- jQuery 3 -->
<script src="static/assets/bower_components/jquery/dist/jquery.min.js"></script>
<!-- DataTables -->
<!--script src="static/assets/bower_components/datatables.net/js/jquery.dataTables.min.js"></script-->
<script src="static/assets/app/app.js"></script>
</head>

<body class="hold-transition skin-blue sidebar-mini">
	<div class="wrapper">
		<jsp:include page="../includes/header.jsp"></jsp:include>
		<jsp:include page="../includes/nav.jsp"></jsp:include>
		<div class="content-wrapper">
			<!-- Content Header (Page header) -->
			<section class="content-header">
			<h1>
				Employees Manager
			</h1>
			<ol class="breadcrumb">
				<li><a href="main"><i class="fa fa-dashboard"></i> Home</a></li>
			</ol>
			</section>

			<!-- Main content -->
			<section class="content">
				<div class="row">
					<div class="col-xs-12">
						<div class="box box-danger">
							<div class="box-header with-border">
								<h3 class="box-title">Search Params</h3>
							</div>
								<div class="box-body">
									<div class="row">
										<div class="col-xs-3">
											<label for="employeeId" style="width: 125px;top: 7px;" class="col-sm-2 control-label">Employee Id:</label>
											<input id="employeeId" name="employeeId" style="width: 200px;" type="text" class="form-control">
										</div>
										<div class="col-xs-4">
											<label style="width: 146px;top: 7px;" for="employeeName" class="col-sm-2 control-label">Employee Name:</label>
											<input id="employeeName" style="width: 200px;" name="employeeName" type="text" class="form-control" >
										</div>
										<div class="col-xs-5" style="right: 84px;">
											<label for="employeeEmail" style="width: 146px;top: 7px;" class="col-sm-2 control-label">Employee Email:</label>
											<input id="employeeEmail" name="employeeEmail" style="width: 200px;" type="text" class="form-control">
										</div>
									</div>
								</div>
								<div class="box-body">
									<div class="row">
										<div class="col-xs-3">
											<label for="status" style="width: 125px;top: 7px;" class="col-sm-2 control-label">status:</label>
											<div class="col-sm-10" style="width: 116px; right: 15px;}">
												<select value="status" id="status" name="status"  style="width: 200px;height: 31px;" class="form-control">
													<option value="2">Active</option>
													<option value="0">No Active</option>
												</select>
											</div>
										</div>
										<div class="col-xs-4">
											<label style="width: 148px;top: 7px; right: 7px;" for="employeeMobilePhone" class="col-sm-2 control-label">Employee Phone:</label>
											<input id="employeeMobilePhone" style="width: 200px;" name="employeeMobilePhone" type="text" class="form-control" >
										</div>
										<div class="col-xs-5" style="right: 84px;width: 109px;">
											<button type="button" style="width: 98px;height: 34px;" class="btn btn-block btn-success btn-lg" onclick="search()">Search</button>
										</div>
									</div>
								</div>
						</div>
					</div>
				</div>

				<div class="row">
					<div class="col-xs-12">
						<div class="box">
							<div class="box-header">
								<h3 class="box-title">Employees List</h3>
							</div>
							<!-- table -->
							<div class="box-body table-responsive">
								<table id="dataTableId" class="table table-hover">
									<!-- .box-header -->
									<thead>
										<tr>
											<th>
												<input type="checkbox" class="minimal-red icheck_master"/>
											</th>
											<th>Employee Id</th>
											<th>Employee Name</th>
											<th>Employee Type</th>
											<th>Employee Phone</th>
											<th>Employee Sex</th>
											<th>Employee Email</th>
											<th>Employee State</th>
											<th>Employee Photo</th>
											<th>Employee Address</th>
											<th>remake</th>
											<th>Create Time</th>
											<th>Expiry Time</th>
											<th>Operate</th>
										</tr>
									</thead>
								</table>
							</div>
						</div>
					</div>
				</div>
			</section>
		</div>
	</div>

	<jsp:include page="../includes/footer.jsp"></jsp:include>

	<script type="text/javascript">
		debugger;
		var _dataTable;
		$(function () {
			var columns = [
				{
					data: function ( row, type, val, meta  ) {
						return '<input id="' + row.employeeId +'" type="checkbox" class="minimal-red">'
					}
				},
				{data: "employeeId"},
				{data: "employeeName"},
				{data: "employeeType"},
				{data: "employeeMobilePhone"},
				{data: "sex"},
				{data: "employeeEmail"},
				{data: "status"},
				{data: "employeePhotoId"},
				{data: "employeeAddRess"},
				{data: "remake"},
				{data: "createTime"},
				{data: "expiryTime"},
				{
					data: function ( row, type, val, meta  ) {
						return '<a href="employeesregister?employeeId=' + row.employeeId + '" type="button" class="btn btn-primary btn-sm add-employee-button-margin-right">'
								+ '<span class="glyphicon glyphicon-pencil"></span>'
								+ '<span class="glyphicon-class"><!-- Modify--></span></a>'
								+ '<button id="deleteId" href="#" type="button" class="btn btn-danger btn-sm add-employee-button-margin-right"'
								+ 'onclick="App.deleteEmployeeByOne(' + row.employeeId + ')">'
								+ '<span class="glyphicon glyphicon-trash"></span> <span class="glyphicon-class"><!-- Delete--></span> </button>';
					}
				}
			];

			_dataTable = App.initDataTables("employee/pages", columns);
		});

		function search () {
			debugger;
			var employeeId = $("#employeeId").val();
			var employeeName = $("#employeeName").val();
			var employeeEmail = $("#employeeEmail").val();
			var status = $("#status").val();
			var employeeMobilePhone = $("#employeeMobilePhone").val();
			var param = {
				employeeId: employeeId,
				employeeName: employeeName,
				employeeEmail: employeeEmail,
				status: status,
				employeeMobilePhone: employeeMobilePhone
			};
			_dataTable.settings()[0].ajax.data = param;
			_dataTable.ajax.reload();
		}

	</script>

</body>
</html>



<style type="text/css">
	.add-employees {
		margin-bottom: 7px;
		margin-right: 20px;
		margin-top: 35px;
	}

	.add-employee-button-margin-right {
		margin-right: 10px;
	}

	#btn-width {
		width: 50px;
	}
</style>

