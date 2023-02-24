package Operaciones;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
public class Calculadora {

  @Getter @Setter private double n1, n2;

  public double sumar() {
    return n1 + n2;
  }

  public double restar() {
    return n1 - n2;
  }

  public double multiplicar() {
    return n1 * n2;
  }

  public double dividir() {
    if (n2 == 0) {
      throw new ArithmeticException("No se puede dividir entre 0");
    }
    return n1 / n2;
  }
}
