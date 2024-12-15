/* Author: Haqim Maths
* Created: 2024, December 15th
* Project: Simple Arithmetic Calculator
*  */

import java.util.Scanner;

public class BasicArithmeticCalculator extends java.lang.Object{
 public static void main(String[] args) {
  double a;
  double b;
  char operation;
  double result;
  Scanner input = new Scanner(System.in);
  System.out.print("Enter the value for variable a: ");
  a = input.nextDouble();
  System.out.print("Enter the value for variable b: ");
  b = input.nextDouble();
  System.out.print("Enter the operation: (+ - * / %): ");
  operation = input.next().charAt(0);
  switch(operation){
   case '+':
    result = a + b;
    break;
   case '-':
    result = a - b;
    break;
   case '*':
    result = a * b;
    break;
   case '/':
    result = a / b;
    break;
   case '%':
    result = (int) a % (int) b;
    break;
   default:
    result = -1;
    System.out.println("Error, cannot complete the calculation, unknown operation detected... the result will be negative -1");
    break;
  }
  System.out.println("The result of variable a (" + a + ") " + operation + " variable b (" + b + ") is: " + result);
 }
}
