<%--
  Created by IntelliJ IDEA.
  User: radim
  Date: 28.01.2019
  Time: 11:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>

  <form method="post" action="StateServlet">
    State name: <input type="text" name="stateName" /> <br />
    Number of citizens: <input type="number" name="citizens" step="1000000" /> <br />
    Flag URL: <input type="url" name="flagUrl" /> <br />
    <input type="submit" value="Insert" />
  </form>

  </body>
</html>
