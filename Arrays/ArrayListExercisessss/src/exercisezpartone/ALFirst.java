/*
* Title: Create a simple array list and display it
* By: Haqim Maths
* Programmed on: 2024, December 19th
* */

package exercisezpartone;
import java.util.ArrayList;
import java.util.Arrays;

public class ALFirst {
 public void TheMain(){
  ArrayList<String> Colors = new ArrayList<>(Arrays.asList("Black", "Blue", "Green", "Yellow"));
  Colors.add("Purple");
  System.out.print("-".repeat(30));
  System.out.println();
  System.out.println("Colors collections");
  System.out.print("-".repeat(30));
  System.out.println();
  System.out.println(Colors);
  System.out.print("-".repeat(30));
  System.out.println();
 }
}
