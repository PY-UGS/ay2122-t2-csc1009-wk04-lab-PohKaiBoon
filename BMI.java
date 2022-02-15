import java.lang.Math;


public class BMI {
    
    private double pounds;
    private double inches;
    private double bmi;
    public static final double KILO_PER_POUND= 0.45359237;
    public static final double METERS_PER_INCH= 0.0254;


    public BMI(double pounds, double inches) {
        this.pounds = pounds;
        this.inches = inches;



    }

    public void calculateBMI() {
        
        double kg= this.pounds*KILO_PER_POUND;
        double m= this.inches*METERS_PER_INCH;

        double bmi= kg/(Math.pow(m,2));
        System.out.println("BMI is: "+ bmi);
        this.bmi= bmi;
    }

    public void determineBMI() {
        
        switch ((this.bmi<18.5) ? 0 :
                (this.bmi >= 18.5 &&  this.bmi < 25) ? 1 :
                (this.bmi >= 25 &&  this.bmi < 30)? 2:
                (this.bmi == 30 )? 3 :4)
                {
                    case 0:
                        System.out.println("Underweight");
                        break;

                    case 1:
                        System.out.println("Normal");
                        break;
                    
                    case 2:
                        System.out.println("Overweight");
                        break;

                    case 3:
                        System.out.println("Obese");
                        break;

                    case 4:
                        System.out.println("Out of range");
                        break;


                }
    }

	
    
    //Getters
    public double getPounds() {
		return this.pounds;
	}

    public double getInches() {
		return this.inches;
	}

    public double getBmi() {
        return this.bmi;
    }


    //Setters
	public void setPounds(double pounds) {
		this.pounds = pounds;
	}


	public void setInches(double inches) {
		this.inches = inches;
	}

    public void setBmi(double bmt) {
        this.bmi = bmt;
    }





}
