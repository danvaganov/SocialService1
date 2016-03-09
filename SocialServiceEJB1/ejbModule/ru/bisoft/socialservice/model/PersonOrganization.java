package ru.bisoft.socialservice.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.GeneratedValue;
import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import static javax.persistence.GenerationType.SEQUENCE;
import static javax.persistence.CascadeType.ALL;
import static javax.persistence.CascadeType.REMOVE;

@Entity
@Table(name = "PERSON_ORGANIZATION")
@SequenceGenerator(name = "PERSON_ORGANIZATION_GEN_ID", allocationSize = 1, initialValue = 1, sequenceName = "PERSON_ORGANIZATION_GEN_ID")
public class PersonOrganization {

	@Id
	@GeneratedValue(generator = "PERSON_ORGANIZATION_GEN_ID", strategy = SEQUENCE)
	@Column(name = "KEY_PERSON_ORGANIZATION")
	private int keyPersonOrganization;
	
	@ManyToOne
	@JoinColumn(name = "KEY_ORGANIZATION", referencedColumnName = "KEY_ORGANIZATION")
	private Organization organization;
	
	@ManyToOne
	@JoinColumn(name = "KEY_PERSON", referencedColumnName = "KEY_PERSON")
	private Person person;

	public int getKeyPersonOrganization() {
		return keyPersonOrganization;
	}

	public void setKeyPersonOrganization(int keyPersonOrganization) {
		this.keyPersonOrganization = keyPersonOrganization;
	}

	public Organization getOrganization() {
		return organization;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public PersonOrganization() {
		super();
	}

	public PersonOrganization(Organization organization, Person person) {
		super();
		this.organization = organization;
		this.person = person;
	}
}
