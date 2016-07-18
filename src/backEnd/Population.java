package backEnd;

import java.util.ArrayList;

import chromosomes.BloodType;
import chromosomes.ColorVision;
import chromosomes.EyeColor;
import chromosomes.HairColor;
import chromosomes.Hearing;
import chromosomes.Height;
import chromosomes.QualityOfVision;
import chromosomes.SkinColor;

public class Population {
	
	
	protected ArrayList<Species> females;
	protected ArrayList<Species> males;
	
	
	public Population() {
		this.females = new ArrayList<Species>(); //An ArrayList of Species that will hold females
		this.males = new ArrayList<Species>(); //An ArrayList of Species that will hold males
		this.females.add(new Species(true));
		this.males.add(new Species(false));
	}
	/**
	 * 
	 * @param female
	 * @param male
	 */
	public Population(Species female, Species male) {
		this.females = new ArrayList<Species>(); //An ArrayList of Species that will hold females
		this.males = new ArrayList<Species>(); //An ArrayList of Species that will hold males
		this.females.add(female); //Adds the first female to the ArrayList
		this.males.add(male); //Adds the first male to the ArrayList
	
	}
	
	public Population(Population population) {
		this.females = new ArrayList<Species>();
		for(Species i: population.females)
			this.females.add(new Species(i));
		this.males = new ArrayList<Species>();
		for(Species i: population.males)
			this.males.add(new Species(i));
	}

	
	/**
	 * 
	 * @param min :: minimum age to reproduce (exclusive)
	 * @param max :: minimum age to reproduce (exclusive)
	 */
	public void reproduce(int min, int max, int kids) {
		for(int i = 0; i < females.size(); i++) {
			Species temp = females.get(i);
			if(temp.getAge() >= min && temp.getAge() <= max && temp.getKids() < kids) { //females will reproduce between ages 5 and 15 (both exclusive)
				double rand = Math.random();
				int num = 0;
				//Generates the number of offspring
				/*if(rand < 0.25/8) {
					num = 4;
				} else*/ if (rand < 0.25/4) {
					num = 3;
				} else if (rand < 0.25/2) {
					num = 2;
				} else if (rand < 0.25/1) {
					num = 1;
				} else {
					num = 0;
				}
				for(int k = 0; k <= num; k++) {
					Species temp2 = new Species(females.get(i),males.get((int)(Math.random()*males.size()))); //Creates a new object of Species
					if(temp.isFemale()) {
						females.add(temp2); //Adds this temp object to females if it is a female
					} else {
						males.add(temp2); //otherwise it adds it to male
					}
					temp.kids++;
					females.set(i, temp);
				}
			}
		}
	}

	
	/**
	 * ages the population by one year
	 */
	public void age() {
		for(int i = 0; i < females.size(); i++) {
			females.get(i).age();
		}
		for(int i = 0; i < males.size(); i++) {
			males.get(i).age();
		}
	}
	
	
	/**
	 * 
	 * @param age
	 */
	public void die(int age) {
		for(int i = 0; i < females.size(); i++) {
			if(females.get(i).getAge() >= age) { //20 || (temp.getPhenotype().getHeight() == 2 && temp.getAge() >= 5)
				females.remove(i);
				i--;
			}
		}
		for(int i = 0; i < males.size(); i++) {
			if(males.get(i).getAge() >= age) {
				males.remove(i);
				i--;
			}
		}
	}
	
	@Deprecated
	/**
	 * 
	 * @param hairColor
	 * @param num
	 * @param age
	 */
	public void naturalSelection(HairColor hairColor, int num, int age) {
		for(int i = 0; i < females.size(); i++) {
			Species temp = females.get(i);
			if(temp.getPhenotype().getHairColor() == num && Math.random() < (temp.getAge()/(double)age)) {
				females.remove(i);
				i--;
			}
		}
		for(int i = 0; i < males.size(); i++) {
			Species temp = males.get(i);
			if(temp.getPhenotype().getHairColor() == num && Math.random() < (temp.getAge()/(double)age)) {
				males.remove(i);
				i--;
			}
		}
	}
	
