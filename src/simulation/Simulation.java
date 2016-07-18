package simulation;

import backEnd.Population;
import backEnd.Statistics;
import chromosomes.BloodType;
import chromosomes.ColorVision;
import chromosomes.EyeColor;
import chromosomes.HairColor;
import chromosomes.Hearing;
import chromosomes.Height;
import chromosomes.QualityOfVision;
import chromosomes.SkinColor;
import userInterface.UI;

//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.util.ArrayList;
@Deprecated
public class Simulation {
	
	protected boolean ready;
	protected int startingPopulationSize;
	protected int lifeSpan;
	protected int minReproductionAge;
	protected int maxReproductionAge;
	protected int simulationLength;
	protected Population population;
	protected Statistics[] statistics;
	protected UI userInterface;
	
	public Simulation() {
		
		this.population = new Population();
		
		this.userInterface = new UI();
		this.userInterface.setup();
		this.userInterface.input();
		
		ready = this.userInterface.start();
		while(!ready) {
			ready = this.userInterface.start();
		}
		this.startingPopulationSize = this.userInterface.startingPopulation();
		this.lifeSpan = this.userInterface.lifeSpan();
		this.minReproductionAge = this.userInterface.minAgeReproduction();
		this.maxReproductionAge = this.userInterface.maxAgeReproduction();
		this.simulationLength = this.userInterface.simulationLength();
		this.statistics = new Statistics[this.simulationLength];
	}
	
	public void genesis(int startingIndividuals) {
		int var = this.startingPopulationSize % 2;
		for(int i=0;i<(this.startingPopulationSize/2)+var-1;i++) {
			this.population.addFemales();
		}
		for(int i=0;i<(this.startingPopulationSize/2)-1;i++) {
			this.population.addMales();
		}
		//System.out.println("Genesis Done!");
	}
	
	public void runSimulation() {
		for(int i = 0; i < this.simulationLength; i++) {
			this.population.age();
			this.population.reproduce(this.minReproductionAge,this.maxReproductionAge,4);
			this.population.die(this.lifeSpan);
			this.selection();
			this.statistics[i] = new Statistics(population);
			//System.out.println(i);
		}
		//System.out.println("Simulation Done!");
	}
	
	
	public void selection() {
		
		//int deathAge = this.minReproductionAge+(this.maxReproductionAge-this.minReproductionAge)/2;
		int deathAge = this.lifeSpan;
		
		if(this.userInterface.getHairColorButton().getText().equals(UI.HAIR_COLOR_TEXT)) {
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
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Simulation simulation = new Simulation();
		simulation.genesis(simulation.startingPopulationSize);
		simulation.runSimulation();
		simulation.statistics[simulation.simulationLength-1].printLimitedPercents();
		//System.out.println();
		//System.out.println(simulation.statistics[simulation.simulationLength-1].createString());
	}

}
