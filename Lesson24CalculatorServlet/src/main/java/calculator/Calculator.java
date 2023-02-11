package calculator;


import lombok.experimental.UtilityClass;

@UtilityClass
public class Calculator {

   public static <N extends Number, P extends Number> double sum(N n, P p) {
      return n.doubleValue() + p.doubleValue();
   }


   public static <N extends Number, P extends Number> double subtraction(N n, P p) {
      return n.doubleValue() - p.doubleValue();
   }

   public static <N extends Number, P extends Number> double multiply(N n, P p) {
      return n.doubleValue() * p.doubleValue();
   }

   public static <N extends Number, P extends Number> double division(N n, P p) {
      return n.doubleValue() / p.doubleValue();
   }
}
