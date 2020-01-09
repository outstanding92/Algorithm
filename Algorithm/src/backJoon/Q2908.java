package backJoon;
import java.util.*;
import java.io.*;



public class Q2908 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Scanner sc = new Scanner(System.in);
		
		
		String [] input = br.readLine().trim().split(" ");
		String a = input[0];
		String b = input[1];
		
		String sa= "";
		String sb= "";
		

		
		for(int i=a.length()-1;i>=0;i--) {
			sa = sa + a.charAt(i);
		}
		for(int i=b.length()-1;i>=0;i--) {
			sb = sb + b.charAt(i);
		}
		
	
		
		System.out.println((Integer.parseInt(sa)>Integer.parseInt(sb)?sa:sb));
	}

}
