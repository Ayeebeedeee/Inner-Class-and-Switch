//This is a combination of Inner class and switch program, where it's a user based direction to enter in the class of the user's choice
//Also I made the switch choices in String format since there was some issue with the choices in integer form

import java.util.Scanner;

class A {
    void show() {
        System.out.println("Currently in class A");
    }

    class B {
        void newhsow() {
            System.out.println("Currently in Class B");
        }
    }
}

public class demo {
    public static void main(String[] args) {
        A obj = new A();
        A.B obj2 = obj.new B();
        Scanner sc = new Scanner(System.in);

        System.out.println("Hello viewer, kindly share which class do you wanna go in? Press 1 for class A and 2 for class B");

        String ch=sc.nextLine();

        switch (ch) {
            case "2":
                obj2.newhsow();
                break;
            case "1":
                obj.show();
                break;
            default:
                System.out.println("Sorry viewer, kindly check your choice and update your choice accordingly");
                break;
        }

        sc.close();
    }
}
