import Operaciones.Calculadora;
import java.util.Scanner;

public class CalculadoraTest {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Ingrese el primer número: ");
    double num1 = sc.nextDouble();

    System.out.print("Ingrese el segundo número: ");
    double num2 = sc.nextDouble();

    Calculadora calculadora = new Calculadora(num1, num2);

    // Operación de suma
    System.out.println("La suma de " + num1 + " y " + num2 + " es: " + calculadora.sumar());

    // Operación de resta
    System.out.println("La resta de " + num1 + " y " + num2 + " es: " + calculadora.restar());

    // Operación de multiplicación
    System.out.println(
        "La multiplicación de " + num1 + " y " + num2 + " es: " + calculadora.multiplicar());

    // Operación de división
    try {
      System.out.println("La división de " + num1 + " y " + num2 + " es: " + calculadora.dividir());
    } catch (ArithmeticException e) {
      System.out.println(e.getMessage());
    }
  }
}
