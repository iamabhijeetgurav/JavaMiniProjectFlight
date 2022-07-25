<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Booking</title>
</head>
<body>
	<%--id  | schedule_date | no_of_passengers | user_id | flight_id --%>
	<form method="post" action="${pageContext.request.contextPath}/BookTicketController">
		<label>Date</label> <input type="date" name="schedule-date"> <label>No
			of passengers</label> <input type="number" maxlength="10" name="no-of-passenger">
			<input type="submit" value="Book">
	</form>


</body>
</html>