<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LittleFlys</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<link href="./main.css" rel="stylesheet">
<script src="https://code.jquery.com/jquery-3.6.0.min.js"
	integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4="
	crossorigin="anonymous"></script>
<style type="text/css">
.flight-list {
	box-shadow: 1px 8px 15px black;
	padding: 16px;
	border-radius: 5px;
	margin-top: 10px;
}

.book-option {
	font-size: 25px;
}

.book-option a{
	text-decoration: none;
	color: black;
}

.book-value {
	font-size: 20px;
}

.book-title {
	font-weight: bolder;
	font-size: 25px;
}
</style>
</head>
<body>
	<div class="container">
		<div class="header">
			<div class="row">
				<div class="col">
					<div class="header-left">
						<h1>Little Flys</h1>
					</div>
				</div>
				<div class="col">
					<div class="header-right">
						<div class="dropdown">
							<button class="dropbtn">LogIn/Register</button>
							<div class="dropdown-content">
								<a href="Login.jsp">LogIn</a> <a href="Registration.jsp">Signup</a>
							</div>
							<div id="welcome-tag">
								Welcome
								<%=session.getAttribute("firstName")%>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="search-bar">
			<div class="row">
				<form method="get"
					action="${pageContext.request.contextPath}/FlightSearchController">
					<div class="col">
						<div class="input-group input-group-lg">
							<span class="input-group-text" id="inputGroup-sizing-lg">From</span>
							<input name="input-from" type="text" class="form-control"
								aria-label="Sizing example input"
								aria-describedby="inputGroup-sizing-lg">
						</div>
					</div>
					<div class="col">
						<div class="input-group input-group-lg">
							<span class="input-group-text" id="inputGroup-sizing-lg">To</span>
							<input name="input-to" type="text" class="form-control"
								aria-label="Sizing example input"
								aria-describedby="inputGroup-sizing-lg">
						</div>
					</div>
					<div class="col">
						<input type="submit" value="Search">
					</div>
				</form>
			</div>
		</div>

		<div class="flight-list">
			<form method="post">
				<c:forEach items="${sessionScope.flightslist}" var="flights">
					<div class="row">
						<div class="col">
							<div class="book-title">Name</div>
							<div class="book-value">
								<c:out value="${flights.flightName}"></c:out>
							</div>
						</div>
						<div class="col">
							<div class="book-title">From</div>
							<div class="book-value">
								<c:out value="${flights.source}"></c:out>
							</div>
						</div>
						<div class="col">
							<div class="book-title">To</div>
							<div class="book-value">
								<c:out value="${flights.destination}"></c:out>
							</div>
						</div>
						<div class="col">
							<div class="book-title">Arrival Time</div>
							<div class="book-value">
								<c:out value="${flights.arrivalTime}"></c:out>
							</div>
						</div>
						<div class="col">
							<div class="book-title">DepartureTime</div>
							<div class="book-value">
								<c:out value="${flights.departureTime}"></c:out>
							</div>
						</div>
						<div class="col">
							<div class="book-title">Type</div>
							<div class="book-value">
								<c:out value="${flights.flightType}"></c:out>
							</div>
						</div>
						<div class="col">
							<div class="book-title">FlightFare</div>
							<div class="book-value">
								<c:out value="${flights.flightFare} Rs"></c:out>
							</div>
						</div>
						<div class="col">
							<div class="book-option">
								<button class="btn btn-primary">
									<a href="BookATicket.jsp">Book</a>
								</button>
							</div>
						</div>
					</div>
				</c:forEach>
			</form>
		</div>
	</div>
</body>
<script type="text/javascript">
$(document).ready(function(){
	  $("#welcome-tag").hide();
	  });
	});
</script>
</html>