import java.util.Scanner;

public class Main {
    public boolean isPalindrome(String palavra) {
        palavra = palavra.toLowerCase().replaceAll("[^a-z]", "");

        int fim = palavra.length() - 1;
        for (int i=0; i<palavra.length(); i++) {
            if(palavra.charAt(i) != palavra.charAt(fim-i)) {
              return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma palavra:");
        String palavra = scanner.nextLine();

        if(main.isPalindrome(palavra)) {
            System.out.println("Esta palavra é um palíndromo");
        } else {
            System.out.println("Esta palavra não é um palíndromo");
        }

    }
}
