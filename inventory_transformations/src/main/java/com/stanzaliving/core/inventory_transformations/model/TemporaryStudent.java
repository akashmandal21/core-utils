package com.stanzaliving.core.inventory_transformations.model;

import com.stanzaliving.inventory.converter.JsonToMapConverter;
import com.stanzaliving.inventory.util.Constants;
import org.apache.commons.lang3.StringUtils;

import java.util.*;

@Entity
@Table(name = "TEMPORARY_STUDENT")
public class TemporaryStudent {
	
	@Id
	@GeneratedValue
	@Column(name = "TEMPORARY_STUDENT_ID")
	private int temporaryStudentId;
	
	@OneToMany(mappedBy = "temporaryStudent", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<Booking> booking = new HashSet<>(0);
	
	@OneToOne(fetch = FetchType.LAZY, optional=true)
	@JoinColumn(name = "INVENTORY_ID")
	private Inventory inventory;
	
	@Column(name = "FIRST_NAME")
	private String firstName;

	@Column(name = "LAST_NAME")
	private String lastName;

	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "PHONE")
	private String phone;

	@Column(name = "DATE_OF_BIRTH")
	private Date dateOfBirth;
	
	@ManyToOne(fetch = FetchType.EAGER, optional=true)
	@JoinColumn(name = "HOME_TOWN")
	private City homeTown;
	
	@Column(name = "PROFESSION")
	private Profession profession;
	
	@ManyToOne(fetch = FetchType.EAGER, optional=true)
	@JoinColumn(name="EDUCATIONAL_INSTITUTION_ID")
	private EducationalInstitution educationalInstitution;
	
	@ManyToOne(fetch = FetchType.EAGER, optional=true)
	@JoinColumn(name="DEGREE_ID")
	private Degree degree;
	
	@ManyToOne(fetch = FetchType.EAGER, optional=true)
	@JoinColumn(name="COURSE_ID")
	private Course course;
	
	@Column(name = "YEAR")
	private int year;
	
	@Column(name = "COACHING_CENTER")
	private String coachingCenter;
	
	@Column(name = "COMPANY_NAME")
	private String companyName;
	
	@Column(name = "DESIGNATION")
	private String designation;

	@Column(name="GENDER")
	private Gender gender;
	
