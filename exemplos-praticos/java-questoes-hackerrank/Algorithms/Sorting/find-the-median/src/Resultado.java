import java.util.*;

public class Resultado {

    public static int findMedian(List<Integer> arr) {

        Collections.sort(arr);

        int media = arr.size() / 2;

        return arr.get(media);
    }

}
