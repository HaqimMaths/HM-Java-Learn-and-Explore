/*
 * Title: Reverse, shuffle, and more!
 * By: Haqim Maths
 * Programmed on: 2024, December 19th
 * */

package exercisezparttwo;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MicroLinuxEmployees {
 public static void TheThirdMain(){
  ArrayList<Integer> ages = new ArrayList<>(3);
  ages.add(90);
  ages.add(12);
  ages.add(22);
  System.out.println(ages);
  ages.ensureCapacity(6);
  ages.add(9);
  ages.add(30);
  ages.add(78);
  System.out.println(ages);
  System.out.println("Replace the second element of the array");
  ages.set(1, 7890);
  System.out.println(Arrays.asList(ages));
  System.out.println("Get all the elements based on their number index");
  for(int i = 0; i < ages.size(); i++){
   System.out.println(ages.get(i));
  }
 }
 public static void TheSecondMain(){
  List<String> villageNames = new ArrayList<String>();
  villageNames.addAll(Arrays.asList("St mark", "St deli", "St san andreas"));
  System.out.println("Joined list!");
  System.out.println("villagesNames : " + villageNames);
  List<String> townNames = new ArrayList<String>();
  townNames.add("Fbaucii");
  townNames.add("Jakarta");
  townNames.add("Kuala Lumpur");
  System.out.println("townNames : " + townNames);
  List<String> villageAndTownNames = new ArrayList<>();
  villageAndTownNames.addAll(villageNames);
  villageAndTownNames.addAll(townNames);
  System.out.println("villageAndTownNames : " + villageAndTownNames);
  System.out.println("Cloning lists!");
  List<String> cloneOfVillageNames = (ArrayList<String>) ((ArrayList<String>)villageNames).clone();
  villageNames.remove(1);
  System.out.println("villageNames : "+villageNames);
  System.out.println("copyOfVillageNames : " + cloneOfVillageNames);
  System.out.println("Empty the list of copyVillageNames");
  cloneOfVillageNames.removeAll(cloneOfVillageNames);
  System.out.println("copyOfVillageNames : " + cloneOfVillageNames);
  System.out.println("Is the list 'villageNames' empty?: " + villageNames.isEmpty());
  System.out.println("Trim the villageNames: ");
  ((ArrayList<String>) villageNames).trimToSize();
  System.out.println(villageNames);
 }
 public static void TheMain(){
  List<String> employeeNames = new ArrayList<String>();
  for(int i = 0; i < 10; i++){
   employeeNames.add(
    switch (i){
     case 0 -> "Thiesyendran";
     case 1 -> "Haqim";
     case 2 -> "Harish";
     case 3 -> "Seertinban";
     case 4 -> "Aiman";
     case 5 -> "Amirah";
     case 6 -> "Aina";
     case 7 -> "Starscream";
     case 8 -> "Megatron";
     case 9 -> "Solus Prime";
     case 10 -> "Unicron";
     default -> "ANONYMOUS";
    }
   );
  }
  System.out.println("List before reversed: " + employeeNames);
  Collections.reverse(employeeNames);
  System.out.println("List after reversed: " + employeeNames);
  System.out.println("Extract a portion of employeeNames");
  System.out.println(employeeNames.getClass().getName());
  System.out.println(employeeNames.subList(0, 3));
  employeeNames.add("Megatronous Prime");
  // Create copyEmployeeNames
  List<String> copyEmployeeNames = new ArrayList<String>();
  for(int i = 0; i < employeeNames.size(); i++){
   copyEmployeeNames.add("");
  }
  Collections.copy(copyEmployeeNames, employeeNames);
  Collections.shuffle(copyEmployeeNames);
  copyEmployeeNames.add(3, "The fallen");
  System.out.println("Compare two array list which are employeeNames and copyEmployeeNames");
  List<String> compareResults = new ArrayList<String>();
  employeeNames.remove(2);
  for(String e : copyEmployeeNames){
   compareResults.add(employeeNames.contains(e) ? "Found" : "Not found");
  }
  System.out.println(employeeNames);
  System.out.println(copyEmployeeNames);
  System.out.println("The result: " + Arrays.asList(compareResults));
  // Swapping
  System.out.println("Swap element 2 and 4 in employeeNames");
  String temp = employeeNames.get(2);
  Collections.swap(employeeNames, 2, 4);
  System.out.println(employeeNames);
 }
}
