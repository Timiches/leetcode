import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class t802_FindEventualSafeStates {
    boolean[] visited;
    boolean[] recorded;
    int[][] graph;
    List<Integer> result;

    public List<Integer> eventualSafeNodes(int[][] graph) {
        this.graph = graph;
        result = new ArrayList<>();
        int graphLength = graph.length;
        visited = new boolean[graphLength];
        recorded = new boolean[graphLength];

        for(int i = 0; i < graphLength; i++){
            visited[i] = false;
            recorded[i] = false;
        }

        for(int i = 0; i < graphLength; i++){
            if(!visited[i]){
                trace(graph[i], i);
            }
        }

        Collections.sort(result);
        return result;
    }

    public boolean trace(int[] node, int position){

        if(recorded[position])
            return true;
        if(visited[position])
            return false;
        visited[position] = true;
        recorded[position] = true;
        for(int i = 0; i < node.length; i++){
            if(trace(graph[node[i]], node[i]))
                return true;
        }
        recorded[position] = false;
        result.add(position);
        return false;
    }
}
