package backEnd;

public class Statistics {
	
	int[] female, hairColor, bloodType, height, hearing, colorVision, qualityOfVision, eyeColor, skinColor;
	double[] femaleDec, hairColorDec, bloodTypeDec, heightDec, hearingDec, colorVisionDec, qualityOfVisionDec, eyeColorDec, skinColorDec;
	
	public Statistics(Population population) {
		
		this.female = new int[2];
		this.hairColor = new int[3];
		this.bloodType = new int[4];
		this.height = new int[3];
		this.hearing = new int[2];
		this.colorVision = new int[2];
		this.qualityOfVision = new int[3];
		this.eyeColor = new int[3];
		this.skinColor = new int[3];
		
		this.femaleDec = new double[2];
		this.hairColorDec = new double[3];
		this.bloodTypeDec = new double[4];
		this.heightDec = new double[3];
		this.hearingDec = new double[2];
		this.colorVisionDec = new double[2];
		this.qualityOfVisionDec = new double[3];
		this.eyeColorDec = new double[3];
		this.skinColorDec = new double[3];
		
		for(Species i: population.females) {
			
			this.female[0]++; //females
			
			if(i.getPhenotype().getHairColor() == 0) {
				this.hairColor[0]++; //Black
			} else if(i.getPhenotype().getHairColor() == 1) {
				this.hairColor[1]++; //Brown
			} else {
				this.hairColor[2]++; //Blond
			}
			
			if(i.getPhenotype().getBloodType() == 0) {
				this.bloodType[0]++; //A: AA or Ac
			} else if(i.getPhenotype().getBloodType() == 1) {
				this.bloodType[1]++; //B: BB or Bc
			} else if(i.getPhenotype().getBloodType() == 2) {
				this.bloodType[2]++; //AB: AB
			} else {
				this.bloodType[3]++; //cc
			}
			
			if(i.getPhenotype().getHeight() == 0) {
				this.height[0]++; //Tall
			} else if(i.getPhenotype().getHeight() == 1) {
				this.height[1]++; //Medium
			} else {
				this.height[2]++; //Short
			}
			
			if(i.getPhenotype().isHearing()) {
				this.hearing[0]++; //Normal
			} else {
				this.hearing[1]++; //Deaf
			}
			
			if(i.getPhenotype().isColorVision()) {
				this.colorVision[0]++; //Normal
			} else {
				this.colorVision[1]++; //Color Blind
			}
			
			if(i.getPhenotype().getQualityOfVision() == 0) {
				this.qualityOfVision[0]++; //Good
			} else if(i.getPhenotype().getQualityOfVision() == 1) {
				this.qualityOfVision[1]++; //Medium
			} else {
				this.qualityOfVision[2]++; //Bad
			}
			
			if(i.getPhenotype().getEyeColor() == 0) {
				this.eyeColor[0]++; //Black
			} else if(i.getPhenotype().getEyeColor() == 1) {
				this.eyeColor[1]++; //Brown
			} else {
				this.eyeColor[2]++; //Blond
			}
			
			if(i.getPhenotype().getSkinColor() == 0) {
				this.skinColor[0]++; //Black
			} else if(i.getPhenotype().getSkinColor() == 1) {
				this.skinColor[1]++; //Brown
			} else {
				this.skinColor[2]++; //White
			}
			
		}
		
		for(Species i: population.males) {
			
			this.female[1]++; //males
			
			if(i.getPhenotype().getHairColor() == 0) {
				this.hairColor[0]++; //Black
			} else if(i.getPhenotype().getHairColor() == 1) {
				this.hairColor[1]++; //Brown
			} else {
				this.hairColor[2]++; //Blond
			}
			
			if(i.getPhenotype().getBloodType() == 0) {
				this.bloodType[0]++; //A: AA or Ac
			} else if(i.getPhenotype().getBloodType() == 1) {
				this.bloodType[1]++; //B: BB or Bc
			} else if(i.getPhenotype().getBloodType() == 2) {
				this.bloodType[2]++; //AB: AB
			} else {
				this.bloodType[3]++; //cc
			}
			
			if(i.getPhenotype().getHeight() == 0) {
				this.height[0]++; //Tall
			} else if(i.getPhenotype().getHeight() == 1) {
				this.height[1]++; //Medium
			} else {
				this.height[2]++; //Short
			}
			
			if(i.getPhenotype().isHearing()) {
				this.hearing[0]++; //Normal
			} else {
				this.hearing[1]++; //Deaf
			}
			
			if(i.getPhenotype().isColorVision()) {
				this.colorVision[0]++; //Normal
			} else {
				this.colorVision[1]++; //Color Blind
			}
			
			if(i.getPhenotype().getQualityOfVision() == 0) {
				this.qualityOfVision[0]++; //Good
			} else if(i.getPhenotype().getQualityOfVision() == 1) {
				this.qualityOfVision[1]++; //Medium
			} else {
				this.qualityOfVision[2]++; //Bad
			}
			
			if(i.getPhenotype().getEyeColor() == 0) {
				this.eyeColor[0]++; //Black
			} else if(i.getPhenotype().getEyeColor() == 1) {
				this.eyeColor[1]++; //Brown
			} else {
				this.eyeColor[2]++; //Blond
			}
			
			if(i.getPhenotype().getSkinColor() == 0) {
				this.skinColor[0]++; //Black
			} else if(i.getPhenotype().getSkinColor() == 1) {
				this.skinColor[1]++; //Brown
			} else {
				this.skinColor[2]++; //White
			}
			
		}
		
		this.femaleDec[0] = (double) this.female[0] / (population.females.size()+population.males.size());
		this.femaleDec[1] = (double) this.female[1] / (population.females.size()+population.males.size());
		
		this.hairColorDec[0] = (double) this.hairColor[0] / (population.females.size()+population.males.size());
		this.hairColorDec[1] = (double) this.hairColor[1] / (population.females.size()+population.males.size());
		this.hairColorDec[2] = (double) this.hairColor[2] / (population.females.size()+population.males.size());
		
		this.bloodTypeDec[0] = (double) this.bloodType[0] / (population.females.size()+population.males.size());
		this.bloodTypeDec[1] = (double) this.bloodType[1] / (population.females.size()+population.males.size());
		this.bloodTypeDec[2] = (double) this.bloodType[2] / (population.females.size()+population.males.size());
		this.bloodTypeDec[3] = (double) this.bloodType[3] / (population.females.size()+population.males.size());
		
		this.heightDec[0] = (double) this.height[0] / (population.females.size()+population.males.size());
		this.heightDec[1] = (double) this.height[1] / (population.females.size()+population.males.size());
		this.heightDec[2] = (double) this.height[2] / (population.females.size()+population.males.size());
		
		this.hearingDec[0] = (double) this.hearing[0] / (population.females.size()+population.males.size());
		this.hearingDec[1] = (double) this.hearing[1] / (population.females.size()+population.males.size());
		
		this.colorVisionDec[0] = (double) this.colorVision[0] / (population.females.size()+population.males.size());
		this.colorVisionDec[1] = (double) this.colorVision[1] / (population.females.size()+population.males.size());
		
		this.qualityOfVisionDec[0] = (double) this.qualityOfVision[0] / (population.females.size()+population.males.size());
		this.qualityOfVisionDec[1] = (double) this.qualityOfVision[1] / (population.females.size()+population.males.size());
		this.qualityOfVisionDec[2] = (double) this.qualityOfVision[2] / (population.females.size()+population.males.size());
		
		this.eyeColorDec[0] = (double) this.eyeColor[0] / (population.females.size()+population.males.size());
		this.eyeColorDec[1] = (double) this.eyeColor[1] / (population.females.size()+population.males.size());
		this.eyeColorDec[2] = (double) this.eyeColor[2] / (population.females.size()+population.males.size());
		
		this.skinColorDec[0] = (double) this.skinColor[0] / (population.females.size()+population.males.size());
		this.skinColorDec[1] = (double) this.skinColor[1] / (population.females.size()+population.males.size());
		this.skinColorDec[2] = (double) this.skinColor[2] / (population.females.size()+population.males.size());
		
	}
		
