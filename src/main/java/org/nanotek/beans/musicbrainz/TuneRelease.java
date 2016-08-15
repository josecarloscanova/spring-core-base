package org.nanotek.beans.musicbrainz;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.nanotek.Base;
import org.nanotek.ws.xml.ArtistRelease;

@SuppressWarnings("serial")
@Entity
public class TuneRelease implements Base<Long>{

	@Id
	private Long id; 
	
	@Column(name="name",nullable=false , length=2500)
	private String name;
	
	@Column(name="checked",nullable=false)
	private Boolean tuneSChecked;

	public TuneRelease(){}
	
	public TuneRelease(Long id , String name)
	{ 
		this.id = id; 
		this.name = name;
		this.tuneSChecked = false;
	}
	
	public TuneRelease(ArtistRelease artistRelease) 
	{ 
		this.id = artistRelease.getId();
		this.name = artistRelease.getName(); 
		this.tuneSChecked=false;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getTuneSChecked() {
		return tuneSChecked;
	}

	public void setTuneSChecked(Boolean tuneSChecked) {
		this.tuneSChecked = tuneSChecked;
	}

}
