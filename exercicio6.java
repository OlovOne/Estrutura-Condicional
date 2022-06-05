package trabalho;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String nome1 = teclado.next();
		String nome2 = teclado.next();
		int n = teclado.nextInt();
		int n1 = teclado.nextInt();
		if(n>n1){
			System.out.println(nome1);
		}else{
			System.out.println(nome2);
		}

	}

}
