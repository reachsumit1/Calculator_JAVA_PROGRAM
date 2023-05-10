import java.util.Scanner;
public class Calculator  {
    public static void main(String[] args) {
        double result;

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome");
        System.out.println("Enter 2 values");
        System.out.println("Enter first value");
        double first = sc.nextDouble();
        System.out.println("Enter second value");
        double second = sc.nextDouble();
        System.out.println("Choose one operation");
        System.out.println("Enter 1 for Addition");
        int num = sc.nextInt();
        switch (num) {
            case 1:
                result = first + second;
                System.out.println(first + " and " + second + "Addition of number:= " + result);
                break;
        }


    }


}
