package test;

public class pattern17 {

	public static void main(String[] args) {
		for(int i=1;i<=9;i++)
		{
			
			for(int j=1;j<=9;j++) {  
				if(i==1 || i==9 || j==1 || j==9  ||i==5 || j==5)//inner loop -> j<=i is for triangle
				System.out.print("* ");
				else 
					System.out.print("  ");
			}
			System.out.println();
		}

	}

}
