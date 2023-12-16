import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class StreamSearcher {
	/**
	 * Search the array and find count of how many times each item exists in the array
	 * */
	public static Map<Integer, Integer> searchArray(int[] intArr){
		Integer[] what = Arrays.stream( intArr ).boxed().toArray( Integer[]::new );
		Map<Integer, Integer> counterMap = new HashMap<Integer,Integer>();
		for (Integer item : what) {
			int counter = 1;
			if(Objects.nonNull(counterMap.get(item))) {
				counter = counterMap.get(item);
				counter++;
			}
			counterMap.put(item,counter);
		}
		
		return counterMap;
	}
	
	/**
	 * Second way to find find count of how many times each item exists in the array
	 * @param intArr
	 * @return
	 */
	public static Map<Integer, Long> searchArrayWithStream(int[] intArr){
		
		Map<Integer, Long> counterMap =
		Arrays.stream( intArr ).
		boxed().
		collect(Collectors.groupingBy(foo -> foo.intValue(),Collectors.counting()));
		
		
		//counterMap.forEach((i,count) -> System.out.println(i+" key is "+count + " times"));
		return counterMap;
	}

}
