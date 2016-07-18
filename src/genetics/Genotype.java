package genetics;

public class Genotype {
	
	
	protected InheritedGenes momsGenes;
	protected InheritedGenes dadsGenes;
	
	public Genotype(boolean gender) {
		this.momsGenes = new InheritedGenes(true);
		this.dadsGenes = new InheritedGenes(gender);
	}
	
	/**
	 * 
	 * @param genotype1
	 * @param genotype2
	 */
	public Genotype(InheritedGenes genotype1, InheritedGenes genotype2) {
		this.momsGenes = genotype1;
		this.dadsGenes = genotype2;
	}
	
	
	public InheritedGenes getMomsGenes() {
		return momsGenes;
	}
	public InheritedGenes getDadsGenes() {
		return dadsGenes;
	}

	
	public void setMomsGenes(InheritedGenes momsGenes) {
		this.momsGenes = momsGenes;
	}
	public void setDadsGenes(InheritedGenes dadsGenes) {
		this.dadsGenes = dadsGenes;
	}


	@Override
	public String toString() {
		return "Genotype [momsGenes=" + momsGenes + ", dadsGenes=" + dadsGenes + "]";
	}
	
	
}