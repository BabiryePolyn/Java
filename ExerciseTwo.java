import java.util.Scanner;

public class ExerciseTwo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Your age is: " + age);  

        System.out.println("Enter your name : ");
        String name =sc.next();
        System.out.println("Your name is: " + name);

        sc.nextLine();

        System.out.println("Enter your full name: ");
        String fullName = sc.nextLine();
        System.out.println("Your full name is: " + fullName);

        sc.close();

    }
}
