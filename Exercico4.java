package trabalho;

import java.util.Scanner;

public class Exercico4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float n = teclado.nextFloat();
		if(n>=1.55){
			System.out.println("pode");
		}else{
			System.out.println("Não pode");
		}

	}

}
