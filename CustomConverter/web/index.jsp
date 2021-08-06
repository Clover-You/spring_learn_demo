<%@ page import="top.ctong.converter.dao.User" %>
<!--
- █████▒█ ██ ▄████▄ ██ ▄█▀ ██████╗ ██╗ ██╗ ██████╗
- ▓██ ▒ ██ ▓██▒▒██▀ ▀█ ██▄█▒ ██╔══██╗██║ ██║██╔════╝
- ▒████ ░▓██ ▒██░▒▓█ ▄ ▓███▄░ ██████╔╝██║ ██║██║ ███╗
- ░▓█▒ ░▓▓█ ░██░▒▓▓▄ ▄██▒▓██ █▄ ██╔══██╗██║ ██║██║ ██║
- ░▒█░ ▒▒█████▓ ▒ ▓███▀ ░▒██▒ █▄ ██████╔╝╚██████╔╝╚██████╔╝
- ▒ ░ ░▒▓▒ ▒ ▒ ░ ░▒ ▒ ░▒ ▒▒ ▓▒ ╚═════╝ ╚═════╝ ╚═════╝
- ░ ░░▒░ ░ ░ ░ ▒ ░ ░▒ ▒░
- ░ ░ ░░░ ░ ░ ░ ░ ░░ ░
- ░ ░ ░ ░ ░
- Copyright 2021 Clover.
- <p>
- $TODO
- </p>
-
- @author Clover
- @version V1.0
- @class ${NAME}
- @create 2021-08-05 21:16
-->
<%@ page import="top.ctong.converter.dao.User" contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE>
<html lang="en">
<head>
    <%
        User user = (User)request.getAttribute("user");
        boolean nutNull = user != null;
    %>
    <title><%=nutNull ? "自定义Converter测试" : "请根据下方描述进行请求"%>
    </title>
</head>
<body>
<%=nutNull ?
   "user数据：<code>" + user.toString() + "</code>" :
   "请根据这个地址进行请求：<code>" + request.getRequestURL() + "go?user=clover-19-男-2021/08/06</code>"%>

</body>
</html>

