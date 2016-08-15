package org.nanotek.beans.musicbrainz;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.nanotek.Base;

@SuppressWarnings("serial")
@Entity
public class TuneGenre implements Base<Long>{

	@Id
	private Long id; 
	
	@Column(name="name" , length=255)
	private Long name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getName() {
		return name;
	}

	public void setName(Long name) {
		this.name = name;
	}

}
