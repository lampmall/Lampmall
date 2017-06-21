<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/6/20 0020
  Time: 16:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="css/bootstrap.css" />
    <link rel="stylesheet" href="css/icon.css" />
    <link rel="stylesheet" href="css/easyui.css" />
    <script type="text/javascript" src="js/jquery.js"></script>
    <script type="text/javascript" src="js/easyui.js"></script>
    <script type="text/javascript">
        function init(){
            $.getJSON("findResourceeByUser.do",{userid:${user.id}},function(data){
                alert(data);
                for(var x in data){
                    $("#main_resource").accordion("add",{
                       title:data[x].task,
                        content:"<ul class='easyui-tree' data-options=\"url:'findSubByRid.do?rid="+data[x].id+"'\"></ul>"
                    });
                }
                //给所有的tree注册监听函数判断是否已经存在
                $(".easyui-tree").tree({
                   onClick:function (node) {
                       //判断tab是否已经存在
                       var isHad=$("#work").tabs("exists",node.task);
                       if(isHad){
                           $("#work").tabs("select",node.task);
                       }else{
                           $("#work").tabs("add",{
                              title:node.task,
                               closable:true,
                               href:node.url
                           });
                       }
                   }
                });
            });
        }
        $(init);
    </script>
</head>
<body>
<div class="easyui-layout" style="width:100%;height:600px;">
    <div data-options="region:'north'"
         style="height:100px;background-color:red"></div>
    <div id="main_resource" class="easyui-accordion"
         data-options="region:'west'" style="width:20%"></div>
    <div id="work" class="easyui-tabs" data-options="region:'center'">

    </div>
</div>
</body>
</html>
