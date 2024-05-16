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
		Stack<Integer> stack = new Stack();
		int a = Integer.parseInt(br.readLine());
		int[] arr = new int[a];
		int b = 0;
		int sum = 0;
		for (int i = 0; i < a;i++) {
			b = Integer.parseInt(br.readLine());

			if (b == 0) {
				stack.pop();
			} else {
				stack.push(b);
			}

		}
		for(int s : stack) {
			sum += s;
		}
		System.out.print(sum);

	}

}