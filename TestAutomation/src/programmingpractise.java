
public class programmingpractise {
	
	public static void main(String args[])
	{
		int k=10;
		for(int i=1;i<=6;i++) {
			System.out.println(" ");
			for(int j=6;j>=0;j--)
			{
				if(j>i) {
				System.out.print("*" +" ");
				}
				else {
					System.out.print(" ");
					break;
				}
			}
		}
	}

}
