/* •Code: 
	Underweight: BMI less than 18.5
•	Normal weight: BMI of 18.5 to 24.9
•	Overweight: BMI of 25 to 29.9
•	Obesity: BMI of 30 or higher
 */


import java.util.*;
class BMI
{
	public static void main(String... args)
	{
		Scanner s =new Scanner(System.in);
		double wt=s.nextDouble();
		double ht=s.nextDouble();
		double Bmi=wt/Math.pow(ht,2);
		if(Bmi<=18.5)
		{
			
			System.out.printf("Underweight having BMI: %.4f" , Bmi );
		}
		else if(Bmi >= 18.5 && Bmi<=24.5)
		{
			System.out.printf("Normal Weight having BMI: %.4f" , Bmi );
		}
		//Overweight: BMI of 25 to 29.9
		else if (Bmi >= 25 && Bmi<=29.5)
		{
			System.out.println("Overweight having BMI: %.4f" , Bmi );
		}
		else
		{
			System.out.println("Obesity having BMI: %.4f", Bmi );
		}
	}
}