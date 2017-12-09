/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;
import java.util.Scanner;
/**
 *
 * @author Shikhin
 */
public class Person implements properties {
    public String city;
    Scanner s;
    String getcity(){
        Scanner showing;
        showing = new Scanner(System.in);
        System.out.println("What is your city?");
        city=showing.next();
     return city;   
    }
    void showcity(){
        System.out.println("The city is "+city);
    }
    
    void getdetails(){
        System.out.println("What is your age and gender?");
        Scanner showing2;
        showing2=new Scanner(System.in);
        age=showing2.nextInt();
        gender=showing2.next();
        
    }
    public int age;
    public String gender;
    void showdetails(){
        System.out.println("The age is "+age+" The gender is "+gender);
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        student stu = new student();
        stu.getinfo();
        stu.showinfo();
        Person prop = new Person();
        prop.getcity();
        prop.showcity();
        prop.getdetails();
        prop.showdetails();
// TODO code application logic here
    }
    
}
