package org.zerock.util;

import lombok.Data;

@Data
public class Criteria {

	private int page;
	
	private String keyword;
	
	public String[] getArr() {
		if(keyword == null) {
			return null;
		}
		return this.keyword.split("");
	}
	public Criteria() {
		this.page = 1;
	}
	
	public Criteria(int page) {
		this.page = page;
	}
	public int getSkip() {
		return (this.page-1) *10;
	}
}
