package project;

//=====TreeNode.java============
public class TreeNode {
  private TreeNode leftChild;
  private TreeNode rightChild;
  private int key;//year of admission
  private DoublyLinkedList studentList;
  public TreeNode() {
      setLeftChild(null);
      setRightChild(null);
      studentList=new DoublyLinkedList();
  }
  public TreeNode(int key) {
      this.setKey(key);
      setLeftChild(null);
      setRightChild(null);
      studentList=new DoublyLinkedList();
  }
  public TreeNode getLeftChild() {
      return leftChild;
  }
  public void setLeftChild(TreeNode leftChild) {
      this.leftChild = leftChild;
  }
  public TreeNode getRightChild() {
      return rightChild;
  }
  public void setRightChild(TreeNode rightChild) {
      this.rightChild = rightChild;
  }
  public int getKey() {
      return key;
  }
  public void setKey(int key) {
      this.key = key;
  }
  public void addStudent(Student stud) {
      studentList.addFirst(stud);
  }
  public DoublyLinkedList getStudentList() {
      return studentList;
  }

}
//==end of TreeNode.java===============
