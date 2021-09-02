import java.util.*;
class MergeSort{
	public static void merge(int a[],int start,int mid,int end){
		int i=start,j=mid+1,k=start;
		int n=a.length;
		int[] b=new int[n];
		while(i<=mid && j<=end){
			if(a[i]<=a[j])
				b[k++]=a[i++];
			else
				b[k++]=a[j++];
		}//while loop

		while(i<=mid)
			b[k++]=a[i++];
		while(j<=end)
			b[k++]=a[j++];
		for(i=start;i<=end;i++){
			a[i]=b[i];
		}
	}//merge sort

	public static void mergeSort(int a[],int start,int end){
		int mid;
		if(start<end){
			mid=(start+end)/2;
			mergeSort(a,start,mid);
			mergeSort(a,mid+1,end);
			merge(a,start,mid,end);
		}
	}//merge sort function

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number of elements in the array");
		int n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("Enter the elements in the array");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		mergeSort(a,0,n-1);
		System.out.println("The sorted array is:");
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}