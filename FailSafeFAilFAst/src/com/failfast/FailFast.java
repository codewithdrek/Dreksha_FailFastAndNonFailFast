package com.failfast;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FailFast {
	public static void main(String[] args)
    {
        Map<String, String> cityCode = new HashMap<String, String>();
        cityCode.put("Delhi", "India");
        cityCode.put("Moscow", "Russia");
        cityCode.put("New York", "USA");
  
  
        Iterator iterator =cityCode.keySet().iterator();
        
        
        while (iterator.hasNext()) {
			
        	System.out.println(cityCode.get(iterator.next()));//if u fetch it give u value
        //	System.out.println(cityCode.keySet());//gives us Keys
        	
        	cityCode.put("HJH", "hbj");//same time pe geting and removinng hensxe 
        	
        	//ConcurrentModificationException
        	
		}
		
    }
}

