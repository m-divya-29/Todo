<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
    <head>
        <link href = "webjars/bootstrap/5.2.2/css/bootstrap.min.css" rel = "stylesheet"/>
        <title> Welcome ${name} </title>
    </head>
    <body>
    <div class = "container">
        <form:form method="post" modelAttribute="todo">
        Enter title: <form:input type="text" path="title" required="true"/>
        Enter description: <form:input type="text" path = "description" />
        <form:input type="hidden" path = "id" />
        <form:input type="hidden" path = "finished" />
        <input type = "submit" class = "btn btn-success"/>
        </form:form>
        </div>
        <script src="webjars/bootstrap/5.2.2/js/bootstrap.bundle.min.js"></script>
        <script src="webjars/jquery/3.6.1/jquery.min.js"></script>
    </body>
</html>