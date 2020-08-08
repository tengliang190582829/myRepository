<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
<!-- Tell the browser to be responsive to screen width -->
<meta
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no"
	name="viewport">
<!-- bootstrap框架 -->
<link rel="stylesheet"
	href="static/assets/bower_components/bootstrap/dist/css/bootstrap.min.css" />
<!-- Ionicons -->
<link rel="stylesheet"
	href="static/assets/bower_components/Ionicons/css/ionicons.css" />
<!-- Font awesome -->
<link rel="stylesheet"
	href="static/assets/bower_components/font-awesome/css/font-awesome.css" />
<link rel="stylesheet" href="static/assets/css/AdminLTE.min.css" />
<link rel="stylesheet" href="static/assets/plugins/iCheck/square/blue.css" />

<!-- /.login-box -->
<!-- jQuery 3 -->
<script src="static/assets/bower_components/jquery/dist/jquery.min.js"></script>
<!-- Bootstrap 3.3.7 -->
<script src="static/assets/bower_components/bootstrap/dist/js/bootstrap.min.js"></script>
<!-- iCheck -->
<script src="static/assets/plugins/iCheck/icheck.min.js"></script>

<!-- 添加特殊样式，调整页面美观 -->
<style type="text/css">
.checkbox_icheck_left {
	margin-left: 20px;
}
</style>

<script type="text/javascript">
 		  $(function () {
 		    $('input').iCheck({
 		      checkboxClass: 'icheckbox_square-blue',
 		      radioClass: 'iradio_square-blue',
 		      increaseArea: '20%' /* optional */
 		    });
 		  });
		</script>
<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
	    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
	    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
	    <![endif]-->

</head>
<body class="hold-transition login-page">
	<div class="login-box">
		<div class="login-logo">
			<p>Admin Login</p>
		</div>
		<!-- /.login-logo -->
		<div class="login-box-body">
			<p class="login-box-msg">Welcome Login</p>
			<form action="login" method="post">
				<!-- email -->
				<div>${loginRespMessage}</div>
				<div class="form-group has-feedback">
					<input name="email" type="email" class="form-control"
						placeholder="Email" /> <span
						class="glyphicon glyphicon-envelope form-control-feedback"></span>
				</div>
				<!-- password -->
				<div class="form-group has-feedback">
					<input name="password" type="password" class="form-control"
						placeholder="Password" /> <span
						class="glyphicon glyphicon-lock form-control-feedback"></span>
				</div>
				<div class="row">
					<div class="col-xs-8">
						<div class="checkbox icheck checkbox_icheck_left">
							<label> <input type="checkbox" name="isCheckbox" />
								Remember Me
							</label>
						</div>
					</div>
					<!-- /.col -->
					<div class="col-xs-4">
						<button type="submit" class="btn btn-primary btn-block btn-flat">Sign
							In</button>
					</div>
					<!-- /.col -->
				</div>
			</form>
			<!-- /.social-auth-links -->
			<a href="#">I forgot my password</a><br>
		</div>
		<!-- /.login-box-body -->
	</div>
</body>
</html>