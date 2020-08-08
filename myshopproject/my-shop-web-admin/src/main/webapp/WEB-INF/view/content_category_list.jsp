<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!--引入jsp标签，用于加载后台返回的数据 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Employees Register</title>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport" />

    <!-- jQuery 3 -->
    <script src="static/assets/bower_components/jquery/dist/jquery.min.js"></script>

    <!-- 导入 treeTable的样式 -->
    <link rel="stylesheet" type="text/css" href="static/assets/plugins/treeTable/jquery.treetable.css"/>
    <link rel="stylesheet" type="text/css" href="static/assets/plugins/treeTable/jquery.treetable.theme.default.css"/>
    <link rel="stylesheet" type="text/css" href="static/assets/plugins/treeTable/screen.css"/>
</head>

<body class="hold-transition skin-blue sidebar-mini">
<div class="wrapper">
    <jsp:include page="../includes/header.jsp"></jsp:include>
    <jsp:include page="../includes/nav.jsp"></jsp:include>
    <div class="content-wrapper">
     <!-- Content Header (Page header) -->
        <section class="content-header">
            <h1>
                Content Manager
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
                        <form action="searchEmployeeInfo" method="post">
                            <div class="box-body">
                                <div class="row">
                                    <div class="col-xs-3">
                                        <label for="categoryId" style="width: 125px;top: 7px;" class="col-sm-2 control-label">Category Id:</label>
                                        <input id="categoryId" name="categoryId" style="width: 200px;" type="text" class="form-control">
                                    </div>
                                    <div class="col-xs-4">
                                        <label style="width: 146px;top: 7px;" for="name" class="col-sm-2 control-label">Category Name:</label>
                                        <input id="name" style="width: 200px;" name="name" type="text" class="form-control" >
                                    </div>
                                    <div class="col-xs-5" style="right: 84px;">
                                        <button type="submit" style="width: 98px;height: 34px;" class="btn btn-block btn-success btn-lg">Search</button>
                                    </div>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>

            <div class="row">
                <div class="col-xs-12">
                    <div class="box">
                        <div class="box-header">
                            <h3 class="box-title">Content Category List</h3>
                        </div>
                        <!-- table -->
                        <div class="box-body table-responsive no-padding">
                            <table id="treeTableId" class="table table-hover">
                                <!-- .box-header -->
                                <thead>
                                    <tr>
                                        <th>Category Id</th>
                                        <th>Category Name</th>
                                        <th>Category Sort</th>
                                        <th>Operate</th>
                                    </tr>
                                </thead>
                                <!-- .box-tbody -->
                                <tbody>
                                <c:forEach items="${ContentCategporyInfoList}" var="item">
                                    <tr id="${item.id}" pId="${item.parentId}">
                                        <td>${item.id}</td>
                                        <td>${item.name}</td>
                                        <td>${item.sortOrder}</td>
                                        <td>
                                            <a href="employeesregister?employeeId=${item.id}" type="button" class="btn btn-primary btn-sm add-employee-button-margin-right">
                                                <span class="glyphicon glyphicon-pencil"></span> <span class="glyphicon-class"><!-- Modify--></span>
                                            </a>
                                            <button id="deleteId" href="#" type="button" class="btn btn-danger btn-sm add-employee-button-margin-right" onclick="App.deleteEmployeeByOne(${item.id}, 'deleteEmployee')">
                                                <span class="glyphicon glyphicon-trash"></span> <span class="glyphicon-class"><!-- Delete--></span>
                                            </button>
                                        </td>
                                    </tr>
                                </c:forEach>
                                </tbody>
                                <!-- /.box-body -->
                            </table>
                            <!-- /.box-table -->
                        </div>
                    </div>
                </div>
            </div>
        </section>
    </div>
    <jsp:include page="../includes/footer.jsp"></jsp:include>
    <div class="control-sidebar-bg"></div>
</div>

</body>
<!-- 导入 treeTable的js -->
<script src="static/assets/plugins/treeTable/jquery.treetable.js"></script>
<script src="static/assets/plugins/treeTable/jquery-ui.js"></script>
<script type="text/javascript">
    $(function () {
        //$('#treeTableId').DataTable();
        $("#treeTableId").treetable();
    });
</script>
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

