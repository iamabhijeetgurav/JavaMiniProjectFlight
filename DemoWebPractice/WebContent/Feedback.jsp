<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>
<body>
	<div style="text-align: center; color: red; background-color: aqua;">
		<h1>Feedbck Form</h1>
	</div>
	<div class="container">
		<div class="row">
			<div class="col"></div>
			<div class="col">
				<form action="${pageContext.request.contextPath}/FeedbackController" method="post">
					<div class="form-group">
						<label>Enter the User Id:</label> <input type="number"
							class="form-control" name="user-id" aria-describedby="emailHelp"
							placeholder="Enter User Id">
					</div>
					<div class="form-group">
						<label>Enter Booking Id:</label> <input type="number"
							class="form-control" placeholder="Enter Booking Id"
							name="booking-id">
					</div>
					<div class="form-group">
						<label>Enter the rating:</label> <input type="number" max="10"
							class="form-control" placeholder="Enter Rating" name="rating">
					</div>

					<div class="form-group">
						<label>Enter the rating:</label> <input type="text"
							class="form-control" placeholder="Enter Description"
							name="description">
					</div>


					<button type="submit" class="btn btn-primary" value="submit">Submit</button>
				</form>
			</div>
			<div class="col"></div>
		</div>
	</div>

</body>
</html>