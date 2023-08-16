package sorting;

import java.util.Iterator;
import java.util.LinkedList;

public class BreadthFirstSearch {
	
	/*How does BFS work?
	Starting from the root, all the nodes at a particular level are visited first 
	and then the nodes of the next level are traversed till all the nodes are visited.
	To do this a queue is used. All the adjacent unvisited nodes of the current level are pushed into the queue and 
	the nodes of the current level are marked visited and popped from the queue.*/
	//No. of Vertices
	
	private int V;
	
	private LinkedList<Integer> adj[];
	BreadthFirstSearch(int v)
	{
		V = v;
		adj = new LinkedList[v];
		for(int i= 0;i<v ; ++i)
			adj[i] = new LinkedList();
		
	}
	
	//Function to add an edge into the graph 
	void addEdge(int v ,int w) {adj[v].add(w);}
	
	//prints BFS traversal from a given sources
	void BFS(int s) {
		//Mark all the vertices as not visited (By default set as false)
		boolean visted[] = new boolean[V];
		//create a queue for BFS
		LinkedList<Integer> queue = new LinkedList<Integer>();
		//Mark the current node as visited and enqueue it
		visted[s] = true;
		queue.add(s);
		
		while(queue.size() !=0) {
			//Dequeue a vertex from queue and print it 
			s=queue.poll();
			System.out.print(s+" ");
			
			// Get all adjacent vertices of the dequeued
            // vertex s.
            // If an adjacent has not been visited,
            // then mark it visited and enqueue it
			
			Iterator<Integer> i = adj[s].listIterator();
			while(i.hasNext()) {
				int n= i.next();
				if(!visted[n]) {
					visted[n]=true;
					queue.add(n);
				}
			}
			
			
			
		}
		
	}
	
	public static void main(String args[]) {
		BreadthFirstSearch g = new BreadthFirstSearch(4);
		g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
 
        System.out.println(
            "Following is Breadth First Traversal "
            + "(starting from vertex 2)");
 
        g.BFS(2);
		
	}
	
	

}
