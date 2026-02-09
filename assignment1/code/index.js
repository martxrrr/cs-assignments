const cpp = document.getElementById("cpp");
const python = document.getElementById("python");
const javascript = document.getElementById("javascript");
const textbox = document.getElementById("textbox");
const fname = document.getElementById("fname");
const lname = document.getElementById("lname");
const age = document.getElementById("age");

let first_name;
let last_name;
let your_age;

function Click(){
    first_name = fname.value;
    last_name = lname.value;
    your_age = age.value;
    
    if (cpp.checked){
        textbox.textContent = "Hello " + first_name + " " + last_name + ",You are " + your_age + " years old!.Your favorite programming language is C++";
        console.log("cpp checked");
    }
    if (python.checked){
        textbox.textContent = "Hello " + first_name + " " + last_name + ",You are " + your_age + " years old!.Your favorite programming language is Python";
    }
    if (javascript.checked){
        textbox.textContent = "Hello " + first_name + " " + last_name + ",You are " + your_age + " years old!.Your favorite programming language is Javascript ";
        console.log("Javascript checked");
    }
}