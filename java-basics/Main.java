public class Main {

    static int plusMethod(int x, int y) {
        return x + y;
    }

    static double plusMethod(double x, double y) {
        return x + y;
    }
    static void myMethod() {
        System.out.println("Olá");
    }

    static void mySecondMethod(String parameter) {
        System.out.println(parameter + " brabo");
    }

    static void myThirdMethod(String parameter, int secondParameter) {
        System.out.println(parameter + " " + secondParameter);
    }
    public static void main(String[] args) {
        System.out.println("Hello world");
        int numero = 10;
        int numero2;
        final int numero3 = 30;
        char caractere = 40;
        int numero4= 10, numero5 = 50, numero6 = 100;
        int x,y,z;
        x = y = z = 30;

        String meuNome = "Davi";
        String meuSobrenome = "Pinheiro";

        numero2 = 20;
        System.out.println(meuNome.indexOf('v'));
        System.out.println(meuNome.concat(meuSobrenome));
        System.out.println(numero);
        System.out.println(numero2);
        System.out.println(x);
        System.out.println(caractere);
        myMethod();
        mySecondMethod("hahahaha");
        myThirdMethod("primeiro", 2);
    }
}
