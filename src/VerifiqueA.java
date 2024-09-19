import java.util.Scanner;

public class VerifiqueA {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String palavra = scanner.next();
        int contador = 0;

        for(char x : palavra.toLowerCase().toCharArray()){
            if(x == 'a')contador++;
        }

        System.out.println(contador);
    }
}
