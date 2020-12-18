package jCw1;

public class MissingElement {
	public int solution(int[] A) {
		long sum = 0;
		for (int num : A) {
			sum += num;
		}
		long s = (((long) A.length + 1) * ((long) A.length + 2)) / 2;
		return (int) (s - sum);
}

}