	@Deprecated
	/**
	 * 
	 * @param bloodType
	 * @param num
	 * @param age
	 */
	public void naturalSelection(BloodType bloodType, int num, int age) {
		for(int i = 0; i < females.size(); i++) {
			Species temp = females.get(i);
			if(temp.getPhenotype().getBloodType() == num && Math.random() < (temp.getAge()/(double)age)) {
				females.remove(i);
				i--;
			}
		}
		for(int i = 0; i < males.size(); i++) {
			Species temp = males.get(i);
			if(temp.getPhenotype().getBloodType() == num && Math.random() < (temp.getAge()/(double)age)) {
				males.remove(i);
				i--;
			}
		}
	}
	
	@Deprecated
	/**
	 * 
	 * @param height
	 * @param num
	 * @param age
	 */
	public void naturalSelection(Height height, int num, int age) {
		for(int i = 0; i < females.size(); i++) {
			Species temp = females.get(i);
			if(temp.getPhenotype().getHeight() == num && Math.random() < (temp.getAge()/(double)age)) {
				females.remove(i);
				i--;
			}
		}
		for(int i = 0; i < males.size(); i++) {
			Species temp = males.get(i);
			if(temp.getPhenotype().getHeight() == num && Math.random() < (temp.getAge()/(double)age)) {
				males.remove(i);
				i--;
			}
		}
	}
	
	@Deprecated
	/**
	 * 
	 * @param hearing
	 * @param var
	 * @param age
	 */
	public void naturalSelection(Hearing hearing, boolean var, int age) {
		for(int i = 0; i < females.size(); i++) {
			Species temp = females.get(i);
			if((temp.getPhenotype().isHearing() == var) && Math.random() < (temp.getAge()/(double)age)) {
				females.remove(i);
				i--;
			}
		}
		for(int i = 0; i < males.size(); i++) {
			Species temp = males.get(i);
			if((temp.getPhenotype().isHearing() == var) && Math.random() < (temp.getAge()/(double)age)) {
				males.remove(i);
				i--;
			}
		}
	}
	
	@Deprecated
	/**
	 * 
	 * @param colorVision
	 * @param var
	 * @param age
	 */
	public void naturalSelection(ColorVision colorVision, boolean var, int age) {
		for(int i = 0; i < females.size(); i++) {
			Species temp = females.get(i);
			if((temp.getPhenotype().isColorVision() == var) && Math.random() < (temp.getAge()/(double)age)) {
				females.remove(i);
				i--;
			}
		}
		for(int i = 0; i < males.size(); i++) {
			Species temp = males.get(i);
			if((temp.getPhenotype().isColorVision() == var) && Math.random() < (temp.getAge()/(double)age)) {
				males.remove(i);
				i--;
			}
		}
	}
	
	@Deprecated
	/**
	 * 
	 * @param qualityOfVision
	 * @param num
	 * @param age
	 */
	public void naturalSelection(QualityOfVision qualityOfVision, int num, int age) {
		for(int i = 0; i < females.size(); i++) {
			Species temp = females.get(i);
			if(temp.getPhenotype().getQualityOfVision() == num && Math.random() < (temp.getAge()/(double)age)) {
				females.remove(i);
				i--;
			}
		}
		for(int i = 0; i < males.size(); i++) {
			Species temp = males.get(i);
			if(temp.getPhenotype().getQualityOfVision() == num && Math.random() < (temp.getAge()/(double)age)) {
				males.remove(i);
				i--;
			}
		}
	}
	
	@Deprecated
	/**
	 * 
	 * @param eyeColor
	 * @param num
	 * @param age
	 */
	public void naturalSelection(EyeColor eyeColor, int num, int age) {
		for(int i = 0; i < females.size(); i++) {
			Species temp = females.get(i);
			if(temp.getPhenotype().getEyeColor() == num && Math.random() < (temp.getAge()/(double)age)) {
				females.remove(i);
				i--;
			}
		}
		for(int i = 0; i < males.size(); i++) {
			Species temp = males.get(i);
			if(temp.getPhenotype().getEyeColor() == num && Math.random() < (temp.getAge()/(double)age)) {
				males.remove(i);
				i--;
			}
		}
	}
	
