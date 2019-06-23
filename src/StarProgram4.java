import java.util.Scanner;

public class StarProgram4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();		
		//List<Integer> arr1=new ArrayList<Integer>();
		
		int []arr1= new int[n];
		int []arr2= new int[n];
		for(int i=0;i<n;i++) {
		
			if(i==0) {
				arr1[i]=1;
				arr2[i]=1;
			}
			else {
				arr1[i]=0;
				arr2[i]=0;
			}
		}
		for(int i=0;i<n;i++) {
			
			for(int g=0;g<arr1.length;g++) {
				
				arr1[g]=arr2[g];
			}
			
			for(int d=n;d>i;d--) {
				System.out.print(" ");
			}
			
			for(int k=0;k<i;k++) {
				//System.out.println("k:"+k);
				//System.out.println(arr1[k]+" "+arr1[k+1]);
				arr2[k+1]=((arr1[k])+(arr1[k+1]));
				//System.out.println("values:"+arr2[k+1]+" "+arr1[k]+" "+arr1[k+1]);
			}
			
			for(int j=0;j<=i;j++) {
				
				System.out.print(arr2[j]+" ");
			}
			System.out.println();
			
			
			
		}
		
	}
}
