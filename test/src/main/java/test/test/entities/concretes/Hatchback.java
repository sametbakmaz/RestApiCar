package test.test.entities.concretes;

import org.springframework.stereotype.Service;

import test.test.entities.abstracts.Car;

@Service
public class Hatchback   implements Car{

	@Override
	public String getType() {
		
		return "Hatchback Car is produced";
	}

}
