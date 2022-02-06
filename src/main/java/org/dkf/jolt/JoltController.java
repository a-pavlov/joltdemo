package org.dkf.jolt;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Controller
public class JoltController {
	Logger LOG = LoggerFactory.getLogger(JoltController.class);

	@GetMapping("/greeting")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		LOG.info("greetings asked");
		model.addAttribute("name", name);
		return "greeting";
	}

	@GetMapping(value = "/hello")
	public Collection<String> sayHello() {
		return IntStream.range(0, 10)
				.mapToObj(i -> "Hello number " + i)
				.collect(Collectors.toList());
	}
}