	@Column(name="FOOD_PREFERENCE")
	private FoodPreference foodPreference;
	
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL, optional=true)
	@JoinColumn(name="STUDENT_ADDRESS_ID")
	private Address address;
	
	@Column(name = "BLOOD_GROUP")
	private BloodGroup bloodGroup;
	
	@Column(name = "MEDICAL_CONDITIONS")
	private String medicalConditions;
	
	@Column(name = "PRIMARY_GUARDIAN_RELATION_TO_STUDENT")
	private String primaryGuardianRelationToStudent;

	@Column(name = "PRIMARY_GUARDIAN_NAME")
	private String primaryGuardianName;

	@Column(name = "PRIMARY_GUARDIAN_MOBILE")
	private String primaryGuardianMobile;

	@Column(name = "PRIMARY_GUARDIAN_EMAIL")
	private String primaryGuardianEmail;
	
	@Column(name = "ADDITIONAL_CONTACT_RELATION_TO_STUDENT")
	private String additionalContactRelationToStudent;

	@Column(name = "ADDITIONAL_CONTACT_NAME")
	private String additionalContactName;

	@Column(name = "ADDITIONAL_CONTACT_MOBILE")
	private String additionalContactMobile;

	@Column(name = "ADDITIONAL_CONTACT_EMAIL")
	private String additionalContactEmail;

	@Column(name = "LOCAL_GUARDIAN_RELATION_TO_STUDENT")
	private String localGuardianRelationToStudent;
	
	@Column(name = "LOCAL_GUARDIAN_NAME")
	private String localGuardianName;

	@Column(name = "LOCAL_GUARDIAN_MOBILE")
	private String localGuardianMobile;

	@Column(name = "QR_LINK")
	private String qrLink;
	
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL, optional=true)
	@JoinColumn(name = "LOCAL_GUARDIAN_ADDRESS_ID")
	private Address localGuardianAddress;
	
	@Column(name = "CREATED", nullable = false)
	private Date created = new Date();

	@Column(name = "UPDATED", nullable = false)
	private Date updated = new Date();
	
	@ManyToOne(fetch = FetchType.EAGER, optional = true)
	@JoinColumn(name = "INSTITUTION_ID")
	private Institution institution;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = true)
	@JoinColumn(name = "COUNTRY_ID")
	private Country country;

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	@Convert(converter = JsonToMapConverter.class)
	private Map<String, Object> metadata  = new HashMap<>();

	public int getTemporaryStudentId() {
		return temporaryStudentId;
	}

	public void setTemporaryStudentId(int temporaryStudentId) {
		this.temporaryStudentId = temporaryStudentId;
	}
	
	public Booking getBooking() {
		List<Booking> bookings = new ArrayList<>(booking);
		Collections.sort(bookings, Collections.reverseOrder());
		return bookings.stream().filter(Booking::getInProgress).findFirst().orElse(bookings.get(0));
	}

	public void setBooking(Booking booking) {
		Set<Booking> bookings = new HashSet<>();
		bookings.add(booking);
		this.booking = bookings;
	}

	public Inventory getInventory() {
		return inventory;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public City getHomeTown() {
		return homeTown;
	}

	public void setHomeTown(City homeTown) {
		this.homeTown = homeTown;
	}

	public Profession getProfession() {
		return profession;
	}

	public void setProfession(Profession profession) {
		this.profession = profession;
	}

	public EducationalInstitution getEducationalInstitution() {
		return educationalInstitution;
	}

	public void setEducationalInstitution(EducationalInstitution educationalInstitution) {
		this.educationalInstitution = educationalInstitution;
	}

	public Degree getDegree() {
		return degree;
	}

	public void setDegree(Degree degree) {
		this.degree = degree;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getCoachingCenter() {
		return coachingCenter;
	}

	public void setCoachingCenter(String coachingCenter) {
		this.coachingCenter = coachingCenter;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public BloodGroup getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(BloodGroup bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getMedicalConditions() {
		return medicalConditions;
	}

	public void setMedicalConditions(String medicalConditions) {
		this.medicalConditions = medicalConditions;
	}

	public String getPrimaryGuardianRelationToStudent() {
		return primaryGuardianRelationToStudent;
	}

	public void setPrimaryGuardianRelationToStudent(String primaryGuardianRelationToStudent) {
		this.primaryGuardianRelationToStudent = primaryGuardianRelationToStudent;
	}

	public String getPrimaryGuardianName() {
		return primaryGuardianName;
	}

	public void setPrimaryGuardianName(String primaryGuardianName) {
		this.primaryGuardianName = primaryGuardianName;
	}

	public String getPrimaryGuardianMobile() {
		return primaryGuardianMobile;
	}

	public void setPrimaryGuardianMobile(String primaryGuardianMobile) {
		this.primaryGuardianMobile = primaryGuardianMobile;
	}

	public String getPrimaryGuardianEmail() {
		return StringUtils.isEmpty(primaryGuardianEmail) ? Constants.STELLO_WORKINGPROFESSIONAL_EMAIL : primaryGuardianEmail;
	}

	public void setPrimaryGuardianEmail(String primaryGuardianEmail) {
		this.primaryGuardianEmail = primaryGuardianEmail;
	}

	public String getAdditionalContactRelationToStudent() {
		return additionalContactRelationToStudent;
	}

	public void setAdditionalContactRelationToStudent(String additionalContactRelationToStudent) {
		this.additionalContactRelationToStudent = additionalContactRelationToStudent;
	}

	public String getAdditionalContactName() {
		return additionalContactName;
	}

	public void setAdditionalContactName(String additionalContactName) {
		this.additionalContactName = additionalContactName;
	}

	public String getAdditionalContactMobile() {
		return additionalContactMobile;
	}

	public void setAdditionalContactMobile(String additionalContactMobile) {
		this.additionalContactMobile = additionalContactMobile;
	}

	public String getAdditionalContactEmail() {
		return additionalContactEmail;
	}

	public void setAdditionalContactEmail(String additionalContactEmail) {
		this.additionalContactEmail = additionalContactEmail;
	}

	public String getLocalGuardianRelationToStudent() {
		return localGuardianRelationToStudent;
	}

	public void setLocalGuardianRelationToStudent(String localGuardianRelationToStudent) {
		this.localGuardianRelationToStudent = localGuardianRelationToStudent;
	}

	public String getLocalGuardianName() {
		return localGuardianName;
	}

	public void setLocalGuardianName(String localGuardianName) {
		this.localGuardianName = localGuardianName;
	}

	public String getLocalGuardianMobile() {
		return localGuardianMobile;
	}

	public void setLocalGuardianMobile(String localGuardianMobile) {
		this.localGuardianMobile = localGuardianMobile;
	}

	public Address getLocalGuardianAddress() {
		return localGuardianAddress;
	}

	public void setLocalGuardianAddress(Address localGuardianAddress) {
		this.localGuardianAddress = localGuardianAddress;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	public FoodPreference getFoodPreference() {
		return foodPreference;
	}

	public void setFoodPreference(FoodPreference foodPreference) {
		this.foodPreference = foodPreference;
	}

	public String getQrLink() {
		return qrLink;
	}

	public void setQrLink(String qrLink) {
		this.qrLink = qrLink;
	}

	public Institution getInstitution() {
		return institution;
	}

	public void setInstitution(Institution institution) {
		this.institution = institution;
	}

	public String getFullName() {
		return getFirstName() + " " + (StringUtils.isNotEmpty(getLastName()) ? getLastName() : "");
	}

	public Map<String, Object> getMetadata() {
		return metadata;
	}

	public void setMetadata(Map<String, Object> metadata) {
		this.metadata = metadata;
	}
}