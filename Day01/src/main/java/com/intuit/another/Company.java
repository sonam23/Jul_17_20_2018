package com.intuit.another;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;

@Component
public class Company {
	@Value("Intuit")
	private String name;
	@Value("Blore")
	private String headOffice;
	
	@Resource(name="locations")
	private List<String> locations;
	
	public List<String> getLocations(){
		return locations;
	}
	public String getName() {
		return name;
	}
	public String getHeadOffice() {
		return headOffice;
	}
}
