import java.util.List;

public class Car {
	private Long id;
	private  String name;
	private String model;
	private int makeYear;
	private String company;
	private int comfortLevel;
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(Long id, String name, String model, int makeYear, String company, int comfortLevel) {
		super();
		this.id = id;
		this.name = name;
		this.model = model;
		this.makeYear = makeYear;
		this.company = company;
		this.comfortLevel = comfortLevel;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getMakeYear() {
		return makeYear;
	}

	public void setMakeYear(int makeYear) {
		this.makeYear = makeYear;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getComfortLevel() {
		return comfortLevel;
	}

	public void setComfortLevel(int comfortLevel) {
		this.comfortLevel = comfortLevel;
	}
	
	public static Car findCar(Long carId, List<Car> carList) {
        for (Car car : carList) {
            if (car.getId().equals(carId)) {
                return car;
            }
        }
        return null; // Car not found
    }
	
	

}
