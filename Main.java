import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao;
        int numero1;
        int numero2;
        int resultado;
        System.out.println("CALCULADORA");
        System.out.println("1 - Adição");
        System.out.println("2 - subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - divisão");
        opcao = entrada.nextInt();
        if (opcao == 1) {
            System.out.println("Você escolheu adição");
        }
        else if (opcao == 2){
          System.out.println("Você escolheu subtração");
        }
        else if (opcao == 3) {
            System.out.println("Você escolheu multiplicação");
        }
        else if (opcao == 4) {
            System.out.println("Você escolheu divisão");
        }
        System.out.println("Escolha seu primeiro número:");
        numero1 = entrada.nextInt();
        
         System.out.println("Escolha seu segundo número:");
         numero2 = entrada.nextInt();
         
         if (opcao == 1){
          resultado = numero1 + numero2;
          System.out.println("Resultado:" + resultado);
         }
         else if (opcao == 2) {
             resultado = numero1 - numero2;
             System.out.println("resultado:" + resultado);
         }
         else if (opcao == 3) {
             resultado = numero1 * numero2;
             System.out.println("resultado:" + resultado);
         }
         else if (opcao == 4) {
             if (numero2 == 0) {
               System.out.println("erro!");
             }
             else {
             resultado = numero1 / numero2;
             System.out.println("resultado:" + resultado);
             }
         }
    }
}