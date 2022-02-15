package com.visualnutsproject.controller;

import com.visualnutsproject.model.Country;
import com.visualnutsproject.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path = "/country")
public class CountryController {

    @Autowired
    private CountryService countryService;

    @PostMapping
    public Map<String, ?> getByIdCaixa(@RequestBody List<Country> countries){
        return countryService.returnCountriesMapInformation(countries);
    }

}
