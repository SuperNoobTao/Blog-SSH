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
        <form method="post" class="am-form" action="UserAction_login.action" >
          <label for="email">邮箱:</label>
          <input type="text" name="usertableBean.studentNumber" id="email" value="">
          <br>
          <label for="password">密码:</label>

          <input type="password" name="usertableBean.password" id="password" value="">
          <br>
          <label for="remember-me">
            <input id="remember-me" type="checkbox">
            记住密码
          </label>
          <br />
          <div class="am-cf">
            <input type="submit" name="" value="登 录" class="am-btn am-btn-primary am-btn-sm am-fl">
            <input type="submit" name="" value="忘记密码" class="am-btn am-btn-default am-btn-sm am-fr">
          </div>
        </form>
        <hr>
        <p>© 2016 -------------------------------------------</p>

</div>
</div>
</body>
</html>
