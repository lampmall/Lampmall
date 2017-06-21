<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/6/19 0019
  Time: 19:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <link rel="stylesheet" href="css/bootstrap.css" />
    <link rel="stylesheet" href="css/icon.css" />
    <link rel="stylesheet" href="css/easyui.css" />
    <script type="text/javascript" src="js/jquery.js"></script>
    <script type="text/javascript" src="js/easyui.js"></script>
    <script type="text/javascript">
        function login() {
            $("#f1").form("submit",{
               //处理返回值
                success:function(data){
                    var x=JSON.parse(data);
                    alert(x);
                    if(x==1){
                        location.href="main.jsp";
                    }else{
                        $.messager.alert("系统提示","登录失败");
                    }
                }
            });
        }
    </script>
  </head>
  <body>
  <div style="width:300px;margin:200px auto;">
    <form id="f1" action="login.do" method="post">
      <label>账号</label>
      <input type="text" name="name"/>
      <br/>
      <label>密码</label>
      <input type="password" name="password"/>
      <br/>
    </form>
    <button class="btn btn-success" onclick="login()">登录</button>
  </div>
  </body>
</html>
