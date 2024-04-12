
import java.util.ArrayList;
import java.util.Scanner;

//Teste:
//caso 1: 0, 3, -8; Quantidade de números= 2 e média = 1.5;
//caso 2: 5, 10, 4, 3, -1; Quantidade de números= 4 e média = 5.5;
//caso 3: -9; Não foi informado nenhum número positivo

public class Numeros{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        int quantNumeros = 0, soma = 0;//quantNumero irá controlar a quantidade de números informados pelo usuário e a soma irá realizar a operação de soma dos números informados;
        int valor;

        do {
            System.out.println("Informe um número inteiro");
            valor = scanner.nextInt();
            if (valor >= 0) {
                numeros.add(valor);
                soma += valor;
                quantNumeros++;
            }
        }

        while (valor >= 0);

        if (quantNumeros == 0 ) {// trata o problema de divisão por zero
            System.out.println("Não foi informado nenhum número positivo");
        }
        else {
            double media = (double) soma /numeros.size();
            System.out.println("A quantidade de número(s) positivo(s) informado(s) = " + numeros.size() + '\n' + "A média dos números digitados é: " + media);
        }

    }
}


