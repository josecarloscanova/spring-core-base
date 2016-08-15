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
@Table(name="isrc")
public class Isrc implements Base<Long> {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="isrc_id_seq")
	@SequenceGenerator(name = "isrc_id_seq", sequenceName = "isrc_id_seq")
	private Long id; 
	@Column (name="ISRC_ID" , insertable=true)
	private Long isrcId; 
	@Column (name="RECORDING_ID" , insertable=true )
	private Long recording; 
	@Column (name="SOURCE" , insertable=true , length=255)
	private String source; 
	@Column (name="ISRC" , insertable=true , length=255)
	private String isrc; 
	
	public Isrc() {}

	@Override
	public Long getId() {
		return id;
	}
	
	public Long getIsrcId() {
		return isrcId;
	}

	public void setIsrcId(Long isrcId) {
		this.isrcId = isrcId;
	}

	public Long getRecording() {
		return recording;
	}
	
	public void setRecording(Long recording) {
		this.recording = recording;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getIsrc() {
		return isrc;
	}

	public void setIsrc(String isrc) {
		this.isrc = isrc;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
