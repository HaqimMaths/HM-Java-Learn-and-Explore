/*
 * Title: Remove third element
 * By: Haqim Maths
 * Programmed on: 2024, December 19th
 * */

package exercisezpartone;

import java.util.Arrays;
import java.util.ArrayList;

public class ALSix {
 public void TheMain(){
  ArrayList<Integer> fileSize = new ArrayList<>(Arrays.asList(10, 20, 1, 3, 90, 221, 21, 1024));
  System.out.print("Before removal of third element: " + fileSize);
  System.out.println();
  fileSize.remove(3);
  System.out.print("After removal of third element: " + fileSize);
  System.out.println();
 }
}
