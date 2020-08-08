<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- Bootstrap 3.3.7 -->
<link rel="stylesheet"
	href="static/assets/bower_components/bootstrap/dist/css/bootstrap.min.css" />
<!-- Font Awesome -->
<link rel="stylesheet"
	href="static/assets/bower_components/font-awesome/css/font-awesome.min.css" />
<!-- Ionicons -->
<link rel="stylesheet"
	href="static/assets/bower_components/Ionicons/css/ionicons.min.css" />
<!-- Theme style -->
<link rel="stylesheet" href="static/assets/dist/css/AdminLTE.min.css" />
<!-- AdminLTE Skins. Choose a skin from the css/skins
       folder instead of downloading all of them to reduce the load. -->
<link rel="stylesheet" href="static/assets/dist/css/skins/_all-skins.min.css" />
<!-- Morris chart -->
<link rel="stylesheet"
	href="static/assets/bower_components/morris.js/morris.css" />
<!-- jvectormap -->
<link rel="stylesheet"
	href="static/assets/bower_components/jvectormap/jquery-jvectormap.css" />
<!-- Date Picker -->
<link rel="stylesheet"
	href="static/assets/bower_components/bootstrap-datepicker/dist/css/bootstrap-datepicker.min.css" />
<!-- Daterange picker -->
<link rel="stylesheet"
	href="static/assets/bower_components/bootstrap-daterangepicker/daterangepicker.css" />
<!-- bootstrap wysihtml5 - text editor -->
<link rel="stylesheet"
	href="static/assets/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css" />
<!-- jQuery 3 -->
<script src="static/assets/bower_components/jquery/dist/jquery.min.js"></script>
<!-- jQuery UI 1.11.4 -->
<script src="static/assets/bower_components/jquery-ui/jquery-ui.min.js"></script>
<!-- Resolve conflict in jQuery UI tooltip with Bootstrap tooltip -->
<!-- Bootstrap 3.3.7 -->
<script src="static/assets/bower_components/bootstrap/dist/js/bootstrap.min.js"></script>
<!-- Morris.js charts -->
<script src="static/assets/bower_components/raphael/raphael.min.js"></script>
<script src="static/assets/bower_components/morris.js/morris.min.js"></script>
<!-- Sparkline -->
<script
	src="static/assets/bower_components/jquery-sparkline/dist/jquery.sparkline.min.js"></script>
<!-- jvectormap -->
<script src="static/assets/plugins/jvectormap/jquery-jvectormap-1.2.2.min.js"></script>
<script
	src="static/assets/plugins/jvectormap/jquery-jvectormap-world-mill-en.js"></script>
<!-- jQuery Knob Chart -->
<script
	src="static/assets/bower_components/jquery-knob/dist/jquery.knob.min.js"></script>
<!-- daterangepicker -->
<script src="static/assets/bower_components/moment/min/moment.min.js"></script>
<script
	src="static/assets/bower_components/bootstrap-daterangepicker/daterangepicker.js"></script>
<!-- datepicker -->
<script
	src="static/assets/bower_components/bootstrap-datepicker/dist/js/bootstrap-datepicker.min.js"></script>
<!-- Bootstrap WYSIHTML5 -->
<script
	src="static/assets/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js"></script>
<!-- Slimscroll -->
<script
	src="static/assets/bower_components/jquery-slimscroll/jquery.slimscroll.min.js"></script>
<!-- FastClick -->
<script src="static/assets/bower_components/fastclick/lib/fastclick.js"></script>
<!-- AdminLTE App -->
<script src="static/assets/dist/js/adminlte.min.js"></script>
<!-- AdminLTE dashboard demo (This is only for demo purposes) -->
<script src="static/assets/dist/js/pages/dashboard.js"></script>
<!-- AdminLTE for demo purposes -->
<script src="static/assets/dist/js/demo.js"></script>
<!-- iCheck for checkboxes and radio inputs -->
<link rel="stylesheet" href="static/assets/plugins/iCheck/all.css"/>
<script src="static/assets/plugins/iCheck/icheck.min.js"></script>
<!-- DataTables js 引入 -->
<script src="static/assets/bower_components/datatables.net/js/jquery.dataTables.min.js"></script>
<script src="static/assets/bower_components/datatables.net-bs/js/dataTables.bootstrap.min.js"></script>
</head>
<body>
	<aside class="main-sidebar"> <section class="sidebar">
	<div class="user-panel">
		<div class="pull-left image">
			<img src="static/assets/dist/img/user2-160x160.jpg" class="img-circle"
				alt="User Image">
		</div>
		<div class="pull-left info">
			<p>${userInfo.email}</p>
			<a href="#"><i class="fa fa-circle text-success"></i>在线</a>
		</div>
	</div>
	<!-- search form -->
	<form action="#" method="get" class="sidebar-form">
		<div class="input-group">
			<input type="text" name="q" class="form-control"
				placeholder="Search..."> <span class="input-group-btn">
				<button type="submit" name="search" id="search-btn"
					class="btn btn-flat">
					<i class="fa fa-search"></i>
				</button>
			</span>
		</div>
	</form>
	<ul class="sidebar-menu" data-widget="tree">
		<li class="header">MAIN NAVIGATION</li>
		<li class="active treeview">
			<a href="#">
				<i class="fa fa-fw fa-users"></i>
				<span>Employees</span>
				<span class="pull-right-container">
					<i class="fa fa-angle-left pull-right"></i>
				</span>
			</a>
			<ul class="treeview-menu">
				<li>
					<a href="employeesregister">
						<i class="fa fa-circle-o"></i>Employees Register
					</a>
				</li>
				<li class="active">
					<a href="employeesmanger">
						<i class="fa fa-circle-o"></i>Employees Manager
					</a>
				</li>
			</ul>
		</li>
		<li class="active treeview">
			<a href="#">
				<i class="fa fa-fw fa-book"></i>
				<span>ContentCategory Manager</span>
				<span class="pull-right-container">
					<i class="fa fa-angle-left pull-right"></i>
				</span>
			</a>
			<ul class="treeview-menu">
				<li>
					<a href="contentCategoryManage">
						<i class="fa fa-circle-o"></i>Content Category
					</a>
				</li>
				<li>
					<a href="contentManage">
						<i class="fa fa-circle-o"></i>Content
					</a>
				</li>
			</ul>
		</li>
	</ul>
	</section> </aside>
</body>
</html>