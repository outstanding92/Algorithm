package backJoon;
import java.util.*;
import java.io.*;

public class Q2562 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int max = Integer.MIN_VALUE;
		int index = 0;
		int [] arr = new int[9];
		
		for(int i=0; i<9;i++) {
			arr[i] = Integer.parseInt(br.readLine());
			max = Math.max(max, arr[i]);
		}
		
		for(int j=0; j<9; j++) {
			if(arr[j] == max) {
				index = j+1;
			}
		}
		
		bw.write(max+"\n");
		bw.write(index+"\n");
		bw.flush();
		

	}

}
