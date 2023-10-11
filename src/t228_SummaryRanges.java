import java.util.LinkedList;
import java.util.List;

public class t228_SummaryRanges {
    public List<String> summaryRanges(int[] arr) {
        LinkedList<String> resultList= new LinkedList<>();
        if(arr.length == 0)
            return resultList;
        int from = arr[0];
        int to = arr[0];
        String interval;

        for(int i = 1; i < arr.length; i++){
            if(to + 1 != arr[i]) {
                interval = "";
                interval += from;
                if (from != to)
                    interval = interval + "->" + to;
                resultList.addLast(interval);
                from = arr[i];
            }
            to = arr[i];
        }
        interval = "";
        interval += from;
        if (from != to)
            interval = interval + "->" + to;
        resultList.addLast(interval);
        return resultList;
    }
}
