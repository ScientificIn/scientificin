var checkbox = document.getElementsByClassName('checkboxTeste'); 
 
for (i = 0; i < checkbox.length; i++) {    
    checkbox[i].addEventListener('click', myFunction); 
} 
 
function myFunction() { 
  if (document.getElementById('mn'+this.value)) { 
       document.getElementById('mn'+this.value).remove(); 
   } else { 
       var input = document.createElement("input"); 
       input.id = 'mn'+this.value; 
       input.name = 'mn'+this.value; 
       input.type = 'text'; 
       input.placeholder = ''; 
       var div = "mydiv"+this.value;        
       document.getElementById(div).appendChild(input); 
//       document.getElementById(div).appendChild(document.createElement("br")); 
   } 
} 