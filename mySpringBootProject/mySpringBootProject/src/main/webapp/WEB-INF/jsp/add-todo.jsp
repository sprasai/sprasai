<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<HTML>
<Head>
<Title>Todo Lists</Title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">

</Head>
<body>
	<div class="container">

		<form method="post" object="Todo">
			<fieldset class="form-group">
			<label>Description</label>
				<input type="text" name="desc" class="form-control" object="Todo.desc" required="required"/> 
			</fieldset>
			<button type="submit" class="btn btn-success">Add</button>
		</form>

		<div>List of Todos for <<${name}>> :</div>


		<table class="table table-striped">
			<thead>
				<tr>
					<th>description</th>
					<th>targetDate</th>
					<th>Done?</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${todos}" var="todo">
					<tr>
						<td>${todo.description}</td>
						<td>${todo.targetDate}</td>
						<td>${todo.completed}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>



		<div>
			<a class="btn" href="/todo-list">Back to Todo List</a>
		</div>

	</div>
	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>


</body>
</HTML>