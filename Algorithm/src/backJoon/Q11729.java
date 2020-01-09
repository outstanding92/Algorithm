package backJoon;
import java.util.*;
import java.io.*;

public class Q11729 {
	
	public static int answer = 0;
	public static StringBuilder sb = new StringBuilder();
	
	public static void Hanoi(int num, int from, int by, int to) {
		++answer;
		if(num == 1) {
			sb.append(from + " " + to + "\n");
		}else {
			Hanoi(num-1, from, to, by);
			sb.append(from+ " " + to + "\n");
			Hanoi(num-1, by, from, to);
		}
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		Hanoi(num, 1,2,3);
		sb.insert(0, answer + "\n");	
		System.out.println(sb);
	}

}
