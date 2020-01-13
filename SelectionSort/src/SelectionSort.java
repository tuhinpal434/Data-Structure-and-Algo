import java.util.Scanner;

public class SelectionSort {

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
		
		for(int i=0;i<len-1;i++) {
			int imin=i;
			for(int j=i+1;j<len;j++) {
				if(arr[j]<arr[imin]) {
					imin=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[imin];
			arr[imin]=temp;
		}
		System.out.println();
		System.out.println("After Sorting----");
		System.out.println();
		for(int j:arr) {
			System.out.print(j+" ");
		}

	}

}
