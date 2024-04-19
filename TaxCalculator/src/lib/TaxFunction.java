package lib;

public class TaxFunction {

	/*
	 * Pajak penghasilan yang dibayarkan harus setahun.
	 * 
	 * Pajak yang dihitungkan 5% dari penghasilan bersih tahunan(gaji dan pemasukan bulanan lainnya dikalikan jumlah bulan bekerja dikurangi pemotongan) dikurangi penghasilan tidak kena pajak.
	 * 
	 * Keterangan pajak:
	 * Pegawai yang belum menikah dan belum punya anak maka tidak kena pajak penghasilan Rp 54.000.000,
	 * Pegawai sudah menikah maka tidak dikenakan pajak penghasilan ditambah Rp.4.500.000,
	 * Pegawai sudah memiliki anak tidak kena pajak penghasilan ditambah Rp 4.500.000/anak sampai dengan anak ketiga  
	 */
	
	public static int calculateTax(int monthlySalary, int otherMonthlyIncome, int numberOfMonthWorking, int deductible, boolean isMarried, int numberOfChildren) {
		
		validateNumberOfMonths(numberOfMonthWorking);
    	numberOfChildren = validateNumberOfChildren(numberOfChildren);

		int taxableIncome = calculateTaxableIncome(monthlySalary, otherMonthlyIncome, numberOfMonthWorking, deductible, isMarried, numberOfChildren);
    	int tax = (int) Math.round(0.05 * taxableIncome);

    	return Math.max(tax, 0);
			 
	}

	private static void validateNumberOfMonths(int numberOfMonthWorking) {
		if (numberOfMonthWorking > 12) {
			System.err.println("More than 12 month working per year");
		}
	}

	private static int validateNumberOfChildren(int numberOfChildren) {
		if (numberOfChildren > 3) {
			numberOfChildren = 3;
		}

		return numberOfChildren;
	}

	private static int calculateTaxableIncome(int monthlySalary, int otherMonthlyIncome, int numberOfMonthWorking, int deductible, boolean isMarried, int numberOfChildren) {
		int nonTaxableIncome = calculateNonTaxableIncome(isMarried, numberOfChildren);
	
		return ((monthlySalary + otherMonthlyIncome) * numberOfMonthWorking) - deductible - nonTaxableIncome;
	}

	private static int calculateNonTaxableIncome(boolean isMarried, int numberOfChildren) {
		int nonTaxableIncome = 54000000;
		if (isMarried) {
			nonTaxableIncome += 4500000;
		}
		nonTaxableIncome += numberOfChildren * 1500000;
		return nonTaxableIncome;
	}
}
