class Grades {
    private int[] values;

    Grades () {

    }

    Grades (int[] myArray) {
        this.values = myArray;
    }

    public void setValues(int[] myArray) { // set values declaration
    }

    public int[] getValues() { // returns values array
        return myArray;
    }

    public int highest() {// returns the highest value in array
        // TODO Not really highest yet, but a check to print the values.
        // for (/* setup */; /* condition to keep going */ ; /* how to advance */) {
        var highest = this.values[0];
        for (var currentGrade = 0; currentGrade < this.values.length; currentGrade++) {
            if (this.values[currentGrade] > highest) {
                highest = this.values[currentGrade];
            }
        }
        return highest;
    }

    public int lowest() {// returns the lowest value in array
        var lowest = this.values[0];
        for (var currentGrade = 0; currentGrade < this.values.length; currentGrade++) {
            if (this.values[currentGrade]< lowest) {
                lowest = this.values[currentGrade];
            }
        }
            return lowest;
    }

    public int numOfGrades() {// returns the number of grades in array
        // returns the length of the array
        return this.values.length;
    }

    public double average() { // returns the average of array
        // for loop that adds up all values and divides them by numerOfGrades
        var sum = 0;
        for (var currentGrade = 0; currentGrade < this.values.length; currentGrade++) {
            sum = sum + this.values[currentGrade];
        }
        return sum/this.values.length;
    }

    public int numOfFailingGrades(int gradeValue) { // returns the number of values in the array that are less than input value, gradeValue
        for (var currentGrade = 0; currentGrade < this.values.length; currentGrade++) {
            if (this.values[currentGrade] < fail) {
                failing[currentGrade] = gradeValue;
            }
        }
        return gradeValue;
    }

public void histogram() { // prints the histogram of grades
    int[] gradercounter = new int[101];
    for (int k = 0; k < this.values.length; k++) {
        int score = this.values[k] - (this.values[k]%10);
        gradercounter[score]++;
    }
    for (int i = 0; i < gradercounter.length; i++) {
        if (gradercounter[i] > 0) {
            System.out.print(i + "-" + (i/10) + "9: ");
            for (int j = 0; j < gradercounter[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class GradesApp {
    public static void main(String[] args) {
        String response = System.console().readLine("Enter the number of grades to input: ");
        var numberOfGrades = Integer.parseInt(response);
        //String inputValue = System.console().readLine("Enter grade that you want to be the failing metric: ");
        //fail = Integer.parseInt(inputValue);

        // for (/* setup */; /* condition to keep going */ ; /* how to advance */) {
        var grades = new int[numberOfGrades];
        for (var currentGrade = 0; currentGrade < numberOfGrades; currentGrade++) {
            String gradeResponse = System.console().readLine("Enter grade " + (currentGrade + 1) + ": ");
            var gradeValue = Integer.parseInt(gradeResponse);
            grades[currentGrade] = gradeValue;
        }

        Grades grader = new Grades(grades);
        System.out.println("highest " +grader.highest());
        System.out.println("lowest " +grader.lowest());
        System.out.println("this is the number of total grades " +grader.numOfGrades());
        System.out.println("this is the average " +grader.average());
        //System.out.println("This is the number of failing grades: " +grader.numofFailingGrades());
        grader.histogram();
    }
}
}
