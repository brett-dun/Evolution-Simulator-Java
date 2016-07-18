package simulation;

import backEnd.Population;
//import backEnd.Species;
import backEnd.Statistics;
/*import chromosomes.BloodType;
import chromosomes.ColorVision;
import chromosomes.EyeColor;
import chromosomes.HairColor;
import chromosomes.Hearing;
import chromosomes.Height;
import chromosomes.QualityOfVision;
import chromosomes.SkinColor;
import userInterface.UI;*/

//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.util.ArrayList;

public class Simulation2 {
	
	//protected boolean ready;
	protected int startingPopulationSize;
	protected int lifeSpan;
	protected int maxKids;
	protected int minReproductionAge;
	protected int maxReproductionAge;
	protected int simulationLength;
	protected Population[] population;
	protected Statistics[][] statistics;
	//protected UI userInterface;
	
	public Simulation2() {
		
		this.population = new Population[4];
		this.population[0] = new Population();
		this.population[1] = new Population();
		this.population[2] = new Population();
		this.population[3] = new Population();
		
		//this.userInterface = new UI();
		//this.userInterface.setup();
		//this.userInterface.input();
		
		/*ready = this.userInterface.start();
		while(!ready) {
			ready = this.userInterface.start();
		}*/
		this.startingPopulationSize = 100;
		this.lifeSpan = (int) 78.7;
		this.maxKids = 4;
		this.minReproductionAge = 20;
		this.maxReproductionAge = 30;
		this.simulationLength = 200;
		this.statistics = new Statistics[4][this.simulationLength];
	}
	
	public void genesis(int startingIndividuals) {
		int var = this.startingPopulationSize % 2;
		for(int i=0;i<(this.startingPopulationSize/2)+var-1;i++) {
			this.population[0].addFemales();
		}
		for(int i=0;i<(this.startingPopulationSize/2)-1;i++) {
			this.population[0].addMales();
		}
		this.population[1] = new Population(this.population[0]);
		this.population[2] = new Population(this.population[0]);
		this.population[3] = new Population(this.population[0]);
		//System.out.println("Genesis Done!");
	}
	
