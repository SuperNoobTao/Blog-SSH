<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>Login Page | Amaze UI Example</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="format-detection" content="telephone=no">
    <meta name="renderer" content="webkit">
    <meta http-equiv="Cache-Control" content="no-siteapp" />
    <link rel="alternate icon" type="image/png" href="assets/i/favicon.png">
    <link rel="stylesheet" href="assets/css/amazeui.min.css"/>

    <style>
        .header {
            text-align: center;
        }
        .header h1 {
            font-size: 200%;
            color: #333;
            margin-top: 30px;
        }
        .header p {
            font-size: 14px;
        }
    </style>
</head>
<body>
<div class="header">
    <div class="am-g">
        <h1>几乎</h1>
        <p>分享知识<br/>一个知识分享的平台</p>
    </div>
    <hr />
</div>


<div class="am-u-lg-6 am-u-md-8 am-u-sm-centered">
    <div class="am-u-md-8 am-u-sm-centered">
        <form method="post" class="am-form am-form-horizontal" action="UserAction_register.action"  name="myform">

            <%--账号--%>
            <div class="am-input-group am-form-group">
                <span class="am-input-group-label"><i class="am-icon-user am-icon-fw"></i></span>
                <input type="text" class="am-form-field" name="usertableBean.userAcount" placeholder="Username">
            </div>
            <%--密码--%>
            <div class="am-input-group am-form-group">
                <span class="am-input-group-label"><i class="am-icon-lock am-icon-fw"></i></span>
                <input type="text" class="am-form-field" name="usertableBean.userPwd" placeholder="Password">
            </div>
            <%--邮箱--%>
            <div class="am-input-group am-form-group">
                <span class="am-input-group-label">Email</span>
                <input type="email" class="am-form-field" name="usertableBean.userEmail" placeholder="Email">
            </div>
            <%--手机--%>
            <div class="am-input-group am-form-group">
                <span class="am-input-group-label">Phone</span>
                <input type="phone" class="am-form-field"  name="usertableBean.userPhone" placeholder="cellphone" >
                <span class="am-input-group-btn">
                  <input    type="button" name="phone"  value="点击获取验证码" class="am-btn am-btn-primary am-btn-block" onclick="showtime(60)"/></span>
            </div>
            <%--验证码--%>
            <div class="am-input-group am-form-group">
                <input type="text" class="am-form-field" placeholder="请输入验证码">
                <span class="am-input-group-label">   验证码</span>
            </div>

            <button type="submit" class="am-btn am-btn-primary am-btn-block">注册账号</button>


            <script>
                function showtime(t){
                    document.myform.phone.disabled=true;
                    for(i=1;i<=t;i++) {
                        window.setTimeout("update_p(" + i + ","+t+")", i * 1000);
                    }

                }

                function update_p(num,t) {
                    if(num == t) {
                        document.myform.phone.value =" 重新发送 ";
                        document.myform.phone.disabled=false;
                    }
                    else {
                        printnr = t-num;
                        document.myform.phone.value = " (" + printnr +")秒后重新发送";
                    }
                }
            </script>


        </form>
        <hr>
        <p>© 2016 -------------------------------------------</p>

    </div>

</div>
</body>
</html>


