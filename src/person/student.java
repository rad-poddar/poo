/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

import java.util.Scanner;

public class student extends Person {

    public int rollno;
    public String name;

    void getinfo() {
        System.out.println("What is your roll no. and name?");
        Scanner showing3;
        showing3 = new Scanner(System.in);
        rollno = showing3.nextInt();
        name = showing3.next();
    }

    void showinfo() {
        System.out.println("Roll no. is " + rollno + " name is " + name);
    }

       
    
}
