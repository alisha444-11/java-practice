import java.util.Scanner;

public class tsk3{
	public static void main(String[] args){
	
	Scanner vote = new Scanner(System.in);
	
	int age = vote.nextInt();
	vote.nextLine();

	String name = vote.nextLine();

	if(age>= 18){
		System.out.println( name + " " + "Your eligiable for vote");
	}else{
		System.out.println(name + " " + "Your not eligiable for vote");
	}
	}
}

