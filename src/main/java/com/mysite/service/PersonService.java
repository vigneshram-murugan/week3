package com.mysite.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

import com.mysite.model.person;

@Service
public class PersonService {
	 List<person> list = new ArrayList<person>();
	    
	

	public List<person> getmymethod(){
		
     
     return list;


}
	
	
	
	public void putmymethod(person p){
		list.add(p);
 }

 
}
