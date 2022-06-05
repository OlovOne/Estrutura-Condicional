import java.util.Scanner;
public class Exercicio7 {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		int ano = t.nextInt();
		if(ano%400==0 || ano%4==0 && ano%100!=0) {
			System.out.println("bisesto");
		}else {
			System.out.println("não bisesto");
		}
		

	}

}
