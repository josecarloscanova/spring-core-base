package org.nanotek.beans;

import org.nanotek.Base;
import javax.persistence.Table;
import javax.persistence.Entity;


@SuppressWarnings("serial")
@Entity
@Table(name="label_name")
public class LabelName implements Base<Long> {

	private Long id; 
	private String name; 
	
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

}
