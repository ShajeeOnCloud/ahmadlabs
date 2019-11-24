package shajee;

import java.util.Set;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import rx.Observable;
import shajee.ahmad.labs.rx.services.DataService;

@RestController
@RequestMapping("/data/stream")
public class DataRestController {

	@Autowired
	private DataService service;
	
	@GetMapping(value = "/names", produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
	public Observable<?> getData(@RequestParam("page") int page) {
		return service.getNamesFromService(page);
	}
}
