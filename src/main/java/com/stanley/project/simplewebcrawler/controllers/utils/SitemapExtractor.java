package com.stanley.project.simplewebcrawler.controllers.utils;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.validator.routines.UrlValidator;
import org.springframework.stereotype.Component;

import com.stanley.project.simplewebcrawler.models.Pages;
import com.stanley.project.simplewebcrawler.models.Sitemap;

@Component
public class SitemapExtractor {

	public Sitemap fetchSiteMap(String site) {
		Sitemap sitemap = new Sitemap();
		sitemap.setSiteName(site);
		Pages page = new Pages();
		page.setPageName("child1");
		Pages page2 = new Pages();
		page2.setPageName("child2");
		Pages page3 = new Pages();
		page3.setPageName("child2_2");
		List<Pages> childPages = new ArrayList<>();
		childPages.add(page3);
		page2.setChildPages(childPages);
		List<Pages> childPages2 = new ArrayList<>();
		childPages2.add(page);
		childPages2.add(page2);
		sitemap.setPages(childPages2);
		return sitemap;
	}

	public boolean isValid(String site) {
		UrlValidator urlValidator = new UrlValidator();
		return urlValidator.isValid(site);
	}

}
