// Lisa Sinn
// Intro to Java - CSCI 1146 
// CSCI 1146
// Unit 8, Exercise #7a
// CollegeCourse.java

public class CollegeCourse {

      private String courseID;

      private int credits;

      private char grade;

      public String getID() {

            return courseID;

      }

      public int getCredits() {

            return credits;

      }

      public char getGrade() {

            return grade;

      }

      public void setID(String idNum) {

            courseID = idNum;

      }

      public void setCredits(int cr) {

            credits = cr;

      }

      public void setGrade(char gr) {

            grade = gr;

      }

      // returns a String containing course id, credits and grade

      public String toString() {

            return courseID + " " + credits + " -- credits. Grade is " + grade;

      }

}