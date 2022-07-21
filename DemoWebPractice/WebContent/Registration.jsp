<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign Up</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col"></div>
			<div class="col" style="margin-top: 50px">
				<form class="row g-3" action="${pageContext.request.contextPath}/UserController" method="post">
					<div class="col-md-6">
						<label for="inputEmail4" class="form-label">First Name</label> <input
							type="text" class="form-control" id="inputEmail4" name="first-name">
					</div>
					<div class="col-md-6">
						<label for="inputEmail4" class="form-label">Last Name</label> <input
							type="text" class="form-control" id="inputEmail4" name="last-name">
					</div>
					<div class="col-md-12">
						<label for="inputEmail4" class="form-label">Email</label> <input
							type="email" class="form-control" id="inputEmail4" name="user-email">
					</div>
					<div class="col-md-12">
						<label for="inputPassword4" class="form-label">Password</label> <input
							type="password" class="form-control" id="inputPassword4" name="user-password">
					</div>
					<div class="col-12">
						<label for="inputAddress" class="form-label">Mobile No</label> <input
							type="tel" class="form-control" id="inputAddress" name="user-mobile">
					</div>
					<div class="col-12">
						<button type="submit" class="btn btn-primary">Sign up</button>
					</div>
				</form>
			</div>
			<div class="col"></div>
		</div>
	</div>

</body>
</html>