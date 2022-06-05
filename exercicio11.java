import java.util.Scanner;

public class exercicio11 {

	public static void main(String[] args) {
		float x;
		Scanner t = new Scanner(System.in);
		x = t.nextFloat();
		if(x<=199) {
			System.out.println("valor "+(x*1.2));
		}
		if(x>=200 &&x<=400) {
			System.out.println("valor "+(x*1.5));
		} 
		if(x>=401 &&x<=600) {
			System.out.println("valor "+(x*1.8));
		}
		if(x>600) {
			System.out.println("valor "+(x*2.0));
			}
	}

}
