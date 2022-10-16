import java.util.Scanner;
public class OperacaoMatematica {
    //Enunciar Realizar uma operação matemática, que deve ser passada via System.in
    //( opções: + - / * ) entre dois números que também devem ser solicitados via System.in

    public static void main(String[] args) {
        double n1, n2, opcao;
        double soma, subtracao, multiplicacao, divisao;
        System.out.println("######## CALCULADORA ########");
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o preimeiro valor: ");
        n1 = sc.nextDouble();
        System.out.println("Digite o segundo valor: ");
        n2 = sc.nextDouble();

        System.out.println("###### Selecione uma operação ######");

        System.out.println("(1) - SOMA");
        System.out.println("(2) - SUBTRAÇÃO");
        System.out.println("(3) - MULTIPLICAÇÃO");
        System.out.println("(4) - DIVISÃO");

        System.out.println("######## Digite sua opção: ########");
        opcao = sc.nextInt();
         if (opcao == 1 ) {
             soma = n1 + n2;
             System.out.println("O resultado da soma é : " + soma);
         } else if (opcao == 2) {
             subtracao = n1 - n2;
             System.out.println("O resultado da subtração é : " + subtracao);
         } else if (opcao == 3) {
             multiplicacao = n1 * n2;
             System.out.println("O resultado da multiplicação é : " + multiplicacao);
         } else if (opcao == 4){
             divisao = n1 / n2;
             System.out.printf("A DIVISÃO é : " + divisao);
         }else {
             System.out.println("Operação invalida");
         }
    }
}
