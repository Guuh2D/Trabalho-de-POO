import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Digite uma palavra que contenha cinco letras:");
        String palavra = a.next();
        a.close();

        for (int i = 0; i < palavra.length() - 2; i++) {
            for (int j = i + 1; j < palavra.length() - 1; j++) {
                for (int k = j + 1; k < palavra.length(); k++) {
                    System.out.println(palavra.charAt(i) + "" + palavra.charAt(j) + "" + palavra.charAt(k));
                }
            }
        }
    }
}