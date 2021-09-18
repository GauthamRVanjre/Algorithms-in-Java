import java.util.Scanner;
class Prims{
	

	public static void main(String[] args) {
		int a=0,b=0,v=0,u=0,ne=1;
		int i,j,k;
		int[] visited=new int[10];
		int min;
		int mincost=0;
		int[][] cost=new int[10][10];

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of vertices");
		int n=sc.nextInt();

		System.out.println("Enter the cost matrix");
		for(i=0;i<n;i++){
			for(j=0;j<n;j++){
				cost[i][j]=sc.nextInt();			
			}//inner j loop
		}//outer i loop

		for(i=1;i<n;i++)
			visited[i]=0;

		System.out.println("The edges of the spanning tree are: ");
		System.out.println();
		visited[i]=1;
		while(ne<n){
			min=999;
			for(i=0;i<n;i++){
				for(j=0;j<n;j++){
					if(cost[i][j]<min){
						if(visited[i]==1){
							min=cost[i][j];
							a=u=i;
							b=v=j;
						}//visited if
					}//check min cost 
				}//inner j loop
			}//outer i loop

			if(visited[u]==0 || visited[v]==0){
				System.out.println(ne++ + " edge ("+a+","+b+") = "+min);
				mincost+=min;
				visited[b]=1;
			}
			cost[a][b]=cost[b][a]=999;

		}//while loop

		System.out.println("Min cost = "+mincost);

	}
}