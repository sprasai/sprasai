<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>

<div class="container">

<Table class="table table-striped">
<caption>List of Todos for ${name} :</caption> 
	<thead>
	 <tr>
		<th>Id</th>
		<th>Desc</th>
		<th>Name</th>
		<th>TargetDate</th>
		<th>Completed</th> 
		<th></th>
		<th></th>
	</tr>
	</thead>
<tbody>
<c:forEach items="${todos}" var="todo">
	<tr>
		<td>${todo.id}</td>
		<td>${todo.desc}</td>
		<td>${todo.name}</td>
		<td><fmt:formatDate value="${todo.targetDate}" pattern="dd/MM/yyyy"/></td>
		<td>${todo.completed}</td> 
		<td><a class="btn btn-success" href="\update-todo?id=${todo.id}">Update</a></td>
		<td><a class="btn btn-warning" href="\delete-todo?id=${todo.id}">Delete</a></td>
	</tr>
</c:forEach>
</tbody>
</Table>
<div><a class="button" href=/add-todo> Add TODO</a> </div>
 
</div>
<%@ include file="common/footer.jspf" %>