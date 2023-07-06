<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Techfly Login</title>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<!-- bootstrap CDN link -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

<!-- CSS Link -->
<link rel="stylesheet" href="loginPageCss.css">

<!-- swal library insert -->
<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
<link rel="stylesheet" href="alert/dist/sweetalert.css">

</head>
<body>
	
	<input type="hidden" id="status" value= <%= request.getAttribute("status") %>>
	<section class="form my-5">
		<div class="container">
			<div class="row g-0">
				<div class="col-lg-5">
					<img src="TECHFLY copy.jpg" width="5000px" length="100000px" class="img-fluid" alt="login Bus Image">
				</div>

				<div class="col-lg-7 px-5 pt-5">

					<h1 class="font-weight-bold pt-5">
						Techfly
						<h2>C o m p u t e r s</h2>
					</h1>
					<h4 class="pb-2 pt-5">Log in to Payment Profile</h4>

					<form action="login" method="post">

						<div class="form-row">
							<div class="col-lg-7">
								<input type="email" placeholder="jhonCater@gmail.com"
									name="email" class="form-control my-3 py-3">
							</div>

							<div class="form-row">
								<div class="col-lg-7">
									<input type="password" placeholder="********" name="password"
										class="form-control my-3 py-3">
								</div>
							</div>

							<div class="form-row">
								<div class="col-lg-7">
									<input type="submit" value="Login" class="btn1 mt-3 mb-5">
								</div>
							</div>

							<a href="#">Forget Password</a>
							<p class="mt-1">
								Don't have an account<a href="registration.jsp"> Register here</a>
							</p>
					</form>
				</div>
			</div>

		</div>
	</section>
</body>

    <script type="text/javascript">
		var status = document.getElementById("status").value;
	
		if(status == 'failed'){
			swal("Oops!","You have entered Wrong Details","error");
		}
	</script>
</html>