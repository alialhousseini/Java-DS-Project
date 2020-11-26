package project;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Subject subject1=new Subject(1,"ITC",3,3.44);
        Subject subject2=new Subject(2,"ITCWeb",3,3.44);
        Subject subject3=new Subject(3,"ITCLinux",3,3.44);
        Subject subject4=new Subject(4,"ITCMacOS",3,3.44);
        Subject subject5=new Subject(5,"ITCUbuntu",3,3.44);
        Subject subject6=new Subject(6,"ITCSierra",3,3.44);
        Subject subject7=new Subject(7,"ITCJava",3,3.44);


        Student s1=new Student(202087987,"Ali");
        Student s2=new Student(201998453,"Bahaa");
        Student s3=new Student(202174532,"Khaled");
        Student s4=new Student(202087988,"Ahmad");
        Student s5=new Student(201947938,"John");
        Student s6=new Student(202012355,"Alex");
        Student s7=new Student(202028329,"Mohamad");
        Student s8=new Student(201711222,"Zain");
        Student s9=new Student(202166398,"Amena");
        Student s10=new Student(202139271,"Malak");
        Student s11=new Student(202263398,"Houda");
        Student s12=new Student(202235671,"Aisha");

        System.out.println("Welcome to our Program!");
        System.out.println("Adding 10 students now, and give them subjects randomly..");
        TreeOfList tree=new TreeOfList();
        tree.insert(s1);
        tree.addSubject(202087987,subject1);
        tree.addSubject(202087987,subject2);
        tree.addSubject(202087987,subject3);
        tree.addSubject(202087987,subject4);
        tree.insert(s2);
        tree.addSubject(201998453,subject1);
        tree.addSubject(201998453,subject2);
        tree.addSubject(201998453,subject3);
        tree.addSubject(201998453,subject4);
        tree.insert(s3);
        tree.addSubject(201874532,subject4);
        tree.addSubject(201874532,subject5);
        tree.addSubject(201874532,subject6);
        tree.addSubject(201874532,subject7);
        tree.insert(s4);
        tree.addSubject(202087988,subject4);
        tree.addSubject(202087988,subject5);
        tree.addSubject(202087988,subject6);
        tree.addSubject(202087988,subject7);
        tree.insert(s5);
        tree.addSubject(201947938,subject4);
        tree.addSubject(201947938,subject5);
        tree.addSubject(201947938,subject6);
        tree.addSubject(201947938,subject7);
        tree.insert(s6);
        tree.insert(s7);
        tree.insert(s8);
        tree.insert(s9);
        tree.insert(s10);
        tree.insert(s11);
        tree.insert(s12);


//
        System.out.println("Finished.");
        System.out.println("Adding a subject Math to the student S1");
        Subject sub=new Subject(8,"Math",150,70);
        tree.addSubject(202087987, sub);
        System.out.println("Printing the Average of 2020");
        System.out.println(tree.Avg(2020));
        System.out.println("Delete a student with id included");
        System.out.println(tree.delete(202166398)); // the student s9 called Amena
        System.out.println("Delete a student with id NOT included");
        System.out.println(tree.delete(201612345));
        
        System.out.println("Find ...");
        if (tree.find(201947938)==null)
        	System.out.println("Student Not Found!");
        else
            System.out.println("Student Found!");
        if (tree.find(201911122)==null)
        	System.out.println("Student Not Found!");
        else
            System.out.println("Student Found!");
        
        
        System.out.println("Print Students.");
        tree.PrintStudents(tree.getroot());
        System.out.println("Finishing Printing of Students");
        System.out.println("Get Subject of Ali ...");
        for(int i=0;i<s1.getSubject().size();i++)
        {
        	System.out.print("Id: "+s1.getSubject().get(i).getId());
        	System.out.println(" Name: "+s1.getSubject().get(i).getTitle());
        	
        }
        System.out.println("Get Subject of John ...");
        for(int i=0;i<s5.getSubject().size();i++)
        {
        	System.out.print("Id: "+s5.getSubject().get(i).getId());
        	System.out.println(" Name: "+s5.getSubject().get(i).getTitle());
        	
        }
        
    }
}
