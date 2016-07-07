package firstproject;

import java.util.Scanner;

public class mainc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calc obj=new calcdef();
		int choice;
		choice=4;
		int a,b;
		a=1;
		b=0;
		float ans;
		ans=0;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		choice=sc.nextInt();
		//new added comment
		switch(choice){
		case 1:System.out.println(obj.add(a, b));
			break;
		case 2:System.out.println(obj.sub(a, b));
			break;
		case 3:System.out.println(obj.mul(a,b));
			break;
		case 4:
			try{
				System.out.println(obj.div((float) a, b));
			}
			catch(ArithmeticException e){
				e.printStackTrace();
			}
			break;
		default:
			System.out.println("Choice not available");
		}
		//System.out.println(ans);
	}

}
