import java.util.Scanner;

public class GradeCalculator{
    public static void main(String []args){
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the no. of subjects:");
        int noSubjects=scanner.nextInt();
        
        int totalMarks=0;

        System.out.println("Enter marks get in each subject (out of 100):");

        for(int i=1;i<=noSubjects;i++){
            System.out.println("Subject" +i+ ":");
            int marks=scanner.nextInt();

            if(marks<0||marks>100){
                System.out.println("Invalid marks.");
                return;
            }
            totalMarks+=marks;
        }

        double averagePercentage=(double)totalMarks/noSubjects;
        System.out.println("Total Marks:"+totalMarks);
        System.out.println("Average Percentage:"+averagePercentage+ "%");

        char grade=calulatorGrade(averagePercentage);
        System.out.println("Grade:"+grade);
    }

    private static char calulatorGrade(double averagePercentage){
        if(averagePercentage>=90){
            return 'A';
        }

        else if(averagePercentage>=80){
            return 'B';
        }
        
        else if(averagePercentage>=70){
            return 'C';
        }

        else if(averagePercentage>=60){
            return 'D';
        }

        else if(averagePercentage>=50){
            return 'E';
        }

        else{
            return 'F';
        }
    }
}