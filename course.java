
// Course.java
class Course {

    // Instance variables
    String courseName;
    int duration;
    int studentsEnrolled;

    // Final variable
    final String creator = "CodeMentor Academy";

    // Static variable
    static int totalStudents = 0;

    // Parameterized Constructor
    Course(String courseName, int duration, int studentsEnrolled) {
        this.courseName = courseName;
        this.duration = duration;
        this.studentsEnrolled = studentsEnrolled;

        // Updating total students
        totalStudents += studentsEnrolled;
    }

    // Method to display course details
    void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration (weeks): " + duration);
        System.out.println("Students Enrolled: " + studentsEnrolled);
        System.out.println("Course Creator: " + creator);
        System.out.println();
    }

    // Static Nested Class
    static class Platform {
        static void showPlatformMessage() {
            System.out.println("Courses are hosted on CodeMentor");
        }
    }
}
