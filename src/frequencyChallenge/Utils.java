package frequencyChallenge;

import java.util.*;

public class Utils {

	public static <T> ArrayList<Frequency<T>> orderByFrequency(ArrayList<T> myArr){
		ArrayList<Frequency<T>> newArr = new ArrayList<Frequency<T>>();
		while(myArr.size() > 0) {
			long letterCount = myArr.stream()
			.filter(letter -> letter == myArr.get(0))
			.count();
			newArr.add(new Frequency<T>(myArr.get(0), letterCount));
			T toRemove = myArr.get(0);
			Iterator<T> itr = myArr.iterator();
			
			while(myArr.contains(toRemove)) {
				if(itr.next() == toRemove) {
					itr.remove();
				}
			}
		}
		//sort frequency class in order by frequency
		System.out.println(newArr);
		Collections.sort((ArrayList) myArr, Comparator.comparing(Frequency<T>::getFrequency));
		return newArr;
		
		
		
	}

}
