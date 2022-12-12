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
    <title>Hexagono</title>
  </head>

  <body>
    <h1>Hexagono</h1>
    <div><img src="../img/hexagono.png" alt="Hexagono" class="figuraspaginas"></div>
    <hr>
    <div class="row">
      <div class="col">
        <h2 id="perimetro">Perimetro</h2>
        <br>
        <img src="../img/hexagono.png" alt="Hexagono" class="figura">
        <br>
        <p class="centro">El perimetro del rombo equivale al suma de las longitudes de sus lados:
        </p>
        <p class="centro"><b>P = a + b + c + d + d + f</b> </p>
        <br>
        <table class="centro">
          <tr>
            <td>Lado a: <input type="text" class="textbox" value="0" size="5" id="ladoa">&nbsp; &nbsp;</td>
            <td>Lado b: <input type="text" class="textbox" value="0" size="5" id="ladob">&nbsp; &nbsp; </td>
            <td>Lado c: <input type="text" class="textbox" value="0" size="5" id="ladoc">&nbsp; &nbsp;</td>
            <td>Lado d: <input type="text" class="textbox" value="0" size="5" id="ladod">&nbsp; &nbsp; </td>
            <td>Lado e: <input type="text" class="textbox" value="0" size="5" id="ladoe">&nbsp; &nbsp;</td>
            <td>Lado f: <input type="text" class="textbox" value="0" size="5" id="ladof">&nbsp; &nbsp; </td>
          </tr>
        </table>
        <br>
        <button class="boton" onclick="calcularPerimetro();">Calcular</button>
        <br><br>

      </div>
      <div class="col">
        <h2 id="area">Area</h2>
        <br>
        <img src="../img/hexagono.png" alt="Hexagono" class="figura">
        <br>
        <p class="centro">El área del hexágono regular es igual al perímetro por la apotema partido por dos.</p>
        <p class="centro"><b>A = (P x a) / 2</b></p>
        <br>
        <table class="centro">
          <tr>
            <td>Perimetro: <input type="text" class="textbox" value="0" size="5" id="perimetro1">&nbsp; &nbsp;</td>
            <td>Apotema: <input type="text" class="textbox" value="0" size="5" id="apotema"> </td>
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
      var num4 = parseFloat(document.getElementById('ladod').value);
      var num5 = parseFloat(document.getElementById('ladoe').value);
      var num6 = parseFloat(document.getElementById('ladof').value);
      var perimetro;
      perimetro = num1 + num2 + num3 + num4 + num5 + num6;
      alert("El perimetro del hexagono es: " + perimetro);
    }
  </script>
  <script type="text/javascript">
    function calcularArea() {
      var num1 = parseFloat(document.getElementById('perimetro1').value);
      var num2 = parseFloat(document.getElementById('apotema').value);
      var area;
      area = (num1 * num2) / 2;
      alert("El area del hexagono es: " + area);
    }
  </script>

  </html>