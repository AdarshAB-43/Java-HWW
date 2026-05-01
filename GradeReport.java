public class GradeReport {
    public static void main(String[] args) {

        int[] marks = {78, 82, 91, 65, 34}; // Change values here

        int total = 0;
        boolean isFail = false;

  
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < 35) {
                System.out.println("Fail");
                isFail = true;
                break; 
            }
            total += marks[i];
        }

        if (!isFail) {
            double average = total / (double) marks.length;

            System.out.println("Total Marks: " + total);
            System.out.println("Average Marks: " + average);

            String grade;

            if (average >= 90) {
                grade = "Grade: A";
            } else if (average >= 75) {
                grade = "Grade: B";
            } else if (average >= 60) {
                grade = "Grade: C";
            } else {
                grade = "Grade: D";
            }

            System.out.println(grade);
        }
    }
}