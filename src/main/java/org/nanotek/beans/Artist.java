package org.nanotek.beans;

import org.nanotek.Base;
import org.nanotek.LongBase;

@SuppressWarnings("serial")
public class Artist extends LongBase {

	private String name;
	private String sortName;

	public Artist() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSortName() {
		return sortName;
	}

	public void setSortName(String sortName) {
		this.sortName = sortName;
	}

}
