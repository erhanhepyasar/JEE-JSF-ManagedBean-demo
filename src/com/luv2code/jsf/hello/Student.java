package com.luv2code.jsf.hello;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Student {
	
	private String firstName;
	private String lastName;
	private String country;
	private String programmingLanguage;
	List<String> favoriteProgLanguages;
	List<String> countryOptions;
	List<String> programmingLanguageOptions;
	
	// no-arg constructor
	public Student() {
		
		countryOptions = new ArrayList<>();
		countryOptions.add("Brasil");
		countryOptions.add("India");
		countryOptions.add("Turkey");
		countryOptions.add("United States");
		countryOptions.add("United Kingdom");	
		
		programmingLanguageOptions = new ArrayList<>();
		programmingLanguageOptions.add("Java");
		programmingLanguageOptions.add("C#");
		programmingLanguageOptions.add("Php");
		programmingLanguageOptions.add("Node");
		
		// pre-populate the bean
		firstName = "Erhan";
		lastName = "Hepyasar";
		programmingLanguage = "Java";
		favoriteProgLanguages = new ArrayList<>();
		favoriteProgLanguages.addAll(Arrays.asList("Java", "Node"));
	}
	
	// getters - setters
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public List<String> getCountryOptions() {
		return countryOptions;
	}

	public void setCountryOptions(List<String> countryOptions) {
		this.countryOptions = countryOptions;
	}

	public String getProgrammingLanguage() {
		return programmingLanguage;
	}

	public void setProgrammingLanguage(String programmingLanguage) {
		this.programmingLanguage = programmingLanguage;
	}

	public List<String> getProgrammingLanguageOptions() {
		return programmingLanguageOptions;
	}

	public void setProgrammingLanguageOptions(List<String> programmingLanguageOptions) {
		this.programmingLanguageOptions = programmingLanguageOptions;
	}

	public List<String> getFavoriteProgLanguages() {
		return favoriteProgLanguages;
	}

	public void setFavoriteProgLanguages(List<String> favoriteProgLanguages) {
		this.favoriteProgLanguages = favoriteProgLanguages;
	}
	
}
