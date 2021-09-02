import java.util.Scanner;
class SelectionSort{
	static void sort(int a[]){
		int n=a.length;
		for(int i=0;i<n;i++){
			int min=i;
			for(int j=i+1;j<n;j++){
				if(a[j]<a[min])
					min=j;
			}

			int temp=a[min];
			a[min]=a[i];
			a[i]=temp;
		}
	}//sort function

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements you want to insert");
		int n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("Enter the elements in the array");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}

		sort(a);
		System.out.println("Sorted elements are:");
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}