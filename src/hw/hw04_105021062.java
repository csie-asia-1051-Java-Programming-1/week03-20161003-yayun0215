package hw;
import java.util.Scanner;
public class hw04_105021062 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("輸入一個正整數");
		int n = scn.nextInt();
		int a=1;
		int b=1;
		while (a <= n) {
			b=b*a;
			a=a+1;
		}
		a=a-1;
		System.out.println(n+"!="+b);

	}

}
