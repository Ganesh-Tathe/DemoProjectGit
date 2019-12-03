<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>
<body>
<div class="jumbotron">
  <form action="Regis                                     ter">
  <h3>${msg}</h3>
  <H1> REGISTRATION FORM</H1>
 
    <table>
    <tr><td>Enter first name:</td><td><input type="text" name="fname"></td></tr>
     <tr><td>Enter last name:</td><td><input type="text" name="lname"></td></tr>
     <tr><td>Enter birthdate:</td><td><input type="Date" name="bdate"></td></tr>
      <tr><td>Gender:</td><td><input type="radio" name="gender" value="male" required>Male
			<input type="radio" name="gender" value="female" required>Female</td></tr>
		<tr>
		<td>
			Country
		</td>
		<td>
			<select name="country">
					<option>India</option>
					<option>America</option>
					<option>Japan</option>
			</select>
		</td>
	</tr>
	
	<tr>
		<td>
			State
		</td>
		<td>
			<select name="state">
				<option>maharashtra</option>
				<option>chicago</option>
				<option>muimui</option>
			</select>
		</td>
	</tr>
	
	<tr>
		<td>
			City
		</td>
		<td>
			<select name="city">
				<option>pune</option>
				<option>apachestreet</option>
				<option>taotao</option>
			</select>
			
		</td>
	</tr>
	
	<tr>
		<td>
			Email
		</td>
		<td>
			<input type="email" name="email">
		</td>
	</tr>
	
	<tr>
		<td>
			Password
		</td>
		<td>
			<input type="password" name="password" required>
		</td>
	</tr>
	
	<tr>
		<td>
			Confirm Password
		</td>
		<td>
			<input type="password" name="confirmpassword" required>
		</td>
	</tr>
	
	<tr>
		<td colspan="2" align="Center">
			<input type="checkbox" name="condition" id="agree">I agree terms and Conditions
		</td>
	</tr>	
	<tr>
	
		<td colspan="2" align="center">
			<input type="submit" class="btn btn-primary"  name="Register User">
		</td>
		
	</tr>
	
</table>
             
     </table>
    
    
    
    </form>
    

</body>
</html>