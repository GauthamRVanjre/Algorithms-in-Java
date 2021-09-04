import java.util.*;
class BinarySearch{
	public static int search(int arr[],int l,int r,int key){
		if(r>=l){
			int mid=l+r/2;

			// first check with mid term
			if(arr[mid]==key){
				return mid;
			}

			// if element is smaller than mid
			if(arr[mid]>key){
				return search(arr,l,mid-1,key);
			}

			// else if element is greater than key
			return search(arr,mid+1,r,key);
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BinarySearch ob=new BinarySearch();
		System.out.println("Enter the number of elements in the array");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the elements in the array");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the key element to search");
		int key=sc.nextInt();
		int result=ob.search(arr,0,n-1,key);

		if(result==-1)
			System.out.println("Element is not present in the array");
		else
			System.out.println("Element found at index: "+(result+1));
	}
}