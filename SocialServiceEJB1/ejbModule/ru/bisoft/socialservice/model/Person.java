package ru.bisoft.socialservice.model;

import static javax.persistence.CascadeType.ALL;
import static javax.persistence.GenerationType.SEQUENCE;
import static javax.persistence.TemporalType.DATE;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name = "PERSON")
@NamedQueries({
	@NamedQuery(name="Person.findAll", query="SELECT p FROM Person p order by p.keyPerson"),
	@NamedQuery(name="Person.findByOrganization", query="SELECT p FROM Person p JOIN p.personOrganizationList po WHERE po.organization = :organization"),
	@NamedQuery(name="Person.findByPassport", query="SELECT p FROM Person p WHERE p.passport.serialPassport = :serialPassport AND p.passport.numberPassport = :numberPassport AND p.passport.issueDatePassport = :issueDatePassport"),
	@NamedQuery(name="Person.getCount", query="SELECT COUNT(p) FROM Person p"),
	@NamedQuery(name="Person.getCountByOrganization", query="SELECT COUNT(p) FROM Person p JOIN p.personOrganizationList po WHERE po.organization = :organization"),
	@NamedQuery(name = "Person.findByFIO", query = "SELECT P FROM Person P WHERE TRIM(LOWER(P.namePerson)) = TRIM(LOWER(:namePerson)) AND TRIM(LOWER(P.surnamePerson)) = TRIM(LOWER(:surnamePerson)) AND TRIM(LOWER(P.patronymicPerson)) = TRIM(LOWER(:patronymicPerson))")
})
@SequenceGenerator(name = "PERSON_GEN_ID", sequenceName = "PERSON_GEN_ID", allocationSize = 1, initialValue = 1)
public class Person {
	@Id
	@Column(name = "KEY_PERSON")
	@GeneratedValue(generator = "PERSON_GEN_ID", strategy = SEQUENCE)
	private int keyPerson;
	@Column(name = "NAME_PERSON")
	private String namePerson;
	@Column(name = "SURNAME_PERSON")
	private String surnamePerson;
	@Column(name = "PATRONYMIC_PERSON")
	private String patronymicPerson;
	@Column(name = "BIRTHDAY_PERSON")
	@Temporal(DATE)
	private Date birthdayPerson;
	
	@Embedded
	@AttributeOverrides({ 
		@AttributeOverride(name = "serialPassport", column = @Column(name = "SERIAL_PASSPORT_PERSON", table = "PERSON")), 
		@AttributeOverride(name = "numberPassport", column = @Column(name = "NUMBER_PASSPORT_PERSON", table = "PERSON")),
		@AttributeOverride(name = "issuePassport", column = @Column(name = "ISSUE_PASSPORT_PERSON", table = "PERSON")),
		@AttributeOverride(name = "issueDatePassport", column = @Column(name = "ISSUE_DATE_PASSPORT_PERSON", table = "PERSON")),
		@AttributeOverride(name = "registrationPassport", column = @Column(name = "REGISTRATION_POSSPORT_PERSON", table = "PERSON")) 
	})
	private Passport passport;
	@OneToMany(mappedBy = "person", orphanRemoval = true, cascade = ALL)
	private List<PersonEducation> personEducationList;
	
	@OneToMany(mappedBy = "person", orphanRemoval = true)
	private List<PersonDisability> personDisabilityList;
	
	@OneToMany(mappedBy = "person", orphanRemoval = true)
	private List<PersonOrganization> personOrganizationList;
	
	@OneToMany(mappedBy = "person", orphanRemoval = true)
	private List<PersonIncome> personIncomeList;
	
	@OneToMany(mappedBy = "person", orphanRemoval = true)
	private List<PersonProfession> personProfessionList;
	
	@OneToMany(mappedBy = "person", orphanRemoval = true, cascade = ALL)
	private List<PersonDocument> personDocumentList;
	
	public int getKeyPerson() {
		return keyPerson;
	}
	public void setKeyPerson(int keyPerson) {
		this.keyPerson = keyPerson;
	}
	public String getNamePerson() {
		return namePerson;
	}
	public void setNamePerson(String namePerson) {
		this.namePerson = namePerson;
	}
	public String getSurnamePerson() {
		return surnamePerson;
	}
	public void setSurnamePerson(String surnamePerson) {
		this.surnamePerson = surnamePerson;
	}
	public String getPatronymicPerson() {
		return patronymicPerson;
	}
	public void setPatronymicPerson(String patronymicPerson) {
		this.patronymicPerson = patronymicPerson;
	}
	public Date getBirthdayPerson() {
		return birthdayPerson;
	}
	public void setBirthdayPerson(Date birthdayPerson) {
		this.birthdayPerson = birthdayPerson;
	}
	public List<PersonEducation> getPersonEducationList() {
		return personEducationList;
	}
	public void setPersonEducationList(List<PersonEducation> personEducationList) {
		this.personEducationList = personEducationList;
	}
	public Passport getPassport() {
		return passport;
	}
	public void setPassport(Passport passport) {
		this.passport = passport;
	}
	public List<PersonOrganization> getPersonOrganizationList() {
		return personOrganizationList;
	}
	public void setPersonOrganizationList(List<PersonOrganization> personOrganizationList) {
		this.personOrganizationList = personOrganizationList;
	}
	public List<PersonDisability> getPersonDisabilityList() {
		return personDisabilityList;
	}
	public void setPersonDisabilityList(List<PersonDisability> personDisabilityList) {
		this.personDisabilityList = personDisabilityList;
	}
	public List<PersonIncome> getPersonIncomeList() {
		return personIncomeList;
	}
	public void setPersonIncomeList(List<PersonIncome> personIncomeList) {
		this.personIncomeList = personIncomeList;
	}
	public List<PersonProfession> getPersonProfessionList() {
		return personProfessionList;
	}
	public void setPersonProfessionList(List<PersonProfession> personProfessionList) {
		this.personProfessionList = personProfessionList;
	}
	public List<PersonDocument> getPersonDocumentList() {
		return personDocumentList;
	}
	public void setPersonDocumentList(List<PersonDocument> personDocumentList) {
		this.personDocumentList = personDocumentList;
	}
	public Person() {
		super();
		this.passport = new Passport();
		this.personOrganizationList = new ArrayList<PersonOrganization>();
	}
	public void removePersonEducation(PersonEducation personEducation)
	{
		this.personEducationList.remove(personEducation);
	}
	public void addPersonEducation(PersonEducation personEducation)
	{
		this.personEducationList.add(personEducation);
	}
}
