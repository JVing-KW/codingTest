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
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

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
		for (int i = 0; i < intarr2.length; i++) {
			sb.append(Main.binarySearch(intarr1, intarr2[i])+" ");
		}
		System.out.print(sb);

	}

	public static int binarySearch(int[] arr, int key) {

		int lo = 0;
		int hi = arr.length - 1 ;// ??
		while (lo <= hi) {

			int mid = (lo + hi) / 2;

			if (key < arr[mid]) {
				hi = mid - 1;
			} else if (key > arr[mid]) {
				lo = mid + 1;
			} else {
				return 1;
			}

		}

		return 0;

	}

}