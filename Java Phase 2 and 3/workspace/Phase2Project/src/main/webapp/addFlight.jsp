<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Add Flight Details</h2>
<form action="AddFlightDetails" method="post">
<label>FId</label>
<input type="number" name="fid"><br/>
<label>Flight Name</label>
<input type="text" name="flightname"><br/>
<label>Price</label>
<input type="number" name="price"><br/>
<label>Date Of Flight</label>
<input type="date" name="dof"><br/>
<label>Number of seats</label>
<input type="number" name="seats"><br/>
<label>PlaceId</label>
<input type="number" name="pid"><br/>
<input type="submit" value="Store Flight Details">
<input type="reset" value="reset">
</form>
<br/>
<a href="index.jsp">Back</a>
</body>
</html>