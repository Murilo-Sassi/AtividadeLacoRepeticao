import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Atividade9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();
        int n = 0;

        while (n < 5) {
            System.out.println("Digite o nome da pessoa: ");
            String nome = sc.nextLine();
            nomes.add(nome);
            n++;
        }

        System.out.println("Os nomes digitados foram" );
        for(String nome : nomes) {
            System.out.println(nome);
        }

    }
}