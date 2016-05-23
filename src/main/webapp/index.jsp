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
        <h1>IOnline</h1>
        <p>分享知识<br/>一个知识分享的平台</p>
    </div>
    <hr />
</div>


<div class="am-u-lg-6 am-u-md-8 am-u-sm-centered">
    <div class="am-u-md-8 am-u-sm-centered">
        <form method="post" class="am-form am-form-horizontal" action="UserAction_login.action" >

            <div class="am-input-group am-form-group">
                <span class="am-input-group-label"><i class="am-icon-user am-icon-fw"></i></span>
                <input type="text" class="am-form-field" name="usertableBean.studentNumber" placeholder="Username">
            </div>

            <div class="am-input-group am-form-group">
                <span class="am-input-group-label"><i class="am-icon-lock am-icon-fw"></i></span>
                <input type="text" class="am-form-field" name="usertableBean.password" placeholder="Password">

            </div>
            <div class="am-input-group am-form-group">
                <span class="am-input-group-label">Email</span>
                <input type="text" class="am-form-field" name="usertableBean.email" placeholder="Email">

            </div>


            <div class="am-input-group am-form-group">

                <span class="am-input-group-label">Phone</span>
                <input type="phone" class="am-form-field"  name="usertableBean.cellphone" placeholder="cellphone" >
                <span class="am-input-group-btn">
                  <input    type="button" value="点击获取验证码" class="am-btn am-btn-primary am-btn-block" onclick="settime(this)"/></span>
            </div>




            <div class="am-input-group am-form-group">
                <input type="text" class="am-form-field" placeholder="请输入验证码">
                <span class="am-input-group-label">   验证码</span>
            </div>

            <button type="submit" class="am-btn am-btn-primary am-btn-block">注册账号</button>




            <div class="am-cf">
            <script type="text/javascript">
                var countdown=60;
                function settime(val) {
                    if (countdown == 0) {
                        val.removeAttribute("disabled");
                        val.value="获取验证码";
                        countdown = 60;
                    } else {
                        val.setAttribute("disabled", true);
                        val.value="重新发送(" + countdown + ")";
                        countdown--;
                    }
                    setTimeout(function() {
                        settime(val)
                    },1000)
                }
            </script>
            </div>

        </form>
        <hr>
        <p>© 2016 -------------------------------------------</p>

    </div>

</div>
</body>
</html>


