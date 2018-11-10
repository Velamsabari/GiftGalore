<style>
body {
	font-family: Arial, Helvetica, sans-serif;
}
/* Full-width input fields */
input[type=text], input[type=password] {
	width: 100%;
	padding: 15px;
	margin: 5px 0 22px 0;
	display: inline-block;
	border: none;
	background: #f1f1f1;
}

/* Add a background color when the inputs get focus */
input[type=text]:focus, input[type=password]:focus {
	background-color: #ddd;
	outline: none;
}

 #justpushtobottom {
	height: 27%;
}
</style>
<div class="container">
	<form method="post">
		<h1>Login</h1>
		<hr>
		<div>
			<label for="name"><b>Name</b></label> <input type="text"
				placeholder="Enter Name" name="user_name" />
		</div>
		<div>
			<label for="psw"><b>Password</b></label> <input type="password"
				placeholder="Enter Password" name="user_password" />
		</div>
		<div class="clearfix">
			<input type="submit" class="btn btn-info" value="Login"/>
		</div>
	</form>

</div>

