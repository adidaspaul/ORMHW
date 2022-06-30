<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
    <head>
        <title>IT Structure</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    </head>

    <body>
        <c:import url="${contextPath}/WEB-INF/html/navbar.jsp"/>

        <div class="container">
            <form action="/findDeveloper">
              <div class="form-group">
                 <label for="developerId">Developer search</label><br>
                 <input type="number" class="form-control" id="developerId" placeholder="Enter developer id" name="developerId"><br>
               </div>
                 <input type="submit" value="Find">
            </form>
        </div>
    </body>
</html>
