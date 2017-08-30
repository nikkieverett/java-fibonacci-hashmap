import java.math.BigInteger;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapProject{
    static Map<Integer, Long> listOfNumbers = new HashMap<>();

    public static void initMap(){
        listOfNumbers.put(0, 0l);
        listOfNumbers.put(1, 1l);
    }

    public static long calcFibonacci (int index) {
        if (listOfNumbers.containsKey(index)) {
            return listOfNumbers.get(index);
        }
        long response = calcFibonacci(index - 1) + calcFibonacci(index - 2);
        listOfNumbers.put(index, response);

        return response;
    }

    public static void main(String[] args) {
        initMap();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            System.out.println("calc(" + i + ") = " + calcFibonacci(i));
        }
        long endTime = System.currentTimeMillis();

        long totalTime = endTime - startTime;
        System.out.println("total time in milliseconds: " + totalTime + " ms");

    }
}
