<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
  <!DOCTYPE html>
  <html lang="en">

  <head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="./assets/css/styles.css">
    <title>Adivina la pelicula</title>
  </head>

  <body>
    <h1>Adivina la pelicula</h1>
    <div id="pantalla-inicial">
      <p>¿A qué pelicula hace referencia los emojis?</p>
      <button class="btn" onclick="comenzarJuego()">Comenzar a jugar</button>
    </div>
    <div class="pantalla-juego" id="pantalla-juego">
      <img src="./assets/img/frozen.png" alt="emojis" id="imgEmoji">
      <div class="opciones">
        <div class="opcion" id="op0" onclick="comprobarRespuesta(0)">
          <div class="letra" id="l0">A</div>
          <div class="nombre" id="n0">Opcion A</div>
        </div>
        <div class="opcion" id="op1" onclick="comprobarRespuesta(1)">
          <div class="letra" id="l1">B</div>
          <div class="nombre" id="n1">Opcion B</div>
        </div>
        <div class="opcion" id="op2" onclick="comprobarRespuesta(2)">
          <div class="letra" id="l2">C</div>
          <div class="nombre" id="n2">Opcion C</div>
        </div>
      </div>
    </div>
    <div id="pantalla-final">
      <h2>CORRECTAS <span id="numCorrectas">3</span></h2>
      <h2>INCORRECTAS <span id="numIncorrectas">2</span></h2>
      <button class="btn" onclick="volverAlInicio()">VOLVER AL INICIO</button>
    </div>
    <footer>Leandro Ramirez</footer>

    <script src="./assets/js/script.js"></script>
  </body>

  </html>