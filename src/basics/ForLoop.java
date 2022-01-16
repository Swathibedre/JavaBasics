package basics;

public class ForLoop {
	public static void main(String[] args) {
		for (int i = 1; i <=10 ;i++) {
			System.out.println(i);
			if(i == 9) {break;}//exits after printing 9
			
		}
		
		System.out.println("even number");
		int k = 0;
		for (; k <=10 ;) {
			
			System.out.println(k);//exits after printing 9
			k =+2;
			
		}
		for (int i = 1; i <=10 ;i++) {
			System.out.println(i);
			if(i == 9) {break;}//exits after printing 9
			
		}
		//for(;;) {System.out.println("hi");}//infinite loops
	}

}
