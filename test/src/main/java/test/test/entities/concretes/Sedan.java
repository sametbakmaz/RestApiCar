package test.test.entities.concretes;

import org.springframework.stereotype.Service;

import test.test.entities.abstracts.Car;


@Service
public class Sedan  implements Car {

	@Override
	public String getType() {
		return "Sedan Car is produced";
	}

}
