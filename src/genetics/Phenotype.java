package genetics;

public class Phenotype {
	
	protected boolean female, hearing, colorVision;
	protected int hairColor, bloodType, height, qualityOfVision, eyeColor, skinColor;
	
	/**
	 * 
	 * @param genotype1
	 * @param genotype2
	 */
	public Phenotype(Genotype genotype) {
		
		//this.eyeColor = 1;
		
		if(genotype.getMomsGenes().getGender().isAllele() && genotype.getDadsGenes().getGender().isAllele()) {
			this.female = true; //Female
		} else {
			this.female = false; //Male
		}
		
		if(genotype.getMomsGenes().getHairColor().isAllele() && genotype.getDadsGenes().getHairColor().isAllele()) {
			this.hairColor = 0; //Black
		} else if(genotype.getMomsGenes().getHairColor().isAllele() || genotype.getDadsGenes().getHairColor().isAllele()) {
			this.hairColor = 1; //Brown
		} else {
			this.hairColor = 2; //Blond
		}
		
		//Test
		if((genotype.getMomsGenes().getBloodType().getAllele().equals("A") && !genotype.getDadsGenes().getBloodType().getAllele().equals("B")) || (genotype.getDadsGenes().getBloodType().getAllele().equals("A") && !genotype.getMomsGenes().getBloodType().getAllele().equals("B"))) {
			this.bloodType = 0; //A
		} else if ((genotype.getMomsGenes().getBloodType().getAllele().equals("B") && !genotype.getDadsGenes().getBloodType().getAllele().equals("A")) || (genotype.getDadsGenes().getBloodType().getAllele().equals("B") && !genotype.getMomsGenes().getBloodType().getAllele().equals("A"))) {
			this.bloodType = 1; //B
		} else if ((genotype.getMomsGenes().getBloodType().getAllele().equals("A") && genotype.getDadsGenes().getBloodType().getAllele().equals("B")) || (genotype.getDadsGenes().getBloodType().getAllele().equals("A") && genotype.getMomsGenes().getBloodType().getAllele().equals("B"))) {
			this.bloodType = 2; //AB
		} else {
			this.bloodType = 3; //c
		}
		
		if(genotype.getMomsGenes().getHeight().isAllele() && genotype.getDadsGenes().getHeight().isAllele()) {
			this.height = 0; //Tall
		} else if(genotype.getMomsGenes().getHeight().isAllele() || genotype.getDadsGenes().getHeight().isAllele()) {
			this.height = 1; //Medium
		} else {
			this.height = 2; //Short
		}
		
		if(genotype.getMomsGenes().getHearing().isAllele() || genotype.getDadsGenes().getHearing().isAllele()) {
			this.hearing = true; //Regular
		} else {
			this.hearing = false; //Deaf
		}
		
		if(genotype.getMomsGenes().getColorVision().isAllele() || genotype.getDadsGenes().getColorVision().isAllele()) {
			this.colorVision = true; 
		} else {
			this.colorVision = false;
		}
		
		if(genotype.getMomsGenes().getQualityOfVision().isAllele() && genotype.getDadsGenes().getQualityOfVision().isAllele()) {
			this.qualityOfVision = 0; //Good Vision
		} else if(genotype.getMomsGenes().getQualityOfVision().isAllele() || genotype.getDadsGenes().getQualityOfVision().isAllele()) {
			this.qualityOfVision = 1; //Medium Vision
		} else {
			this.qualityOfVision = 2; //Bad Vision
		}
		
		if(genotype.getMomsGenes().getEyeColor().isAllele() && genotype.getDadsGenes().getEyeColor().isAllele()) {
			this.eyeColor = 0; //Brown
		} else if(genotype.getMomsGenes().getEyeColor().isAllele() || genotype.getDadsGenes().getEyeColor().isAllele()) {
			this.eyeColor = 1; //Green
		} else {
			this.eyeColor = 2; //Blue
		}
		
		if(genotype.getMomsGenes().getSkinColor().isAllele() && genotype.getDadsGenes().getSkinColor().isAllele()) {
			this.skinColor = 0; //Black
		} else if(genotype.getMomsGenes().getSkinColor().isAllele() || genotype.getDadsGenes().getSkinColor().isAllele()) {
			this.skinColor = 1; //Brown
		} else {
			this.skinColor = 2; //White
		}
		
	}


	public boolean isFemale() {
		return female;
	}
	public int getHairColor() {
		return hairColor;
	}
	public int getBloodType() {
		return bloodType;
	}
	public int getHeight() {
		return height;
	}
	public boolean isHearing() {
		return hearing;
	}
	public boolean isColorVision() {
		return colorVision;
	}
	public int getQualityOfVision() {
		return qualityOfVision;
	}
	public int getEyeColor() {
		return eyeColor;
	}
	public int getSkinColor() {
		return skinColor;
	}


	@Override
	public String toString() {
		return "Phenotype [female=" + female + ", hairColor=" + hairColor + ", bloodType=" + bloodType + ", height="
				+ height + ", hearing=" + hearing + ", colorVision=" + colorVision + ", qualityOfVision="
				+ qualityOfVision + ", eyeColor=" + eyeColor + ", skinColor=" + skinColor + "]";
	}
	public String toCSV() {
		return female + "," + hairColor + "," + bloodType + "," + height + "," + hearing + "," + colorVision + "," + qualityOfVision + "," + eyeColor + "," + skinColor;
	}
	
	
}