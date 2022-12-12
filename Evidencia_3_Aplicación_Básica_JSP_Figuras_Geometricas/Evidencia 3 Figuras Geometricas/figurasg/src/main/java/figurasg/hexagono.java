package figurasg;

public class hexagono extends figurasGeometricas {
  private double ladoA, ladoB, ladoC, ladoD, ladoE, ladoF, perimetro, apotema, area;

  public hexagono() {

  }

  public hexagono(double ladoA, double ladoB, double ladoC, double ladoD, double ladoE, double ladoF, double perimetro,
      double apotema, double area) {
    this.ladoA = ladoA;
    this.ladoB = ladoB;
    this.ladoC = ladoC;
    this.ladoD = ladoD;
    this.ladoE = ladoE;
    this.ladoF = ladoF;
    this.perimetro = perimetro;
    this.apotema = apotema;
    this.area = area;
  }

  public double getArea() {
    return area;
  }

  public void setArea(double area) {
    this.area = area;
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

  public double getLadoD() {
    return ladoD;
  }

  public void setLadoD(double ladoD) {
    this.ladoD = ladoD;
  }

  public double getLadoE() {
    return ladoE;
  }

  public void setLadoE(double ladoE) {
    this.ladoE = ladoE;
  }

  public double getLadoF() {
    return ladoF;
  }

  public void setLadoF(double ladoF) {
    this.ladoF = ladoF;
  }

  public double getPerimetro() {
    return perimetro;
  }

  public void setPerimetro(double perimetro) {
    this.perimetro = perimetro;
  }

  public double getApotema() {
    return apotema;
  }

  public void setApotema(double apotema) {
    this.apotema = apotema;
  }

  @Override
  public void calcularPerimetro() {
    perimetro = ladoA + ladoB + ladoC + ladoD + ladoE + ladoF;
    System.out.println("El perimetro es:" + perimetro);
  }

  @Override
  public void calcularArea() {
    area = ((perimetro * apotema) / 2);
    System.out.println("El area es: " + area);
  }
}
