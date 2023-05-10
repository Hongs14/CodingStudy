package baekjun.level1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class aminusb_1001 {
	public static void main(String[] args) {
		//방법 1 Scanner사용
//		Scanner sc = new Scanner(System.in);
//		int A = sc.nextInt();
//		int B = sc.nextInt();
//		System.out.print(A-B);
		
		//방법2  BufferedReader + split() 사용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
 		String str="";
		try {
			str = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		StringTokenizer st = new StringTokenizer(str," ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		//3번째
//		String[] str = br.readLine().split(" ");
//		int a = Integer.parseInt(str[0]);
//		int b = Integer.parseInt(str[1]);
		
		
		System.out.println(a-b);
	}
}
