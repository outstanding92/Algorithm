package backJoon;
import java.util.*;
import java.io.*;

public class Q10872 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		int result = 1;
		
		for(int i=num; i>0; i--) {
			result *= i;
		}
		
		bw.write(String.valueOf(result));
		bw.newLine();
		bw.flush();
	}

}
