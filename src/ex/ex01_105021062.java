package ex;
import java.util.Scanner;
/*
 * Topic: 輸入一個字串，並把它反向輸出。
 * Date: 2016/10/03
 * Author: 105021062 鄭雅韵
 */

public class ex01_105021062 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int v1 =scn.nextInt();
		int v2=~(v1);
		System.out.println(v1);
		System.out.println(Integer.toBinaryString(v1));
		System.out.println(v2);
		System.out.println(Integer.toBinaryString(v2));
		

	}

}
