<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
	<link href="./main.css" rel="stylesheet">
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col"></div>
			<div class="col" style="margin-top: 50px">
				<div class="login-form">
					<form action="${pageContext.request.contextPath}/LoginController" method="post">
						<div class="mb-3">
							<label for="exampleInputEmail1" class="form-label">Email
								address</label> <input name="check-email" type="email" class="form-control"
								id="exampleInputEmail1" aria-describedby="emailHelp">
							<div id="emailHelp" class="form-text">We'll never share
								your email with anyone else.</div>
						</div>
						<div class="mb-3">
							<label for="exampleInputPassword1" class="form-label">Password</label>
							<input name="check-password" type="password" class="form-control"
								id="exampleInputPassword1">
						</div>
						<div>
							Not yet registered? <a href="Registration.jsp">Sign up</a>here.
						</div>
						<button type="submit" class="btn btn-primary">Submit</button>
					</form>
				</div>

			</div>
			<div class="col"></div>
		</div>

	</div>

</body>
</html>