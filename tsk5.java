import java.util.Scanner;
public class tsk5{

	public static void main(String[] agrs){
	
	Scanner input = new Scanner(System.in);

	int num= input.nextInt();

	if (num % 3 == 0 && num % 5 == 0){

		System.out.println("Divisiable by both 3 & 5");
	}else{
		System.out.println("Nope");
	}
	}
}
