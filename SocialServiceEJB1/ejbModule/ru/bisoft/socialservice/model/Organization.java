package ru.bisoft.socialservice.model;

import static javax.persistence.GenerationType.SEQUENCE;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.NamedQuery;
import javax.persistence.NamedQueries;

@Entity
@SequenceGenerator(name = "organization_seq", sequenceName = "organization_seq", allocationSize = 1)
@NamedQueries({ 
	@NamedQuery(name = "Organization.findByName", query = "SELECT O FROM Organization O WHERE TRIM(LOWER(O.nameOrganization)) = TRIM(LOWER(:nameOrganization))"), 
	@NamedQuery(name = "Organization.findByINN", query = "SELECT O FROM Organization O WHERE TRIM(O.innOrganization) = TRIM(:innOrganization)") 
})
public class Organization {
	
	@Column(name = "FULL_NAME_ORGANIZATION")
	private String fullNameOrganization;
	
	@Column(name = "INN_ORGANIZATION")
	private String innOrganization;
	
	@Id
	@GeneratedValue(generator = "organization_seq", strategy = SEQUENCE)
	@Column(name = "KEY_ORGANIZATION")
	private int keyOrganization;
	
	@Column(name = "NAME_ORGANIZATION")
	private String nameOrganization;

	@OneToMany(mappedBy = "organization")
	private List<PersonOrganization> personOrganizations;
	
	@Column(name = "REQUEST_TEMPLATE_ORGANIZATION")
	@Lob
	private String requestTemplateOrganization;
	
	@Column(name = "CONTRACT_TEMPLATE_ORGANIZATION")
	@Lob
	private String contractTemplateOrganization;
	
	@Column(name = "ACT_TEMPLATE_ORGANIZATION")
	@Lob
	private String actTemplateOrganization;
	
	@Column(name = "LOCALITY_ORGANIZATION")
	private String localityOrganization;
	
	@Column(name = "ADDRESS_ORGANIZATION")
	private String addressOrganization;
	
	@Column(name = "DIRECTOR_ORGANIZATION")
	private String directorOrganization;
	
	@OneToMany(mappedBy = "organization")
	private List<Employee> employees;
	
	public Organization() {
		super();
	}

	public String getFullNameOrganization() {
		return fullNameOrganization;
	}

	public void setFullNameOrganization(String fullNameOrganization) {
		this.fullNameOrganization = fullNameOrganization;
	}

	public String getInnOrganization() {
		return innOrganization;
	}

	public void setInnOrganization(String innOrganization) {
		this.innOrganization = innOrganization;
	}

	public int getKeyOrganization() {
		return keyOrganization;
	}

	public void setKeyOrganization(int keyOrganization) {
		this.keyOrganization = keyOrganization;
	}

	public String getNameOrganization() {
		return nameOrganization;
	}

	public void setNameOrganization(String nameOrganization) {
		this.nameOrganization = nameOrganization;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public List<PersonOrganization> getPersonOrganizations() {
		return personOrganizations;
	}

	public void setPersonOrganizations(List<PersonOrganization> personOrganizations) {
		this.personOrganizations = personOrganizations;
	}

	@Override
	public String toString() {
		return nameOrganization;
	}

	public String getRequestTemplateOrganization() {
		return requestTemplateOrganization;
	}

	public void setRequestTemplateOrganization(String requestTemplateOrganization) {
		this.requestTemplateOrganization = requestTemplateOrganization;
	}

	public String getContractTemplateOrganization() {
		return contractTemplateOrganization;
	}

	public void setContractTemplateOrganization(String contractTemplateOrganization) {
		this.contractTemplateOrganization = contractTemplateOrganization;
	}

	public String getLocalityOrganization() {
		return localityOrganization;
	}

	public void setLocalityOrganization(String localityOrganization) {
		this.localityOrganization = localityOrganization;
	}

	public String getAddressOrganization() {
		return addressOrganization;
	}

	public void setAddressOrganization(String addressOrganization) {
		this.addressOrganization = addressOrganization;
	}

	public String getDirectorOrganization() {
		return directorOrganization;
	}

	public void setDirectorOrganization(String directorOrganization) {
		this.directorOrganization = directorOrganization;
	}

	public String getActTemplateOrganization() {
		return actTemplateOrganization;
	}

	public void setActTemplateOrganization(String actTemplateOrganization) {
		this.actTemplateOrganization = actTemplateOrganization;
	}
}
