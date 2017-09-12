<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<HTML>
<head>
<title>TODO List</title>

<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
	
</head>

<body>

<div class="container">

<Table class="table table-striped">
<caption>List of Todos for ${name} :</caption> 
<thead> <tr>
	<th>Id</th>
	<th>Desc</th>
	<th>Name</th>
	<th>TargetDate</th>
	<th>Completed</th> 
	<th>Delete</th>
	</tr></thead>
<tbody>
<c:forEach items="${todos}" var="todo">
	<tr>
	<td>${todo.id}</td>
	<td>${todo.description}</td>
	<td>${todo.name}</td>
	<td>${todo.targetDate}</td>
	<td>${todo.completed}</td> 
	<td><a class="btn btn-warning" href="\delete-todo?id=${todo.id}">Delete</a></td>
	</tr>
</c:forEach>
</tbody>
</Table>
<div><a class="button" href=/add-todo> Add TODO</a> </div>
<div> <a class="button" href=/delete-todo> Delete TODO</a></div> 

</div>
<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
		
</body>
</HTML>