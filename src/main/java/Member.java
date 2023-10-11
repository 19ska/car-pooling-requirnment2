//package assignment;

//import assignment.Member;

import java.util.List;

public class Member {
	private Long id;
	private String firstName;
	private String lastName;
	private String email;
	private String contactNumber;
	private String licenseNumber;
	private String licenseStartDate;
	private String licenseExpiryDate;
	
	
	public Member() {
		
		
	}
	
	public Member(Long id, String firstName, String lastName, String email,
			String contactNumber, String licenseNumber, String licenseStartDate,
			String licenseExpiryDate) {
		this.id=id;
		this.firstName=firstName;
		this.lastName=lastName;
		this.email=email;
		this.contactNumber=contactNumber;
		this.licenseNumber=licenseNumber;
		this.licenseStartDate=licenseStartDate;
		this.licenseExpiryDate=licenseExpiryDate;
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getLicenseNumber() {
		return licenseNumber;
	}
	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}
	public String getLiscenseStartDate() {
		return licenseStartDate;
	}
	public void setLiscenseStartDate(String liscenseStartDate) {
		this.licenseStartDate = liscenseStartDate;
	}
	public String getLicenseExpiryDate() {
		return licenseExpiryDate;
	}
	public void setLicenseExpiryDate(String licenseExpiryDate) {
		this.licenseExpiryDate = licenseExpiryDate;
	}
	
	//public String toString() {
		
		//return "Menber: " +firstName +" " +lastName + "\nMember contact number" +contactNumber
		//		+ "," +email;
	//}
	//public boolean isSameMember(Member otherMember) {
	    // Check if email and contactNumber are both not null and case-insensitive equal
	 //   return this.email != null && otherMember.email != null &&
	      //     this.email.equalsIgnoreCase(otherMember.email) &&
	       //    this.contactNumber != null && otherMember.contactNumber != null &&
	       //    this.contactNumber.equalsIgnoreCase(otherMember.contactNumber);
	//}

	public static Member findMember(Long memberId, List<Member> memberList) {
        for (Member member : memberList) {
            if (member.getId().equals(memberId)) {
                return member;
            }
        }
        return null; // Member with the specified ID was not found
    }


}