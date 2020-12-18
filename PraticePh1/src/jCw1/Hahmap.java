package jCw1;
import java.util.HashMap;

public class Hahmap {
	
	    private static final HashMap<String, Integer> wdayNumber =  new HashMap<String, Integer>();
	    static {
	        int wdayno = 0;
	        String[] wdays =  {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
	        for (String wday: wdays)
	            wdayNumber.put(wday, wdayno++);
	    }

	    public static int wdayno5(String wday) {
	        Integer res = wdayNumber.get(wday);
	        return res == null ? -1: res;
	    }

	    public static void main(String[] args) {
	        System.out.println(wdayno5("Sommar"));
	        System.out.println(wdayno5("Thursday"));
	    }

}
