<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
  <!DOCTYPE html>
  <html lang="es">

  <head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet"
      integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">

    <link rel="stylesheet" href="../css/estilos.css">
    <title>Triangulo</title>
  </head>

  <body>
    <h1>Triangulo</h1>
    <div><img src="../img/Triangle-Vector-PNG-Picture.png" alt="triangulo" class="figuraspaginas"></div>
    <hr>
    <div class="row">
      <div class="col">
        <h2 id="perimetro">Perimetro</h2>
        <br>
        <img src="../img/Triangle-Vector-PNG-Picture.png" alt="triangulo" class="figura">
        <br>
        <p class="centro">El perimetro del triángulo ∆ABC equivale al suma de las longitudes de sus lados:
        </p>

        <p class="centro"><b>P = a + b + c</b> </p>
        <br>
        <table class="centro">
          <tr>
            <td>Lado a: <input type="text" class="textbox" value="0" size="5" id="ladoa">&nbsp; &nbsp;</td>
            <td>Lado b: <input type="text" class="textbox" value="0" size="5" id="ladob">&nbsp; &nbsp; </td>
            <td>Lado c: <input type="text" class="textbox" value="0" size="5" id="ladoc"> </td>
          </tr>
        </table>
        <br>
        <button class="boton" onclick="calcularPerimetro();">Calcular</button>
        <br><br>

      </div>
      <div class="col">
        <h2 id="area">Area</h2>
        <br>
        <img src="../img/Triangle-Vector-PNG-Picture.png" alt="triangulo" class="figura">
        <br>
        <p class="centro">El área de un triángulo es igual a base por altura partido por 2.</p>
        <p class="centro"><b>A = (b x h) / 2</b></p>
        <br>
        <table class="centro">
          <tr>
            <td>Base: <input type="text" class="textbox" value="0" size="5" id="base">&nbsp; &nbsp;</td>
            <td>Altura: <input type="text" class="textbox" value="0" size="5" id="altura"> </td>
          </tr>
        </table>
        <br>
        <button class="boton" onclick="calcularArea();">Calcular</button>
        <br><br>
      </div>
    </div>
    <hr>
    <a href="../../index.jsp" class="volver">Volver al Menú</a>
  </body>
  <script type="text/javascript">
    function calcularPerimetro() {
      var num1 = parseFloat(document.getElementById('ladoa').value);
      var num2 = parseFloat(document.getElementById('ladob').value);
      var num3 = parseFloat(document.getElementById('ladoc').value);
      var perimetro;
      perimetro = num1 + num2 + num3;
      alert("El perimetro del triangulo es: " + perimetro);
    }
  </script>
  <script type="text/javascript">
    function calcularArea() {
      var num1 = parseFloat(document.getElementById('base').value);
      var num2 = parseFloat(document.getElementById('altura').value);
      var area;
      area = (num1 * num2) / 2;
      alert("El area del triangulo es: " + area);
    }
  </script>

  </html>