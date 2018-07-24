package com.emuthui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.emuthui.entity.County;
import com.emuthui.repository.CountryRepository;

@SpringBootApplication
public class CountriesApplication implements CommandLineRunner {
	
	@Autowired
	CountryRepository countryRepository;

	public static void main(String[] args) {
		SpringApplication.run(CountriesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		countryRepository.save(new County("Kenya", "Nairobi"));
		countryRepository.save(new County("Uganda", "Kampala"));
		countryRepository.save(new County("Somalia", "Mogadishu"));
		countryRepository.save(new County("Tanzania", "Arusha"));
		countryRepository.save(new County("Ethiopia", "Adis Ababa"));
		countryRepository.save(new County("South Africa", "Nairobi"));
		countryRepository.save(new County("Morrocco", "Kampala"));
		countryRepository.save(new County("Ghana", "Mogadishu"));
		countryRepository.save(new County("Nigeria", "Arusha"));
		countryRepository.save(new County("Tunisia", "Adis Ababa"));
		countryRepository.save(new County("Argentina", "Nairobi"));
		countryRepository.save(new County("Russia", "Moscow"));
		countryRepository.save(new County("Iraq", "Mogadishu"));
		countryRepository.save(new County("Iran", "Arusha"));
		countryRepository.save(new County("Portugal", "Adis Ababa"));
		countryRepository.save(new County("algeria", "Arusha"));
		countryRepository.save(new County("Uraguay", "Adis Ababa"));
		countryRepository.save(new County("paraguay", "Nairobi"));
		countryRepository.save(new County("India", "Moscow"));
		countryRepository.save(new County("Australia", "Mogadishu"));
		countryRepository.save(new County("Sudan", "Arusha"));
		countryRepository.save(new County("Malawi", "Adis Ababa"));
		
	}
}
