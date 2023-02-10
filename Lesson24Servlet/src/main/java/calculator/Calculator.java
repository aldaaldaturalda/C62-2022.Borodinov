package calculator;


import lombok.experimental.UtilityClass;

@UtilityClass
public class Calculator {
   public static double sum(double a, double b) {
      return a + b;
   }

   public double subtraction(double a, double b) {
      return a - b;
   }

   public double multiply(double a, double b) {
      return a * b;
   }

   public double division(double a, double b) {
      return a / b;
   }
}
