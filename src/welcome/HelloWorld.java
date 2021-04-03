package welcome;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HelloWorld {

	public static void main(String[] args) {
		
		HashMap <Character, Integer> mp=new HashMap<Character, Integer>();
		String ss="United States of America";
		char[] c=ss.toCharArray();
		for(char x:c) {
			if(mp.containsKey(x)) {
				mp.put(x, mp.get(x)+1);
			}else
				mp.put(x, 1);
		}
		Iterator<Entry<Character, Integer>>e=mp.entrySet().iterator();
		while(e.hasNext()) {
			Entry<Character, Integer> i=e.next();
		    System.out.println("key is "+ i.getKey()+" "+"value is "+ i.getValue());
		    System.out.println("HashMap is Interface");
		
	}
}}
