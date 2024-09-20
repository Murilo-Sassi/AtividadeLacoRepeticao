import java.util.Scanner;

public class Atividade8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int num = sc.nextInt();

        int numero =0;

        while (numero <= num) {
            System.out.println(numero);
            numero++;
        }

    }
}