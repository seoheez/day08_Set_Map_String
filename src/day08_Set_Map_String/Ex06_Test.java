package day08_Set_Map_String;

import java.util.ArrayList;
import java.util.Iterator;

import org.apache.commons.lang3.time.StopWatch;
public class Ex06_Test {

	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		for(int i=0; i<1000000; i++) {
			arr.add(i);
		}
		
		StopWatch sw = new StopWatch();
		sw.start();
		for(int i=0; i<arr.size() ;i++) {arr.get(i);}; 
		sw.stop();
		System.out.println("arr 수행시간 : "+sw.getTime());
		
		Iterator it = arr.iterator();
		sw = new StopWatch();
		sw.start();
		for(;it.hasNext();) {it.next();};
		sw.stop();
		System.out.println("it 수행시간 : "+sw.getTime());
	}
}

