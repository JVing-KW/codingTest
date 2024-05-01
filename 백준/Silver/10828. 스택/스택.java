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

		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());

		StringTokenizer st;

		arr = new int[N];

		while (N-- > 0) {

			st = new StringTokenizer(br.readLine(), " ");

			switch (st.nextToken()) {

			case "push": {
				Main.push(Integer.parseInt(st.nextToken()));
				break;

			}
			case "pop": {
				sb.append(Main.pop()).append("\n");
				break;
			}
			case "size": {
				sb.append(Main.size()).append("\n");
				break;
			}
			case "empty": {
				sb.append(Main.empty()).append("\n");
				break;
			}
			case "top": {
				sb.append(Main.top()).append("\n");
				break;
			}

			}
		}
		System.out.print(sb);
	}

	public static int top = 0;

	public static int[] arr;

	public static void push(int a) {

		arr[top] = a;
		top++;

	}

	public static int pop() {
		if (top == 0) {
			return -1;
		}

		else {
			int value = arr[top - 1];
			arr[top - 1] = 0; // 0으로 초기화 해준다.
			top--;
			return value;
		}
	}

	public static int size() {

		return top;
	}

	public static int top() {

		if (top == 0) {
			return -1;
		}
		return arr[top - 1];
	}

	public static int empty() {
		if (top == 0) {
			return 1;
		} else {
			return 0;
		}
	}

}