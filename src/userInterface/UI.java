/*
***Old Code***

public class UI {
	
	public static int startingPoulationSize() {
		System.out.println("Starting population size:");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		return scan.nextInt();
	}
	public static int simulationLength() {
		System.out.println("Number of years:");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		return scan.nextInt();
	}
	public static int lifeSpan() {
		System.out.println("Enter a lifespan:");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		return scan.nextInt();
	}					
	public static int minReproductionAge() {
		System.out.println("Enter a minimum age for reproduction:");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		return scan.nextInt();
	}
	public static int maxReproductionAge() {
		System.out.println("Enter a maximum age for reproduction:");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		return scan.nextInt();
	}
	
	public static void printPopulationPhenotype(Population population) {
		/*for(Species i: population.females) {
			System.out.println(i.getPhenotype().toString());
		}
		for(Species i: population.males) {
			System.out.println(i.getPhenotype().toString());
		}
		System.out.println(population.females.size()+population.males.size());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
	}
	
	
	
	/*
	public boolean getStart() {
		return start;
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

	public int getHearing() {
		return hearing;
	}

	public int getColorVision() {
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

	public int getStartingPopulation() {
		return startingPopulation;
	}

	public int getLifeSpan() {
		return lifeSpan;
	}

	public int getMinAgeReproduction() {
		return minAgeReproduction;
	}

	public int getMaxAgeReproduction() {
		return maxAgeReproduction;
	}

	public int getSimulationLength() {
		return simulationLength;
	}

	
	
	public void setStart(boolean start) {
		this.start = start;
	}
	public void setHairColor(int hairColor) {
		this.hairColor = hairColor;
	}

	public void setBloodType(int bloodType) {
		this.bloodType = bloodType;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void setHearing(int hearing) {
		this.hearing = hearing;
	}

	public void setColorVision(int colorVision) {
		this.colorVision = colorVision;
	}

	public void setQualityOfVision(int qualityOfVision) {
		this.qualityOfVision = qualityOfVision;
	}

	public void setEyeColor(int eyeColor) {
		this.eyeColor = eyeColor;
	}

	public void setSkinColor(int skinColor) {
		this.skinColor = skinColor;
	}

	public void setStartingPopulation(int startingPopulation) {
		this.startingPopulation = startingPopulation;
	}

	public void setLifeSpan(int lifeSpan) {
		this.lifeSpan = lifeSpan;
	}

	public void setMinAgeReproduction(int minAgeReproduction) {
		this.minAgeReproduction = minAgeReproduction;
	}

	public void setMaxAgeReproduction(int maxAgeReproduction) {
		this.maxAgeReproduction = maxAgeReproduction;
	}

	public void setSimulationLength(int simulationLength) {
		this.simulationLength = simulationLength;
	}
	

}*/

