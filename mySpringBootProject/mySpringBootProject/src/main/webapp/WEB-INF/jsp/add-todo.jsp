<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>

<body>
	<div class="container">

		<form:form method="post" commandName="todo">
			<form:hidden path="id" />
			<form:hidden path="name" />
<!-- 			<fieldset class="form-group"> -->
<%-- 				<form:label path="name">UserName</form:label> --%>
<%-- 				<form:input type="text" path="name"	class="form-control" required="required" /> --%>
<%-- 				<form:errors path="name" cssClass="text-warning" /> --%>
<!-- 			</fieldset> -->
			
			<fieldset class="form-group">
				<form:label path="desc">Description</form:label>
				<form:input type="text" path="desc"	class="form-control" required="required" />
				<form:errors path="desc" cssClass="text-warning" />
			</fieldset>
			
			<fieldset class="form-group">
				<form:label path="targetDate">Target Completion Date</form:label>
				<form:input type="text" path="targetDate"	class="form-control" required="required" />
				<form:errors path="targetDate" cssClass="text-warning" />
			</fieldset>
			
			
			<button type="submit" class="btn btn-success">Add</button>


		</form:form>


	</div>
	<%@ include file="common/footer.jspf"%>