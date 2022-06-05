import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		int x,y;
		Scanner t = new Scanner(System.in);
		x = t.nextInt();
		y = t.nextInt();
		if(x>0 && y>0) {
			System.out.println("Quadrado 1");
		}
		if(x<0 && y>0) {
			System.out.println("Quadrado 2");
		}
		if(x<0 && y<0) {
			System.out.println("Quadrado 3");
		}
		if(x>0 && y<0) {
			System.out.println("Quadrado 4");
		}
	}

}
