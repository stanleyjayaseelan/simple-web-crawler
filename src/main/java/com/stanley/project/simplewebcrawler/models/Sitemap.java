package com.stanley.project.simplewebcrawler.models;

import java.util.List;

import lombok.Data;

@Data
public class Sitemap {

	private String siteName;
	private List<Pages> pages;

}
