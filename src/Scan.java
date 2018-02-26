import java.util.Scanner;
public class Scan {
	
	Scanner scan = new Scanner(System.in);
	
	public int Scan(int scani) {
		scani = scan.nextInt();
		return scani;
	}
	public String Scan(String scans) {
		scans = scan.next();
		return scans;
	}
}
