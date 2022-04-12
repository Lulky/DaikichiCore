package com.codingdojo.luciano.controladores;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorDaikichi {
	/*@RequestMapping(value="/daikichi/{travel}/{city}", method =RequestMethod.GET)
	public String viajarKyoto(@PathVariable(value="travel")String travel,
							   @PathVariable(value="city")String city) {
		return "<h1>Felicidades pronto viajarás a "+city+"!</h1>";
	}*/
		
	@RequestMapping(value="/daikichi/{lotto}/{number}", method =RequestMethod.GET)
	public String lottoDaikichi(@PathVariable(value="lotto")String lotto,
							   @PathVariable(value="number")Integer number) {
		if(number % 2 == 0) {
			return "<h1>Harás un gran viaje en un futuro cercano, pero ten cuidado con las ofertas tentadoras!</h1>";
		} else {
			return "<h1>Haz disfrtado de los frutos de tu trabajo, pero ahora es tiempo para pasar con familiares y amigos</h1>";
		}
	}
}
