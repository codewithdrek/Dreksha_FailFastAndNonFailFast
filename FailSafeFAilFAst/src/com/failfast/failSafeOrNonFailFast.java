package com.failfast;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class failSafeOrNonFailFast {

	public static void main(String args[]) {

		// COPYONWRITE
		CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<Integer>(new Integer[] { 1, 3, 5, 8 });

		Iterator itr = list.iterator();

		// CopyOnWriteArrayList
		while (itr.hasNext()) {
			Integer no = (Integer) itr.next();

			// first operation
			System.out.println(no);

			if (no == 8) {

				// System.out.println(itr.next());
			}

			// second operation
			// This will not print,
			// hence it has created separate copy
			list.add(14);
		}
//-----------------------------------------------------------------------
//----------------------------------------------------------------------------
		
		
		// CONCURRENT HASHMAP
		
		ConcurrentHashMap<String, String> cityCode = new ConcurrentHashMap<String, String>();
		cityCode.put("Delhi", "India");
		cityCode.put("Moscow", "Russia");
		cityCode.put("New York", "USA");

		Iterator iterator = cityCode.keySet().iterator();

		
		while (iterator.hasNext()) { // while me hashNext comes
			System.out.println(cityCode.get(iterator.next()));
			cityCode.put("hjj", "bj");
		}
	}
}
