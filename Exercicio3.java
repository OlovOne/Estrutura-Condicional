package trabalho;
import java.util.Scanner;
public class Exercicio3 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n = teclado.nextInt();
		if(n>0){
			System.out.println("positivo");
		}else{
			System.out.println("negativo");
		}
	}
}
