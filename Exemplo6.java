import java.util.Scanner;

public class Exemplo6 {
    public static void main (String args []){
        Scanner sc = new Scanner(System.in);

        int veta[] = new int [5];
        int vetb[] = new int [5];

        for(int i=0; i<5; i++){
            System.out.println("Digite um numero inteiro ");

            veta[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++){
            vetb[i] = veta[i]*2;
        }
        for(int i=0; i<5; i++){
            System.out.print(vetb[i] + "\t");
        }
    }
}
