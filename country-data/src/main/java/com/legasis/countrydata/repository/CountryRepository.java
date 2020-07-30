package com.legasis.countrydata.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.legasis.countrydata.model.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {
}