	public void runSimulation() {
		for(int i = 0; i < this.simulationLength; i++) {
			
			this.population[0].age();
			this.population[0].reproduce(this.minReproductionAge,this.maxReproductionAge,this.maxKids);
			this.population[0].die(this.lifeSpan);
			
			this.population[1].age();
			this.population[1].reproduce(this.minReproductionAge,this.maxReproductionAge,this.maxKids);
			this.population[1].die(this.lifeSpan);
			
			this.population[2].age();
			this.population[2].reproduce(this.minReproductionAge,this.maxReproductionAge,this.maxKids);
			this.population[2].die(this.lifeSpan);
			
			this.population[3].age();
			this.population[3].reproduce(this.minReproductionAge,this.maxReproductionAge,this.maxKids);
			this.population[3].die(this.lifeSpan);
			
			this.selection();
			
			this.statistics[0][i] = new Statistics(population[0]);
			this.statistics[1][i] = new Statistics(population[1]);
			this.statistics[2][i] = new Statistics(population[2]);
			this.statistics[3][i] = new Statistics(population[3]);
			
			
			System.out.println(i + ":" + this.population[0].populationSize() + "," + this.population[1].populationSize() + "," +
					this.population[2].populationSize() + "," + this.population[3].populationSize());
			
		}
		//System.out.println("Simulation Done!");
	}
	
	
	public void selection() {
		
		//int deathAge = this.minReproductionAge+(this.maxReproductionAge-this.minReproductionAge)/2;
		
		this.population[0].naturalSelection("Hearing", 0, this.lifeSpan);
		this.population[1].naturalSelection("Hearing", 0, this.lifeSpan);
		this.population[2].naturalSelection("Hearing", 0, this.lifeSpan);
		this.population[3].naturalSelection("Hearing", 0, this.lifeSpan);
		
		this.population[0].naturalSelection("ColorVision", 1, this.lifeSpan);
		
		this.population[0].naturalSelection("SkinColor", 0, this.lifeSpan);
		//this.population[1].naturalSelection("SkinColor", 0, this.lifeSpan);
		this.population[2].naturalSelection("SkinColor", 2, this.lifeSpan);
		//this.population[3].naturalSelection("SkinColor", 0, this.lifeSpan);
		
		//this.population[0].naturalSelection("Height", 0, this.lifeSpan);
		this.population[1].naturalSelection("Height", 0, this.lifeSpan);
		//this.population[2].naturalSelection("Height", 0, this.lifeSpan);
		this.population[3].naturalSelection("Height", 2, this.lifeSpan);
		
		/*if(this.userInterface.getHairColorButton().getText().equals(UI.HAIR_COLOR_TEXT)) {
			//Nothing happens
		} else if(this.userInterface.getHairColorButton().getText().equals("Hair Color: Black")) {
			this.population.naturalSelection(new HairColor(true), 0, deathAge);
		} else if(this.userInterface.getHairColorButton().getText().equals("Hair Color: Brown")) {
			this.population.naturalSelection(new HairColor(true), 1, deathAge);
		} else {
			this.population.naturalSelection(new HairColor(true), 2, deathAge);
		}
		
		if(this.userInterface.getBloodTypeButton().getText().equals(UI.BLOOD_TYPE_TEXT)) {
			//Nothing happens
		} else if(this.userInterface.getBloodTypeButton().getText().equals("Blood Type: AA/Ao")) {
			this.population.naturalSelection(new BloodType(null), 0, deathAge);
		} else if(this.userInterface.getBloodTypeButton().getText().equals("Blood Type: BB/Bo")) {
			this.population.naturalSelection(new BloodType(null), 1, deathAge);
		} else if(this.userInterface.getBloodTypeButton().getText().equals("Blood Type: AB")) {
			this.population.naturalSelection(new BloodType(null), 2, deathAge);
		} else {
			this.population.naturalSelection(new BloodType(null), 3, deathAge);
		}
		
		if(this.userInterface.getHeightButton().getText().equals(UI.HEIGHT_TEXT)) {
			//Nothing happens
		} else if(this.userInterface.getHeightButton().getText().equals("Height: Tall")) {
			this.population.naturalSelection(new Height(true), 0, deathAge);
		} else if(this.userInterface.getHeightButton().getText().equals("Height: Medium")) {
			this.population.naturalSelection(new Height(true), 1, deathAge);
		} else {
			this.population.naturalSelection(new Height(true), 2, deathAge);
		}
		
		if(this.userInterface.getHearingButton().getText().equals(UI.HEARING_TEXT)) {
			//Nothing happens
		} else if(this.userInterface.getHearingButton().getText().equals("Hearing: Normal")) {
			this.population.naturalSelection(new Hearing(true), true, deathAge);
		} else {
			this.population.naturalSelection(new Hearing(true), false, deathAge);
		}
		
		if(this.userInterface.getColorVisionButton().getText().equals(UI.COLOR_VISION_TEXT)) {
			//Nothing happens
		} else if(this.userInterface.getColorVisionButton().getText().equals("Color Vision: Normal")) {
			this.population.naturalSelection(new ColorVision(true), true, deathAge);
		} else {
			this.population.naturalSelection(new ColorVision(true), false, deathAge);
		}
		
		if(this.userInterface.getQualityOfVisionButton().getText().equals(UI.QUALITY_OF_VISION_TEXT)) {
			//Nothing happens
		} else if(this.userInterface.getQualityOfVisionButton().getText().equals("Vision: Good")) {
			this.population.naturalSelection(new QualityOfVision(true), 0, deathAge);
		} else if(this.userInterface.getQualityOfVisionButton().getText().equals("Vision: Medium")) {
			this.population.naturalSelection(new QualityOfVision(true), 1, deathAge);
		} else {
			this.population.naturalSelection(new QualityOfVision(true), 2, deathAge);
		}
		
		if(this.userInterface.getEyeColorButton().getText().equals(UI.EYE_COLOR_TEXT)) {
			//Nothing happens
		} else if(this.userInterface.getEyeColorButton().getText().equals("Eye Color: Brown")) {
			this.population.naturalSelection(new EyeColor(true), 0, deathAge);
		} else if(this.userInterface.getEyeColorButton().getText().equals("Eye Color: Green")) {
			this.population.naturalSelection(new EyeColor(true), 1, deathAge);
		} else {
			this.population.naturalSelection(new EyeColor(true), 2, deathAge);
		}
		
		if(this.userInterface.getSkinColorButton().getText().equals(UI.SKIN_COLOR_TEXT)) {
			//Nothing happens
		} else if(this.userInterface.getSkinColorButton().getText().equals("Skin Color: Black")) {
			this.population.naturalSelection(new SkinColor(true), 0, deathAge);
		} else if(this.userInterface.getSkinColorButton().getText().equals("Skin Color: Brown")) {
			this.population.naturalSelection(new SkinColor(true), 1, deathAge);
		} else {
			this.population.naturalSelection(new SkinColor(true), 2, deathAge);
		}*/
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Simulation2 simulation = new Simulation2();
		simulation.genesis(simulation.startingPopulationSize);
		simulation.runSimulation();
		/*for(Species i : simulation.population[0].getFemales())
			System.out.println(i.getGeneration());*/
		/*System.out.println(0);
		simulation.statistics[0][simulation.simulationLength-1].printLimitedPercents();
		System.out.println(1);
		simulation.statistics[1][simulation.simulationLength-1].printLimitedPercents();
		System.out.println(2);
		simulation.statistics[2][simulation.simulationLength-1].printData();
		System.out.println(3);
		simulation.statistics[3][simulation.simulationLength-1].printLimitedPercents();
		System.out.println("Population 0 Size: " + (simulation.population[0].getFemales().size() + simulation.population[0].getMales().size()));
		System.out.println("Population 1 Size: " + (simulation.population[1].getFemales().size() + simulation.population[1].getMales().size()));
		System.out.println("Population 2 Size: " + (simulation.population[2].getFemales().size() + simulation.population[2].getMales().size()));
		System.out.println("Population 3 Size: " + (simulation.population[3].getFemales().size() + simulation.population[3].getMales().size()));*/
		//System.out.println();
		//System.out.println(simulation.statistics[simulation.simulationLength-1].createString());
	}

}
