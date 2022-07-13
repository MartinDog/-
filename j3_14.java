import java.util.Scanner;
public class j3_14 {
	public static void main(String argv[]) {
		Scanner s = new Scanner(System.in);
		String course[] = {"Java","C++","HTML5","컴퓨터구조","안드로이드"};
		int score[]= {95,88,76,62,55};
		do {
			String t = s.next();
			if(t.equals("그만")) {
				break;
			}
			for(int i=0;i<5;i++) {
				if(course[i].equals(t)) {
					System.out.println(score[i]);
					break;
				}
			}
		
		}while(true);
	}
}
