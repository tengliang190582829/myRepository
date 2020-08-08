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
<!-- DataTables插件样式引入 -->
<link rel="stylesheet" href="static/assets/bower_components/datatables.net-bs/css/dataTables.bootstrap.min.css" />
<!-- jQuery 3 -->
<script src="static/assets/bower_components/jquery/dist/jquery.min.js"></script>
<!-- jQuery UI 1.11.4 -->
<script src="static/assets/bower_components/jquery-ui/jquery-ui.min.js"></script>
<!-- Resolve conflict in jQuery UI tooltip with Bootstrap tooltip -->
<script>
    $.widget.bridge('uibutton', $.ui.button);
  </script>
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
<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
  <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
  <![endif]-->

<!-- iCheck for checkboxes and radio inputs -->
<link rel="stylesheet" href="static/assets/plugins/iCheck/all.css"/>
<script src="static/assets/plugins/iCheck/icheck.min.js"></script>
</head>
<body>
	<header class="main-header"> <a href="index2.html"
		class="logo"> <span class="logo-mini"><b>A</b>LT</span> <span
		class="logo-lg"><b>商城后台管理平台</b></span>
	</a> <nav class="navbar navbar-static-top"> <a href="#"
		class="sidebar-toggle" data-toggle="push-menu" role="button"> <span
		class="sr-only">Toggle navigation</span>
	</a>
	<div class="navbar-custom-menu">
		<ul class="nav navbar-nav">
			<li class="dropdown messages-menu"><a href="#"
				class="dropdown-toggle" data-toggle="dropdown"> <i
					class="fa fa-envelope-o"></i> <span class="label label-success">1</span>
			</a>
				<ul class="dropdown-menu">
					<li class="header">You have 1 messages</li>
					<li>
						<ul class="menu">
							<li><a href="#">
									<div class="pull-left">
										<img src="static/assets/dist/img/user2-160x160.jpg"
											class="img-circle" alt="User Image">
									</div>
									<h4>
										张三<small><i class="fa fa-clock-o"></i> 5 mins</small>
									</h4>
									<p>你在干什么！?</p>
							</a></li>
						</ul>
					</li>
					<li class="footer"><a href="#">See All Messages</a></li>
				</ul></li>
			<li class="dropdown user user-menu"><a href="#"
				class="dropdown-toggle" data-toggle="dropdown"> <img
					src="static/assets/dist/img/user2-160x160.jpg" class="user-image"
					alt="User Image"> <span class="hidden-xs">${userInfo.email}</span>
			</a>
				<ul class="dropdown-menu">
					<li class="user-header"><img
						src="static/assets/dist/img/user2-160x160.jpg" class="img-circle"
						alt="User Image">
						<p>
							超级管理员<small>Member since Nov. 2018</small>
						</p></li>
					<li class="user-body">
						<div class="row">
							<div class="col-xs-4 text-center">
								<a href="#">Followers</a>
							</div>
							<div class="col-xs-4 text-center">
								<a href="#">Sales</a>
							</div>
							<div class="col-xs-4 text-center">
								<a href="#">Friends</a>
							</div>
						</div>
					</li>
					<li class="user-footer">
						<div class="pull-left">
							<a href="#" class="btn btn-default btn-flat">Profile</a>
						</div>
						<div class="pull-right">
							<a href="#" class="btn btn-default btn-flat">Sign out</a>
						</div>
					</li>
				</ul></li>
			<li><a href="#" data-toggle="control-sidebar"><i
					class="fa fa-gears"></i></a></li>
		</ul>
	</div>
	</nav> </header>
</body>
</html>