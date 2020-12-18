package jCw1;

public class TimeComplexityJumps {
	public static int solution(int X, int Y, int D) {
		int noofjumps = 0;
		int diff;
		diff=Y-X;
		int addone=0;
		if(diff%D!=0) {
			addone=1;
		}
		noofjumps=(diff/D)+1;
		return noofjumps;
	}
	
}
