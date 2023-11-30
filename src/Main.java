import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número de 0 a 100:");
        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();

        int somaNumero = numero1 + numero2;
        int resultadoNumero = somaNumero;

        if(resultadoNumero %2 == 0){
            System.out.println(resultadoNumero + " seu resultado é par ");
        }
        else{
        System.out.println(resultadoNumero + " seu resultado é impar ");
        }
        }
    }
