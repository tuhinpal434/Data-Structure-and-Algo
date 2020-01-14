import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of Elements: ");
		int len=sc.nextInt();
		int arr[] =new int[len];
		System.out.println("Enter Array Elements: ");
		
		for(int i=0;i<len;i++) {
			arr[i]=sc.nextInt();
		}
		
		
		System.out.println("Before Sorting----");
		System.out.println();
		for(int j:arr) {
			System.out.print(j+" ");
		}
		for(int i=1;i<len;i++)
		{
			int hole=i;
			int value=arr[i];
			
			while(hole>0 && arr[hole-1]>value) {
				arr[hole]=arr[hole-1];
				hole=hole-1;
			}
			arr[hole]=value;
		}
		
		System.out.println();
		System.out.println("After Sorting----");
		System.out.println();
		for(int j:arr) {
			System.out.print(j+" ");
		}
		sc.close();
	}

}
