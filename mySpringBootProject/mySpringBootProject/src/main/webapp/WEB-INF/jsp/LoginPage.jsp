
<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>

<div class="container">
<font color="RED"> ${errorMessage}</font>

<form method="post">
	<input type="text" value="in28minutes" name="nameLogin" />
	<input type="password" value="mySecretPassword" name="password" />
	<input type="submit" />
</form>

</div>

<%@ include file="common/footer.jspf" %>