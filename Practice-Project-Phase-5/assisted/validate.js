function validateLogin(){
   // alert("Hello");
   var email=document.getElementById("n1").value;
   var password=document.getElementById("n2").value;
   if(email.length==0){
    alert("Plz Enter Email ID");
    return false
   }else if(password.length==0){
        alert("Plz Enter the password");
        return false
   }else if(email=="Saveri@gmail.com" && password=="123"){
    alert("Login done successfully");
    return true;
   }else{
    alert("Login failed...pls try again");
    return false;
   }
    return false;
}