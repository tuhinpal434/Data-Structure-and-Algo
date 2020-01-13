import java.util.Scanner;

public class BubbleSort {

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
		
		for(int i=0;i<len-1;i++)
		{
			//To improve the algo for best case.If the array is alreday sorted no need to loop through the process
			boolean is_sorted=true; 
			for(int j=0;j<len-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
					is_sorted=false;
				}
			}
			if(is_sorted)
				break;
		}
		
		System.out.println();
		System.out.println("After Sorting----");
		System.out.println();
		for(int j:arr) {
			System.out.print(j+" ");
		}

	}

}
