
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String st = br.readLine();
		String[] str = st.split(" ");
		int[] arr = new int[N];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(str[i]);
		}
		//예산 
		int M = Integer.parseInt(br.readLine());
//		5
//		70 80 30 40 100
//		450

		System.out.print(Main.upper(arr,M));
	}

	public static long upper(int[] arr, int max) {
		int hi = 0;
		int lo = 0;
		long answer=0;
		long sum = 0;
		// mid 값이 필요 lo 는 0 그대로 쓰고 .
		for (int i = 0; i < arr.length; i++) {

			sum +=arr[i];
			if (arr[i] > hi) {
				hi = arr[i];
			}
			
		}
		if(sum < max)return hi;
		

		while (hi >= lo) { 
			// 전체 비용 초기화.
			sum = 0;
			
			
			int mid = (hi + lo) / 2;
			for (int i = 0; i < arr.length; i++) {
				// 	배열의 값을 변경하지 않고 mid 값만 이용.
				if(arr[i]>mid) sum+=mid;
				
                else sum += arr[i];

			}
			if(sum > max) {
			hi = mid-1;
				
			}else {
			lo = mid+1;
			answer = mid;

			}

		}
		return answer;
	}
}
