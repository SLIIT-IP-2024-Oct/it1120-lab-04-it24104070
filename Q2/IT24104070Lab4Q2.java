import java.util.*;
class IT24104070Lab4Q2{
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
//--------------input exam marks and lab submisiion mark---------------
	
	System.out.print("Please Enter Exam Marks (0-100) : ");
	double examMarks = scanner.nextDouble();
	
	System.out.print("Please Enter Lab Submission Marks (0-100) : ");
	double labMarks = scanner.nextDouble();
	
//---------------validate Enterd Marks---------------------------------

	if(examMarks<0 || examMarks>100 ||labMarks<0 ||labMarks>100){
	System.out.println("Terminating Program.");
	return;
	}
	
//---------------Input percentage weights------------------------------

	System.out.print("Please Enter the percentage for exam marks: ");
	double examPres = scanner.nextDouble();

	System.out.print("Please Enter the percentage for lab submisiion: ");
	double labPres = scanner.nextDouble();
	
	 if (examPres + labPres != 100 ){
              System.out.println("The percentage must add up to 100. Terminating program.");
              return;
           }

	double finalMark = (examMarks * examPres / 100) + (labMarks * labPres / 100);
	
	System.out.printf("The final mark is:"+finalMark);
	
	}
}

