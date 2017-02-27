import java.util.Scanner;

/**
 * @author: Brojandos.
 * @creation_date: 27.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a1 = input.nextInt();
        int d = input.nextInt() - a1;
        System.out.print(a1 + (input.nextInt() - 1) * d);
    }
}