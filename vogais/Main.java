import java.util.Scanner;

public class Main {
    public int contadorVogais(String palavra) {
        palavra = palavra.toLowerCase();
        int contador = 0;
        for (int i = 0; i<palavra.length(); i++) {
            char letra = palavra.charAt(i);
            if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ) {
                contador++;
            }
        }
        System.out.println(contador);
        return contador;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma palavra:");
        String palavra = scanner.nextLine();

        Main main = new Main();
        int contador = main.contadorVogais(palavra);
        if(contador>0) {
            System.out.println("A palavra possui " + contador + " vogais.");
        } else {
            System.out.println("A palavra não possui vogais.");
        }
    }
}
