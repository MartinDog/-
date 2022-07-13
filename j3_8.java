import java.util.Scanner;
public class j3_8 {
	public static void main(String argv[]) {
		Scanner s = new Scanner(System.in);
		boolean t=true;
		int num = s.nextInt();
		int numc[] = new int[num];
		for(int i=0;i<num;) {
			int newnum = (int)(Math.random()*100+1);
			System.out.println(newnum);
			t=true;
			for(int j=0;j<i;j++) {
				if(numc[j]==newnum) {
					t=false;
					break;
				}
			}
			if(t) {
				numc[i++] = newnum;
			}
		}
		for(int j=0;j<num;j++) {
			System.out.print(numc[j]+" ");
		}
	}
}
