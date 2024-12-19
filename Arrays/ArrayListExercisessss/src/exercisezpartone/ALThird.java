/*
 * Title: Insert an element to the array at first position
 * By: Haqim Maths
 * Programmed on: 2024, December 19th
 * */

package exercisezpartone;
import java.util.Arrays;
import java.util.ArrayList;

public class ALThird {
 public void TheMain(){
  ArrayList<Integer> luckyNumbers = new ArrayList<>(Arrays.asList(10, 90, 2, 1, 34, 234, 22, 112, 34, 22332, 122, 112));
  luckyNumbers.add(0, 100);
  System.out.print("-+".repeat(30));
  System.out.println();;
  System.out.println("Lucky numbers");
  System.out.print("-+".repeat(30));
  System.out.println();;
  for(Integer x : luckyNumbers){
   System.out.print(x + " ");
  }
  System.out.println();
  System.out.print("-+".repeat(30));
  System.out.println();;
 }
}