package userInterface;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
//import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class UI extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static final String STARTING_POPULATION_TEXT = "Starting Population";
	public static final String LIFE_SPAN_TEXT = "Life Span";
	public static final String MIN_AGE_REPRODUCTION_TEXT = "Minimum Age for Reproduction";
	public static final String MAX_AGE_REPRODUCTION_TEXT = "Maximum Age for Reproduction";
	public static final String SIMULATION_LENGTH_TEXT = "Simulation Length";
	
	public static final String HAIR_COLOR_TEXT = "Hair Color: Not Unfavorable";
	public static final String BLOOD_TYPE_TEXT = "Blood Type: Not Unfavorable";
	public static final String HEIGHT_TEXT = "Height: Not Unfavorable";
	public static final String HEARING_TEXT = "Hearing: Not Unfavorable";
	public static final String COLOR_VISION_TEXT = "Color Vision: Not Unfavorable";
	public static final String QUALITY_OF_VISION_TEXT = "Quality of Vision: Not Unfavorable";
	public static final String EYE_COLOR_TEXT = "Eye Color: Not Unfavorable";
	public static final String SKIN_COLOR_TEXT = "Skin Color: Not Unfavorable";
	
	//protected JFrame guiOutput;
	
	protected final JPanel comboPanel;
	
	protected JLabel startingPopulationText;
	protected JLabel lifeSpanText;
	protected JLabel minAgeReproductionText;
	protected JLabel maxAgeReproductionText;
	protected JLabel simulationLengthText;
	
	protected JTextField startingPopulationField;
	protected JTextField lifeSpanField;
	protected JTextField minAgeReproductionField;
	protected JTextField maxAgeReproductionField;
	protected JTextField simulationLengthField;
	
	protected JButton hairColorButton;
	protected JButton bloodTypeButton;
	protected JButton heightButton;
	protected JButton hearingButton;
	protected JButton colorVisionButton;
	protected JButton qualityOfVisionButton;
	protected JButton eyeColorButton;
	protected JButton skinColorButton;
	protected JButton resetButton;
	protected JButton startButton;
	
	protected static boolean start;
	//protected static int hairColor, bloodType, height, hearing, colorVision, qualityOfVision, eyeColor, skinColor, startingPopulation, lifeSpan, minAgeReproduction, maxAgeReproduction, simulationLength;
	
	
	public UI() {
		
		comboPanel = new JPanel();
		
		startingPopulationText = new JLabel(UI.STARTING_POPULATION_TEXT);
		lifeSpanText = new JLabel(UI.LIFE_SPAN_TEXT);
		minAgeReproductionText = new JLabel(UI.MIN_AGE_REPRODUCTION_TEXT);
		maxAgeReproductionText = new JLabel(UI.MAX_AGE_REPRODUCTION_TEXT);
		simulationLengthText = new JLabel(UI.SIMULATION_LENGTH_TEXT);
		
		startingPopulationField = new JTextField(); 
		lifeSpanField = new JTextField();
		minAgeReproductionField = new JTextField();
		maxAgeReproductionField = new JTextField();
		simulationLengthField = new JTextField();
		hairColorButton = new JButton(UI.HAIR_COLOR_TEXT);
		bloodTypeButton = new JButton(UI.BLOOD_TYPE_TEXT);
		heightButton = new JButton(UI.HEIGHT_TEXT);
		hearingButton = new JButton(UI.HEARING_TEXT);
		colorVisionButton = new JButton(UI.COLOR_VISION_TEXT);
		qualityOfVisionButton = new JButton(UI.QUALITY_OF_VISION_TEXT);
		eyeColorButton = new JButton(UI.EYE_COLOR_TEXT);
		skinColorButton = new JButton(UI.SKIN_COLOR_TEXT);
		resetButton = new JButton("RESET");
		startButton = new JButton("START");
		
	}
	
	
	public void setup() {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Closes the program when the frame closes
		this.setTitle("Evolution Sumulator");
		this.setSize(500,500);
		this.setLocationRelativeTo(null); //center the JFrame
		
		final JPanel comboPanel = new JPanel();
		JLabel title = new JLabel("Unfavorable Traits:");
		comboPanel.add(title);
		
		this.setLayout(new GridLayout(16,1));
		
		this.add(startingPopulationField);
		this.add(lifeSpanField);
		this.add(minAgeReproductionField);
		this.add(maxAgeReproductionField);
		this.add(simulationLengthField);
		
		this.add(comboPanel);
		
		this.add(hairColorButton);
		this.add(bloodTypeButton);
		this.add(heightButton);
		this.add(hearingButton);
		this.add(colorVisionButton);
		this.add(qualityOfVisionButton);
		this.add(eyeColorButton);
		this.add(skinColorButton);
		
		this.add(resetButton);
		/*resetButton.setBackground(Color.BLUE);
		resetButton.setOpaque(true);
		resetButton.setBorderPainted(false);
		resetButton.setForeground(Color.WHITE);*/
		
		this.add(startButton);
		
		this.setVisible(true); //make sure the JFrame is visible 
		
		UI.start = false;
	}
	
	
	public void input() {
		
		hairColorButton.addActionListener(new ActionListener() { 
			@Override public void actionPerformed(ActionEvent event) { 
				if(hairColorButton.getText().equals(UI.HAIR_COLOR_TEXT)) {
					hairColorButton.setText("Hair Color: Black");
				} else if(hairColorButton.getText().equals("Hair Color: Black")) {
					hairColorButton.setText("Hair Color: Brown");
				} else if(hairColorButton.getText().equals("Hair Color: Brown")) {
					hairColorButton.setText("Hair Color: Blond");
				} else {
					hairColorButton.setText(UI.HAIR_COLOR_TEXT);
				}
			}
		});
		bloodTypeButton.addActionListener(new ActionListener() { 
			@Override public void actionPerformed(ActionEvent event) { 
				if(bloodTypeButton.getText().equals(UI.BLOOD_TYPE_TEXT)) {
					bloodTypeButton.setText("Blood Type: AA/Ao");
				} else if(bloodTypeButton.getText().equals("Blood Type: AA/Ao")) {
					bloodTypeButton.setText("Blood Type: BB/Bo");
				} else if(bloodTypeButton.getText().equals("Blood Type: BB/Bo")) {
					bloodTypeButton.setText("Blood Type: AB");
				} else if(bloodTypeButton.getText().equals("Blood Type: AB")) {
					bloodTypeButton.setText("Blood Type: oo");
				} else {
					bloodTypeButton.setText(UI.BLOOD_TYPE_TEXT);
				}
				} 
			});
		heightButton.addActionListener(new ActionListener() { 
			@Override public void actionPerformed(ActionEvent event) { 
				if(heightButton.getText().equals(UI.HEIGHT_TEXT)) {
					heightButton.setText("Height: Tall");
				} else if(heightButton.getText().equals("Height: Tall")) {
					heightButton.setText("Height: Medium");
				} else if(heightButton.getText().equals("Height: Medium")) {
					heightButton.setText("Height: Short");
				} else {
					heightButton.setText(UI.HEIGHT_TEXT);
				}
				} 
			});
		hearingButton.addActionListener(new ActionListener() { 
			@Override public void actionPerformed(ActionEvent event) { 
				if(hearingButton.getText().equals(UI.HEARING_TEXT)) {
					hearingButton.setText("Hearing: Normal");
				} else if(hearingButton.getText().equals("Hearing: Normal")) {
					hearingButton.setText("Hearing: Deaf");
				} else {
					hearingButton.setText(UI.HEARING_TEXT);
				}
				} 
			});
		colorVisionButton.addActionListener(new ActionListener() { 
			@Override public void actionPerformed(ActionEvent event) { 
				if(colorVisionButton.getText().equals(UI.COLOR_VISION_TEXT)) {
					colorVisionButton.setText("Color Vision: Normal");
				} else if(colorVisionButton.getText().equals("Color Vision: Normal")) {
					colorVisionButton.setText("Color Vision: Color Blind");
				} else {
					colorVisionButton.setText(UI.COLOR_VISION_TEXT);
				}
				} 
			});
		qualityOfVisionButton.addActionListener(new ActionListener() { 
			@Override public void actionPerformed(ActionEvent event) { 
				if(qualityOfVisionButton.getText().equals(UI.QUALITY_OF_VISION_TEXT)) {
					qualityOfVisionButton.setText("Vision: Good");
				} else if(qualityOfVisionButton.getText().equals("Vision: Good")) {
					qualityOfVisionButton.setText("Vision: Medium");
				} else if(qualityOfVisionButton.getText().equals("Vision: Medium")) {
					qualityOfVisionButton.setText("Vision: Bad");
				} else {
					qualityOfVisionButton.setText(UI.QUALITY_OF_VISION_TEXT);
				}
				} 
			});
		eyeColorButton.addActionListener(new ActionListener() { 
			@Override public void actionPerformed(ActionEvent event) {
				if(eyeColorButton.getText().equals(UI.EYE_COLOR_TEXT)) {
					eyeColorButton.setText("Eye Color: Brown");
				} else if(eyeColorButton.getText().equals("Eye Color: Brown")) {
					eyeColorButton.setText("Eye Color: Green");
				} else if(eyeColorButton.getText().equals("Eye Color: Green")) {
					eyeColorButton.setText("Eye Color: Blue");
				} else {
					eyeColorButton.setText(UI.EYE_COLOR_TEXT);
				}
				} 
			});
		skinColorButton.addActionListener(new ActionListener() { 
			@Override public void actionPerformed(ActionEvent event) {
				if(skinColorButton.getText().equals(UI.SKIN_COLOR_TEXT)) {
					skinColorButton.setText("Skin Color: Black");
				} else if(skinColorButton.getText().equals("Skin Color: Black")) {
					skinColorButton.setText("Skin Color: Brown");
				} else if(skinColorButton.getText().equals("Skin Color: Brown")) {
					skinColorButton.setText("Skin Color: White");
				} else {
					skinColorButton.setText(UI.SKIN_COLOR_TEXT);
				}
				} 
			});	
		resetButton.addActionListener(new ActionListener() { 
			@Override public void actionPerformed(ActionEvent event) { 
				//hairColor=-1; bloodType=-1; hearing=-1; height=-1; colorVision=-1; qualityOfVision=-1; eyeColor=-1; skinColor=-1;
				//startingPopulation=-1; lifeSpan=0; minAgeReproduction=0; maxAgeReproduction=0; simulationLength=0;
				startingPopulationField.setText(UI.STARTING_POPULATION_TEXT);
				lifeSpanField.setText(UI.LIFE_SPAN_TEXT);
				minAgeReproductionField.setText(UI.MIN_AGE_REPRODUCTION_TEXT);
				maxAgeReproductionField.setText(UI.MAX_AGE_REPRODUCTION_TEXT);
				simulationLengthField.setText(UI.SIMULATION_LENGTH_TEXT);
				hairColorButton.setText(UI.HAIR_COLOR_TEXT);
				bloodTypeButton.setText(UI.BLOOD_TYPE_TEXT);
				heightButton.setText(UI.HEIGHT_TEXT);
				hearingButton.setText(UI.HEARING_TEXT);
				colorVisionButton.setText(UI.COLOR_VISION_TEXT);
				qualityOfVisionButton.setText(UI.QUALITY_OF_VISION_TEXT);
				eyeColorButton.setText(UI.EYE_COLOR_TEXT);
				skinColorButton.setText(UI.SKIN_COLOR_TEXT);
				}
			});
	}

	
	public boolean start() {
		start = false;
		startButton.addActionListener(new ActionListener() { 
			@Override public void actionPerformed(ActionEvent event) {
					start = true;
					
					
					
					//this.setLayout(new GridLayout(16,1));
			}
			});
		return start;
		
	}
	
	
	public int startingPopulation() {
		int temp;
		try {
			temp = Integer.parseInt(this.startingPopulationField.getText());
		} catch(Exception e) {
			//e.printStackTrace();
			temp = 2;
		}
		return temp;
	}
	public int lifeSpan() {
		int temp;
		try {
			temp = Integer.parseInt(this.lifeSpanField.getText());
		} catch(Exception e) {
			//e.printStackTrace();
			temp = 80;
		}
		return temp;
	}
	public int minAgeReproduction() {
		int temp;
		try {
			temp = Integer.parseInt(this.minAgeReproductionField.getText());
		} catch(Exception e) {
			//e.printStackTrace();
			temp = 18;
		}
		return temp;
	}
	public int maxAgeReproduction() {
		int temp;
		try {
			temp = Integer.parseInt(this.maxAgeReproductionField.getText());
		} catch(Exception e) {
			//e.printStackTrace();
			temp = 35;
		}
		return temp;
	}
	public int simulationLength() {
		int temp;
		try {
			temp = Integer.parseInt(this.simulationLengthField.getText());
		} catch(Exception e) {
			//e.printStackTrace();
			temp = 500;
		}
		return temp;
	}


	/**
	 * @return the startingPopulationField
	 */
	public JTextField getStartingPopulationField() {
		return startingPopulationField;
	}


	/**
	 * @return the lifeSpanField
	 */
	public JTextField getLifeSpanField() {
		return lifeSpanField;
	}


	/**
	 * @return the minAgeReproductionField
	 */
	public JTextField getMinAgeReproductionField() {
		return minAgeReproductionField;
	}


	/**
	 * @return the maxAgeReproductionField
	 */
	public JTextField getMaxAgeReproductionField() {
		return maxAgeReproductionField;
	}


	/**
	 * @return the simulationLengthField
	 */
	public JTextField getSimulationLengthField() {
		return simulationLengthField;
	}


	/**
	 * @return the hairColorButton
	 */
	public JButton getHairColorButton() {
		return hairColorButton;
	}


	/**
	 * @return the bloodTypeButton
	 */
	public JButton getBloodTypeButton() {
		return bloodTypeButton;
	}


	/**
	 * @return the heightButton
	 */
	public JButton getHeightButton() {
		return heightButton;
	}


	/**
	 * @return the hearingButton
	 */
	public JButton getHearingButton() {
		return hearingButton;
	}


	/**
	 * @return the colorVisionButton
	 */
	public JButton getColorVisionButton() {
		return colorVisionButton;
	}


	/**
	 * @return the qualityOfVisionButton
	 */
	public JButton getQualityOfVisionButton() {
		return qualityOfVisionButton;
	}


	/**
	 * @return the eyeColorButton
	 */
	public JButton getEyeColorButton() {
		return eyeColorButton;
	}


	/**
	 * @return the skinColorButton
	 */
	public JButton getSkinColorButton() {
		return skinColorButton;
	}


	/**
	 * @return the resetButton
	 */
	public JButton getResetButton() {
		return resetButton;
	}


	/**
	 * @return the startButton
	 */
	public JButton getStartButton() {
		return startButton;
	}


	/**
	 * @return the start
	 */
	public static boolean isStart() {
		return start;
	}
	
}
	

