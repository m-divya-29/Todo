<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <link href = "webjars/bootstrap/5.2.2/css/bootstrap.min.css" rel = "stylesheet"/>
        <title> Welcome ${name} </title>
    </head>
    <body>
    <div class = "container">
        <form method="post">
        Enter title: <input type="text" name="title"/>
        Enter description: <input type="text" name = "description"/>
        <input type = "submit" class = "btn btn-success"/>
        </form>
        </div>
        <script src="webjars/bootstrap/5.2.2/js/bootstrap.bundle.min.js"></script>
        <script src="webjars/jquery/3.6.1/jquery.min.js"></script>
    </body>
</html>