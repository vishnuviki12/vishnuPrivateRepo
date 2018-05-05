import java.util.*;
public class Tdd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter first number");
        int a = s.nextInt();
        System.out.println("enter second number");
        int b = s.nextInt();
        System.out.println("enter third number");
        int c = s.nextInt();

        if(a > b) {
            if (a > c) {
                System.out.println(a+" is greater");
            }
            else {
                System.out.println(c+" is greater");
            }
        }
        else {
            if (b > c) {
                System.out.println(b+" is greater");
            }
            else {
                System.out.println(c+" is greater");
            }

        }

    }
}
