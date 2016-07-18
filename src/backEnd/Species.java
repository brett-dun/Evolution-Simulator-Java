package backEnd;

import chromosomes.BloodType;
import chromosomes.ColorVision;
import chromosomes.EyeColor;
import chromosomes.Gender;
import chromosomes.HairColor;
import chromosomes.Hearing;
import chromosomes.Height;
import chromosomes.QualityOfVision;
import chromosomes.SkinColor;
import genetics.Genotype;
import genetics.InheritedGenes;
import genetics.Phenotype;

public class Species {
	
	//protected ArrayList<Chromosome> momsChromosomes;
	//protected ArrayList<Chromosome> dadsChromosomes;
	protected Genotype genotype;
	protected Phenotype phenotype;
	protected int age;
	protected int kids;
	protected int generation = 0;
	
	public Species(boolean gender) {
		this.genotype = new Genotype(gender);
		this.phenotype = new Phenotype(this.genotype);
		this.age = 0;
		this.kids = 0;
		this.generation = 0;
	}
	
	/**
	 * 
	 * @param genotype1
	 * @param genotype2
	 */
	public Species(InheritedGenes genotype1, InheritedGenes genotype2) {
		this.genotype = new Genotype(genotype1,genotype2);
		this.phenotype = new Phenotype(this.genotype);
		this.age = 0;
		this.kids = 0;
		this.generation = 0;
	}
	
	/**
	 * 
	 * @param genotype
	 */
	public Species(Genotype genotype) {
		this.genotype = genotype;
		this.phenotype = new Phenotype(genotype);
		this.age = 0;
		this.kids = 0;
		this.generation = 0;
	}
	
