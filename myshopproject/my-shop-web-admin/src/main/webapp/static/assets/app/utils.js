var App = function (){
    debugger;
    var _master_checkbox;
    var _minimal_red;
    var handlerInitCheckBox = function() {
        $('input[type="checkbox"].minimal-red').iCheck({
            checkboxClass: 'icheckbox_minimal-red',
            radioClass: 'iradio_minimal-red'
        });
        _master_checkbox = $('input[type="checkbox"].minimal-red.icheck_master');
        _minimal_red = $('input[type="checkbox"].minimal-red');
    }

    var handlerInitCheckBoxAll = function () {
        _master_checkbox = $('input[type="checkbox"].minimal-red.icheck_master');
        _minimal_red = $('input[type="checkbox"].minimal-red');
        _minimal_red.on("ifChecked", function (e) {
            // 当前状态已选中，点击后应取消选择
            if (e.target.checked) {
                _minimal_red.iCheck("uncheck");
            }
            // 当前状态未选中，点击后应全选
            else {
                _minimal_red.iCheck("check");
            }
        });
    };

    $("deleteId").bind("click", function () {});

    var deleteEmployee = function (delArray, url){
        $.ajax({
            type:"POST",
            url: url,
            data: {"deleteEmployeeId": delArray.toString()},
            dataType:"json",
            async:true, //请求是否异步，默认为异步，这也是ajax重要特性
            beforeSend:function(){
                //请求前的处理
            },
            complete:function(){
                //请求完成的处理
            },
            success:function(data){
                window.location.reload();

                if(data.status == "200"){
                    window.location.reload();
                }else{
                    console.log("数据删除失败："  + data.msg);
                }
            },
            error:function(){
                //请求出错处理
            }
        });
    };

    // 单个删除员工
    var deleteEmployeeByOne =  function (employeeId) {
        var deleteArray = [];
        var url = "deleteEmployee";
        deleteArray.push(employeeId);
        deleteEmployee(deleteArray, url);
    }

    // 初始化DataTable表格
    var handlerInitDataTables = function (url, columns) {
        debugger;
        var _dataTable = $('#dataTableId').DataTable({
            paging: true, // 是否进行分业务
            searching: false, // 是否显示搜索框
            ordering:  false, // 是否对列进行排序
            info: true, // 是否显示左下脚的信息
            scrollY: 200,
            scrollCollapse: true,
            jQueryUI: true,
            lengthChange: false,
            processing: true, // 加载数据 等待提示，提高用户体验度用
            serverSide: true, // 是否开启服务器模式，由后台进行分页
            deferRender: true, // 延迟渲染，提高数据加载速度
            language: {
                lengthMenu: "每页 _MENU_ 条记录",
                zeroRecords: "No have Date.",
                info: "第 _PAGE_ 页 ( 总共 _PAGES_ 页 )",
                infoEmpty: "No Date",
                infoFiltered: "(从 _MAX_ 条记录过滤)"
            },
            ajax: {
                url: url
            },
            columns: columns
        });
        return _dataTable;
    }

    // 返回方法
    return {
        init: function () {
            handlerInitCheckBox();
            handlerInitCheckBoxAll();
        },
        deleteEmployeeByOne: function(employeeId){
            deleteEmployeeByOne(employeeId);
        },
        initDataTables: function (url, columns) {
            return handlerInitDataTables(url, columns);
        }
    };
}();

/**
 * 界面加载时，初始化方法
 * */
$(document).ready(function(){
    App.init();
});