package problem1;

import java.util.ArrayList;

/**
 * 
 * problem1 class contains three methods in total; where's the first method get my student ID,
 * second method convert the numeric grades to letter grade, and
 * third method return the average of grades at the scale of 10.
 * 
 * @author Nurjahan A. Shiah
 */
public class problem1 {
	
	/**
	 * method 1 to return my ID
	 * @return A string of my student ID
	 */
	
	public static String getMyID() {
		return "12345678";

	}
	
	/**
	 * method 2: Convert to get the letter grade
	 * @pre The input grade is a double number between zero and 100 inclusive.
	 * @param grade- double
	 * @return A string representing the grade 
	 */
	
	public static String getLetterGrade(double grade) {
		
		if (grade >= 90) {
			return "A+";
		}else if (grade >= 80){
			return "A";
		}else if (grade >= 75){
			return "B+";
		}else if (grade >= 70){
			return "B";
		}else if (grade >= 60){
			return "C";
		}else if (grade >= 55){
			return "D+";
		}else if (grade >= 50){
			return "D";
		}else if (grade >= 45){
			return "E";
		}
		return "F";
		
	}
	
	/**
	 * Method 3: return the average of grades at the scale of 10.
	 * result is rounded to two decimal places. 
	 * 
	 * @pre grades should not be null or empty.
	 * @pre grades should be between 0 and 100, inclusive. 
	 * @param grades- Arraylist of double values
	 * @throws IllegalArgumentException if the grade is null or empty
	 * @return average of the grades on a scale of 10 with two decimal places 
	 * 
	 */
	
	public static double addAndChangeScale(ArrayList<Double> grades) {
        if (grades == null || grades.isEmpty()) {
            throw new IllegalArgumentException("Please provide valid grades.");
        }

        // Calculate the sum of grades using a for loop
        double sum = 0.0;
        for (double grade : grades) {
            sum += grade;
        }

        // Calculate the average
        double average = sum / grades.size();

        // Scale the average to 10
        double scaled = average / 10;

        // Round the result to two decimal places
        return Math.round(scaled * 100.0) / 100.0;
    }
}
