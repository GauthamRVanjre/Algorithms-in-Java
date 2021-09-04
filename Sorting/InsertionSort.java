import java.util.Scanner;
class InsertionSort{
	static void sort(int a[]){
		int n=a.length;
		for(int i=1;i<n;i++){
			int key=a[i];
			int j=i-1;

			while(j>=0 && a[j]>key){
				a[j+1]=a[j];
				j=j-1;
			}
			a[j+1]=key;
		}
	}//sort function

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=sc.nextInt();
		int[] a=new int[n];

		System.out.println("Enter the elements in the array");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}

		sort(a);
		System.out.println("Sorted elements are");
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}