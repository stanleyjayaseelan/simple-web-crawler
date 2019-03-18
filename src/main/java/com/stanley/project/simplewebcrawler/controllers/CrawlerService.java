package com.stanley.project.simplewebcrawler.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.stanley.project.simplewebcrawler.controllers.utils.SitemapExtractor;
import com.stanley.project.simplewebcrawler.exceptions.CrwalerServiceException;
import com.stanley.project.simplewebcrawler.models.Sitemap;

@RestController
@RequestMapping(value = "api/v1/sitemap")
public class CrawlerService {

	@Autowired
	SitemapExtractor stiemapExtractor;

	@RequestMapping(method = RequestMethod.GET, produces = "application/json")
	public Sitemap getSitemap(@RequestParam("site") String site) {

		if (stiemapExtractor.isValid(site)) {
			return stiemapExtractor.fetchSiteMap(site);
		} else {
			throw new CrwalerServiceException("Site is invalid provide proper site",
					"Site validation failed, refer logs for details");
		}
	}

}
