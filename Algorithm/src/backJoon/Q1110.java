package backJoon;
import java.io.*;
import java.util.*;

public class Q1110 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cnt=0;

		int a = sc.nextInt();
		int b = a;
		
		while(true) {
			cnt++;
			int one = a%10;				//1의자리
			int ten = a/10; 			//10의자리
			int hap = (one+ten)%10;
			a = one*10 + hap;
			if(b==a) {
				break;
			}

		
		}
		
		System.out.println(cnt);


	}

}
