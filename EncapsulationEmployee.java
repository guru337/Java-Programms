import java.util.*;
//demonstaring encapsualtion using Studnet class 
class Student{
    private String name;//private keyword makes the variables not accessiblae outside the class but can be accessible through getter and setter method
    private int sid;
    //parameterized constructor
    Student(String name,int sid){
        this.name=name;//this keyword represents current object which is created with class blueprint
        this.sid=sid;
    }
    public String getName(){//getter method
        return name;
    }
    public int getStudnetID(){
        return sid;
    }
    public void setName(String name){//setter method
        this.name=name;
    }
}

public class EncapsulationEmployee {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("======Student Details=====");
        System.out.println("Enter Student name: ");
        String name=sc.next();
        System.out.println("Enter student id: ");
        int sid=sc.nextInt();
       
        Student Student1=new Student(name,sid);//object creation
        System.out.println("Student name: "+name);
        System.out.println("Studnet id: "+sid);

        System.out.println("Enter the name to be updated: ");
        String uname=sc.next();
        Student1.setName(uname);//Assigning new value to the student
        System.out.println("updated name: "+Student1.getName());
        System.out.println("Student id: "+Student1.getStudnetID());
    }
}
