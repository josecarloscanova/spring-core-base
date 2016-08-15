package org.nanotek.ws.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.nanotek.ws.WsBase;

@SuppressWarnings("serial")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="track" , namespace="org.nanotek.ws.xml")
public class Track implements WsBase<Long>{

	@XmlElement(name="trackId")
	private Long id;

	@XmlElement(name="trackName")
	private String name;
	
	public Track(){}
	
	public Track(org.nanotek.beans.Track p1) {
		this.id = p1.getTrackId();
		this.name = p1.getName();
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

}
