package trabalho;

import java.util.Scanner;

public class exercicio9 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n = teclado.nextInt();
		int n1 = teclado.nextInt();
		int n2 = teclado.nextInt();
		n2 = n2+n1+n;
		if(n2 == 180){
			System.out.println("e um triangulo");
		}else{
			System.out.println("Não e triangulo");
		}

	}

}
