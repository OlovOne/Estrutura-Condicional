package trabalho;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String n=teclado.next();
		if(n.equals ("password")){
			System.out.println("Acesso liberado");
		}else{
			System.out.println("Acesso negado");
		}

	}

}
