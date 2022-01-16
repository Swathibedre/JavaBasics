package basics;

public class WhileLoop {

	public static void main(String[] args) {
		int i =1;
		while(i<=10) {
			System.out.println(i);
			++i;
			//i++
			//i=i+1
		}
		int score = 10;
		while(score<=100) {
			if(score==50) {System.out.println("Half century");}
			 if(score==100) {System.out.println("Century");}
			 if(score==0) {System.out.println("Out");
			 break;}//breaks out of loop
	    	score++;
			}
		
		int g = 1;
		do {
			System.out.println(g);
			g--;
			
		}while(g>1);//executed atleast once	
		
//		while(true) {
//			System.out.println("infinite loop");
//			
//		}
		
		
//		while (true) { dead code as previous while is an infinite loop
//			
//		}
			}

}
