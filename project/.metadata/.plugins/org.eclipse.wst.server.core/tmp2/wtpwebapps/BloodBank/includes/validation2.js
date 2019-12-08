function validate(){
	
var name= document.getElementById("txtPatientName").value;
var hsname= document.getElementById("txtHosName").value;
var hsid= document.getElementById("txtHosPatID").value;
var phone = document.getElementById("txtPhone").value;
var valid = true;

if(name.length<=0 || hsname.length<=0 || hsid.length <=0 || phone.length <=0 )
	{
	alert("Dont Leave any Field Empty");
	valid = false;
	}

if(isNaN(phone) || phone.length > 10|| phone.length < 10)
	{
	alert("Enter a valid Mobile Number");
	valid = false;
	}


return valid;
}