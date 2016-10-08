package hw;
import java.util.Scanner;

public class hw03_105021062 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("輸入一個正整數");
		int n = scn.nextInt();
		int a=1;
		int b=1;
		for(a = 1; a <= n;a++){
			b=b*a;
		}
		System.out.println(n+"!="+b);

	}

}
