//import java.util.List;

public class MemberCar {
	
	    private Long id;
	    private Member member;
	    private Car car;
	    private String carRegistrationNumber;
	    private String carColor;

	    public MemberCar() {
	    }

	    public MemberCar(Long id, Member member, Car car, String carRegistrationNumber, String carColor) {
	        this.id = id;
	        this.member = member;
	        this.car = car;
	        this.carRegistrationNumber = carRegistrationNumber;
	        this.carColor = carColor;
	    }

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Member getMember() {
			return member;
		}

		public void setMember(Member member) {
			this.member = member;
		}

		public Car getCar() {
			return car;
		}

		public void setCar(Car car) {
			this.car = car;
		}

		public String getCarRegistrationNumber() {
			return carRegistrationNumber;
		}

		public void setCarRegistrationNumber(String carRegistrationNumber) {
			this.carRegistrationNumber = carRegistrationNumber;
		}

		public String getCarColor() {
			return carColor;
		}

		public void setCarColor(String carColor) {
			this.carColor = carColor;
		}

	//	public static Member findMember(Long memberId, List<Member> memberList) {
	     //   for (Member member : memberList) {
	       //     if (member.getId().equals(memberId)) {
	       //         return member;
	       //     }
	     //   }
	     //   return null; // Member with the specified ID was not found
	   // }
	
}
