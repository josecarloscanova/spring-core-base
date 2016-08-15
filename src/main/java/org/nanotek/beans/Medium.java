package org.nanotek.beans;

import org.nanotek.Base;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;

@SuppressWarnings("serial")
@Entity
@Table(name="medium")
public class Medium implements Base<Long>{

	@Id
	@GeneratedValue(generator="medium_id_seq",strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="medium_id_seq" , sequenceName="medium_id_seq")
	private Long id; 
	@Column(name="MEDIUM_ID")
	private Long mediumId; 
	@Column(name="RELEASE")
	private Long release;
	@Column(name="POSITION",nullable=true)
	private Long position;
	@Column(name="FORMAT")
	private Long format;
	@Column(name="NAME" , length=2500 , nullable=true)
	private String name; 
	@Column(name="TRACK_COUNT")
	private Long trackCount; 
	

	@Override
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}

	
	public Long getMediumId() {
		return mediumId;
	}


	public void setMediumId(Long mediumId) {
		this.mediumId = mediumId;
	}
	

	public Long getTrackCount() {
		return trackCount;
	}


	public void setTrackCount(Long trackCount) {
		this.trackCount = trackCount;
	}


	public Long getRelease() {
		return release;
	}


	public void setRelease(Long release) {
		this.release = release;
	}


	public Long getPosition() {
		return position;
	}


	public void setPosition(Long position) {
		this.position = position;
	}


	public Long getFormat() {
		return format;
	}


	public void setFormat(Long format) {
		this.format = format;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
}
