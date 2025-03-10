import java.util.Arrays;

public class Student {
    int rollNumber;
    String name;
    int [] marks = new int[3];

    public Student(int rollNumber, String name, int [] marks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks = marks;
    }

    public void display() {
        System.out.println("Roll Number: " + this.rollNumber);
        System.out.println("Name: " + this.name);

        double averageMarks = this.getAverageMarks();

        if (averageMarks >= 80) {
            System.out.println("Grade : A");
        }
        else if (averageMarks >= 70) {
            System.out.println("Grade : B");
        }
        else if (averageMarks >= 60) {
            System.out.println("Grade : C");
        }
        else if (averageMarks >= 50) {
            System.out.println("Grade : D");
        }
        else if(averageMarks >= 40) {
            System.out.println("Grade : E");
        }
        else{
            System.out.println("Grade : F");
        }
    }
    public double getAverageMarks() {
        int totalMarks = 0;

        for(int i = 0; i < marks.length; i++) {
            totalMarks += marks[i];
        }
        return (double) totalMarks /marks.length;
    }
    public static void main(String[] args) {
        int [] marks = {80,80,80};
        Student student = new Student(21,"Mary",marks);

        student.display();

    }
}

//Roll Number: 21
//Name: Mary
//Grade : A