	@Deprecated
	/**
	 * 
	 * @param skinColor
	 * @param num
	 * @param age
	 */
	public void naturalSelection(SkinColor skinColor, int num, int age) {
		for(int i = 0; i < females.size(); i++) {
			Species temp = females.get(i);
			if(temp.getPhenotype().getSkinColor() == num && Math.random() < (temp.getAge()/(double)age)) {
				females.remove(i);
				i--;
			}
		}
		for(int i = 0; i < males.size(); i++) {
			Species temp = males.get(i);
			if(temp.getPhenotype().getSkinColor() == num && Math.random() < (temp.getAge()/(double)age)) {
				males.remove(i);
				i--;
			}
		}
	}
	
	/**
	 * 
	 * @param trait ("HairColor","BloodType","Height","Hearing","ColorVision","QualityOfVision","EyeColor","SkinColor")
	 * @param num (trait number)
	 * @param age (age at which the individual must die by)
	 */
	public void naturalSelection(String trait, int num, int age) {
		boolean var;
		switch(trait) {
			case "HairColor":
				for(int i = 0; i < females.size(); i++) {
					Species temp = females.get(i);
					if(temp.getPhenotype().getHairColor() == num && Math.random() < (temp.getAge()/(double)age)) {
						females.remove(i);
						i--;
					}
				}
				for(int i = 0; i < males.size(); i++) {
					Species temp = males.get(i);
					if(temp.getPhenotype().getHairColor() == num && Math.random() < (temp.getAge()/(double)age)) {
						males.remove(i);
						i--;
					}
				}
				break;
				
			case "BloodType":
				for(int i = 0; i < females.size(); i++) {
					Species temp = females.get(i);
					if(temp.getPhenotype().getBloodType() == num && Math.random() < (temp.getAge()/(double)age)) {
						females.remove(i);
						i--;
					}
				}
				for(int i = 0; i < males.size(); i++) {
					Species temp = males.get(i);
					if(temp.getPhenotype().getBloodType() == num && Math.random() < (temp.getAge()/(double)age)) {
						males.remove(i);
						i--;
					}
				}
				break;
				
			case "Height":
				for(int i = 0; i < females.size(); i++) {
					Species temp = females.get(i);
					if(temp.getPhenotype().getHeight() == num && Math.random() < (temp.getAge()/(double)age)) {
						females.remove(i);
						i--;
					}
				}
				for(int i = 0; i < males.size(); i++) {
					Species temp = males.get(i);
					if(temp.getPhenotype().getHeight() == num && Math.random() < (temp.getAge()/(double)age)) {
						males.remove(i);
						i--;
					}
				}
				break;
				
			case "Hearing":
				if(num == 0)
					var = false;
				else
					var = true;
				for(int i = 0; i < females.size(); i++) {
					Species temp = females.get(i);
					if((temp.getPhenotype().isHearing() == var) && Math.random() < (temp.getAge()/(double)age)) {
						females.remove(i);
						i--;
					}
				}
				for(int i = 0; i < males.size(); i++) {
					Species temp = males.get(i);
					if((temp.getPhenotype().isHearing() == var) && Math.random() < (temp.getAge()/(double)age)) {
						males.remove(i);
						i--;
					}
				}
				break;
				
			case "Color Vision":
				if(num == 0)
					var = false;
				else
					var = true;
				for(int i = 0; i < females.size(); i++) {
					Species temp = females.get(i);
					if((temp.getPhenotype().isColorVision() == var) && Math.random() < (temp.getAge()/(double)age)) {
						females.remove(i);
						i--;
					}
				}
				for(int i = 0; i < males.size(); i++) {
					Species temp = males.get(i);
					if((temp.getPhenotype().isColorVision() == var) && Math.random() < (temp.getAge()/(double)age)) {
						males.remove(i);
						i--;
					}
				}
				break;
				
			case "QualityOfVision":
				for(int i = 0; i < females.size(); i++) {
					Species temp = females.get(i);
					if(temp.getPhenotype().getQualityOfVision() == num && Math.random() < (temp.getAge()/(double)age)) {
						females.remove(i);
						i--;
					}
				}
				for(int i = 0; i < males.size(); i++) {
					Species temp = males.get(i);
					if(temp.getPhenotype().getQualityOfVision() == num && Math.random() < (temp.getAge()/(double)age)) {
						males.remove(i);
						i--;
					}
				}
				break;
				
			case "EyeColor":
				for(int i = 0; i < females.size(); i++) {
					Species temp = females.get(i);
					if(temp.getPhenotype().getEyeColor() == num && Math.random() < (temp.getAge()/(double)age)) {
						females.remove(i);
						i--;
					}
				}
				for(int i = 0; i < males.size(); i++) {
					Species temp = males.get(i);
					if(temp.getPhenotype().getEyeColor() == num && Math.random() < (temp.getAge()/(double)age)) {
						males.remove(i);
						i--;
					}
				}
				break;
			
			case "SkinColor":
				for(int i = 0; i < females.size(); i++) {
					Species temp = females.get(i);
					if(temp.getPhenotype().getSkinColor() == num && Math.random() < (temp.getAge()/(double)age)) {
						females.remove(i);
						i--;
					}
				}
				for(int i = 0; i < males.size(); i++) {
					Species temp = males.get(i);
					if(temp.getPhenotype().getSkinColor() == num && Math.random() < (temp.getAge()/(double)age)) {
						males.remove(i);
						i--;
					}
				}
				break;
				
		}
	}
	
	
	public void addFemales() {
		Species temp = new Species(true);
		this.females.add(temp);
	}
	public void addMales() {
		Species temp = new Species(false);
		this.males.add(temp);
	}
	
	
	@Override
	public String toString() {
		return "Population [females=" + females + ", males=" + males + "]";
	}
	
	
	/**
	 * @return the females
	 */
	public ArrayList<Species> getFemales() {
		return females;
	}
	/**
	 * @return the males
	 */
	public ArrayList<Species> getMales() {
		return males;
	}
	
