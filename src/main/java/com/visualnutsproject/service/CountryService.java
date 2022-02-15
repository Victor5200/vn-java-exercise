package com.visualnutsproject.service;

import com.visualnutsproject.model.Country;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class CountryService {

    public Map<String, ?> returnCountriesMapInformation(List<Country> countries) {
        Map<String, Object> contriesMapInfo = new HashMap<>();
        contriesMapInfo.put("countriesInWorld", countries.size());

        contriesMapInfo.put("countryWithSpeakGermanWithMostOfficialLanguages",
                countries.stream().filter(x -> x.getLanguages().contains("de"))
                                  .sorted((o1, o2) -> Integer.valueOf(o2.getLanguages().size()).compareTo(o1.getLanguages().size()))
                                  .findFirst());

        HashMap<String , String> allLanguages = new HashMap<>();
        countries.stream().flatMap(x -> x.getLanguages().stream()).collect(Collectors.toList()).forEach(x -> allLanguages.put(x, x));
        contriesMapInfo.put("allOficialLanguages", new ArrayList<>(allLanguages.values()));

        contriesMapInfo.put("countryWithHighestNumberLanguages",
                countries.stream().sorted((o1, o2) -> Integer.valueOf(o2.getLanguages().size()).compareTo(o1.getLanguages().size()))
                        .findFirst());

        return contriesMapInfo;
    }
}
