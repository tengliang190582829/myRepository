var Validate = function (){
    debugger;
    //$.noConflict();
    var handelInitValidate = function () {
        $.validator.addMethod("mobile", function (value, element) {
            var length = value.length();
            var mobile = /^(((13[0-9]{1}) | (15[0-9]{1}))+\d{8})$/;
            return this.optional(element) || (length == 11 && mobile.test(value));
        }, "请输入正确的手机号码.");

        $("#inputForm").validate({
            errorElement: 'span',
            errorClass: 'help-block',
            errorPlacement: function (error, element) {
                element.parent.parent.attr("class", "form-group has-error");
                error.insertAfter(element);
            }
        });
    };
    return {
        init: function(){
            handelInitValidate();
        }
    };
}();



