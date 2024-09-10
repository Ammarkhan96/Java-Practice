import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //reading input

//        Scanner scanner = new Scanner(System.in);
//        byte age =scanner.nextByte();
//        System.out.println("You are " + age);

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Age: ");
//        byte age =scanner.nextByte();
//        System.out.println("You are " + age);

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Name: ");
//        String name = scanner.next();//this method only return my first name
//        System.out.println("You are " + name);

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Name: ");
//        String name = scanner.nextLine();//this method return my first and last name
//        System.out.println("You are " + name);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        String name = scanner.nextLine().trim();//this trim method remove white space
        System.out.println("You are " + name);
    }
}