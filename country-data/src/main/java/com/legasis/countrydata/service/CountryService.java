package com.legasis.countrydata.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.legasis.countrydata.model.Country;
import com.legasis.countrydata.repository.CountryRepository;

@Service
public class CountryService {

    @Autowired
    CountryRepository countryRepository;

    public List<Country> getCountries()
    {
        return (List<Country>) countryRepository.findAll();
    }

    public Optional<Country> getCountryById(Integer Id)
    {
        return countryRepository.findById(Id);
    }

    public void addCountry(Country country)
    {
        countryRepository.save(country);
    }

    public void updateCountry(Country country)
    {
        countryRepository.save(country);
    }

    public void deleteCountry(Integer Id)
    {
        countryRepository.deleteById(Id);
    }
}
