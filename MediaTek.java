package com.navin.SpringAnno;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary //since we have 2 classes that implements MobileProcessor interface we need to mention @Primary to get executed by default.
public class MediaTek implements MobileProcessor {

	public void process() {
		System.out.println("2nd Best CPU...");

	}

}
