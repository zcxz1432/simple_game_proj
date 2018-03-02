import java.util.Scanner;
public class Scan {
	
	Scanner scan = new Scanner(System.in);
	
	public int Scan(int scani) {//정수 입력
		scani = scan.nextInt();
		return scani;
	}
	public String Scan(String scans) {//문자열 입력
		scans = scan.next();
		return scans;
	}
}
