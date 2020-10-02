import java.util.Scanner;

public class Scord {

	public static void main(String[] args) {
		//初始化
				Scanner in =new Scanner(System.in);
				int type = in.nextInt();               
				int a = 100;
				//设置
				System.out.println("type your scord name.");
				System.out.println(in.nextLine());
				switch (type) {
				case 1:
					System.out.println("1 bule");
					break;
				case 2:
					System.out.println("2 red");
					break;
				case 3:
					System.out.println("3 green");
					break;
				default:
					System.out.println("0");
			       break;
				}
				
				//计分		
				System.out.println(a+in.nextInt());
	}
}


