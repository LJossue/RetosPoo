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
    <title>Rombo</title>
  </head>

  <body>
    <h1>Rombo</h1>
    <div><img src="../img/rombo.png" alt="rombo" class="figuraspaginas"></div>
    <hr>
    <div class="row">
      <div class="col">
        <h2 id="perimetro">Perimetro</h2>
        <br>
        <img src="../img/rombo.png" alt="perimetro" class="figura">
        <br>

        <p class="centro">El perimetro del rombo equivale al suma de las longitudes de sus lados, puesto a que es un
          paralelogramo, solo necesitamos saber la longitud de uno de sus lados.
        </p>
        <p class="centro"><b>P = a + b + c + d</b> </p>
        <br>
        <table class="centro">
          <tr>

            <td>Lado a: <input type="text" class="textbox" value="0" size="5" id="ladoa"> </td>
          </tr>
        </table>
        <br>
        <button class="boton" onclick="calcularPerimetro();">Calcular</button>
        <br><br>

      </div>
      <div class="col">
        <h2 id="area">Area</h2>
        <br>
        <img src="../img/rombo.png" alt="area" class="figura">
        <br>
        <p class="centro">El área del rombo es igual a la Diagonal mayor por la diagonal menor entre dos. Es decir:</p>
        <p class="centro"><b>A = (D x d) / 2</b></p>
        <br>
        <table class="centro">
          <tr>
            <td>D. Mayor: <input type="text" class="textbox" value="0" size="5" id="dmayor">&nbsp; &nbsp;</td>
            <td>D. Menor: <input type="text" class="textbox" value="0" size="5" id="dmenor"> </td>
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
      var perimetro;
      perimetro = num1 * 4;
      alert("El perimetro del rombo es: " + perimetro);
    }
  </script>
  <script type="text/javascript">
    function calcularArea() {
      var num1 = parseFloat(document.getElementById('dmayor').value);
      var num2 = parseFloat(document.getElementById('dmenor').value);
      var area;
      area = (num1 * num2) / 2;
      alert("El area del rombo es: " + area);
    }
  </script>

  </html>