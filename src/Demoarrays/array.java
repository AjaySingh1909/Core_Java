package Demoarrays;

class Student
{
	String name;
	int num;
	int score;
	public Student(String name, int num, int score) 
	{
		super();
		this.name = name;
		this.num = num;
		this.score = score;
	}
	
}

public class array
{
	public static void main(String[] args) 
	{
		Student[] std=new Student[10];
		Student s1=new Student("ajay", 1, 12);
		Student s2=new Student("avinash", 2, 11);
		//System.out.println(s1.name);
		findhighestscore( s1,s2);

	}


public static Student findhighestscore(Student s1, Student s2) {
	if(s1.score>s2.score){
		System.out.println(s1.name);
		//return s1;
	}
	else
	{
		System.out.println(s2.name);
	}
	return s2 ;
}
}
//public class array {
//	public static void main(String[] args) {
//		int[] empId=new int[5];
//		empId[0]=100;
//		empId[1]=101;
//		empId[2]=102;
//		for(int i=0; i<empId.length;i++) {
//			System.out.println(empId[i]);
//		}
//
//	}
//
//}
