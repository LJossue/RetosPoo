let emojis = ["frozen.png", "reyleon.png", "it.png", "gatoconbotas.png"];

let correcta = [1, 0, 2, 1];

let opciones = [];

opciones.push(["Alicia en el pais de las maravillas", "Frozen", "Valiente"]);
opciones.push(["El Rey Leon", "Pinocho", "Zootopia"]);
opciones.push(["Scary Movie", "Saw", "It (Eso)"]);
opciones.push(["Shrek", "El gato con botas", "Bolt"]);

let posActual = 0;
let cantidadAcertadas = 0;
function comenzarJuego() {
  posActual = 0;
  cantidadAcertadas = 0;
  document.getElementById("pantalla-inicial").style.display = "none";
  document.getElementById("pantalla-juego").style.display = "block";
  cargarEmoji();
}

function cargarEmoji() {
  if (emojis.length <= posActual) {
    terminarJuego();
  } else {
    limpiarOpciones();
    document.getElementById("imgEmoji").src =
      "./assets/img/" + emojis[posActual];
    document.getElementById("n0").innerHTML = opciones[posActual][0];
    document.getElementById("n1").innerHTML = opciones[posActual][1];
    document.getElementById("n2").innerHTML = opciones[posActual][2];
  }
}

function limpiarOpciones() {
  document.getElementById("n0").className = "nombre";
  document.getElementById("n1").className = "nombre";
  document.getElementById("n2").className = "nombre";

  document.getElementById("l0").className = "letra";
  document.getElementById("l1").className = "letra";
  document.getElementById("l2").className = "letra";
}

function comprobarRespuesta(opElegida) {
  if (opElegida == correcta[posActual]) {
    document.getElementById("n" + opElegida).className =
      "nombre nombreAcertada";
    document.getElementById("l" + opElegida).className = "letra letraAcertada";
    cantidadAcertadas++;
  } else {
    document.getElementById("n" + opElegida).className =
      "nombre nombreNoAcertada";
    document.getElementById("l" + opElegida).className =
      "letra letraNoAcertada";

    document.getElementById("n" + correcta[posActual]).className =
      "nombre nombreAcertada";
    document.getElementById("l" + correcta[posActual]).className =
      "letra letraAcertada";
  }
  posActual++;

  setTimeout(cargarEmoji, 1000);
}

function terminarJuego() {
  document.getElementById("pantalla-juego").style.display = "none";
  document.getElementById("pantalla-final").style.display = "block";

  document.getElementById("numCorrectas").innerHTML = cantidadAcertadas;
  document.getElementById("numIncorrectas").innerHTML =
    emojis.length - cantidadAcertadas;
}

function volverAlInicio() {
  document.getElementById("pantalla-final").style.display = "none";
  document.getElementById("pantalla-inicial").style.display = "block";
  document.getElementById("pantalla-juego").style.display = "none";
}
