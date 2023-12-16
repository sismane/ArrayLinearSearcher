import java.util.Map;

public class ArraySearcher {

	public static void main(String[] args) {
		int[] intArr = {1,2,1,3,4,5,2};
		
		Map<Integer,Integer> countMap = StreamSearcher.searchArray(intArr);
		countMap.entrySet().forEach(s -> System.out.println(s.getKey()+" key is "+s.getValue()+" times"));
		
		System.out.println("*********");
		Map<Integer,Long> counterMap = StreamSearcher.searchArrayWithStream(intArr);
		counterMap.forEach((i,count) -> System.out.println(i+" key is "+count + " times"));
		
	}

}
