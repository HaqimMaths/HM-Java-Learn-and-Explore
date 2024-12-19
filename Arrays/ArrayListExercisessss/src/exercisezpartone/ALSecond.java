/*
 * Title: Iterate all the elements in array list
 * By: Haqim Maths
 * Programmed on: 2024, December 19th
 * */

package exercisezpartone;

import java.util.ArrayList;
import java.util.Arrays;

public class ALSecond {
 public void TheMain(){
  ArrayList<Character> grades = new ArrayList<Character>(Arrays.asList('A', 'A', 'B', 'F', 'E', 'D', 'C', 'G', 'A'));
  grades.add('F');
  grades.remove(Character.valueOf('B'));
  System.out.print("-".repeat(30));
  System.out.println();
  System.out.println("Grades collections");
  System.out.print("-".repeat(30));
  System.out.println();
  for(Character grade : grades){
   System.out.println(grade);
  }
  System.out.print("-".repeat(30));
  System.out.println();
 }
}
