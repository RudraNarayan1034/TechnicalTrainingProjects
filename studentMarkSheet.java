
public class studentMarkSheet {
    private int rollNo;
    private String name;
    private int[] subjectMarks;
    
    // Constructor
    public studentMarkSheet(int rollNo, String name, int[] subjectMarks) {
        this.rollNo = rollNo;
        this.name = name;
        this.subjectMarks = subjectMarks;
    }
    
    // Getter for Roll Number
    public int getRollNo() {
        return rollNo;
    }
    
    // Getter for Name
    public String getName() {
        return name;
    }
    
    // Getter for Subject Marks
    public int[] getSubjectMarks() {
        return subjectMarks;
    }
    
    // Method to compute total marks
    public int computeTotalMarks() {
        int totalMarks = 0;
        for (int mark : subjectMarks) {
            totalMarks += mark;
        }
        return totalMarks;
    }
    
    // Method to compute percentage
    public double computePercentage() {
        int totalMarks = computeTotalMarks();
        return (double) totalMarks / subjectMarks.length;
    }
    
    // Method to compute grade
    public String computeGrade() {
        double percentage = computePercentage();
        if (percentage >= 90) {
            return "A+";
        } else if (percentage >= 80) {
            return "A";
        } else if (percentage >= 70) {
            return "B";
        } else if (percentage >= 60) {
            return "C";
        } else if (percentage >= 50) {
            return "D";
        } else {
            return "F";
        }
    }
    
    // Method to print student report card
    public void printReportCard() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Subject Marks:");
        for (int i = 0; i < subjectMarks.length; i++) {
            System.out.println("Subject " + (i + 1) + ": " + subjectMarks[i]);
        }
        System.out.println("Total Marks: " + computeTotalMarks());
        System.out.println("Percentage: " + computePercentage() + "%");
        System.out.println("Grade: " + computeGrade());
    }
    
    public static void main(String[] args) {
        int[] marks = {95, 80, 90}; // Example marks for three subjects
        studentMarkSheet student = new studentMarkSheet(1, "Rudra Narayan Mishra", marks);
        student.printReportCard();
    }
    
}
