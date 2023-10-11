public class t207_CourseSchedule {
    boolean[] visited;
    boolean[] recorded;
    int[][] graph;
    int numCourses;

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        boolean canFinish = true;

        this.numCourses = numCourses;
        graph = prerequisites;
        visited = new boolean[numCourses];
        recorded = new boolean[numCourses];

        for(int i = 0; i < graph.length; i++){
            if(!visited[graph[i][0]]){
                canFinish = traceFin(graph[i][0]);
                if(!canFinish)
                    break;
            }
        }

        return canFinish;
    }

    public boolean traceFin(int position){
        if(recorded[position])
            return false;
        if(visited[position])
            return true;
        visited[position] = true;
        recorded[position] = true;
        for(int[] ints : graph){
            if(ints[0] == position && !traceFin(ints[1])){
                return false;
            }
        }
        recorded[position] = false;
        return true;
    }
}
