<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="emp"  class="com.Controller.model.Employee" scope="application"></jsp:useBean>
<jsp:setProperty property="id" name="emp" param="id"/>
<jsp:setProperty property="name" name="emp" param="name"/>
<jsp:setProperty property="salary" name="emp" param="salary"/>

<!-- <a href="checkdata.jsp">Check</a> -->

<jsp:forward page="checkdata.jsp">
<jsp:param value="LTI" name="company"/>
</jsp:forward>
</body>
</html>