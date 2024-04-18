package lib;

public class EmployeeInfo {
    private String employeeId;
	private String firstName;
	private String lastName;
	private String idNumber;
	private String address;
	
	private int yearJoined;
	private int monthJoined;
	private int dayJoined;
	private int monthWorkingInYear;
	
	private boolean isForeigner;
	private boolean gender; //true = Laki-laki, false = Perempuan
    public EmployeeInfo(String employeeId, String firstName, String lastName, String idNumber, String address,
            int yearJoined, int monthJoined, int dayJoined, int monthWorkingInYear, boolean isForeigner,
            boolean gender) {

        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.address = address;
        this.yearJoined = yearJoined;
        this.monthJoined = monthJoined;
        this.dayJoined = dayJoined;
        this.monthWorkingInYear = monthWorkingInYear;
        this.isForeigner = isForeigner;
        this.gender = gender;
    }
    
    public String getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
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

    public String getIdNumber() {
        return idNumber;
    }
    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public int getYearJoined() {
        return yearJoined;
    }
    public void setYearJoined(int yearJoined) {
        this.yearJoined = yearJoined;
    }

    public int getMonthJoined() {
        return monthJoined;
    }
    public void setMonthJoined(int monthJoined) {
        this.monthJoined = monthJoined;
    }

    public int getDayJoined() {
        return dayJoined;
    }
    public void setDayJoined(int dayJoined) {
        this.dayJoined = dayJoined;
    }

    public int getMonthWorkingInYear() {
        return monthWorkingInYear;
    }
    public void setMonthWorkingInYear(int monthWorkingInYear) {
        this.monthWorkingInYear = monthWorkingInYear;
    }

    public boolean isForeigner() {
        return isForeigner;
    }
    public void setForeigner(boolean isForeigner) {
        this.isForeigner = isForeigner;
    }
    
    public boolean isGender() {
        return gender;
    }
    public void setGender(boolean gender) {
        this.gender = gender;
    }

    
}
