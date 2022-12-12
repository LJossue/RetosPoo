package principal;

import salud.persona;

public class inicio {
  public static void main(String[] args) {
    persona per = new persona();
    System.out.println("Calcular si su peso es el ideal.");
    per.pedirDatos();
    per.mostarPersona();
    per.mayorEdad();
    per.calcularImc();
  }
}
