package labtwo;
public class Employee {
    String name;
    int id;
    String[] hobbies = new String[3];
    void printInfo(){
        System.out.println("The id of "+name+" is "+id);
    }
    void printHobbies(){
        for(int i=0;i<3;i++){
        System.out.println(hobbies[i]);
    }
    }
    
    void setValues(String n, int i, String[] h){
        name =n;
        id=i;
        hobbies = h;
    }
}
