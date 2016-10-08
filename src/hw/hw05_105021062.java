package hw;
import java.util.Scanner;
public class hw05_105021062 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("輸入一個正整數");
		int n = scn.nextInt();
		int a=0;
		int b=0;
		for(b=1;b<n;b++){
			a=b*(b+1)+a;
		}
		System.out.println(a);

	}

}
