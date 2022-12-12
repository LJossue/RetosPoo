package principal;

import salud.empleado;

public class inicio {
  public static void main(String[] args) {
    empleado emp = new empleado();
    emp.pedirDatosemp();
    emp.calcularHonorarios();
    emp.mostraremp();
  }
}
