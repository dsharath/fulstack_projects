package com.sharath;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Details {

	@RequestMapping("/bill")	
	public Hotel branch() {
		Hotel sitara = new Hotel();
		sitara.setBillno(4235);
		sitara.setName("hyd");
		return sitara;
}
}
