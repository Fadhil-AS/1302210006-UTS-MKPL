package lib;

public class Spouse {
    private String spouseName;
	private String spouseIdNumber;
    
    public Spouse(String spouseName, String spouseIdNumber) {
        this.spouseName = spouseName;
        this.spouseIdNumber = spouseIdNumber;
    }
    public String getSpouseName() {
        return spouseName;
    }
    public void setSpouseName(String spouseName) {
        this.spouseName = spouseName;
    }
    public String getSpouseIdNumber() {
        return spouseIdNumber;
    }
    public void setSpouseIdNumber(String spouseIdNumber) {
        this.spouseIdNumber = spouseIdNumber;
    }

    
}
