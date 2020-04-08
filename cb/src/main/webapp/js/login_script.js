
function myFunction() {
	var user_name1="admin";
	var password1="admin";
  var user_name2 = document.frm.username.value; 
  var password2 =document.frm.password.value;
  if((user_name1==user_name2)&&(password1==password2))
	  {
	  alert("Login Successfull!!");
	  return true;
	  }
  else
	  {
	  alert("Invalid Details!!");
	  return false;
	  }

}


