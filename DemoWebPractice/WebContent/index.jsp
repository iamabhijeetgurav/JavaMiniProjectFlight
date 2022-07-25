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
		<form action="${pageContext.request.contextPath}/BookTicketController" method="post">
			<c:forEach items="${sessionScope.flightslist}" var="flights">
				<div>Name</div>
				<c:out value="${flights.flightName}"></c:out>
				<div>From</div>
				<c:out value="${flights.source}"></c:out>
				<div>To</div>
				<c:out value="${flights.destination}"></c:out>
				<div>Arrival Time</div>
				<c:out value="${flights.arrivalTime}"></c:out>
				<div>DepartureTime</div>
				<c:out value="${flights.departureTime}"></c:out>
				<div>Type</div>
				<c:out value="${flights.flightType}"></c:out>
				<div>FlightFare</div>
				<c:out value="${flights.flightFare}"></c:out>
				<div>
					<input type="submit" value="Book">
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