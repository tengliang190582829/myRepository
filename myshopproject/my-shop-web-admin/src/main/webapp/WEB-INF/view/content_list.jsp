<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Content Manager</title>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport" />
    <!-- jQuery 3 -->
    <script src="static/assets/bower_components/jquery/dist/jquery.min.js"></script>

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
                    <div class="box">
                        <div class="box-header">
                            <h3 class="box-title">Content List</h3>
                        </div>
                        <!-- table -->
                        <div class="box-body table-responsive">
                            <table id="dataTableId" class="table table-hover">
                                <!-- .box-header -->
                                <thead>
                                <tr>
                                    <th>category Id</th>
                                    <th>title</th>
                                    <th>sub Title</th>
                                    <th>title Desc</th>
                                    <th>url</th>
                                    <th>pic</th>
                                    <th>pic2</th>
                                    <th>content</th>
                                    <th>create Time</th>
                                    <th>modify Time</th>
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
            {data: "categoryId"},
            {data: "title"},
            {data: "subTitle"},
            {data: "titleDesc"},
            {data: "url"},
            {data: "pic"},
            {data: "pic2"},
            {data: "content"},
            {data: "createTime"},
            {data: "modifyTime"},
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

        _dataTable = App.initDataTables("content/pages", columns);
    });
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

