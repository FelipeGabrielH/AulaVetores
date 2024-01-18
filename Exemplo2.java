public class Exemplo2 {
    public static void main (String [] args){
            String mes[] = {"Janeiro","Fevereiro", "Março", "Abril", "Maio","Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};

            int diasMes[] = {31,28,31,30,31,30,31,30,31,30,31,31};

            int i;
            for (i=0; i<12; i++){
                System.out.printf("%s, tem %d dias.\n,", mes[i], diasMes[i]);
            }

    }
}
