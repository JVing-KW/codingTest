

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        int M = Integer.parseInt(br.readLine());

        bw.write(String.valueOf(upper(arr, M)));
        bw.flush();
        bw.close();
    }

    public static long upper(int[] arr, int max) {
        int hi = 0;
        int lo = 0;
        long sum = 0;

        for (int value : arr) {
            sum += value;
            if (value > hi) {
                hi = value;
            }
        }

        if (sum <= max) return hi;

        long answer = 0;
        while (hi >= lo) {
            sum = 0;
            int mid = (hi + lo) / 2;

            for (int value : arr) {
                sum += Math.min(value, mid);
            }

            if (sum > max) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
                answer = mid;
            }
        }

        return answer;
    }
}
