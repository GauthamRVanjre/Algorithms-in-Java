import java.util.Scanner;
class floyds_warshall{
	static int min(int a,int b){
		return (a<b?a:b);
	}

	static void floyds(int cost[][],int n){
		int i,j,k;
		for(k=0;k<n;k++)
			for(i=0;i<n;i++)
				for(j=0;j<n;j++)
					cost[i][j]=min(cost[i][j],cost[i][k]+cost[k][j]);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number od vertices");
		int n=sc.nextInt();
		int[][] cost =new int[n][n];
		System.out.println("Enter the cost matrix of the graph");
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				cost[i][j]=sc.nextInt();
			}//j loop
		}//i loop

		floyds(cost,n);

		System.out.println("The all pairs shortest path is: ");
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(cost[i][j]+" ");
			}
			System.out.println();
		}
	}
}