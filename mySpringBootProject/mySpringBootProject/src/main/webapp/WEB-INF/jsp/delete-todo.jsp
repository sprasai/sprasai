<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>
<div class="container">
<form method="post">
<input type="text"  name="id" />
<input type="submit" />
</form>

List of Todos for <<${name}>> : <BR/>
${todos} 

<div><a href="/todo-list">Back to Todo List</a></div>

</div>
<%@ include file="common/footer.jspf" %>