(function() {

  //seleciona o elemento video pelo ID "video"
  var video = document.getElementById("video");
  
  //Verifica se o navegador possui suporte para dar play no video
  video.addEventListener( "canplay", function() {
    //Chama o método play
    video.play();
  });
  
})();