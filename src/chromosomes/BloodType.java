package chromosomes;

public class BloodType {
	
	protected String allele; //Stores a String variable to represent an allele
	
	/**
	 * 
	 * @param allele
	 */
	public BloodType (String allele) {
		this.allele = allele;
	}

	/**
	 * 
	 * @return
	 */
	public String getAllele() {
		return allele;
	}

	/**
	 * 
	 * @param allele
	 */
	public void setAllele(String allele) {
		this.allele = allele;
	}

	
	public String toString() {
		return "BloodType [allele=" + allele + "]";
	}
	
}
