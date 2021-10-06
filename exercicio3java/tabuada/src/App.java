import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int num;
        Scanner lerTeclado = new Scanner(System.in);
        System.out.println("Programa da tabuada");
        System.out.println();

        System.out.print("Informe o número: ");
        num = lerTeclado.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println("  " + num + " X " + i + " = " + (num * i));
        }
    }
}
