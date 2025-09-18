import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class inputs {
    public static void main(String[] args) throws IOException {
        // System.out.println("Enter a number");
        // int num = System.in.read();// will not work for higher numbers.. so use
        // BufferedReader
        // System.out.println(num - 48);

        System.out.println("Enter a number");
        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader bf = new BufferedReader(in);
        //OR
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int num1 = Integer.parseInt(bf.readLine());
        System.out.println(num1);
       // bf.close();

        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int num2 = sc.nextInt();
        System.out.println(num2);
        sc.close();

    }
}
