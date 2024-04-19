package lib;

public class Child {
    private String childNames;
	private String childIdNumbers;
    
    public Child(String childNames, String childIdNumbers) {
        this.childNames = childNames;
        this.childIdNumbers = childIdNumbers;
    }
    public String getChildNames() {
        return childNames;
    }
    public void setChildNames(String childNames) {
        this.childNames = childNames;
    }
    public String getChildIdNumbers() {
        return childIdNumbers;
    }
    public void setChildIdNumbers(String childIdNumbers) {
        this.childIdNumbers = childIdNumbers;
    }

    
}
