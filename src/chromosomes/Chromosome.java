package chromosomes;

public abstract class Chromosome {
	
	protected boolean allele;
	
	public Chromosome(boolean allele) {
		this.allele = allele;
	}
	
	public abstract boolean isAllele();
	public abstract void setAllele(boolean allele);
	
	@Override
	public abstract String toString();
	
}
