package figurasg;

public class triangulo extends figurasGeometricas {
  private double area, perimetro, ladoA, ladoB, ladoC, base, altura;

  public triangulo() {

  }

  public triangulo(double area, double perimetro, double ladoA, double ladoB, double ladoC, double base,
      double altura) {
    this.area = area;
    this.perimetro = perimetro;
    this.ladoA = ladoA;
    this.ladoB = ladoB;
    this.ladoC = ladoC;
    this.base = base;
    this.altura = altura;
  }

  public double getArea() {
    return area;
  }

  public void setArea(double area) {
    this.area = area;
  }

  public double getPerimetro() {
    return perimetro;
  }

  public void setPerimetro(double perimetro) {
    this.perimetro = perimetro;
  }

  public double getLadoA() {
    return ladoA;
  }

  public void setLadoA(double ladoA) {
    this.ladoA = ladoA;
  }

  public double getLadoB() {
    return ladoB;
  }

  public void setLadoB(double ladoB) {
    this.ladoB = ladoB;
  }

  public double getLadoC() {
    return ladoC;
  }

  public void setLadoC(double ladoC) {
    this.ladoC = ladoC;
  }

  public double getBase() {
    return base;
  }

  public void setBase(double base) {
    this.base = base;
  }

  public double getAltura() {
    return altura;
  }

  public void setAltura(double altura) {
    this.altura = altura;
  }

  @Override
  public void calcularPerimetro() {
    perimetro = ladoC + ladoB + ladoC;
    System.out.println("El perimetro es:" + perimetro);
  }

  @Override
  public void calcularArea() {
    area = ((base * altura) / 2);
    System.out.println("El area es: " + area);
  }

}
