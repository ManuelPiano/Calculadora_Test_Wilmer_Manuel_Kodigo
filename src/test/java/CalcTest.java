import static org.junit.jupiter.api.Assertions.assertEquals;

import Operaciones.Calculadora;
import org.junit.jupiter.api.Test;

public class CalcTest {
  private final Calculadora calculadora = new Calculadora(1, 1);

  @Test
  void sumar() {
    assertEquals(2, calculadora.sumar());
  }

  @Test
  void resta() {
    assertEquals(0, calculadora.restar());
  }

  @Test
  void mult() {
    assertEquals(1, calculadora.multiplicar());
  }

  @Test
  void divi() {
    assertEquals(1, calculadora.dividir());
  }
}
