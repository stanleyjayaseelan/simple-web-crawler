package com.stanley.project.simplewebcrawler.controllers.utils;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.validator.routines.UrlValidator;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Component;

import com.stanley.project.simplewebcrawler.models.Pages;
import com.stanley.project.simplewebcrawler.models.Sitemap;

@Component
public class SitemapExtractor {

	private final Set<URL> links = new HashSet<>();
	private final long startTime = System.currentTimeMillis();
	private URL originalUrl;

	public Sitemap fetchSiteMap(String site) {
		Sitemap sitemap = new Sitemap();
		try {
			originalUrl = new URL(site);
			sitemap.setSiteURL(site);
		} catch (MalformedURLException e) {

		}
		crawl(initURLS(originalUrl), sitemap);
		return sitemap;
	}

	private void crawl(final Set<URL> urls, Sitemap sitemap) {
		urls.removeAll(this.links);
		if (!urls.isEmpty()) {
			final Set<URL> newURLS = new HashSet<>();
			try {
				this.links.addAll(urls);
				Pages newPage = new Pages();
				for (final URL url : urls) {
					System.out.println(
							"time = " + (System.currentTimeMillis() - this.startTime) + " connect to : " + url);
					final Document document = Jsoup.connect(url.toString()).get();
					final Elements linksOnPage = document.select("a[href]");
					newPage.setPageURL(url.toString());
					List<String> childPages = new ArrayList<>();
					for (final Element page : linksOnPage) {
						final String urlText = page.attr("abs:href").trim();
						final URL discoveredURL = new URL(urlText);
						if (discoveredURL.getHost().equals(originalUrl.getHost())) {
							newURLS.add(discoveredURL);
							System.out.println("Adding URLS:" + discoveredURL.toString());
							childPages.add(urlText);
						}
					}
					newPage.setChildPages(childPages);
				}
				sitemap.addPage(newPage);
			} catch (final Exception | Error ignored) {
			}
			crawl(newURLS, sitemap);
		}
	}

	private Set<URL> initURLS(final URL startURL) {
		return Collections.singleton(startURL);
	}

	public boolean isValid(String site) {
		UrlValidator urlValidator = new UrlValidator();
		return urlValidator.isValid(site);
	}

}
