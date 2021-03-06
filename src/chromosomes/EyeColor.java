package chromosomes;

public class EyeColor extends Chromosome {

	protected boolean allele; //Stores a boolean variable to represent a dominant or recessive allele (true=dominant,false=recessive)
	
	/**
	 * 
	 * @param allele :: true represents that this is a dominant allele
	 */
	public EyeColor(boolean allele) {
		super(allele);
	}

	/**
	 * 
	 * @return :: returns a boolean value representing a dominant (true) or reccessive (false) allele
	 */
	public boolean isAllele() {
		return allele;
	}

	public void setAllele(boolean allele) {
		this.allele = allele;
	}

	@Override
	public String toString() {
		return "EyeColor [allele=" + allele + "]";
	}
	
}
