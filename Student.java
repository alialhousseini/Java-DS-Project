package project;

//Student.java================
import java.util.ArrayList;

public class Student {
    private long id;
    private String name;
    private ArrayList<Subject> subjectList;
    public Student(long id,String name) {
        this.setId(id);
        this.setName(name);
        subjectList=new ArrayList<Subject>();
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public ArrayList<Subject> getSubject() {
        return subjectList;
    }
    public void setSubject(Subject s) {
        subjectList.add(s);
    }
    public String toString() {
        return id+" "+name;
    }
    public double getNote() {
        int s=0;
        for(int i=0;i<subjectList.size();i++)
        {
            s+=subjectList.get(i).getGrade();
        }
        return s;
    }
    public int getTotalNumberofSubject(){
        return subjectList.size();
    }
}