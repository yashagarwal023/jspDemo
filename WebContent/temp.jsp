<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib  uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p>Using for each loop </p> 
<c:forEach var="i" begin="1" end="101" step="10">
<c:out value="${i}"></c:out></c:forEach>
<br>
<br>
<sql:setDataSource var="ds" driver="oracle.jdbc.driver.OracleDriver" url="jdbc:oracle:thin:@localhost:1521:xe"  user="hr" password="hr" ></sql:setDataSource>

<c:set var="query" value="select  ename,sal from emp where sal>2000"></c:set>
<sql:query sql="${query}" dataSource="${ds}"  var="result"></sql:query>
<c:forEach var="row" items="${result.rows}">
<table border="1px solid black">
<tr>
<td><c:out value="${row.ename}"></c:out></td>
<td><c:out value="${row.sal}"></c:out></td>
</tr>
</table>
</c:forEach>




</body>
</html>