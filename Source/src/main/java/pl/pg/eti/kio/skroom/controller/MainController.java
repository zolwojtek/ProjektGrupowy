package pl.pg.eti.kio.skroom.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import pl.pg.eti.kio.skroom.ResourcesBundlesService;
import pl.pg.eti.kio.skroom.model.Task;
import pl.pg.eti.kio.skroom.model.TaskStatus;

@Controller
public class MainController {

	private static final List<Task> taskList;
	
	@Autowired
	private ResourcesBundlesService bundlesService;

	static {
		taskList = Collections
				.synchronizedList(Arrays.asList(new Task("Implementacja A", "Krzysztof", TaskStatus.NOT_STARTED, 1),
						new Task("Implementacja C", "Ewa", TaskStatus.BOCKED, 3),
						new Task("Projekt A", "Wojtek", TaskStatus.COMPLETED, 13),
						new Task("Projekt B", "Krzysztof", TaskStatus.IN_PROGRESS, 11),
						new Task("Analiza A", "Wojtek", TaskStatus.COMPLETED, 3),
						new Task("Analiza B", "Krzysztof", TaskStatus.IN_PROGRESS, 4)));
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView showIndex() {

		ModelAndView model = new ModelAndView("index");
		bundlesService.attachBundlesToModel(model);
		model.addObject("list", taskList);

		return model;
	}
}
