import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = 0, y = 1, temp;
        int h = scanner.nextInt();

        for (int i = 0; x < h; i++) {
             temp = y;
             y += x;
             x = temp;
        }

        if(x == h){
            System.out.println("Este número pertence a série de Fibonacci");
        } else{
            System.out.println("Não pertence a série de Fibonacci");
        }
    }

}
