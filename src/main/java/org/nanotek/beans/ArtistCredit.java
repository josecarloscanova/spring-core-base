package org.nanotek.beans;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.nanotek.Base;
//TODO Generate Equals and Hashcode from refatored class
@SuppressWarnings("serial")
@Entity
@Table(name="artist_credit")
@NamedQueries(value = { 
		@NamedQuery(name = "FindArtistCreditById", query ="Select a from ArtistCredit a where a.artistCreditId = :artistCreditId"),
		@NamedQuery(name = "ArtistCreditLoadAll", query ="Select a from ArtistCredit a order by a.id asc"),
		@NamedQuery(name="FindArtistCredits" , query = "Select a from ArtistCredit a where a.artistCreditId in (:ids)"),
		@NamedQuery(name="FindArtistCreditsByArtistId" , query="Select a from ArtistCredit a inner join a.artistCreditNames n where n.artist = :artistId")
})
public class ArtistCredit implements Base<Long> {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="artist_credit_id_seq")
	@SequenceGenerator(name = "id", sequenceName = "artist_credit_id_seq")
	private Long id;
	@Column (name="artist_name" , length=1000, insertable=true, nullable=false)
	private String name; 
	@Column (name="artist_count")
	private Long artistCount; 
	@Column (name="ref_count")
	private Long refCount;

	@OneToMany(fetch=FetchType.LAZY,mappedBy="artistCreditReference")
	private Set<Release> releases; 

	@OneToMany(fetch=FetchType.LAZY)
	@JoinColumn(name="artist_credit", referencedColumnName="artist_credit_id", unique=true)
	private Set<ArtistCreditName> artistCreditNames;
	
	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getArtistCount() {
		return artistCount;
	}

	public void setArtistCount(Long artistCount) {
		this.artistCount = artistCount;
	}

	public Long getRefCount() {
		return refCount;
	}

	public void setRefCount(Long refCount) {
		this.refCount = refCount;
	}

	public Set<Release> getReleases() {
		return releases != null ? releases : (releases = newAnyType(HashSet::new)); 
	}

	public void setReleases(Set<Release> releases) {
		this.releases = releases;
	}

	public Set<ArtistCreditName> getArtistCreditNames() {
		return  artistCreditNames != null ? artistCreditNames : (artistCreditNames = newAnyType(HashSet::new));  //ofNullable(HashSet::new, artistCredits); Optional.ofNullable(artistCreditNames).orElseGet(HashSet::new);
	}

	public void setArtistCreditNames(Set<ArtistCreditName> artistCreditNames) {
		this.artistCreditNames = artistCreditNames;
	}
	
}
