package salud;

import java.util.*;

public class persona {
  Scanner read = new Scanner(System.in);
  private String nombre, apellido;

  public persona() {
  }

  public persona(String nombre, String apellido) {

    this.nombre = nombre;
    this.apellido = apellido;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellido() {
    return apellido;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

}
