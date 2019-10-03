<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Displaying emp Details</h1>
<jsp:useBean id="emp" class="com.Controller.model.Employee" scope="application"></jsp:useBean>
id:<jsp:getProperty property="id" name="emp"/><br>
name:<jsp:getProperty property="name" name="emp"/><br>
salary:<jsp:getProperty property="salary" name="emp"/><br>
<!-- <a href="input.jsp">Back</a>
 -->
Company:<%=request.getParameter("company") %>
</body>
</html>