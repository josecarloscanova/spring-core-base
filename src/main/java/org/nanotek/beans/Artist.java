package org.nanotek.beans;

import org.nanotek.Base;

@SuppressWarnings("serial")
public class Artist implements Base<Long> {

	private Long id; 
	private String name;
	private String sortName;

	public Artist() {
	}

	@Override
	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSortName() {
		return sortName;
	}

	public void setSortName(String sortName) {
		this.sortName = sortName;
	}

}
