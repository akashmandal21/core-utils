package com.stanzaliving.core.inventory_transformations.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.*;

@Entity
@Table(name = "STUDENT")
public class Student {

	public Student () {
		
	}

	public Student(String studentId) {
		this.studentId = studentId;
	}

	@Id
	@Column(name = "STUDENT_ID")
	@Access(AccessType.PROPERTY)
	public String studentId;

	@OneToMany(mappedBy = "student", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<Booking> booking = new HashSet<>(0);

	@OneToOne(fetch = FetchType.EAGER, optional = true, cascade = CascadeType.ALL)
	@JoinColumn(name = "INVENTORY_ID")
	private Inventory inventory;

	@Column(name = "FIRST_NAME", nullable = false)
	private String firstName;

	@Column(name = "LAST_NAME", nullable = false)
	private String lastName;

	@Column(name = "EMAIL", nullable = false)
	private String email;

	@Column(name = "PHONE", nullable = false)
	private String phone;

	@Column(name = "DATE_OF_BIRTH", nullable = false)
	private Date dateOfBirth;

	@ManyToOne(fetch = FetchType.EAGER, optional = true)
	@JoinColumn(name = "HOME_TOWN")
	private City homeTown;

	@Column(name = "PROFESSION")
	private Profession profession;

	@ManyToOne(fetch = FetchType.EAGER, optional = true)
	@JoinColumn(name = "EDUCATIONAL_INSTITUTION_ID")
	private EducationalInstitution educationalInstitution;

	@ManyToOne(fetch = FetchType.EAGER, optional = true)
	@JoinColumn(name = "DEGREE_ID")
	private Degree degree;

	@ManyToOne(fetch = FetchType.EAGER, optional = true)
	@JoinColumn(name = "COURSE_ID")
	private Course course;

	@Column(name = "YEAR")
	private int year;

	@Column(name = "COACHING_CENTER")
	private String coachingCenter;

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	@Column(name = "COMPANY_NAME")
	private String companyName;

	@Column(name = "DESIGNATION")
	private String designation;

	@Column(name = "GENDER", nullable = false)
	private Gender gender;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = true)
	@JoinColumn(name = "COUNTRY_ID")
	private Country country;

	@Column(name = "FOOD_PREFERENCE", nullable = false)
	private FoodPreference foodPreference;

	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL, optional = true)
	@JoinColumn(name = "STUDENT_ADDRESS_ID")
	private Address address;

	@ManyToOne(fetch = FetchType.LAZY, optional = true)
	@JoinColumn(name = "INSTITUTION_ID")
	private Institution institution;

	@Column(name = "BLOOD_GROUP")
	private BloodGroup bloodGroup;

	@Column(name = "MEDICAL_CONDITIONS")
	private String medicalConditions;

	@Column(name = "QR_LINK")
	private String qrLink;

	@Column(name = "AGREEMENT_URL")
	private String agreementUrl;

	@Column(name = "AGREEMENT_DOCUMENT_ID")
	private String agreementDocumentId;

	@Column(name = "ADDENDUM_URL")
	private String addendumUrl;

	@Column(name = "ADDENDUM_DOCUMENT_ID")
	private String addendumDocumentId;

	@Column(name = "VA_NUMBER")
	private String vaNumber;

	@OneToOne(mappedBy = "student", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER, optional = true)
	private StudentLocalGuardian localGuardian;

	@OneToOne(mappedBy = "student", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER, optional = true)
	private StudentPrimaryGuardian primaryGuardian;

	@OneToOne(mappedBy = "student", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER, optional = true)
	private StudentAdditionalContact additionalContact;

