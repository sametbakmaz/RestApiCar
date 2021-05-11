package test.test.entities.concretes;

import org.springframework.stereotype.Service;

import test.test.entities.abstracts.Car;

@Service
public class Cabrio implements Car{

	@Override
	public String getType() {
		return "Cabrio Car is produced";
	}

}
