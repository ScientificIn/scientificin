function myFunctionVis(tableid) {  
  var e = document.getElementById("divt"+tableid);
  if (e.style.display == "none") {
     e.style.display = "block";
  }else{
     e.style.display = "none";
  }  
} 

