<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!--引入jsp标签，用于加载后台返回的数据 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!-- spring mvc 表单主键 ->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Employees Register</title>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport" />

    <!-- DataTables -->
<!-- jQuery 3 -->
    <script src="static/assets/bower_components/jquery/dist/jquery.min.js"></script>
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
                    <!-- Employees Baseinfo -->
                    <div class="box box-info">
                        <div class="box-header with-border">
                            <h3 class="box-title">Employees BaseInfo</h3>
                        </div>
                        <!-- /.box-header -->
                        <c:if test="${baseResult != null}">
                            <div class="pad margin no-print">
                                <div class="callout callout-danger" style="margin-bottom: 0!important;">
                                        <h4>Message:</h4>
                                        ${baseResult}
                                </div>
                            </div>
                        </c:if>
                        <!-- form start -->
                        <form:form id="inputForm" cssClass="form-horizontal" action="saveEmployeeInfo" METHOD="post" modelAttribute="employeeEntity">
                            <form:hidden path="employeeId"></form:hidden>
                            <div class="box-body">
                                <div class="form-group">
                                    <label for="employeeName" class="col-sm-2 control-label">Employee Name</label>
                                    <div class="col-sm-10">
                                        <form:input cssClass="form-control required" maxlength="70" path="employeeName" placeholder="Name" disabled="employeeId != null"/>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="employeeType" class="col-sm-2 control-label">Employee Type</label>
                                    <div class="col-sm-10">
                                        <form:select path="employeeType" cssClass="form-control">
                                            <option>请选择员工级别</option>
                                            <form:option value="0">普通员工</form:option>
                                            <form:option value="1">超级管理员</form:option>
                                        </form:select>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="password" class="col-sm-2 control-label">Employee passWord</label>
                                    <div class="col-sm-10">
                                        <form:password cssClass="form-control required" maxlength="70" path="password" placeholder="password"/>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="employeeMobilePhone" class="col-sm-2 control-label">Employee Phone</label>
                                    <div class="col-sm-10">
                                        <form:input path="employeeMobilePhone" maxlength="70" cssClass="form-control required mobile" placeholder="Mobile Phone"/>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="sexId" class="col-sm-2 control-label">Employee Sex</label>
                                    <div class="col-sm-10" id="sexId">
                                        <div><form:radiobutton path="sex" cssClass="radio" value="男"/>男</div>
                                        <div><form:radiobutton path="sex" cssClass="radio" value="女"/>女</div>
                                    </div>
                                </div>
                                <div class="form-group" style="position: relative;display: flex;">
                                    <label for="employeeEmail" class="col-sm-2 control-label" style="width: 279px; right: -4px;">Employee Email</label>
                                        <span class="form-control" style="width: 49px; margin-left: 14px;"><i class="fa fa-envelope"></i></span>
                                        <form:input cssClass="form-control required email" maxlength="70" style="margin-right: -57px; width: 1293px;" path="employeeEmail" placeholder="Email" type="email"/>
                                </div>
                                <div class="form-group">
                                    <label for="exampleInputFile" class="col-sm-2 control-label">Employee Photo</label>
                                    <div class="col-sm-10">
                                        <input type="file" id="exampleInputFile">
                                        <p class="help-block">Example block-level help text here.</p>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="employeeAddRess" class="col-sm-2 control-label">Employee Address</label>
                                    <div class="col-sm-10">
                                        <form:input path="employeeAddRess" maxlength="200" cssClass="form-control" placeholder="Address Info"/>
                                    </div>
                                </div>
                                <div class="form-group" style="margin-left: 189px;">
                                    <label style="float: left;">Textarea</label>
                                    <form:textarea path="remake" cssClass="form-control" placeholder="remake"/>
                                </div>
                            </div>
                            <!-- /.box-body -->
                            <div class="box-footer">
                                <c:if test="${employeeId == ''}">
                                    <button type="button" class="btn btn-default" onclick="history.go(-1);">Cancel</button>
                                </c:if>
                                <button type="submit" class="btn btn-info pull-right">Submit</button>
                            </div>

                            <!-- /.box-footer -->
                        </form:form>
                    </div>
                </section>
            </div>

            <!-- /.content-wrapper -->
            <jsp:include page="../includes/footer.jsp"></jsp:include>
            <div class="control-sidebar-bg"></div>
        </div>
    </body>
</html>