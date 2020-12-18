package jCw1;
import java.util.*;

public class FrogJump {
	public int solution(int X,int Y,int D) {
	 int istep=0;
		if((Y-X)%D==0) {
			istep=(Y-X)/D;
		}
		else
		{
			istep=(Y-X)/D+1;
		}
		return istep;
	}

}
