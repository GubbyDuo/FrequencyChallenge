package frequencyChallenge;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> stringArr = new ArrayList<String>();
		stringArr.add("one");
		stringArr.add("one");
		stringArr.add("two");
		stringArr.add("two");
		stringArr.add("two");
		stringArr.add("three");
		stringArr.add("four");
		stringArr.add("four");
		stringArr.add("four");
		stringArr.add("four");
		stringArr.add("three");
		
		
		System.out.println(Utils.orderByFrequency(stringArr));
	}

}
