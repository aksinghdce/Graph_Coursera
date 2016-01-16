import java.util.List;
import java.util.Arrays;

public class GraphAdjMatrix extends Graph {
	private int[][] adjMatrix;
	
	GraphAdjMatrix(){
		int n = getNumVertices();
		adjMatrix = new int[n][n];
	}
	
	@Override
	public void implementAddVertex() {
		// TODO Auto-generated method stub
		/*In order to add a vertex one needs to increase the arrays's dimension by 1x1 */
		int twiceNumOfRows = adjMatrix.length * 2;
		int numOfRows = adjMatrix.length;
		int[][] newMatrix;
		//newMatrix = new int[numOfRows*2][];
		//for(int i=0; i< numOfRows; i++){
		//	/*each row is an uninitialized array*/
		//	newMatrix[i] = Arrays.copyOfRange(adjMatrix[i], 0, numOfRows - 1);
		//	/*after the above operation each row is an array of length numOfRows*/
		//	/*we need each row to be an array of length numOfRows*2 */
		newMatrix = new int[twiceNumOfRows][twiceNumOfRows];
		
		/*There is a better implementation in the next to next for loop*/
		for(int i = 0; i< (twiceNumOfRows); i++){
			for(int j = 0; j< (twiceNumOfRows); j++){
				newMatrix[i][j] = 0;
			}
		}
		
		//The above initialization steps can be replaced with this better one
		for(int i=0; i< twiceNumOfRows; i++){
			Arrays.fill(newMatrix[i], 0);
		}
		
		for(int i=0; i< numOfRows; i++){
			System.arraycopy(adjMatrix[i], 0, newMatrix[i], 0, numOfRows);
		}
		
	}

	@Override
	public List<Integer> getNeighbours(int v) {
		// TODO Auto-generated method stub
		return null;
	}

}
