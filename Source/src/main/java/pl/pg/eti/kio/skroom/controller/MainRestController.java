package pl.pg.eti.kio.skroom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import pl.pg.eti.kio.skroom.TestService;

@RestController
@RequestMapping(value = "/rest")
public class MainRestController {

	@Autowired
	private TestService testService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET, produces = "text/plain")
	public String getHelloWorld() {
		return testService.getHelloMessage();
	}
}
