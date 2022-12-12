package salud;

public class empleado extends persona {
  private String cargo, departamento;
  private double valorHora, horasTrabajadas, reteica, total, valorTotal;

  public empleado() {
  }

  public empleado(String nombre, String apellido, String cargo, String departamento, double valorHora,
      double horasTrabajadas, double reteica, double total, double valorTotal) {
    super(nombre, apellido);
    this.cargo = cargo;
    this.departamento = departamento;
    this.valorHora = valorHora;
    this.horasTrabajadas = horasTrabajadas;
    this.reteica = reteica;
    this.total = total;
    this.valorTotal = valorTotal;
  }

  public String getCargo() {
    return cargo;
  }

  public void setCargo(String cargo) {
    this.cargo = cargo;
  }

  public String getDepartamento() {
    return departamento;
  }

  public void setDepartamento(String departamento) {
    this.departamento = departamento;
  }

  public double getValorHora() {
    return valorHora;
  }

  public void setValorHora(double valorHora) {
    this.valorHora = valorHora;
  }

  public double getHorasTrabajadas() {
    return horasTrabajadas;
  }

  public void setHorasTrabajadas(double horasTrabajadas) {
    this.horasTrabajadas = horasTrabajadas;
  }

  public double getReteica() {
    return reteica;
  }

  public void setReteica(double reteica) {
    this.reteica = reteica;
  }

  public double getTotal() {
    return total;
  }

  public void setTotal(double total) {
    this.total = total;
  }

  public double getValorTotal() {
    return valorTotal;
  }

  public void setValorTotal(double valorTotal) {
    this.valorTotal = valorTotal;
  }

  public void pedirDatosemp() {
    System.out.println("Ingrese el nombre");
    setNombre(read.next());
    System.out.println("Ingrese el apellido");
    setApellido(read.next());
    System.out.println("Ingrese el cargo:");
    setCargo(read.next());
    System.out.println("Ingrese el departamento:");
    setDepartamento(read.next());
    System.out.println("Ingrese las horas trabajadas:");
    setHorasTrabajadas(read.nextDouble());
    System.out.println("Ingrese el valor por hora:");
    setValorHora(read.nextDouble());
  }

  public void calcularHonorarios() {
    total = valorHora * horasTrabajadas;
    reteica = total * 0.00966;
    valorTotal = total - reteica;
  }

  public void mostraremp() {
    System.out.println("HONORARIOS\nEl trabajador " + getNombre() + " " + getApellido() + " con el cargo de "
        + getCargo() + " y con " + getHorasTrabajadas() + " horas trabajadas, con un valor cada una de "
        + getValorHora() + " pesos, y para un total a pagar de:\n " + getValorTotal());
  }
}
