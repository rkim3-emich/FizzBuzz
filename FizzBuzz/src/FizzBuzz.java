import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        //take user input for number of iterations
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of iterations: ");
        int iterations = sc.nextInt();

        //loop for number of iterations
        for (int i = 1; i <= iterations; i++) {
            //calculate if i is a fizz, buzz, fizz buzz, or normal
            if (i % 15 == 0) {
                System.out.print("Fizz Buzz, ");
            } else if (i % 3 == 0) {
                System.out.print("Fizz, ");
            } else if (i % 5 == 0) {
                System.out.print("Buzz, ");
            } else {
                System.out.print(i + ", ");
            }
        }
    }
}