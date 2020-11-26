package project;

//===Subject.java================
public class Subject {
  private int id;
  private String title;
  private int creditHour;
  private double grade;
  public Subject(int id,String title,int creditHour,double grade) {
      this.setId(id);
      this.setTitle(title);
      this.setCreditHour(creditHour);
      this.setGrade(grade);
  }
  public int getId() {
      return id;
  }
  public void setId(int id) {
      this.id = id;
  }
  public String getTitle() {
      return title;
  }
  public void setTitle(String title) {
      this.title = title;
  }
  public int getCreditHour() {
      return creditHour;
  }
  public void setCreditHour(int creditHour) {
      this.creditHour = creditHour;
  }
  public double getGrade() {
      return grade;
  }
  public void setGrade(double grade) {
      this.grade = grade;
  }
}
//====end of Subject.java===============
