import java.util.Scanner;
public class j3_14 {
	public static void main(String argv[]) {
		Scanner s = new Scanner(System.in);
		String course[] = {"Java","C++","HTML5","��ǻ�ͱ���","�ȵ���̵�"};
		int score[]= {95,88,76,62,55};
		do {
			String t = s.next();
			if(t.equals("�׸�")) {
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
