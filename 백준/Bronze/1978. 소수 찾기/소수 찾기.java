import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String aa = br.readLine();
		int a = Integer.parseInt(aa);
		String st = br.readLine();
		String[] str = st.split(" ");
		int[] arr = new int[a];
		
		
		int sum = 0;
		
		for(int i = 0 ; i< arr.length;i++) {
			
			arr[i]= Integer.parseInt(str[i]);
			sum +=	Main.sosu(arr[i]);
			
		}
		System.out.print(sum);

	}

	public static int sosu(int ar) {

		if (ar == 2) {
			return 1;
		} 
		if(ar < 2) {
			return 0;
		}

		for (int i = 2; i < ar; i++) {
			if (ar % i == 0) {
				return 0;
			}

		}
		return 1;
	}

}