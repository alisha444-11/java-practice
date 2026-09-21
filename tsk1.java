import java.util.Scanner;
public class tsk1{
	public static void main(String[] args){
	
		Scanner input= new Scanner(System.in);
	
		int age= input.nextInt();

		if(age>=18){
			System.out.println("adult");
		}else{
			System.out.println("minor");	
		}
	}
}
