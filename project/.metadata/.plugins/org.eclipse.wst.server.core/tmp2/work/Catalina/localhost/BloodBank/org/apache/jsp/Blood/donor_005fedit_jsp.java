/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.67
 * Generated at: 2019-12-07 12:17:05 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.Blood;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import blood.dto.*;
import blood.bl.*;
import blood.dl.*;
import blood.utlity.*;
import java.sql.Date;
import java.text.SimpleDateFormat;

public final class donor_005fedit_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 
      String messages=""; 
  	  String donor_login_id;
	  DonorLoginDTO user1=null;
	  DonorLoginDTO user2=null;
	  String donor_password;
  
 
 
         long phone;
	     float height,weight;  
	     
         String sdonor_id,sdonor_name,sblood_grp,sgender,sage,sphone,sheight,sweight;
         boolean ErrorFlag=false;
         boolean sErrorFlag=false;
         
         String message="";          
         DonorDTO donor=null;
         int result=0;
                   
      
  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/Blood/../Designs/footer.jsp", Long.valueOf(1575371734081L));
    _jspx_dependants.put("/Blood/../includes/menu.jsp", Long.valueOf(1575351223749L));
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Update Donor</title>\r\n");
      out.write("<script src=\"../includes/validation.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("  \r\n");
      out.write(" </script>\r\n");
      out.write("\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<!-- Required meta tags -->\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"viewport\"\r\n");
      out.write("\tcontent=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("\r\n");
      out.write("<!-- Bootstrap CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../Designs/css/bootstrap.min.css\">\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- Swiper CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../Designs/css/swiper.min.css\">\r\n");
      out.write("<style>\r\n");
      out.write("body {\r\n");
      out.write("\tfont-family: Arial, Helvetica, sans-serif;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("* {\r\n");
      out.write("\tbox-sizing: border-box;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input[type=text], select, textarea {\r\n");
      out.write("\twidth: 50%;\r\n");
      out.write("\tpadding: 12px;\r\n");
      out.write("\tborder: 1px solid #ccc;\r\n");
      out.write("\tborder-radius: 4px;\r\n");
      out.write("\tbox-sizing: border-box;\r\n");
      out.write("\tmargin-top: 6px;\r\n");
      out.write("\tmargin-bottom: 16px;\r\n");
      out.write("\tresize: vertical;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input[type=date] {\r\n");
      out.write("\twidth: 25%;\r\n");
      out.write("\tpadding: 12px;\r\n");
      out.write("\tborder: 1px solid #ccc;\r\n");
      out.write("\tborder-radius: 4px;\r\n");
      out.write("\tbox-sizing: border-box;\r\n");
      out.write("\tmargin-top: 6px;\r\n");
      out.write("\tmargin-bottom: 16px;\r\n");
      out.write("\tresize: vertical;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input[type=submit] {\r\n");
      out.write("\tbackground-color: #4CAF50;\r\n");
      out.write("\tcolor: white;\r\n");
      out.write("\tpadding: 12px 20px;\r\n");
      out.write("\tborder: none;\r\n");
      out.write("\tborder-radius: 4px;\r\n");
      out.write("\tcursor: pointer;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input[type=submit]:hover {\r\n");
      out.write("\tbackground-color: #45a049;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".container {\r\n");
      out.write("\tborder-radius: 5px;\r\n");
      out.write("\tbackground-color: #f2f2f2;\r\n");
      out.write("\tpadding: 20px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<h1>Donor Details</h1>\r\n");
      out.write("\r\n");
      out.write("\t");

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
                		  response.sendRedirect("../authentication/direct_donor_login.jsp");
                	  }
                	  else
                	  {
                		  messages="wrong userID or password";
                		  
                	  }
                   }
   
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t");
if(session.getAttribute("donorId")!=null)
                  {
                	  out.println(" Hello "+(String)session.getAttribute("donorId"));
                	  //session.removeAttribute("message");
                  }
                  else
                  {
                	  response.sendRedirect("../authentication/donor_logout.jsp");
                  }
                  
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<style>\r\n");
      out.write("ol {\r\n");
      out.write("\tlist-style-type: none;\r\n");
      out.write("\tmargin: 0;\r\n");
      out.write("\tpadding: 0;\r\n");
      out.write("\toverflow: hidden;\r\n");
      out.write("\tbackground-color: blue;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("li {\r\n");
      out.write("\tfloat: left;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("li a {\r\n");
      out.write("\tdisplay: block;\r\n");
      out.write("\tcolor: white;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tpadding: 14px 16px;\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("li a:hover:not (.active ) {\r\n");
      out.write("\tbackground-color: red;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".active {\r\n");
      out.write("\tbackground-color: blue;\r\n");
      out.write("\torange\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<ol>\r\n");
      out.write("\t\t<li><a href=\"../Designs/index.jsp\">Home</a></li>\r\n");
      out.write("\t\t<li><a href=\"../Blood/donor_add.jsp\">Register Donor</a></li>\r\n");
      out.write("\t\t<li><a href=\"../Blood/receiver_add.jsp\">Register Receiver</a></li>\r\n");
      out.write("\t\t<li><a href=\"../Blood/donor_view_all.jsp\">View Donor Details</a></li>\r\n");
      out.write("\t\t<li><a href=\"../Blood/receiver_view_all.jsp\">View Receiver\r\n");
      out.write("\t\t\t\tDetails</a></li>\r\n");
      out.write("\t</ol>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t");
      out.write('\r');
      out.write('\n');
      out.write('	');

        if(request.getParameter("submit")!=null)
        {
                	   
         message="";
         ErrorFlag=false;
         sErrorFlag=false;         
         sdonor_id="";sdonor_name="";sblood_grp="";sgender="";sage="";sphone="";sheight="";sweight="";
                  	    
        }
   
        else
        {
           message="";
           ErrorFlag=false;
           sErrorFlag=false;
           String donor_id=(String)session.getAttribute("donorId");
           donor=DonorBL.getDonor1(donor_id);   
          if(donor!=null)
           {
           	   sdonor_name=donor.getDonor_name(); 
           	  // session.setAttribute("donor_name", sdonor_name);
           	   
           	   sblood_grp =donor.getBlood_grp();
           	  // session.setAttribute("blood_grp", sblood_grp);

           	   sgender= donor.getGender();
           	   //session.setAttribute("gender", sgender);

           	   sage=donor.getAge();
           	   //session.setAttribute("dob", sdob);

           	   phone=donor.getPhone();
           	  // session.setAttribute("Phone", phone);

           	   height=donor.getHeight();
           	  // session.setAttribute("Height", height);

           	   weight=donor.getWeight();
           	   //session.setAttribute("Weight", weight);
           	   
           	   
           	System.out.println(donor_id);
        	System.out.println(sdonor_name);
        	System.out.println(sblood_grp);
        	System.out.println(sgender);
        	System.out.println(sage);
        	System.out.println(phone);
        	System.out.println(height);
        	System.out.println(weight);


           }
           else
           {
           	   sdonor_id="";sdonor_name="";sblood_grp="";sgender="";sage="";sphone="";sheight="";sweight="";
           }
              		   
       }
                   
  
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<form action=\"donor_edit_process.jsp\" onsubmit=\"return validate();\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!--s\r\n");
      out.write("\t<label for=\"name\">Donor ID</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("      <input type=\"text\" id=\"name\" name=\"txtDonorName\" placeholder=\"Your name..\" \r\n");
      out.write("    value=\"");
      out.print(session.getAttribute("donor_login_id"));
      out.write("\" readonly ><br><br>\r\n");
      out.write("\t-->\r\n");
      out.write("\r\n");
      out.write("\t\t\t<label for=\"name\">Donor Name</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t<input type=\"text\" id=\"txtDonorName\" name=\"txtDonorName\"\r\n");
      out.write("\t\t\t\t placeholder=\"Your name..\"\r\n");
      out.write("\t\t\t\tvalue=\"");
      out.print(sdonor_name);
      out.write("\" required><br> <br> <label\r\n");
      out.write("\t\t\t\tfor=\"bld_grp\">Blood Group</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t<select id=\"bld_grp\" name=\"txtBloodGrp\">\r\n");
      out.write("\t\t\t\t<!--  <option selected=\"selected\" >");
      out.print(sblood_grp);
      out.write("</option>-->\r\n");
      out.write("\t\t\t\t<option value=\"O-ve\">O-ve</option>\r\n");
      out.write("\t\t\t\t<option value=\"O+ve\">O+ve</option>\r\n");
      out.write("\t\t\t\t<option value=\"A-ve\">A-ve</option>\r\n");
      out.write("\t\t\t\t<option value=\"A+ve\">A+ve</option>\r\n");
      out.write("\t\t\t\t<option value=\"B-ve\">B-ve</option>\r\n");
      out.write("\t\t\t\t<option value=\"B+ve\">B+ve</option>\r\n");
      out.write("\t\t\t\t<option value=\"AB-ve\">AB-ve</option>\r\n");
      out.write("\t\t\t\t<option value=\"AB+ve\">AB+ve</option>\r\n");
      out.write("\t\t\t</select><br> <br> <label for=\"gender\">Gender : </label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t<input type=\"radio\" name=\"gender\" id=\"txtgender\" value=\"Male\" checked>Male <input\r\n");
      out.write("\t\t\t\ttype=\"radio\" name=\"gender\" id=\"txtgender\" value=\"Female\">Female<br> <br>\r\n");
      out.write("\t\t\t<br> <label for=\"dob\">Age</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t<input type=\"text\" id=\"txtage\" name=\"age\" value=\"");
      out.print(sage);
      out.write("\"><br>\r\n");
      out.write("\t\t\t<br> <label for=\"phone\">Contact No:</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t<input type=\"text\" id=\"txtPhone\" name=\"txtPhone\" placeholder=\"Contact Number should be a 10 digit number\"\r\n");
      out.write("\t\t\t\tvalue=\"");
      out.print(phone);
      out.write("\"><br> <br> \r\n");
      out.write("\t\t\t\t<label for=\"gender\">Have you donated<br>blood with in 84days  </label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("           <input type = \"radio\" name = \"txtdonation\" id=\"txtdonation\" value = \"Yes\">Yes\r\n");
      out.write("           <input type = \"radio\" name = \"txtdonation\" id=\"txtdonation\" value =\"No\" checked>No<br><br>\r\n");
      out.write("           \r\n");
      out.write("           <label for=\"height\">Height</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t<input type=\"text\" id=\"txtHeight\" name=\"txtHeight\" value=\"");
      out.print(height);
      out.write("\"placeholder=\"Your height is...\" required><br> <br>\r\n");
      out.write("\t\t\t<label for=\"weight\">Weight</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t<input type=\"text\" id=\"txtWeight\" name=\"txtWeight\" value=\"");
      out.print(weight);
      out.write("\"\r\n");
      out.write("\t\t\t\tplaceholder=\"Your weight..\" required><br> <br> <input\r\n");
      out.write("\t\t\t\ttype=\"submit\" value=\"UPDATE\">\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("<!-- Required meta tags -->\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"viewport\"\r\n");
      out.write("\tcontent=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("\r\n");
      out.write("<!-- Bootstrap CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- Swiper CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/swiper.min.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- Styles -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"style.css\">\r\n");
      out.write("<script src=\"js/custom.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div style=\"background-image: url('images/footer-bg.png')\">\r\n");
      out.write("\t<footer class=\"site-footer\">\r\n");
      out.write("\t\t<div class=\"footer-widgets\">\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-12 col-md-6 col-lg-4\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"foot-about\">\r\n");
      out.write("\t\t\t\t\t\t\t<h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\"><img src=\"images/logo.png\" alt=\"\"></a>\r\n");
      out.write("\t\t\t\t\t\t\t</h2>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<p>This project is designed for successful completion of a\r\n");
      out.write("\t\t\t\t\t\t\t\tproject on blood bank management system. This project aims at\r\n");
      out.write("\t\t\t\t\t\t\t\tmaintaining all the information pertaining to blood donors,\r\n");
      out.write("\t\t\t\t\t\t\t\tdifferent blood groups available in each blood bank and help\r\n");
      out.write("\t\t\t\t\t\t\t\tthem manage in a better way.</p>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<p class=\"copyright\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\r\n");
      out.write("\t\t\t\t\t\t\t\tCopyright &copy;\r\n");
      out.write("\t\t\t\t\t\t\t\t<script>\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdocument.write(new Date().getFullYear());\r\n");
      out.write("\t\t\t\t\t\t\t\t</script>\r\n");
      out.write("\t\t\t\t\t\t\t\tAll rights reserved</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<!-- .foot-about -->\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!-- .col -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"col-12 col-md-6 col-lg-4 mt-5 mt-md-0\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"foot-contact\">\r\n");
      out.write("\t\t\t\t\t\t\t<h2>Contact</h2>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<p class=\"p-0 m-0\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>Addtress:</span>ABCD Trivandrum Kerala India </br> <br>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>Phone:</span>+91 773 636 7984<br> <br>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>Email:</span>mbvishnu17@gmail.com</br>\r\n");
      out.write("\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!-- .col -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"col-12 col-md-6 col-lg-4 mt-5 mt-md-0\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"foot-links\">\r\n");
      out.write("\t\t\t\t\t\t\t<h2>Usefull Links</h2>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<A href=\"../Designs/index.jsp\">Home</A><br>\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<A href=\"../Blood/donor_add.jsp\">Donor Register</A><br>\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<A href=\"../Blood/receiver_add.jsp\">Receiver Register</A><br>\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<A href=\"../Blood/donor_view_all.jsp\">View Donor</A><br>\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<A href=\"../Blood/receiver_view_all.jsp\">View Receiver</A><br>\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<!-- .foot-links -->\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!-- .col -->\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- .row -->\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- .container -->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- .footer-widgets -->\r\n");
      out.write("\t</footer>\r\n");
      out.write("\t<!-- .site-footer -->\r\n");
      out.write("\t<script type='text/javascript' src='js/jquery.js'></script>\r\n");
      out.write("\t<script type='text/javascript' src='js/jquery.collapsible.min.js'></script>\r\n");
      out.write("\t<script type='text/javascript' src='js/swiper.min.js'></script>\r\n");
      out.write("\t<script type='text/javascript' src='js/jquery.countdown.min.js'></script>\r\n");
      out.write("\t<script type='text/javascript' src='js/circle-progress.min.js'></script>\r\n");
      out.write("\t<script type='text/javascript' src='js/jquery.countTo.min.js'></script>\r\n");
      out.write("\t<script type='text/javascript' src='js/jquery.barfiller.js'></script>\r\n");
      out.write("\t<script type='text/javascript' src='js/custom.js'></script>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
