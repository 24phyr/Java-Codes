package labtwo;

import java.util.Scanner;

public class LabTwo {
    public static void main(String[] args) {
       
       Employee e1 = new Employee();
       e1.setValues("Bob", 10, new String[]{"Studying","Reading","Writing"});
       
       e1.printInfo();
       e1.printHobbies();
    }
    
}