//	@OneToOne(mappedBy = "student", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER, optional = true)
//	private StudentOnboardingDetails onboardingDetails;
//	
	@JsonManagedReference
	@OneToOne(mappedBy = "student", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER, optional = true)
	private StudentVerification studentVerification;

	@Column(name = "CREATED", nullable = false)
	private Date created = new Date();

	@Column(name = "UPDATED", nullable = false)
	private Date updated = new Date();

	@Column(name = "IMAGE")
	private String image;
	
	@Column(name = "UUID")
	private String uuid;
	
	@Column(name = "STUDENT_QR_CODE")
	private String studentQrCode;
	
	public StudentVerification getStudentVerification() {
		return studentVerification;
	}

	public void setStudentVerification(StudentVerification studentVerification) {
		this.studentVerification = studentVerification;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public Booking getBooking(Boolean getNewestBooking) {
		return booking.stream().filter(Booking::getInProgress).findFirst().orElse(null);
	}

	public Booking getBooking() {
		List<Booking> bookingList = new ArrayList<>(booking);
		Collections.sort(bookingList);
		if(CollectionUtils.isEmpty(bookingList)){
			return null;
		}
		return bookingList.stream().filter(booking -> (booking.getHasMovedIn() || booking.getInProgress())).findAny().orElse(bookingList.get(0));
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

	public Institution getInstitution() {
		return institution;
	}

	public void setInstitution(Institution institution) {
		this.institution = institution;
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

	public StudentLocalGuardian getLocalGuardian() {
		return localGuardian;
	}

	public void setLocalGuardian(StudentLocalGuardian localGuardian) {
		this.localGuardian = localGuardian;
	}

	public StudentPrimaryGuardian getPrimaryGuardian() {
		return primaryGuardian;
	}

	public void setPrimaryGuardian(StudentPrimaryGuardian primaryGuardian) {
		this.primaryGuardian = primaryGuardian;
	}

	public StudentAdditionalContact getAdditionalContact() {
		return additionalContact;
	}

	public void setAdditionalContact(StudentAdditionalContact additionalContact) {
		this.additionalContact = additionalContact;
	}

	public FoodPreference getFoodPreference() {
		return foodPreference;
	}

	public void setFoodPreference(FoodPreference foodPreference) {
		this.foodPreference = foodPreference;
	}

//	public StudentOnboardingDetails getOnboardingDetails() {
//		return onboardingDetails;
//	}
//
//	public void setOnboardingDetails(StudentOnboardingDetails onboardingDetails) {
//		this.onboardingDetails = onboardingDetails;
//	}

	public String getQrLink() {
		return qrLink;
	}

	public void setQrLink(String qrLink) {
		this.qrLink = qrLink;
	}

	public String getAgreementUrl() {
		return agreementUrl;
	}

	public void setAgreementUrl(String agreementUrl) {
		this.agreementUrl = agreementUrl;
	}

	public String getAgreementDocumentId() {
		return agreementDocumentId;
	}

	public void setAgreementDocumentId(String agreementDocumentId) {
		this.agreementDocumentId = agreementDocumentId;
	}

	public String getAddendumUrl() {
		return addendumUrl;
	}

	public void setAddendumUrl(String addendumUrl) {
		this.addendumUrl = addendumUrl;
	}

	public String getAddendumDocumentId() {
		return addendumDocumentId;
	}

	public void setAddendumDocumentId(String addendumDocumentId) {
		this.addendumDocumentId = addendumDocumentId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((studentId == null) ? 0 : studentId.hashCode());
		return result;
	}

	public String getVaNumber() {
		return vaNumber;
	}

	public void setVaNumber(String vaNumber) {
		this.vaNumber = vaNumber;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getFullName() {
		return getFirstName() + " " + (StringUtils.isNotEmpty(getLastName()) ? getLastName() : "");
	}
	
	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getStudentQrCode() {
		return studentQrCode;
	}

	public void setStudentQrCode(String studentQrCode) {
		this.studentQrCode = studentQrCode;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Student))
			return false;
		Student other = (Student) obj;
		if (studentId == null) {
			if (other.studentId != null)
				return false;
		} else if (!studentId.equals(other.studentId))
			return false;
		return true;
	}

}