<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="blood.dto.*,blood.bl.*,blood.dl.*,blood.utlity.*,java.sql.Date,  java.text.SimpleDateFormat "%>


<!DOCTYPE html>
<html>
<head>
<title>Donor Login</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>User Login</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->	
	<link rel="icon" type="image/png" href="images/icons/favicon.ico"/>
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="fonts/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="fonts/iconic/css/material-design-iconic-font.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/animate/animate.css">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="vendor/css-hamburgers/hamburgers.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/animsition/css/animsition.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/select2/select2.min.css">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="vendor/daterangepicker/daterangepicker.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="css/util.css">
	<link rel="stylesheet" type="text/css" href="css/main.css">
<!--===============================================================================================-->
</head>
<body>
	<div class="container-login100" style="background-image: url('images/logo12.png');">
		<div class="wrap-login100 p-l-55 p-r-55 p-t-80 p-b-30">
	
<form action="direct_donor_login.jsp" method="post">
<div>

<table>
<tr>
  <%! 
      String message=""; 
  	  String donor_login_id;
	  DonorLoginDTO user1=null;
	  DonorLoginDTO user2=null;
	  String donor_password;
  %>               
   <td height="33" align="center" valign="middle" style="color: #F70509">
   <%
                   if(request.getParameter("submit")!=null)
                   {
                	   donor_login_id=request.getParameter("txt_user_id") ;
                	  donor_password=request.getParameter("txt_password");
                	  user1=new DonorLoginDTO();

                	  user1.setDonor_login_id(donor_login_id);  
                	  user1.setDonor_password(donor_password);
                	  //session.setAttribute("donor_login_id", donor_login_id);
                	  user2=DonorLoginBL.validateUser(user1);
                	  if(user2!=null)
                	  {
                		 // session.setAttribute("user_name", user2.getDonor_password());
                		  session.setAttribute("donorId", user2.getDonor_login_id());
                		  response.sendRedirect("../Blood/welcome_donor.jsp");
                	  }
                	  else
                	  {
                		  message="wrong userID or password";
                		  
                	  }
                   }
   %>
   			      <%=message %>
      
                  </td>
                </tr>
			</table>
		</div>

				<span class="login100-form-title p-b-37">
					User Login
				</span>


  <div class="wrap-input100 validate-input m-b-20">
    <label for="uname"><b>UserId</b></label><br>
    <input type="text" placeholder="Enter UserID" name="txt_user_id" required><br><br>

    <label for="psw"><b>Password</b></label><br>
    <input type="password" placeholder="Enter Password" name="txt_password" required><br><br>
      
    <div class="container-login100-form-btn">  
    <input class="login100-form-btn" type="submit" value="Login" name="submit"><br><br><br><br>
    </div>
   
   	<div class="text-center">
	<a href="../Blood/donor_add.jsp" class="txt2 hov1">
	Sign Up
	</a>
	</div><br>
   
   	<div class="text-center">
	<a href="../Designs/index.jsp" class="txt2 hov1">
	Back to Home Page
	</a>
	</div>
  </div>
</form>
</div>
</div>

</body>
</html>