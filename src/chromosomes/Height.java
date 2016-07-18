package chromosomes;

public class Height extends Chromosome {
	
	protected boolean allele; //Stores a boolean variable to represent a dominant or recessive allele (true=dominant,false=recessive)
	
	/**
	 * 
	 * @param allele
	 */
	public Height(boolean allele) {
		super(allele);
	}

	/**
	 * 
	 * @return
	 */
	public boolean isAllele() {
		return allele;
	}

	public void setAllele(boolean allele) {
		this.allele = allele;
	}

	@Override
	public String toString() {
		return "Height [allele=" + allele + "]";
	}
	

}