	public void printData() {
		System.out.println("Gender [Females:" + female[0] + ", Males:" + female[1] + "]");
		System.out.println("Hair Color [Black:" + hairColor[0] + ", Brown:" + hairColor[1] + ",Blond:" + hairColor[2] + "]");
		System.out.println("Blood Type [A:" + bloodType[0] + ", B:" + bloodType[1] + ", AB:" + bloodType[2] + ", o:" + bloodType[3] + "]");
		System.out.println("Height [Tall:" + height[0] + ", Medium:" + height[1] + ", Short:" + height[2] + "]");
		System.out.println("Hearing [Normal:" + hearing[0] + ", Deaf:" + hearing[1] + "]");
		System.out.println("Color Vision [Normal:" + colorVision[0] + ", Color Blind:" + colorVision[1] + "]");
		System.out.println("Quality of Vision [Good:" + qualityOfVision[0] + ", Medium:" + qualityOfVision[1] + ", Bad:" + qualityOfVision[2] + "]");
		System.out.println("Eye Color [Brown:" + eyeColor[0] + ", Green:" + eyeColor[1] + ", Blue:" + eyeColor[2] + "]");
		System.out.println("Skin Color [Black:" + skinColor[0] + ", Brown:" + skinColor[1] + ", White:" + skinColor[2] + "]");
	}
	
