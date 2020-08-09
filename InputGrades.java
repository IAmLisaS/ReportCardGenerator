// Lisa Sinn
// Intro to Java - CSCI 1146 
// CSCI 1146
// Unit 8, Exercise #7b
// InputGrades.java


import java.util.*;

public class InputGrades {

      public static void main(String[] args) {

            // scanner for input

            Scanner scanner = new Scanner(System.in);

            // number of courses and students

            int courseCount = 5, studentsCount = 10;

            // creating an array of Student objects

            Student students[] = new Student[studentsCount];

            // looping for studentCount times

            for (int i = 0; i < studentsCount; i++) {

                  // creating a student

                  Student s = new Student();

                  // asking for student id, reading and updating in s

                  System.out.print("Enter student id: ");

                  int studentId = scanner.nextInt();

                  s.setID(studentId);

                  int index = 0;

                  // looping until all course data is entered for current student

                  while (index < courseCount) {

                        // asking for course data. to make things simple and easy to

                        // input, we are reading course id, credits and grade together

                        // (in one line), or it will be difficult to enter 3*5*10 inputs

                        // separately

                        System.out.print("Enter id, credits and grade for course#"

                                    + (index + 1) + ": ");

                        // the input must be in the format <courseId> <credits> <grade>

                        String courseId = scanner.next();

                        int credits = scanner.nextInt();

                        char grade = scanner.next().toUpperCase().charAt(0);

                        // validating the grade

                        if (grade == 'A' || grade == 'B' || grade == 'C'

                                    || grade == 'D' || grade == 'F') {

                              // valid, creating a Course and setting attributes

                              CollegeCourse course = new CollegeCourse();

                              course.setCredits(credits);

                              course.setGrade(grade);

                              course.setID(courseId);

                              // setting course at index position in Student s

                              s.setCourse(course, index);

                              // updating index

                              index++;

                        } else {

                              // invalid grade

                              System.out.println("Invalid grade!");

                        }

                  }

                  // adding s to array at index i

                  students[i] = s;

            }

            // looping and displaying details of all students

            for (int i = 0; i < studentsCount; i++) {

                  System.out.println("\nStudent #" + (i + 1) + " ID #"

                              + students[i].getID());

                  for (int j = 0; j < courseCount; j++) {

                        // since we implemented toString method in CollegeCourse class,

                        // we can simply print it

                        System.out.println(students[i].getCourse(j));

                  }

            }

      }

}