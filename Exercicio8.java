import java.util.Scanner;
public class Exercicio8 {

	public static void main(String[] args) {
		int a,b,c;
		Scanner t = new Scanner(System.in);
		a = t.nextInt();
		b = t.nextInt();
		c = t.nextInt();
		if(a<b && a<c) {
			System.out.println(a);
			if(b<c) {
				System.out.println(b);
				System.out.println(c);
				
			}else if(c<b) {
				System.out.println(c);
				System.out.println(b);
				}
		}
		if(b<a && b<c) {
			System.out.println(b);
			if(a<c) {
				System.out.println(a);
				System.out.println(c);
				
			}else if(c<a) {
				System.out.println(c);
				System.out.println(a);
				}
		}
		if(c<b && c<a) {
			System.out.println(c);
			if(b<a) {
				System.out.println(b);
				System.out.println(a);
				
			}else if(a<b) {
				System.out.println(a);
				System.out.println(b);
				}
		}
	}}