	public void printDecimals() {
		System.out.println("Gender [Females:" + femaleDec[0] + ", Males:" + femaleDec[1] + "]");
		System.out.println("Hair Color [Black:" + hairColorDec[0] + ", Brown:" + hairColorDec[1] + ",Blond:" + hairColorDec[2] + "]");
		System.out.println("Blood Type [A:" + bloodTypeDec[0] + ", B:" + bloodTypeDec[1] + ", AB:" + bloodTypeDec[2] + ", o:" + bloodTypeDec[3] + "]");
		System.out.println("Height [Tall:" + heightDec[0] + ", Medium:" + heightDec[1] + ", Short:" + heightDec[2] + "]");
		System.out.println("Hearing [Normal:" + hearingDec[0] + ", Deaf:" + hearingDec[1] + "]");
		System.out.println("Color Vision [Normal:" + colorVisionDec[0] + ", Color Blind:" + colorVisionDec[1] + "]");
		System.out.println("Quality of Vision [Good:" + qualityOfVisionDec[0] + ", Medium:" + qualityOfVisionDec[1] + ", Bad:" + qualityOfVisionDec[2] + "]");
		System.out.println("Eye Color [Brown:" + eyeColorDec[0] + ", Green:" + eyeColorDec[1] + ", Blue:" + eyeColorDec[2] + "]");
		System.out.println("Skin Color [Black:" + skinColorDec[0] + ", Brown:" + skinColorDec[1] + ", White:" + skinColorDec[2] + "]");
	}
	
