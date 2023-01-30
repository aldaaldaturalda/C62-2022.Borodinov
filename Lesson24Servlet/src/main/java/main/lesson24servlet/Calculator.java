package main.lesson24servlet;

import lombok.Getter;

@Getter
public class Calculator {
   private int a;
   private int b;

   public int sum(int a, int b) {
      return a + b;
   }

   public int subtraction(int a, int b) {
      return a - b;
   }

   public int multiply(int a, int b) {
      return a * b;
   }

   public int division(int a, int b) {
      return a / b;
   }


}
