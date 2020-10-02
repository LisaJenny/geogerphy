import java.util.Scanner;

public class Scored {

	public static void main(String[] args) {
		//≥ı ºªØ
				Scanner in =new Scanner(System.in);
				int type = in.nextInt();               
				//…Ë÷√
				System.out.println("type your scord name."+in.nextLine());
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
				
			}
	}


