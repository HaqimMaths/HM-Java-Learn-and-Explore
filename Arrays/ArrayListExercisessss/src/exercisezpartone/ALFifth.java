/*
 * Title: Update an array element
 * By: Haqim Maths
 * Programmed on: 2024, December 19th
 * */

package exercisezpartone;
import java.util.ArrayList;
import java.util.Arrays;

public class ALFifth {
 public void TheMain(){
  ArrayList<String> computerBrands = new ArrayList<>();
  computerBrands.add("Acer");
  computerBrands.add("Hp");
  computerBrands.add("Asus");
  computerBrands.add("MS Surface");
  computerBrands.add("Macintosh");
  System.out.println("Set index 2 with 'Razer': ");
  System.out.println(computerBrands);
  computerBrands.set(2, "Razer");
  System.out.println(Arrays.asList(computerBrands));
 }
}
