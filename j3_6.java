import java.util.Scanner;
public class j3_6 {
	public static void main(String argv[]) {
		int []unit = {50000,10000,1000,500,100,50,10,1};
		Scanner scan = new Scanner(System.in);
		int money = scan.nextInt();
		for(int i:unit) {
			if(money/i!=0) {
				System.out.println(i+"원 짜리 : "+(int)(money/i)+" 개" );
			}
			money = money%i;
		}
	}
}
