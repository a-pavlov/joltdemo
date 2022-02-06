package org.dkf.jolt;

import org.dkf.jolt.model.TransformRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.springframework.http.MediaType.APPLICATION_FORM_URLENCODED;

@Controller
public class JoltController {
	Logger LOG = LoggerFactory.getLogger(JoltController.class);

	@GetMapping("/")
	public String joltdemo(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		LOG.info("jolt demo started");
		//model.addAttribute("name", name);
		return "jolt_demo";
	}

	@PostMapping(path = "/transform",
			consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE,
			produces = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	@ResponseBody
	public String transform(@RequestParam MultiValueMap paramMap) {
		LOG.info("transform called with parameters count {}", paramMap.size());
		return "{\"result\": \"test\", \"data\": \"xxxx\"}";
	}
}
