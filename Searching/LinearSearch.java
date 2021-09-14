class LinearSearch{
	public static int search(int arr[],int key){
		int n=arr.length;
		for(int i=0;i<n;i++){
			if(arr[i]==key)
				return i;
		}
		return -1;
	}//search function

	public static void main(String[] args) {
		int arr[]={2,3,5,10,30};
		int key=10;

		int result=search(arr,key);
		if (result==-1) {
			System.out.print("Key is not present in the array");
		}
		else
			System.out.print("Key is present at index"+result);
	}
}