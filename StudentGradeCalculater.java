import java.util.*;
public class StudentGradeCalculater {
    public static int StudentTotalMarks(int []marks){
        int Marks = 0;
        for(int i=0;i<marks.length;i++){
            Marks = Marks + marks[i];
        }
        return Marks;
    }

    public static float StudentAvgPercentage(int TotalMarks,int Subject){
        float AvgPercentage = (float)(TotalMarks/Subject);
        return AvgPercentage;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Name: ");
        String Name = sc.nextLine();

        System.out.print("Enter Number of Subjects you Appeared: ");
        int Subject = sc.nextInt();

        int []marks = new int[Subject];
        System.out.print("Enter your Marks Out of 100: ");
        for(int i=0;i<Subject;i++){
            marks[i]=sc.nextInt();
        }
        int TotalMarks = StudentTotalMarks(marks);

        float AvgPercentage = StudentAvgPercentage(TotalMarks,Subject);
        // System.out.println(TotalMarks);
        System.out.println(Name + " you appeared "+ Subject + " Subjects");
        System.out.println("Total Marks: "+ TotalMarks +" and Average Percentage: " + AvgPercentage);
        
        if(AvgPercentage >= 90){
            System.out.print("Grade A");
        }
        else if(AvgPercentage >= 80 && AvgPercentage < 90){
            System.out.print("Grade B");
        }
        else if(AvgPercentage >= 70 && AvgPercentage < 80){
            System.out.print("Grade C");
        }
        else if(AvgPercentage >= 60 && AvgPercentage < 70){
            System.out.print("Grade D");
        }
        else if(AvgPercentage >= 50 && AvgPercentage < 60){
            System.out.print("Grade E");
        }
        else if(AvgPercentage >= 40 && AvgPercentage < 50){
            System.out.print("Grade F");
        }
        else 
            System.out.print("FAIL");
            
        }
    }

