package org.nanotek.beans;

import org.nanotek.Base;
import javax.persistence.Table;
import javax.persistence.Entity;

@SuppressWarnings("serial")
@Entity
@Table(name="medium_cd_toc")
public class MediumCdToc implements Base<Long>{

	private Long id; 
	private Long mediumCdTocId; 
	private Long medium; 
	private Long cdToc; 
	
	@Override
	public Long getId() {
		return id;
	}

	public Long getMedium() {
		return medium;
	}

	public void setMedium(Long medium) {
		this.medium = medium;
	}

	public Long getCdToc() {
		return cdToc;
	}

	public void setCdToc(Long cdToc) {
		this.cdToc = cdToc;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public Long getMediumCdTocId() {
		return mediumCdTocId;
	}

	public void setMediumCdTocId(Long mediumCdTocId) {
		this.mediumCdTocId = mediumCdTocId;
	}

}
