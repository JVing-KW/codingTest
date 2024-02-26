
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine();
	 String[]  str =  a.split(" ");
	 int aa = Integer.parseInt(str[0]);
	 int bb = Integer.parseInt(str[1]);
	 
	 if(aa < bb) {
		 
		 System.out.println("<");
	 }else if(aa > bb){
		 
		 System.out.println(">");
	 }else{
         System.out.println("==");
     }
		br.close();
	}
}