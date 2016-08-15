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

@SuppressWarnings("serial")
@Entity
public class TuneRecord  implements Base<Long>{

	@Id
	private Long id; 
	
	@Column(name="name",nullable=false , length=2500)
	private String name;
	
	@Column(name="checked",nullable=false)
	private Boolean tuneSChecked;


	@OneToMany(fetch=FetchType.LAZY)
	private Set<TuneTrack> tracks;
	
	public TuneRecord(){} 
	
	public TuneRecord(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
		this.tuneSChecked = false;
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

	public Set<TuneTrack> getTracks() {
		return tracks = tracks != null ? tracks : (tracks = newAnyType(HashSet::new));
	}

	public void setTracks(Set<TuneTrack> tracks) {
		this.tracks = tracks;
	}

}
