import java.util.Scanner;
public class Exemplo3 {
    public static void main (String args []){
        Scanner sc = new Scanner(System.in);

        int vet[] = new int [11];
        int cont = 10;

        for (int i = 0; i < 11; i++){
            vet[i] = cont;
            cont++;
        }
        for (int i = 0; i <11; i++){
            System.out.print(vet[i]+ "\t");
        }
    }
}
