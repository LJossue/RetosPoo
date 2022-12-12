package salud;

import java.util.*;

public class persona {
  Scanner read = new Scanner(System.in);
  private String tipoDoc, nombre, apellido, sexo, cPeso;

  private double documento, peso, estatura, edad, pesoActual;

  public persona() {
  }

  public persona(String tipoDoc, String nombre, String apellido, String sexo, double documento, double peso,
      double estatura, double edad, double pesoActual) {
    this.tipoDoc = tipoDoc;
    this.nombre = nombre;
    this.apellido = apellido;
    this.sexo = sexo;
    this.documento = documento;
    this.peso = peso;
    this.estatura = estatura;
    this.edad = edad;
    this.pesoActual = pesoActual;
  }

  public String getcPeso() {
    return cPeso;
  }

  public void setcPeso(String cPeso) {
    this.cPeso = cPeso;
  }

  public String getTipoDoc() {
    return tipoDoc;
  }

  public void setTipoDoc(String tipoDoc) {
    this.tipoDoc = tipoDoc;
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

  public String getSexo() {
    return sexo;
  }

  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  public double getDocumento() {
    return documento;
  }

  public void setDocumento(double documento) {
    this.documento = documento;
  }

  public double getPeso() {
    return peso;
  }

  public void setPeso(double peso) {
    this.peso = peso;
  }

  public double getEstatura() {
    return estatura;
  }

  public void setEstatura(double estatura) {
    this.estatura = estatura;
  }

  public double getEdad() {
    return edad;
  }

  public void setEdad(double edad) {
    this.edad = edad;
  }

  public double getPesoActual() {
    return pesoActual;
  }

  public void setPesoActual(double pesoActual) {
    this.pesoActual = pesoActual;
  }

  public void pedirDatos() {
    System.out.println("Ingrese el tipo de documento: ");
    setTipoDoc(read.nextLine());
    System.out.println("Ingrese el numero de documento: ");
    setDocumento(read.nextDouble());
    System.out.println("Ingrese el nombre: ");
    setNombre(read.next());
    System.out.println("Ingrese el apellido: ");
    setApellido(read.next());
    System.out.println("Ingrese el sexo: ");
    setSexo(read.next());
    System.out.println("Ingrese el peso (EN KG): ");
    setPeso(read.nextDouble());
    System.out.println("Ingrese la estatura(EN M): ");
    setEstatura(read.nextDouble());
    System.out.println("Ingrese la edad: ");
    setEdad(read.nextDouble());
  }

  public void mostarPersona() {
    System.out.println("Los datos de la persona son: \nTipo de documento: " + getTipoDoc() + "\nNumero de documento: "
        + getDocumento() + "\nNombre: " + getNombre() + "\nApellido: " + getApellido() + "\nSexo: " + getSexo()
        + "\nPeso: "
        + getPeso()
        + "\nEstatura: " + getEstatura() + "\nEdad: " + getEdad());
  }

  public String calcularImc(double peso, double estatura) {
    pesoActual = peso / (Math.pow(estatura, 2));

    if (pesoActual < 20) {
      cPeso = "PESOBAJO";
      return cPeso;
    } else if (pesoActual >= 20 && pesoActual <= 25) {
      cPeso = "PESOIDEAL";
      return cPeso;
    } else {
      cPeso = "SOBREPESO";
      return cPeso;
    }
  }

  public void mayorEdad() {
    if (edad >= 18) {
      System.out.println("Es mayor de edad");
    } else {
      System.out.println("Es menor de edad");
    }
  }
}
