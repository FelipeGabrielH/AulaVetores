import java.util.Scanner;

public class main {
    public static void main (String [] args ){
        /* Declaração e criação do objeto "calc" da classe "Calculos" . */
        Calculo calc =  new Calculo();

        /* Declaração e criação do objeto "sc" da classe "Scanner".
        Utilizado para a leitura de valores do teclado don computador.
         */

        Scanner sc = new Scanner(System.in);

        /* Variáveis do programa.
         */
        float valor1, valor2, resultado = 0;
        int opcao;

        /* Menu apresentado ao usuário que utilizará o programa, para
        que este possa escolher o cálculo a ser efetuado ou sair do
        programa .
         */

        do{
            System.out.println("Escolha o cálculo: ");
            System.out.println("1 - Cálculo 01");
            System.out.println("2 - Cálculo 02");
            System.out.println("3 - Cálculo 03");
            System.out.println("4 - Sair");
            System.out.println("Opção:");
            opcao = sc.nextInt();

            if (opcao != 4){
                //Leitura dos valores digitados pelo usuário.
                System.out.println("\nDigite o 1º valor:");
                valor1 = sc.nextFloat();
                System.out.println("\nDigite o 2º valor:");
                valor2 = sc.nextFloat();
                //Execução do cálculo escolhido pelo usuário.
                switch (opcao){
                    case 1:
                        resultado = calc.calculo01(valor1, valor2);
                        break;
                    case 2:
                        calc.setNum1(valor1);
                        calc.setNum2(valor2);
                        resultado = calc.calculo02();
                        break;
                    case 3:
                        calc.setNum1(valor1);
                        calc.setNum2(valor2);
                        calc.calculo03();
                        resultado = calc.getTotal();
                        break;
                }
                //Apresentação do resultado  do cálculo.
                System.out.println("\n\n==================================");
                System.out.println("Resultado : "+resultado);
                System.out.println("======================================\n\n");
            }
        }while(opcao != 4);
    }
}

