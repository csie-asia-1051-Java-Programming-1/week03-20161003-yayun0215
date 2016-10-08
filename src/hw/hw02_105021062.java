package hw;
import java.util.Scanner;

public class hw02_105021062 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請問要輸入幾個數?");
		int a=scn.nextInt();
		int n=a;
        int x=0;
        int y=0;
        int z=0;
        while(n>0){
        	int u=scn.nextInt();
        	if (u>0){
        		x++;
        	}
        	if(u<0){
        		y++;
        	}
        	if(u==0){
        		z++;
        	}
        	n--;
        }
        System.out.println("正數有"+x+"個" );
        System.out.println("負數有"+y+"個" );
        System.out.println("0有"+z+"個" );

	}

}
