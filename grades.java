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
        String inputValue = System.console().readLine("Enter grade that you want to be the failing metric: ");
        var gradee = Integer.parseInt(inputValue);
        int[] failing = new int[this.values.length];
        for (var currentGrade = 0; currentGrade < this.values.length; currentGrade++) {
            if (this.values[currentGrade] < gradee) {
                failing[currentGrade] = newInteger;
            }
        }
        return failing;
    }

    public void histogram() { // prints the histogram of grades
        int[] histogram = new int[101];
        for (var currentGrade = 0; currentGrade <this.values.length; currentGrade++) {
            histogram[currentGrade]++;
            for (int i = 0; i<=100; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class GradesApp {
    public static void main(String[] args) {
        // TODO Need to add error handling if user input is not a number, or negative.
        String response = System.console().readLine("Enter the number of grades to input: ");
        var numberOfGrades = Integer.parseInt(response);

        // for (/* setup */; /* condition to keep going */ ; /* how to advance */) {
        var grades = new int[numberOfGrades];
        for (var currentGrade = 0; currentGrade < numberOfGrades; currentGrade++) {
            String gradeResponse = System.console().readLine("Enter grade " + (currentGrade + 1) + ": ");
            var gradeValue = Integer.parseInt(gradeResponse);
            grades[currentGrade] = gradeValue;
        }   

        // TODO The rest of the assignment 😅
        Grades grader = new Grades(grades);
        System.out.println("highest " +grader.highest());
        System.out.println("lowest " +grader.lowest());
        System.out.println("this is the number of total grades " +grader.numOfGrades());
        System.out.println("this is the average " +grader.average());
        grader.histogram();
    }
}