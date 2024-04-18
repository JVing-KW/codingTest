import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String a = br.readLine();
		String[]  str =  a.split(" ");//112228
		int[] arr = new int[str.length];
		int[] arr2 = {1,1,2,2,2,8};
		int[] result = new int[str.length];
		// int 배열 만들기 
		for(int i = 0; i< str.length;i++) {		
			arr[i] =Integer.parseInt(str[i]);
			if(i == str.length - 1) break;
		}		
		for(int i = 0;i<str.length ;i++) {
			result[i] =	Main.upDown(arr2[i], arr[i]);
			System.out.print(result[i]+" ");
		}		
		//함수 만들기 매개변수만 넣어주고 그 숫자에 맞게 +,- 되는 함수
		}
	//a는 맞춰야하는 수 
	//입력 
	public static int  upDown(int a,int b) {
		int count = 0;
		while(a != b) {
			if(a < b) {
				count--;
				b--;
			}else {
				count++;
				b++;
			}	
		}
		return count;
	}
	
}