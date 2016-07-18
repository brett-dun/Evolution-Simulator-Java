package genetics;

import java.util.Random;

import chromosomes.BloodType;
import chromosomes.ColorVision;
import chromosomes.EyeColor;
import chromosomes.Gender;
import chromosomes.HairColor;
import chromosomes.Hearing;
import chromosomes.Height;
import chromosomes.QualityOfVision;
import chromosomes.SkinColor;

public class InheritedGenes {

	protected Gender gender;
	protected HairColor hairColor;
	protected BloodType bloodType;
	protected Height height;
	protected Hearing hearing;
	protected ColorVision colorVision;
	protected QualityOfVision qualityOfVision;
	protected EyeColor eyeColor;
	protected SkinColor skinColor;
	
	public InheritedGenes(boolean gender) {
		Random random = new Random();
		int num = random.nextInt(3);
		if(num == 0) {
			this.gender = new Gender(gender);
			this.hairColor = new HairColor(random.nextBoolean());
			this.bloodType = new BloodType("A");
			this.height = new Height(random.nextBoolean());
			this.hearing = new Hearing(random.nextBoolean());
			this.colorVision = new ColorVision(random.nextBoolean());
			this.qualityOfVision = new QualityOfVision(random.nextBoolean());
			this.eyeColor = new EyeColor(random.nextBoolean());
			this.skinColor = new SkinColor(random.nextBoolean());
		} else if(num == 1) {
			this.gender = new Gender(gender);
			this.hairColor = new HairColor(random.nextBoolean());
			this.bloodType = new BloodType("B");
			this.height = new Height(random.nextBoolean());
			this.hearing = new Hearing(random.nextBoolean());
			this.colorVision = new ColorVision(random.nextBoolean());
			this.qualityOfVision = new QualityOfVision(random.nextBoolean());
			this.eyeColor = new EyeColor(random.nextBoolean());
			this.skinColor = new SkinColor(random.nextBoolean());
		} else {
			this.gender = new Gender(gender);
			this.hairColor = new HairColor(random.nextBoolean());
			this.bloodType = new BloodType("c");
			this.height = new Height(random.nextBoolean());
			this.hearing = new Hearing(random.nextBoolean());
			this.colorVision = new ColorVision(random.nextBoolean());
			this.qualityOfVision = new QualityOfVision(random.nextBoolean());
			this.eyeColor = new EyeColor(random.nextBoolean());
			this.skinColor = new SkinColor(random.nextBoolean());
		}
	}
	
	/**
	 * 
	 * @param gender
	 * @param hairColor
	 * @param bloodType
	 * @param height
	 * @param hearing
	 * @param colorVision
	 * @param qualityOfVision
	 * @param eyeColor
	 * @param skinColor
	 */
	public InheritedGenes(boolean gender, boolean hairColor, String bloodType, boolean height, boolean hearing, boolean colorVision, boolean qualityOfVision, boolean eyeColor, boolean skinColor) {
		this.gender = new Gender(gender);
		this.hairColor = new HairColor(hairColor);
		this.bloodType = new BloodType(bloodType);
		this.height = new Height(height);
		this.hearing = new Hearing(hearing);
		this.colorVision = new ColorVision(colorVision);
		this.qualityOfVision = new QualityOfVision(qualityOfVision);
		this.eyeColor = new EyeColor(eyeColor);
		this.skinColor = new SkinColor(skinColor);
	}
	
	/**
	 * 
	 * @param gender
	 * @param hairColor
	 * @param bloodType
	 * @param height
	 * @param hearing
	 * @param colorVision
	 * @param qualityOfVision
	 * @param eyeColor
	 * @param skinColor
	 */
	public InheritedGenes(Gender gender, HairColor hairColor, BloodType bloodType, Height height, Hearing hearing, ColorVision colorVision, QualityOfVision qualityOfVision, EyeColor eyeColor, SkinColor skinColor) {
		this.gender = gender;
		this.hairColor = hairColor;
		this.bloodType = bloodType;
		this.height = height;
		this.hearing = hearing;
		this.colorVision = colorVision;
		this.qualityOfVision = qualityOfVision;
		this.eyeColor = eyeColor;
		this.skinColor = skinColor;
	}

	
	public Gender getGender() {
		return gender;
	}
	public HairColor getHairColor() {
		return hairColor;
	}
	public BloodType getBloodType() {
		return bloodType;
	}
	public Height getHeight() {
		return height;
	}
	public Hearing getHearing() {
		return hearing;
	}
	public ColorVision getColorVision() {
		return colorVision;
	}
	public QualityOfVision getQualityOfVision() {
		return qualityOfVision;
	}
	public EyeColor getEyeColor() {
		return eyeColor;
	}
	public SkinColor getSkinColor() {
		return skinColor;
	}
	
	
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public void setHairColor(HairColor hairColor) {
		this.hairColor = hairColor;
	}
	public void setBloodType(BloodType bloodType) {
		this.bloodType = bloodType;
	}
	public void setHeight(Height height) {
		this.height = height;
	}
	public void setHearing(Hearing hearing) {
		this.hearing = hearing;
	}
	public void setColorVision(ColorVision colorVision) {
		this.colorVision = colorVision;
	}
	public void setQualityOfVision(QualityOfVision qualityOfVision) {
		this.qualityOfVision = qualityOfVision;
	}
	public void setEyeColor(EyeColor eyeColor) {
		this.eyeColor = eyeColor;
	}
	public void setSkinColor(SkinColor skinColor) {
		this.skinColor = skinColor;
	}
	

	@Override
	public String toString() {
		return "Genotype [gender=" + gender + ", hairColor=" + hairColor + ", bloodType=" + bloodType + ", height="
				+ height + ", hearing=" + hearing + ", colorVision=" + colorVision + ", qualityOfVision="
				+ qualityOfVision + ", eyeColor=" + eyeColor + ", skinColor=" + skinColor + "]";
	}
	
}
