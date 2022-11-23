<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>
<div class = "container">
    <div>  <h3> Manage your Todos: </h3> </div>
    <div>
    <table class = "table">
        <thead>
            <tr>
                <th> Username </th>
                <th> Title </th>
                <th> Description </th>
                <th> Target </th>
                <th> Last Updated </th>
                <th> Done? </th>
                <th></th>
                <th></th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items = "${todos}" var = "todo">
            <tr>
                <td> ${todo.username}</td>
                <td> ${todo.title}</td>
                <td>${todo.description}</td>
                <td> ${todo.targetDate} </td>
                <td> ${todo.createdDate}</td>
                <td> ${todo.finished}</td>
                <td><a href="delete-todo?id=${todo.id}" class="btn btn-danger">DELETE</a></td>
                <td><a href="update-todo?id=${todo.id}" class="btn btn-warning">UPDATE</a></td>
            </tr>
            </c:forEach>
        </tbody>
    </table>
  <a href="addtodo" class = "btn btn-success">Add Todo </a>
</div>
<%@ include file="common/footer.jspf" %>