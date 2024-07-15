package com.pokemon.solgario.week1introduction.introductionToSpringBoot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "deploy.env", havingValue = "development") //load this particular bean only when the condition matchs
public class DevDB implements DB{
	
	public String getData() {
		return "Dev DB";
	}
}
