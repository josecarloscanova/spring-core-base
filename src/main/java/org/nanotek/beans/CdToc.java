package org.nanotek.beans;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.nanotek.Base;

@SuppressWarnings("serial")
@Entity
@Table(name="cd_toc")
public class CdToc implements Base<Long> {

	private Long id;
	private Long cdtocId;
	private String discId; 
	private String freedbId; 
	private Long trackCount;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getCdtocId() {
		return cdtocId;
	}
	public void setCdtocId(Long cdtocId) {
		this.cdtocId = cdtocId;
	}
	public String getDiscId() {
		return discId;
	}
	public void setDiscId(String discId) {
		this.discId = discId;
	}
	public String getFreedbId() {
		return freedbId;
	}
	public void setFreedbId(String freedbId) {
		this.freedbId = freedbId;
	}
	public Long getTrackCount() {
		return trackCount;
	}
	public void setTrackCount(Long trackCount) {
		this.trackCount = trackCount;
	}
	
}
