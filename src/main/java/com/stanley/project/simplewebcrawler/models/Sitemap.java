package com.stanley.project.simplewebcrawler.models;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Sitemap {

	private String siteURL;
	private List<Pages> pages = new ArrayList<>();

	public void addPage(Pages page) {
		pages.add(page);
	}

}
