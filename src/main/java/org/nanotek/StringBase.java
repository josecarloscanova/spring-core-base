package org.nanotek;

import org.nanotek.Base;

@SuppressWarnings("serial")
public class StringBase implements Base<String>{

	protected String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	} 
	
}
