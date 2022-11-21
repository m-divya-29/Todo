<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <link href = "webjars/bootstrap/5.2.2/css/bootstrap.min.css" rel = "stylesheet"/>
        <title> Welcome ${name} </title>
        <style>
        table, th, td {
          border: 1px solid black;
          border-collapse: collapse;
        }
        </style>
    </head>
    <body>
        <div> <h1> Welcome ${name}! </h1> </div>
        <div>  <h3> Todo: </h3> </div>
        <div>
        <table>
            <thead>
                <tr>
                    <th> id </th>
                    <th> title </th>
                    <th> description </th>
                    <th> target </th>
                    <th> created </th>
                    <th> status </th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items = "${todos}" var = "todo">
                <tr>
                    <td> ${todo.id}</td>
                    <td> ${todo.title}</td>
                    <td>${todo.description}</td>
                    <td> ${todo.targetDate} </td>
                    <td> ${todo.createdDate}</td>
                    <td> ${todo.finished}</td>
                </tr>
                </c:forEach>
            </tbody>
        </table>
        </div>
        <script src="webjars/bootstrap/5.2.2/js/bootstrap.bundle.min.js"></script>
        <script src="webjars/jquery/3.6.1/jquery.min.js"></script>
    </body>
</html>