	public void printLimitedPercents() {
		String temp1, temp2, temp3, temp4;
		final int num = 3;
		temp1 = "" + (femaleDec[0]*100); temp1 = temp1.substring(0, num) + "%";
		temp2 = "" + (femaleDec[1]*100); temp2 = temp2.substring(0, num) + "%";
		System.out.println("Gender [Females:" + temp1 + ", Males:" + temp2 + "]");
		temp1 = "" + (hairColorDec[0]*100); temp1 = temp1.substring(0, num) + "%";
		temp2 = "" + (hairColorDec[1]*100); temp2 = temp2.substring(0, num) + "%";
		temp3 = "" + (hairColorDec[2]*100); temp3 = temp3.substring(0, num) + "%";
		System.out.println("Hair Color [Black:" + temp1 + ", Brown:" + temp2 + ", Blond:" + temp3 + "]");
		temp1 = "" + (bloodTypeDec[0]*100); temp1 = temp1.substring(0, num) + "%";
		temp2 = "" + (bloodTypeDec[1]*100); temp2 = temp2.substring(0, num) + "%";
		temp3 = "" + (bloodTypeDec[2]*100); temp3 = temp3.substring(0, num) + "%";
		temp4 = "" + (bloodTypeDec[3]*100); temp4 = temp4.substring(0, num) + "%";
		System.out.println("Blood Type [A:" + temp1 + ", B:" + temp2 + ", AB:" + temp3 + ", o:" + temp4 + "]");
		temp1 = "" + (heightDec[0]*100); temp1 = temp1.substring(0, num) + "%";
		temp2 = "" + (heightDec[1]*100); temp2 = temp2.substring(0, num) + "%";
		temp3 = "" + (heightDec[2]*100); temp3 = temp3.substring(0, num) + "%";
		System.out.println("Height [Tall:" + temp1 + ", Medium:" + temp2 + ", Short:" + temp3 + "]");
		temp1 = "" + (hearingDec[0]*100); temp1 = temp1.substring(0, num) + "%";
		temp2 = "" + (hearingDec[1]*100); temp2 = temp2.substring(0, num) + "%";
		System.out.println("Hearing [Normal:" + temp1 + ", Deaf:" + temp2 + "]");
		temp1 = "" + (colorVisionDec[0]*100); temp1 = temp1.substring(0, num) + "%";
		temp2 = "" + (colorVisionDec[1]*100); temp2 = temp2.substring(0, num) + "%";
		System.out.println("Color Vision [Normal:" + temp1 + ", Color Blind:" + temp2 + "]");
		temp1 = "" + (qualityOfVisionDec[0]*100); temp1 = temp1.substring(0, num) + "%";
		temp2 = "" + (qualityOfVisionDec[1]*100); temp2 = temp2.substring(0, num) + "%";
		temp3 = "" + (qualityOfVisionDec[2]*100); temp3 = temp3.substring(0, num) + "%";
		System.out.println("Quality of Vision [Good:" + temp1 + ", Medium:" + temp2 + ", Bad:" + temp3 + "]");
		temp1 = "" + (eyeColorDec[0]*100); temp1 = temp1.substring(0, num) + "%";
		temp2 = "" + (eyeColorDec[1]*100); temp2 = temp2.substring(0, num) + "%";
		temp3 = "" + (eyeColorDec[2]*100); temp3 = temp3.substring(0, num) + "%";
		System.out.println("Eye Color [Brown:" + temp1 + ", Green:" + temp2 + ", Blue:" + temp3 + "]");
		temp1 = "" + (skinColorDec[0]*100); temp1 = temp1.substring(0, num) + "%";
		temp2 = "" + (skinColorDec[1]*100); temp2 = temp2.substring(0, num) + "%";
		temp3 = "" + (skinColorDec[2]*100); temp3 = temp3.substring(0, num) + "%";
		System.out.println("Skin Color [Black:" + temp1 + ", Brown:" + temp2 + ", White:" + temp3 + "]");
	}
	
	public String createString() {
		return "Gender [Females: " + femaleDec[0]*100 + "% ] [Males : " + femaleDec[1]*100 + "% ]" + "\n" +
				"Hair Color [Black:" + hairColorDec[0]*100 + "% ] [Brown:" + hairColorDec[1]*100 + "% ] [Blond:" + hairColorDec[2]*100 + "% ]" + "\n" +
				"Blood Type [A:" + bloodTypeDec[0]*100 + "% ] [B:" + bloodTypeDec[1]*100 + "% ] [AB:" + bloodTypeDec[2]*100 + "% ] [o:" + bloodTypeDec[3]*100 + "% ]" + "\n" +
				"Height [Tall:" + heightDec[0]*100 + "% ] [Medium:" + heightDec[1]*100 + "% ] [Short:" + heightDec[2]*100 + "% ]" + "\n" +
				"Hearing [Normal:" + hearingDec[0]*100 + "% ] [Deaf:" + hearingDec[1]*100 + "% ]" + "\n" +
				"Color Vision [Normal:" + colorVisionDec[0]*100 + "% ] [Color Blind:" + colorVisionDec[1]*100 + "% ]" + "\n" +
				"Quality of Vision [Good:" + qualityOfVisionDec[0]*100 + "% ] [Medium:" + qualityOfVisionDec[1]*100 + "% ] [Bad:" + qualityOfVisionDec[2]*100 + "% ]" + "\n" +
				"Eye Color [Brown:" + eyeColorDec[0]*100 + "% ] [Green:" + eyeColorDec[1]*100 + "% ] [Blue:" + eyeColorDec[2]*100 + "% ]" + "\n" +
				"Skin Color [Black:" + skinColorDec[0]*100 + "% ] [Brown:" + skinColorDec[1]*100 + "% ] [White:" + skinColorDec[2]*100 + "% ]";
	}
	
}
