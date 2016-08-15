package org.nanotek.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.nanotek.Base;

@SuppressWarnings("serial")
@Entity
@Table(name="artist_credit_name")
@NamedQuery(name="FindArtistCreditByMbid" , query= "Select a from ArtistCreditName a where a.artist = :mbid")
public class ArtistCreditName implements Base<Long> {

	@Id
	@GeneratedValue(generator="artist_credit_name_id_seq" , strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name = "artist_credit_name_id_seq", sequenceName = "artist_credit_name_id_seq")
	private Long id;
	@Column(name="ARTIST_CREDIT_NAME_POSITION",insertable=true)
	private Long position; 
	@Column(name="ARTIST_CREDIT_ARTIST_NAME",insertable=true)
	private Long artist;
	@Column(name="ARTIST_NAME" ,length=1000,nullable=false,insertable=true)
	private String name;
	@Column(name="ARTIST_CREDIT_NAME_JOIN_PHRASE" ,length=2000,nullable=true,insertable=true)
	private String joinPhrase;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getPosition() {
		return position;
	}
	public void setPosition(Long position) {
		this.position = position;
	}
	
	public Long getArtist() {
		return artist;
	}
	public void setArtist(Long artist) {
		this.artist = artist;
	}
	
	public String getJoinPhrase() {
		return joinPhrase;
	}
	public void setJoinPhrase(String joinPhrase) {
		this.joinPhrase = joinPhrase;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
