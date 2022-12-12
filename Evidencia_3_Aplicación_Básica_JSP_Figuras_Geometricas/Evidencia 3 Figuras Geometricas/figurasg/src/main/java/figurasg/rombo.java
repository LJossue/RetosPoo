package figurasg;

import java.util.*;

public class rombo extends figurasGeometricas {
  Scanner read = new Scanner(System.in);
  private double ladoA, dMayor, dMenor, perimetro, area;

  public rombo() {

  }

  public rombo(double _ladoA, double _dMayor, double _dMenor, double _perimetro, double _area) {
    _ladoA = ladoA;
    _dMayor = dMayor;
    _dMenor = dMenor;
    _perimetro = perimetro;
    _area = area;
  }

  public double getLadoA() {
    return ladoA;
  }

  public void setLadoA(double ladoA) {
    this.ladoA = ladoA;
  }

  public double getdMayor() {
    return dMayor;
  }

  public void setdMayor(double dMayor) {
    this.dMayor = dMayor;
  }

  public double getdMenor() {
    return dMenor;
  }

  public void setdMenor(double dMenor) {
    this.dMenor = dMenor;
  }

  public double getPerimetro() {
    return perimetro;
  }

  public void setPerimetro(double perimetro) {
    this.perimetro = perimetro;
  }

  public double getArea() {
    return area;
  }

  public void setArea(double area) {
    this.area = area;
  }

  @Override
  public void calcularPerimetro() {
    perimetro = ladoA + ladoA + ladoA + ladoA;
    System.out.println("El perimetro es:" + perimetro);
  }

  @Override
  public void calcularArea() {
    area = ((dMayor * dMenor) / 2);
    System.out.println("El area es: " + area);
  }

  public void mostrar(double _perimetro, double _area) {
    System.out.println("El perimetro del rombo es: " + _perimetro);

    System.out.println("El area del rombo es: " + _area);
  }
}
