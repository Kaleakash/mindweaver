<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Add Place Details</h2>
<form action="AddPlaceDetails" method="post">
<label>PId</label>
<input type="number" name="pid"><br/>
<label>Source</label>
<input type="text" name="source"><br/>
<label>Destination</label>
<input type="text" name="destination"><br/>
<input type="submit" value="Store Place Details">
<input type="reset" value="reset">
</form>
<br/>
<a href="index.jsp">Back</a>
</body>
</html>