import java.util.Scanner;
class dijkstra{
	static void Dijkstra(int n,int v,int cost[][],int dist[]){
		int i,u=0,count,w,min;
		int[] visited=new int[10];

		for(i=1;i<=n;i++){
			visited[i]=0;
			dist[i]=cost[v][i];
		}
		visited[u]=1;
		dist[v]=0;
		count=2;

		while(count<n){
			min=999;
			for(i=1;i<=n;i++){
				if(dist[i]<min && visited[i]==0){
					min=dist[i];
					u=i;
				}//if statement 
			}//for loop

			visited[v]=1;
			count++;
			for(w=1;w<=n;w++){
				if (visited[u]==0) {
					dist[w]=dist[u]+cost[u][w];
				}//if statement
			}//for loop

		}//while loop

	}//dijkstra's algorithm

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,v,i,j;
		int[][] cost=new int[10][10];
		int[] dist=new int[10];
		System.out.println("Enter the number of vertices of directed graph");
		n=sc.nextInt();
		System.out.println("Enter the cost matrix:");
		for(i=1;i<=n;i++){
			for(j=1;j<=n;j++){
				cost[i][j]=sc.nextInt();
			}
		}

		System.out.println("Enter the source vertex");
		v=sc.nextInt();
		Dijkstra(n,v,cost,dist);

		System.out.println("Shortest path form source vertex");
		for(i=1;i<=n;i++){
			if(i!=v){
				System.out.println(v+" to "+i+" cost = "+dist[i]);
			}
		}
	}
}