	/**
	 * 
	 * @param mom
	 * @param dad
	 */
	public Species(Species mom, Species dad) {
		
		Gender momGender, dadGender;
		HairColor momHairColor, dadHairColor;
		BloodType momBloodType, dadBloodType;
		Height momHeight, dadHeight;
		Hearing momHearing, dadHearing;
		
		ColorVision momColorVision, dadColorVision;
		QualityOfVision momQualityOfVision, dadQualityOfVision;
		EyeColor momEyeColor, dadEyeColor;
		SkinColor momSkinColor, dadSkinColor;
		
		if((int)(Math.random() * 2) == 1) {
			momGender = mom.getGenotype().getMomsGenes().getGender();
		} else {
			momGender = mom.getGenotype().getDadsGenes().getGender();
		}
		if((int)(Math.random() * 2) == 1) {
			momHairColor = mom.getGenotype().getMomsGenes().getHairColor();
		} else {
			momHairColor = mom.getGenotype().getDadsGenes().getHairColor();
		}
		if((int)(Math.random() * 2) == 1) {
			momBloodType = mom.getGenotype().getMomsGenes().getBloodType();
		} else {
			momBloodType = mom.getGenotype().getDadsGenes().getBloodType();
		}
		if((int)(Math.random() * 2) == 1) {
			momHeight = mom.getGenotype().getMomsGenes().getHeight();
		} else {
			momHeight = mom.getGenotype().getDadsGenes().getHeight();
		}
		if((int)(Math.random() * 2) == 1) {
			momHearing = mom.getGenotype().getMomsGenes().getHearing();
		} else {
			momHearing = mom.getGenotype().getDadsGenes().getHearing();
		}
		if((int)(Math.random() * 2) == 1) {
			momColorVision = mom.getGenotype().getMomsGenes().getColorVision();
		} else {
			momColorVision = mom.getGenotype().getDadsGenes().getColorVision();
		}
		if((int)(Math.random() * 2) == 1) {
			momQualityOfVision = mom.getGenotype().getMomsGenes().getQualityOfVision();
		} else {
			momQualityOfVision = mom.getGenotype().getDadsGenes().getQualityOfVision();
		}
		if((int)(Math.random() * 2) == 1) {
			momEyeColor = mom.getGenotype().getMomsGenes().getEyeColor();
		} else {
			momEyeColor = mom.getGenotype().getDadsGenes().getEyeColor();
		}
		if((int)(Math.random() * 2) == 1) {
			momSkinColor = mom.getGenotype().getMomsGenes().getSkinColor();
		} else {
			momSkinColor = mom.getGenotype().getDadsGenes().getSkinColor();
		}
		
		
		if((int)(Math.random() * 2) == 1) {
			dadGender = dad.getGenotype().getMomsGenes().getGender();
		} else {
			dadGender = dad.getGenotype().getDadsGenes().getGender();
		}
		if((int)(Math.random() * 2) == 1) {
			dadHairColor = dad.getGenotype().getMomsGenes().getHairColor();
		} else {
			dadHairColor = dad.getGenotype().getDadsGenes().getHairColor();
		}
		if((int)(Math.random() * 2) == 1) {
			dadBloodType = dad.getGenotype().getMomsGenes().getBloodType();
		} else {
			dadBloodType = dad.getGenotype().getDadsGenes().getBloodType();
		}
		if((int)(Math.random() * 2) == 1) {
			dadHeight = dad.getGenotype().getMomsGenes().getHeight();
		} else {
			dadHeight = dad.getGenotype().getDadsGenes().getHeight();
		}
		if((int)(Math.random() * 2) == 1) {
			dadHearing = dad.getGenotype().getMomsGenes().getHearing();
		} else {
			dadHearing = dad.getGenotype().getDadsGenes().getHearing();
		}
		if((int)(Math.random() * 2) == 1) {
			dadColorVision = dad.getGenotype().getMomsGenes().getColorVision();
		} else {
			dadColorVision = dad.getGenotype().getDadsGenes().getColorVision();
		}
		if((int)(Math.random() * 2) == 1) {
			dadQualityOfVision = dad.getGenotype().getMomsGenes().getQualityOfVision();
		} else {
			dadQualityOfVision = dad.getGenotype().getDadsGenes().getQualityOfVision();
		}
		if((int)(Math.random() * 2) == 1) {
			dadEyeColor = dad.getGenotype().getMomsGenes().getEyeColor();
		} else {
			dadEyeColor = dad.getGenotype().getDadsGenes().getEyeColor();
		}
		if((int)(Math.random() * 2) == 1) {
			dadSkinColor = dad.getGenotype().getMomsGenes().getSkinColor();
		} else {
			dadSkinColor = dad.getGenotype().getDadsGenes().getSkinColor();
		}
		
		InheritedGenes momsGenes = new InheritedGenes(momGender,momHairColor,momBloodType,momHeight,momHearing,momColorVision,momQualityOfVision,momEyeColor,momSkinColor);
		InheritedGenes dadsGenes = new InheritedGenes(dadGender,dadHairColor,dadBloodType,dadHeight,dadHearing,dadColorVision,dadQualityOfVision,dadEyeColor,dadSkinColor);
		this.genotype = new Genotype(momsGenes,dadsGenes);
		
		this.phenotype = new Phenotype(this.genotype);
		this.age = 0;
		this.kids = 0;
		this.generation = mom.getGeneration() + 1;
	}
	
	/**
	 * 
	 * @param species
	 */
	public Species(Species species) {
		this.genotype = species.getGenotype();
		this.phenotype = new Phenotype(this.genotype);
		this.age = 0;
		this.kids = 0;
		this.generation = species.getGeneration();
	}
	
	public Genotype getGenotype() {
		return genotype;
	}
	public Phenotype getPhenotype() {
		return phenotype;
	}
	public int getAge() {
		return age;
	}
	public int getKids() {
		return kids;
	}
	public int getGeneration() {
		return generation;
	}
	
	public void age() {
		this.age++;
		//System.out.println(this.age); //For testing
	}

	
	public boolean isFemale() {
		return this.genotype.getDadsGenes().getGender().isAllele();
	}

	
	@Override
	public String toString() {
		return "Species [genotype=" + genotype + ", phenotype=" + phenotype + ", age=" + age + "]";
	}
	
	
}
