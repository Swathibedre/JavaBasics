package basics;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String browser = "chrome";
		//all the cases are executed as break statement is missing
         switch (browser) {
		case "chrome": {
			System.out.println("Chrome browser");
			//break;
		}
		case "ff": {
			System.out.println("FF browser");
		}
		case "ie": {
			System.out.println("IE browser");
		}
		default://like else
			System.out.println("Not found");
		}
	
         
         //only chrome case is executed
	
	 switch (browser) {
		case "chrome": {
			System.out.println("Chrome browser");
			break;
		}
		case "ff": {
			System.out.println("FF browser");
			break;
		}
		case "ie": {
			System.out.println("IE browser");
			break;
		}
		default://like else
			System.out.println("Not found");
			break;
		}
	 
	 int marks=10;
	 switch (marks) {
	case 10: {
		
		System.out.println("Failed");
		break;
	}
	 case 20: {		
		System.out.println("Passed");
		break;
	}
	default:
		System.out.println("Failed");
		break;
	}
	}

}
