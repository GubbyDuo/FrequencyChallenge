package frequencyChallenge;

import java.util.*;

public class Utils {

	public static <T> ArrayList<T> orderByFrequency(ArrayList<T> myArr){
		Map<T, Integer> hm = new HashMap<T, Integer>();
		while(myArr.size() > 0) {
			int letterCount = (int) myArr.stream()
			.filter(letter -> letter == myArr.get(0))
			.count();
			hm.put(myArr.get(0), letterCount);
			T toRemove = myArr.get(0);
			Iterator<T> itr = myArr.iterator();
			
			while(myArr.contains(toRemove)) {
				if(itr.next() == toRemove) {
					itr.remove();
				}
			}
		}
		ArrayList<Map.Entry<T, Integer>> newArr = new ArrayList<Map.Entry<T, Integer>>();
		for(Map.Entry<T, Integer> entry : hm.entrySet()) {
			newArr.add(entry);
		}
		Collections.sort(newArr, (i1, i2) -> i1.getValue().compareTo(i2.getValue()));		
		ArrayList<T> finalArr = new ArrayList<T>();
		for(Map.Entry<T, Integer> entry : newArr) {
			finalArr.add(entry.getKey());
		}
		return finalArr;
	
	}
	

}
