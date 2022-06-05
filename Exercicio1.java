package trabalho;
import java.util.Scanner;
public class Exercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n = teclado.nextInt();
		int n2 = teclado.nextInt();
		int n3 = teclado.nextInt();
		if(n >n2){
			System.out.println(n);
		}else if(n2 >n3){
			System.out.println(n2);
		}else if (n3>n2 &&n2>n){
			System.out.println(n3);
		}
	}

}
