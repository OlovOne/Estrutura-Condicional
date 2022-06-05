package trabalho;
import java.util.Scanner;
public class Exercicio2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n = teclado.nextInt();
		n = n%2;
		if(n==0){
			System.out.println("par");
		}else{
			System.out.println("Impar");
		}
	}
}
