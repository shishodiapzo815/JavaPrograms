import java.util.Scanner;


public class Second{
    public static void main(String[] args) {
        System.out.println("Enter a positive integer number:- ");
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        for (int i = 0; i <= n; i++) {
            System.err.println(i);            
        }
    }
}