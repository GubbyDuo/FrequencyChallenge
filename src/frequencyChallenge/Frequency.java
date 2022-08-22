package frequencyChallenge;

import java.util.ArrayList;

public class Frequency<T> implements Comparable<Frequency<T>> {
	private T thing;
	private long frequency;

	public Frequency(T thing, long frequency) {
		this.thing = thing;
		this.frequency = frequency;
	}
	
	public void setFrequency(long frequency) {
		this.frequency = frequency;
	}
	
	public T getThing() {
		return this.thing;
	}
	public long getFrequency() {
		return this.frequency;
	}
	public String toString() {
		return this.thing + " - " + this.frequency;
	}
	
	
	
//	public static Comparator<Frequency> FrequencyComparator = new Comparator<Frequency>() {
//		public int compare(Frequency f1, Frequency f2) {
//			return (int) (f1.getFrequency() - f2.getFrequency());
//		}
//	};

	@Override
	public int compareTo(Frequency<T> frequency) {
		long compareFreq = frequency.getFrequency();
		return ((int)this.frequency - (int)compareFreq);
	}
	
	

}
