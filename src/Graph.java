import java.util.List;

/**
 * 
 */

/**
 * @author aksinghdce
 *
 */
public abstract class Graph {
	private int numOfVertices;
	private int numOfEdges;
	
	Graph(){
		numOfVertices = 0;
		numOfEdges = 0;
	}
	
	int getNumVertices(){
		return numOfVertices;
	}
	
	/*add a vertex means to increment the number of vertex by one with abstracted implementation
	 * details. We don't need any argument because just add one more vertex to the already existing
	 * set */
	void addVertes(){
		implementAddVertex();
		numOfVertices++;
	}
	
	public abstract void implementAddVertex();
	public abstract List<Integer> getNeighbours(int v);

}
