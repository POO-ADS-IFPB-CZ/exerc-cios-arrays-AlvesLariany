

public class Fibonacci {
    public  static final int LIMITE = 30;//Usando uma constante para controlar o quantidade de números que serão impressos para o usuário
    public static void main(String[] args) {

        int[] arrayFibonacci = new int[LIMITE];

        arrayFibonacci[0] = 1;
        arrayFibonacci[1] = 1;

        for (int i = 2; i < LIMITE; i++) {
            arrayFibonacci[i] = arrayFibonacci[i - 1] + arrayFibonacci[i - 2];
        }

        System.out.println("Os " + LIMITE+ " primeiros números da sequência de Fibonacci são:");
        for (int i = 0; i < LIMITE; i++) {
            System.out.print(arrayFibonacci[i]);//usando o print para imprimir a sequência em apenas uma linha
            if (i < LIMITE - 1) {
                System.out.print(",");//controlando a quantidade de números para conseguir colocar uma vírgulas para separá-los
            }
            else {
                System.out.print(".");
                System.out.println('\n'+ "Fim da sequência");
            }
        }
    }
}