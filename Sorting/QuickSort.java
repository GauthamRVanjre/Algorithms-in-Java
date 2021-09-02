import java.util.*;
class QuickSort{
	static void swap(int a[],int i,int j){
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}

	static int partition(int a[],int start,int end){
		int pivot=a[start];

		// variable i is used as smaller index position
		int i=start;
		int j=end;

		while(i<j){
			while(a[i]<=pivot && i<=end-1)
				i++;
			while(a[j]>pivot && j>=start)
				j--;
			if(i<j){
				swap(a,i,j);
			}
		}//while loop

		swap(a,j,start);
		return j;
	}//partition function

	static void quickSort(int a[],int start,int end){
		if(start<end){
			int s=partition(a,start,end);
			quickSort(a,start,s-1);
			quickSort(a,s+1,end);
		}
	}//quick sort function

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("Enter the values into the array");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}

		quickSort(a,0,n-1);
		System.out.println("the array sorted using quick sort is:");
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();

	}
}