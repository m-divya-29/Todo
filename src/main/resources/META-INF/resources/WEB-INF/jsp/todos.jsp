<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <link href = "webjars/bootstrap/5.2.2/css/bootstrap.min.css" rel = "stylesheet"/>
        <title> Welcome ${name} </title>
    </head>
    <body>
    <div class = "container">
        <div> <h1> Welcome ${name}! </h1> </div>
        <div>  <h3> Todo: </h3> </div>
        <div>
        <table class = "table">
            <thead>
                <tr>
                    <th> ID </th>
                    <th> Username </th>
                    <th> Title </th>
                    <th> Description </th>
                    <th> Target </th>
                    <th> Created </th>
                    <th> Done? </th>
                    <th></th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items = "${todos}" var = "todo">
                <tr>
                    <td> ${todo.id}</td>
                    <td> ${todo.username}</td>
                    <td> ${todo.title}</td>
                    <td>${todo.description}</td>
                    <td> ${todo.targetDate} </td>
                    <td> ${todo.createdDate}</td>
                    <td> ${todo.finished}</td>
                    <td><a href="delete-todo?id=${todo.id}" class="btn btn-danger">DELETE</a>
                </tr>
                </c:forEach>
            </tbody>
        </table>
        <a href="addtodo" class = "btn btn-success">Add Todo </a>
        </div>
        <script src="webjars/bootstrap/5.2.2/js/bootstrap.bundle.min.js"></script>
        <script src="webjars/jquery/3.6.1/jquery.min.js"></script>
    </div>
    </body>
</html>