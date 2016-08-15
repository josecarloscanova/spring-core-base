package org.nanotek.beans.musicbrainz;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.nanotek.Base;

@Entity
@SuppressWarnings("serial")
public class TuneArtist implements Base<Long>{

	@Id
	private Long id; 
	
	@Column(name="name",nullable=false,length=1000)
	private String name;
	
	@Column(name="checked",nullable=false)
	private Boolean tuneSChecked; 

	@OneToMany(fetch=FetchType.LAZY)
	private Set<TuneCredit> credits;
	
	@OneToMany(fetch=FetchType.LAZY)
	private Set<TuneRelease> releases;
	
	@OneToMany(fetch=FetchType.LAZY)
	private Set<TuneRecord> records;
	
	public TuneArtist() 
	{ 
		tuneSChecked = false;
	}
	
	public TuneArtist(Long id , String name) 
	{ 
		this.id = id ; 
		this.name = name;
		tuneSChecked = true;
	}
	
/*	public void postConstruct() 
	{ 
		records = new HashSet<TuneRecord>();
		credits = new HashSet<TuneCredit>();
		releases = new HashSet<TuneRelease>();
	}*/
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Boolean getTuneSChecked() {
		return tuneSChecked;
	}

	public void setTuneSChecked(Boolean tuneSChecked) {
		this.tuneSChecked = tuneSChecked;
	}

	public Set<TuneCredit> getCredits() {
		return credits != null ? credits : (credits = newAnyType(HashSet::new));
	}

	public void setCredits(Set<TuneCredit> credits) {
		this.credits = credits;
	}


	public Set<TuneRelease> getReleases() {
		return  releases != null ? releases : (releases = newAnyType(HashSet::new));
	}

	public void setReleases(Set<TuneRelease> releases) {
		this.releases = releases;
	}

	public Set<TuneRecord> getRecords() {
		return records != null ? records : (records = newAnyType(HashSet::new));
	}

	public void setRecords(Set<TuneRecord> records) {
		this.records = records;
	} 
	
}
