package Graph;

import java.util.LinkedList;
import java.util.List;

public class Graph {
	private int vertices[][];

	public Graph(int[][] vertices) {
		this.vertices = vertices;
	}

	public void addEdge(int i, int j) {
		vertices[i][j] = 1;
	}

	public void removeEdge(int i, int j) {
		vertices[i][j] = 0;
	}

	public boolean hasEdge(int i, int j) {
		return vertices[i][j] == 1;
	}

	public List<Integer> getSuccessors(int i) {
		List<Integer> successors = new LinkedList<Integer>();
		for (int j = 0; j < vertices[i].length; i++) {
			if (vertices[i][j] == 1) {
				successors.add(j);
			}
		}
		return successors;
	}

}
