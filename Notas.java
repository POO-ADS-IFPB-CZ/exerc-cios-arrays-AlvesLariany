

import java.util.Scanner;
//Teste:
//Notas: 10, 5, 7, 7, 8.5, 8, 2, 5, 5, 6;
//Resultado esperado: Média= 6.35. 5 alunos acima da média e 5 alunos abaixo da média
public class Notas {
    public static int QUANT_ALUNOS=10;

    public static void main(String[] args){
        int aux=1;// usada para imprimir para o usuário qual é o número do aluno o qual ele está informando a nota
        double soma=0;// controlar a soma das notas para realização do calculo da média
        Scanner scanner=new Scanner(System.in);
        double[] arrayNotas = new double[QUANT_ALUNOS];
        for(int i=0; i<QUANT_ALUNOS;i++){
            System.out.println("Informe a nota do aluno "+ aux);
            arrayNotas[i]= scanner.nextDouble();
            soma+=arrayNotas[i];// somando as notas para fazer o calculo da média
            aux++;
        }
        System.out.println("Fim da leitura");

        //Calcular a média
        double media= soma/QUANT_ALUNOS;
        int acimaMedia=0, abaixoMedia=0;
        for(int i=0; i<QUANT_ALUNOS;i++){
            if(arrayNotas[i]>=media){
                acimaMedia++;
            }
            else{
                abaixoMedia++;
            }
        }
        System.out.println("A média é: "+media);
        System.out.println("Quantidade de alunos acima da média: "+acimaMedia+ '\n'+ "Quantidade de alunos abaixo da média: "+abaixoMedia );

    }



}
