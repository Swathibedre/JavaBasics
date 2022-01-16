package basics;

import java.util.ArrayList;
import java.util.Arrays;

public class DataType {
 int b ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DataType dt = new DataType();
		System.out.println(dt.b);
		new DataType().b =15;
		System.out.println(new DataType().b);
		int a =10;
		
		byte b =127;
		
		short s= 12343;
		
		long l = 821474682;
		
		char c= 'B';
		 char c1 = 'b';
		
		boolean b1 = false;
		
		float f1 = 12.34f;
		
		double d =1232.4565455;
		
//
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(l);
//		System.out.println(c);
//		System.out.println(b1);
//		System.out.println(f1);
//		System.out.println(d);
//		System.out.println(s);
//		System.out.println(c+c1);//prints ascii value added (98+66=164)


		ArrayList<Integer> arrayList = new ArrayList<>();
		System.out.println(arrayList.size());
		arrayList.add(0,10);
		System.out.println(arrayList.size());
		System.out.println(arrayList.get(0));

	}

}
