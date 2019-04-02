import java.util.Scanner;
public class Telemarketer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Follow the instructions in JuniorProblem.pdf
		 * Use the following values to test your program and record your results
		 * 1) 8,6,6,7
		 * 2) 7,6,6,8
		 * 3) 9,5,6,9
		 * 4) 3,4,5,6
		 * 5) 0,8,8,0
		 * 6) 8,5,5,9
		 * 7) 9,1,1,9
		 * 8) 9,9,9,9
		 * 9) 9,1,2,8
		 * 10) 8,7,4,8 
		 * 11) 8,2,2,7
		 * 12) 1,3,3,9
		 * 13) 1,0,2,6
		 */
		Scanner in=new Scanner(System.in);
		System.out.println("Number 1");
		int num1=in.nextInt();
		int num2=in.nextInt();
		int num3=in.nextInt();
		int num4=in.nextInt();
		if (num1==8||num1==9) {
			if (num4==8||num4==9) {
				if(num2==num3) {
					System.out.println("ignore");
					System.exit(0);
				}
			}
		}
		System.out.println("answer");
	}

}
