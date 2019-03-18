# Simple web crawler application 

## Introduction:
	Simple web crawler application provides REST API to scan any website and produce a site-map. Site-map produced is limited to domain of the scanned website.  

### Installation steps:
	To build the spring boot application run, 
		
		mvn clean install
		
		java -jar simple-web-crawler-[build-version].jar

		or
		
		mvn spring-boot:run
		
		

### Testing
	Run from your favourite browser http://localhost:8080/api/v1/sitemap?site=http://www.mit.edu/ 
	
	Expected result, 
	
				{
	   			 "siteURL": "http://www.mit.edu/",
	    		"pages": [
	        		{
	            "pageURL": "http://www.mit.edu/",
	            "childPages": [
	                "http://www.mit.edu/#main",
	                "http://www.mit.edu/",
	                "http://www.mit.edu/education",
	                "http://www.mit.edu/research",
	                "http://www.mit.edu/innovation",
	                "http://www.mit.edu/admissions-aid",
	                "http://www.mit.edu/campus-life",
	                "http://www.mit.edu/alumni",
	                "http://www.mit.edu/about",
	                "http://www.mit.edu/admissions-aid",
	                "http://www.mit.edu/campus-life",
	                "http://www.mit.edu/alumni",
	                "http://www.mit.edu/about",
	                "http://www.mit.edu/search",
	                "http://www.mit.edu/feedback",
	                "http://www.mit.edu/",
	                "http://www.mit.edu/education",
	                "http://www.mit.edu/research",
	                "http://www.mit.edu/innovation",
	                "http://www.mit.edu/admissions-aid",
	                "http://www.mit.edu/campus-life",
	                "http://www.mit.edu/about",
	                "http://www.mit.edu/alumni",
	                "http://www.mit.edu/building-a-better-world",
	                "http://www.mit.edu/visitmit",
	                "http://www.mit.edu/contact",
	                "http://www.mit.edu/privacy",
	                "http://www.mit.edu/accessibility"
	            ]
	        },
	        {
	            "pageURL": "http://www.mit.edu/research/centers-labs-programs/#main",
	            "childPages": [
	                "http://www.mit.edu/research/centers-labs-programs/#main",
	                "http://www.mit.edu/",
	                "http://www.mit.edu/education",
	                "http://www.mit.edu/research",
	                "http://www.mit.edu/innovation",
	                "http://www.mit.edu/admissions-aid",
	                "http://www.mit.edu/campus-life",
	                "http://www.mit.edu/alumni",
	                "http://www.mit.edu/about",
	                "http://www.mit.edu/admissions-aid",
	                "http://www.mit.edu/campus-life",
	                "http://www.mit.edu/alumni",
	                "http://www.mit.edu/about",
	                "http://www.mit.edu/search",
	                "http://www.mit.edu/feedback",
	                "http://www.mit.edu/",
	                "http://www.mit.edu/research",
	                "http://www.mit.edu/",
	                "http://www.mit.edu/education",
	                "http://www.mit.edu/research",
	                "http://www.mit.edu/innovation",
	                "http://www.mit.edu/admissions-aid",
	                "http://www.mit.edu/campus-life",
	                "http://www.mit.edu/about",
	                "http://www.mit.edu/alumni",
	                "http://www.mit.edu/building-a-better-world",
	                "http://www.mit.edu/",
	                "http://www.mit.edu/visitmit",
	                "http://www.mit.edu/contact",
	                "http://www.mit.edu/privacy",
	                "http://www.mit.edu/accessibility"
	            	]
	        }
	    	]
		}	