package io.opentelemetry.example.flight;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlightController {
	
	 private static final Logger LOGGER = LoggerFactory.getLogger(FlightController.class);
	
	private FlightService flightService;
	
	public FlightController(FlightService flightService) {
		this.flightService = flightService;
	}
	
	@GetMapping("/voos")
    public List<Flight> greeting(@RequestParam(value = "origem", defaultValue = "RJ") String origin) {
    	LOGGER.info("Listagem de Voos");
        return flightService.getFlights(origin);
    }

}
