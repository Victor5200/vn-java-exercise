# Visual Nuts Exercise 

## Exercise One:

Run `ExerciseOne.java` to see Exercise Answer.

## Exercise Two:

Use Postman and create a post call to `http://localhost:8080/country` use the json bellow 

```
[ 
	{ 
		"country":"US", 
		"languages": ["en"] 
	}, 
	{ 
		"country":"BE", 
		"languages": ["nl","fr","de"] 
	}, 
	{ 
		"country":"NL", 
		"languages": ["nl","fy"] 
	}, 
	{ 
		"country":"DE", 
		"languages": ["de"] 
	}, 
	{ 
		"country":"ES", 
		"languages": ["es"] 
	} 
]
```

The output is:

```
{
    "allOficialLanguages": [
        "de",
        "fy",
        "en",
        "fr",
        "nl",
        "es"
    ],
    "countriesInWorld": 5,
    "countryWithSpeakGermanWithMostOfficialLanguages": {
        "country": "BE",
        "languages": [
            "nl",
            "fr",
            "de"
        ]
    },
    "countryWithHighestNumberLanguages": {
        "country": "BE",
        "languages": [
            "nl",
            "fr",
            "de"
        ]
    },
    "mostCommomLanguagesInCountries": "de"
}
```
