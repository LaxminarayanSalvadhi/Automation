package CoreJava;

public class ArrayPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1[][]= new int[3][3];
		a1[0][0]=32;
		a1[0][1]=37;
		a1[0][2]=44;
		a1[1][0]=57;
		a1[1][1]=69;
		a1[1][2]=70;
		a1[2][0]=100;
		a1[2][1]=115;
		a1[2][2]=12;
		
		//System.out.println(a1.length);
		
		//int a2[][]= {{2,4,6},{3,5,7}};
		for(int i=0;i<a1.length;i++) 
		{
			for(int j=0;j<=2;j++) {
			System.out.print(a1[i][j]+" ");
			}
			System.out.println(" ");
		}
		
		int mini=a1[0][0];
		for(int i=0;i<a1.length;i++) 
		{
			for(int j=0;j<=2;j++) {
				
			if(a1[i][j]<mini) {
				mini=a1[i][j];					
			}
			
			     }
			}
		System.out.println("Mininum number in the matrix is "+mini);
			
	}

}
