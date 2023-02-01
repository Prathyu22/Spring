package com.navin.SpringAnno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

//By default we get an object of Samsung if we mention @Component before the class.
//Therefore we can not have any beans for that.
@Component //or @Component("samsung") --> The name is by default non-qualified and de-capitalized.
@ComponentScan(basePackages="com.navin.SpringAnno") // This scans all the components in your project in the specific pkg. 
public class Samsung {
	@Autowired
	MobileProcessor cpu;
	
	public MobileProcessor getCpu() {
		return cpu;
	}

	public void setCpu(MobileProcessor cpu) {
		this.cpu = cpu;
	}

	public void config() {
		System.out.println("Octa core, 4gb RAM, 12MP CAMERA");
		cpu.process();
	}
}
