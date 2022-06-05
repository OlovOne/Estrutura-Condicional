import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		float x;
		Scanner t = new Scanner(System.in);
		x = t.nextFloat();
		if(x<0) {
			System.out.println("Congelante");
		}
		if(x>=0 && x<=10) {
			System.out.println("Muito Frio");
		} 
		if(x>=11 && x<=20) {
			System.out.println("Frio");
		}
		if(x>=21 && x<=30) {
			System.out.println("Normal");
			}
		if(x>=31 && x<=40) {
			System.out.println("Calor");
		}
		if(x>=41 && x<=50) {
			System.out.println("Muito Calor");
	}

	}}
