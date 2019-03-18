package com.stanley.project.simplewebcrawler.models;

import java.util.List;

import lombok.Data;

@Data
public class Pages {

	private String pageURL;
	private List<String> childPages;

}
