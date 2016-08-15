package org.nanotek.ws.xml;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="root" , namespace="org.nanotek.ws.xml")
@XmlAccessorType(XmlAccessType.FIELD)
public class AnyBase {

	@XmlAnyElement
	List<Artist> xmlMessage = new ArrayList<>();

	public List<Artist> getXmlMessage() {
		return Optional.ofNullable(xmlMessage).orElseGet(ArrayList::new);
	}

	public void setXmlMessage(List<Artist> xmlMessage) {
		this.xmlMessage = xmlMessage;
	}

}

