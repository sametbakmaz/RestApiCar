package test.test.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;

import test.test.entities.concretes.Cabrio;
import test.test.entities.concretes.Hatchback;
import test.test.entities.concretes.Sedan;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	private Cabrio cabrio;
	private Hatchback hatchback;
	private Sedan sedan;
	
	
	@Autowired
	public RestController(Cabrio cabrio, Hatchback hatchback, Sedan sedan) {
		super();
		this.cabrio = cabrio;
		this.hatchback = hatchback;
		this.sedan = sedan;
	}
	
	@PostMapping("/add")
	public String getType2(String type) {
		type = type.toLowerCase();
		String st = new String(type);
		String cb = new String("cabrio");
		String sd = new String("sedan");
		String ht = new String("hatchback");
		
		if (st.equals(cb)) {
			
			return cabrio.getType();
		}
		if (st.equals(sd)) {
			return sedan.getType();
		}
		if (st.equals(ht)) {
			return hatchback.getType();
		} else {
			return "Car type not found";
		}
		
	}
	
	

}
