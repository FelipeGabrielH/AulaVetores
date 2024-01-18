import java.util.Scanner;

public class MainGot {
    public static void main (String args []){
        Estoque e = new Estoque();
        Scanner in = new Scanner(System.in);

        int opcao;
        int pasta;
        int arroz;
        int banana;



        while(true){

            System.out.println("Olá, Seja Bem Vindo Ao Mercadinho Do Seu Zé");
            System.out.println("===========================================");
            System.out.println("Temos Diversas Opções De Produtos \n Exemplo:");
            System.out.println("1 - Pasta");
            System.out.println("2 - Banana");
            System.out.println("3 - Arroz");
            System.out.println("Caso Queira Usar Outra Opção Insira Os Números Abaixo");
            System.out.println("4 - Ver Estoque");
            System.out.println("5 - Ver Preço Total");
            System.out.println("6 - Sair Do Programa");
            opcao = in.nextInt();

            if (opcao == 1) {
                System.out.println("Digite A Quantidade De Pasta Que Você Quer");
                pasta = in.nextInt();
                e.setQuantidadePastaComprada(pasta);
                opcao =0;

            } else if (opcao == 2) {
                System.out.println("Digite A Quantidade De Banana Que Você Quer");
                banana = in.nextInt();
                e.setQuantidadeBananaComprada(banana);
                opcao =0;

            } else if (opcao == 3) {
                System.out.println("Digite A Quantidade De Arroz Que Você Quer");
                arroz = in.nextInt();
                e.setQuantidadeArrozComprada(arroz);
                opcao =0;

            } else if (opcao == 4) {
                e.VerEstoque();
                opcao =0;

                System.exit(opcao);
            } else if (opcao == 5) {

                System.out.println("O valor de compra e de " + e.ValorCompra());
                opcao =0;


            } else if (opcao == 6) {
                System.out.println("Obrigado Pela Prefêrencia");


                break;
            }

        }
    }
}
