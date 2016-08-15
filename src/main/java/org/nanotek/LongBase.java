package org.nanotek;

@SuppressWarnings("serial")
public abstract class LongBase implements Base<Long>{
	private Long id;

	public LongBase(){}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	} 
}
