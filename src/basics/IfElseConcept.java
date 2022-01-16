package basics;

public class IfElseConcept {
	
	 public static void main(String args[]) {
		int a=10,b=10;
		if(a==b) {
			System.out.println("equal");
		}
		else {
			System.out.println("Not equal");
		}
		
		if(true) {
			System.out.println("equal");
		}
		else {//dead code as always if is executed
			System.out.println("Not equal");
		}
		
		boolean flag=true;
		if(flag) {
			System.out.println("equal");
		}
		else {//not dead code as condition depends on variable
			System.out.println("Not equal");
		}
		
		String browser="chrome";
		if(browser.equals("chrome")) {
			System.out.println("Chrome browser");
		}
		else if(browser.equals("ff")) {
			System.out.println("Firefox browser");
		}
		else {
			System.out.println("Browser not found");
		}
		
		int m =89;
		if (m<=100 && m>=90) {System.out.print("Grade A");}
		else if (m<90 && m>=70) {System.out.println("Grade B");}
		else if (m<70 && m>=40) {System.out.println("Grade C");}
		else if (m<40) {System.out.print("Failed");}
		else {System.out.println("Correct marks");}

		String text = "";
		 System.out.println(text.isBlank());

		
	}
	 

}
