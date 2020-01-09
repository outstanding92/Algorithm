package backJoon;
import java.util.*;
import java.io.*;

public class Q2751 {
// 1. 수의 갯수 입력받기
// 2. 입력받은 갯수만큼 배열크기 만들어주기
// 3. 배열에 입력받은 갯수 만큼 수 넣기
// 4. 오름차순 Collection.sort(data)
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		ArrayList<Integer> data = new ArrayList<Integer>();
		for(int i=0; i<n; i++) {
			data.add(Integer.parseInt(br.readLine()));
		}
		
		Collections.sort(data);
		for(int i=0; i<n; i++) {
			System.out.println(data.get(i));
		}
		
	}

}
