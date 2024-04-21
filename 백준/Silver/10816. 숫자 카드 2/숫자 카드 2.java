import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a = Integer.parseInt(br.readLine());

		String str1 = br.readLine();
		String[] strarr1 = str1.split(" ");
		int[] intarr1 = new int[a];

		int b = Integer.parseInt(br.readLine());

		String str2 = br.readLine();
		String[] strarr2 = str2.split(" ");
	
		int[] intarr2 = new int[b];

		for (int i = 0; i < intarr1.length; i++) {
			intarr1[i] = Integer.parseInt(strarr1[i]);
		}
		for (int i = 0; i < intarr2.length; i++) {
			intarr2[i] = Integer.parseInt(strarr2[i]);
		}
		br.close();
		Arrays.sort(intarr1);
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<intarr2.length;i++) {
			 
			sb.append(Main.upper(intarr1, intarr2[i]) - Main.lower(intarr1, intarr2[i]) +  " ");
		}
		System.out.print(sb);

	}

	
	//key = 2 
	public static int lower(int[] arr , int key) {
		
		int lo = 0;
		
		int hi = arr.length;
		
		while(lo < hi) {
			
			int mid = (lo + hi) / 2; 
			
			if(key <= arr[mid]) {
				hi = mid;
			}
			else {
				lo = mid +1;	
				// key > arr[mid]보다 작을 때  
				// mid + 1 의 의미는? mid는 아님 최소값은 그 값의 인덱스를 나타내야함 
			}
			
		}
		return lo;
	}
public static int upper(int[] arr , int key) {
		
		int lo = 0;
		
		int hi = arr.length;
		
		while(lo < hi) {
			
			int mid = (lo + hi) / 2; 
			
			if(key < arr[mid]) {
				hi = mid;
			}
			else {
				lo = mid +1;	
				// key >= arr[mid]
				// lo로 상한선을 구해야 함 같아도 mid+1로 상한선을 늘려야 
			}
			
		}
		return lo;
	}

}