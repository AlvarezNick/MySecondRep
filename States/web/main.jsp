<%@ page import="java.util.List" %>
<%@ page import="eng.model.Country" %><%--
  Created by IntelliJ IDEA.
  User: radim
  Date: 28.01.2019
  Time: 11:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Countries</title>
    <style>
        img {
            width: 25px;
        }
    </style>
</head>
<body>
<h2>Countries</h2>
<%
    List<Country> countries = (List<Country>) session.getAttribute("countries");

    if (countries == null) {
        response.sendRedirect("index.jsp");
    }

    for (Country country : countries) {
        %>
        <%=country.getName()%> <img src="<%=country.getFlagUrl()%>" /> <div style="background: black;height: 15px; width: <%=country.getNumberOfCitizens()/1000000%>px"></div>
        <br />
<%
    }
%>
<br />
<a href="index.jsp">Insert country</a>
</body>
</html>