	public int populationSize() {
		return females.size() + males.size();
	}
	
	/*public static void main(String args[]) {
		//For testing only
		/*
		Population animals = new Population();
		
		if(ui.getYear() > 0 && ui.getLifeSpan() >0) {
			
		for(int i = 0; i < ui.getYear(); i++) {
			//System.out.println(people.toString());
			System.out.println("year " + i + ": " + (animals.females.size()+animals.males.size()));
			//Cycles through the ArrayList females
			/*for(Species j: animals.females) {
				//System.out.println("[" + j.getPhenotype().isFemale() + "," + j.getPhenotype().getBloodType() + "]");
				//System.out.println(j.getPhenotype().toString());
			}
			//Cycles through the ArrayList males
			for(Species j: animals.males){
				//System.out.println("[" + j.getPhenotype().isFemale() + "," + j.getPhenotype().getBloodType() + "]");
				//System.out.println(j.getPhenotype().toString());
			}*/
			/*int sum = 0;
			for(Species j: animals.females) {
				if(j.getPhenotype().getBloodType()==3) {
					sum++;
				}
			}
			for(Species j: animals.males) {
				if(j.getPhenotype().getBloodType()==3) {
					sum++;
				}
			}
			//System.out.println(((double) sum / (animals.females.size()+animals.males.size())));//
			
			//sum = 0;
			System.out.println();
			animals.age();
			animals.reproduce(25,27);
			//animals.die(ui.getLifeSpan());// life length is controlled by this
			animals.naturalSelection(new BloodType(null), 3, 40);
		}
		}
		Population population = new Population();
		for(int i=0; i<50; i++) {
			population.addFemales();
			population.addMales();
		}
	}*/
	
}

