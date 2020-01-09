package backJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q8958 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int TC = Integer.parseInt(br.readLine());

		
		
		for(int i=0; i<TC; i++) {
			String input = br.readLine();
			int sum = 0;
			int grade = 0;
			for(int j=0; j<input.length(); j++) {
				if(input.charAt(j) == 'O') {
					sum += ++grade;
				}else {
					grade = 0;
				}
				
			}
			bw.write(String.valueOf(sum));
			bw.newLine();
		}	
		bw.flush();
	}
}
