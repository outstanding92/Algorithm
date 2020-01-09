package backJoon;
import java.util.*;


import java.io.*;

public class Q3052 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int [] arr = new int[10];
		int [] arr2 = new int[10];
		int count = 1;

		
		for(int i=0; i<10; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			arr2[i] = arr[i] % 42;
		}
		
		Arrays.sort(arr2);
		
		for(int i=0; i<9; i++) {
			if(arr2[i] != arr2[i+1])
				count++;

		}
		
		bw.write(count+"\n");
		bw.flush();

	}

}
