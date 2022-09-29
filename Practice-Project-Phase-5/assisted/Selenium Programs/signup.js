function store(){

    var name = document.getElementById('name');
    var pw = document.getElementById('pw');

    var lowerCaseLetters = /[a-z]/g;
    var upperCaseLetters = /[A-Z]/g;
    var numbers = /[0-9]/g;

    if(name.value.length == 0){
        alert('Please fill in email');

    }else if(pw.value.length == 0){
        alert('Please fill in password');

    }else if(name.value.length == 0 && pw.value.length == 0){
        alert('Please fill in email and password');

    }else{
        sessionStorage.setItem('name', name.value);
        sessionStorage.setItem('pw', pw.value);
        alert('Your account has been created');
    }
}