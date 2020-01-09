package backJoon;
import java.util.*;
import java.io.*;

public class Q10818 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st ;
		
		int i = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine(), " ");
		int [] arr = new int[i];
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for(int j=0; j<i ; j++) {
			arr[j] = Integer.parseInt(st.nextToken());
			min = Math.min(arr[j], min);
			max = Math.max(arr[j], max);
		}
		
		System.out.println(min + " " + max);
		
	/*	int TC = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine(), " ");
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		while(st.hasMoreTokens()) {
			int num = Integer.parseInt(st.nextToken());
			
			min = Math.min(min, num);
			max = Math.max(max, num);
		}
		
		System.out.println(min + " " +max);*/
		

	}

}
