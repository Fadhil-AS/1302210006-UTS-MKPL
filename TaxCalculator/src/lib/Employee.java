package lib;

import java.time.LocalDate;
import java.time.Month;
import java.util.LinkedList;
import java.util.List;

public class Employee {
    private LocalDate joinedDate;
	private biodataEmployee joinedBiodata;
	private EmployeeInfo info; 
	private biodataEmployee bio;

	private Spouse spouse;
	private List<Child> anak;
	
	private String dataEmployee;

	public Employee(EmployeeInfo info, biodataEmployee bio) {
		this.joinedBiodata = new biodataEmployee(bio.getEmployeeId(), bio.getFirstName(), bio.getLastName(), bio.getIdNumber(), bio.getAddress(), bio.isGender(), bio.isForeigner());
        this.joinedDate = LocalDate.of(info.getYearJoined(), info.getMonthJoined(), info.getDayJoined());
		
		anak = new LinkedList<Child>();
	}
	
	/**
	 * Fungsi untuk menentukan gaji bulanan pegawai berdasarkan grade kepegawaiannya (grade 1: 3.000.000 per bulan, grade 2: 5.000.000 per bulan, grade 3: 7.000.000 per bulan)
	 * Jika pegawai adalah warga negara asing gaji bulanan diperbesar sebanyak 50%
	 */
	
	int monthlySalary = 0;

	public void setMonthlySalary(int grade) {	
		if (grade == 1) {
			monthlySalary = 3000000;
			if (bio.isForeigner()) {
				monthlySalary = (int) (3000000 * 1.5);
			}
		}else if (grade == 2) {
			monthlySalary = 5000000;
			if (bio.isForeigner()) {
				monthlySalary = (int) (3000000 * 1.5);
			}
		}else if (grade == 3) {
			monthlySalary = 7000000;
			if (bio.isForeigner()) {
				monthlySalary = (int) (3000000 * 1.5);
			}
		}
	}
	

	int annualDeductible = 0;
	public void setAnnualDeductible(int deductible) {	
		this.annualDeductible = deductible;
	}
	
	int otherMonthlyIncome = 0;
	public void setAdditionalIncome(int income) {	
		this.otherMonthlyIncome = income;
	}
	
	public void setSpouse(String spouseName, String spouseIdNumber) {
		this.spouse = new Spouse(spouseName, spouseIdNumber);
	}
	
	public void addChild(String childName, String childIdNumber) {
		anak.add(new Child(childName, childIdNumber));
	}
	
	public int getAnnualIncomeTax() {
		
		//Menghitung berapa lama pegawai bekerja dalam setahun ini, jika pegawai sudah bekerja dari tahun sebelumnya maka otomatis dianggap 12 bulan.
		LocalDate date = LocalDate.now();
		int monthWorkingInYear;

		if (date.getYear() == info.getYearJoined()) {
			monthWorkingInYear = date.getMonthValue() - info.getMonthJoined();
		}else {
			monthWorkingInYear = 12;
		}
		
		return TaxFunction.calculateTax(monthlySalary, otherMonthlyIncome, monthWorkingInYear, annualDeductible, spouse.getSpouseIdNumber().equals(""), anak.size());
	}
}
