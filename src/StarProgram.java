import java.util.Scanner;

public class StarProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=4;int r=n+n-1;
		
		int n1=(int) Math.ceil(r/2);
		int n2=n1;
		for(int i=0;i<n;i++) {
			for(int j=n-i;j>0;j--) {
				
				System.out.print("   ");
			}
					for(int k=0;k<2*i+1;k++) {
						
									System.out.print(" * ");
					}
							System.out.println();
								
								}
					
	
		
				
				}		
		
		
		

	}


