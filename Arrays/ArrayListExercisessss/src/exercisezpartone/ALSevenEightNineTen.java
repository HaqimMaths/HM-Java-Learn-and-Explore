/*
 * Title: Search an element and sorting
 * By: Haqim Maths
 * Programmed on: 2024, December 19th
 * */

package exercisezpartone;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ALSevenEightNineTen {
 public void TheMain(){
  List<String> employeeNames = new ArrayList<String>(Arrays.asList("John", "Dutch", "Arthur", "Sean", "Jack"));
  System.out.println(employeeNames);
  if(employeeNames.contains("Arthur")){
   System.out.println("Found ya arthur!");
  } else {
   System.out.println("Where's arthur?");
  }
  System.out.println("Sorting the list!");
  Collections.sort(employeeNames);
  System.out.println(employeeNames);
  System.out.println("Copy array list");
  List<String> copyEmployeeNames = new ArrayList<String>();
  for(int i = 0; i < employeeNames.size(); i++){
   copyEmployeeNames.add("");
  }
  Collections.copy(copyEmployeeNames, employeeNames);
  System.out.println(copyEmployeeNames);
  System.out.println(employeeNames);
  System.out.println("Shuffle elements inside the array :)");
  Collections.shuffle(employeeNames);
  Collections.shuffle(copyEmployeeNames);
  System.out.println(copyEmployeeNames);
  System.out.println(employeeNames);
 }
}
