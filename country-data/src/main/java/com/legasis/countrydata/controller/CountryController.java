package com.legasis.countrydata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.legasis.countrydata.model.Country;
import com.legasis.countrydata.service.CountryService;

import java.util.Optional;

@Controller
public class CountryController {

    @Autowired
    CountryService countryService;

    @GetMapping("/countries")
    public String getCountries(Model model)
    {
        model.addAttribute("countries", countryService.getCountries());
        return "countries";
    }

    @GetMapping("/onecountry")
    @ResponseBody
    public Optional<Country> getCountryById(Integer Id, Model model)
    {
        return countryService.getCountryById(Id);
    }

    @RequestMapping(value="/addNew", method={RequestMethod.POST, RequestMethod.PUT, RequestMethod.GET })
    public String addCountry(Country country)
    {
        countryService.addCountry(country);
        return "redirect:/countries";
    }

    @RequestMapping(value="/save", method={RequestMethod.POST, RequestMethod.PUT, RequestMethod.GET })
    public String updateCountry(Country country)
    {
        countryService.updateCountry(country);
        return "redirect:/countries";
    }

    @RequestMapping(value="/delete", method={RequestMethod.POST, RequestMethod.PUT, RequestMethod.GET })
    public String addCountry(Integer Id)
    {
        countryService.deleteCountry(Id);
        return "redirect:/countries";
    }



}
