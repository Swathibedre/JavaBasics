package basics;

public class IncrementDecreament {
	
	public static void main(String[] args) {
		
		int a = 10;
		
		int b = a++; //postincrement
		
		System.out.println(a);//11
		System.out.println(b);//10
		
		int c= ++a;
		
		System.out.println(a);//12
		System.out.println(c);//12
		
		System.out.println(c++);//12
		System.out.println(++c);//14
		
		//post decrement
		
		int e=-10;
		int f=e--;
		
		System.out.println(e);//-11
		System.out.println(f);//-10
		
		int g = --e;
		System.out.println(e);//-12
		System.out.println(g);//-12
		
		System.out.println(g--);//-12
		System.out.println(--g);//-14
		
		float f1= 12.1f;
		float f2= f1++;
		
		System.out.println(f2);
		System.out.println(f1);
		
		
		int n =1;
		
		System.out.println(n++ + ++n);//4
		System.out.println(n);
		
        int v=1;
		
		System.out.println(++v + v++);//4
		System.out.println(v);
		
		  int v1=1;
			
			System.out.println(v1++ + v1++);//3
			System.out.println(v);
			
			System.out.println('a'+'b');//97+98
			System.out.println('a'+""+'b');//ab
			
			
		
		
		
	}

}
