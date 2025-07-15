package com.crm.microservices.currencyexchangeservice;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchanngeController {
	@Autowired
	private CurrencyExchangeRepository repository;
	
	@Autowired
	private Environment enviroment;
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyExchange getExchangeValue(@PathVariable String from,
			@PathVariable String to) {
		
		
		CurrencyExchange currencyExchange=repository.findByFromAndTo(from, to);
		if(currencyExchange==null) {
			throw new RuntimeException("unable tp find data for"+from+"to"+to);
		}
		String port=enviroment.getProperty("local.server.port");
		currencyExchange.setEnvironment(port);
		return currencyExchange;
		
	
	}
	
	
	

}
