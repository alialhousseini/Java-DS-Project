package project;

import java.util.Stack;


//=====TreeOfList.java===========
public class TreeOfList {
    private TreeNode root;
    public TreeOfList() {
        root=null;
    }
    //______________
    public TreeNode getroot()
    {
    	return root;
    }
    public void insert(Student stud) {
        int year=(int) (stud.getId()/100000);

        if(root==null) {
            TreeNode TNode=new TreeNode(year);
            TNode.addStudent(stud);
            root=TNode;
            System.out.println("Inserted");
            return;
        }
        TreeNode tmp=root;
        while(true) {
            if(tmp.getKey()==year) {
                tmp.addStudent(stud);
                System.out.println("Inserted");
                return;
            }
            else if(year<tmp.getKey() && tmp.getLeftChild()==null) {
                TreeNode TNode=new TreeNode(year);
                TNode.addStudent(stud);
                tmp.setLeftChild(TNode);
                System.out.println("Inserted");
                return;
            }
            else if(year<tmp.getKey() && tmp.getLeftChild()!=null) {
                tmp=tmp.getLeftChild();
            }
            else if(year>tmp.getKey() && tmp.getRightChild()==null) {
                TreeNode TNode=new TreeNode(year);
                TNode.addStudent(stud);
                tmp.setRightChild(TNode);
                System.out.println("Inserted");
                return;
            }
            else if(year>tmp.getKey() && tmp.getRightChild()!=null) {
                tmp=tmp.getRightChild();
            }
        }
    }
    //________________
    Student find(long id) {
        int year=(int) (id/100000);
        TreeNode tmp=root;
        while(true) {
            if(year==tmp.getKey()) {
            	return tmp.getStudentList().getStudent(id);
            }
            else if(year<tmp.getKey() && tmp.getLeftChild()==null) {
                return null;
            }
            else if(year<tmp.getKey() && tmp.getLeftChild()!=null) {
                tmp=tmp.getLeftChild();
            }
            else if(year>tmp.getKey() && tmp.getRightChild()==null) {
                return null;
            }
            else if(year>tmp.getKey() && tmp.getRightChild()!=null) {
                tmp=tmp.getRightChild();
            }
        }

    }
    //_________________
    boolean delete(int id) {
        int year=(int) (id/100000);
        TreeNode tmp=root;
        while(true) {
            if(year==tmp.getKey())
                return tmp.getStudentList().remove(id);
            else if(year<tmp.getKey() && tmp.getLeftChild()==null) {
                return false;
            }
            else if(year<tmp.getKey() && tmp.getLeftChild()!=null) {
                tmp=tmp.getLeftChild();
            }
            else if(year>tmp.getKey() && tmp.getRightChild()==null) {
                return false;
            }
            else if(year>tmp.getKey() && tmp.getRightChild()!=null) {
                tmp=tmp.getRightChild();
            }
        }
    }
    //___________________
    boolean addSubject(int id, Subject sub) {
        if(find(id)==null)
            return false;
        else {
            find(id).setSubject(sub);
            System.out.println("Successfully Added!");
            return true;
        }
    }
    double Avg(int year){
        double total=0;
        int noOfSubjects=0;
        Stack<TreeNode> nodes = new Stack<>();
        TreeNode tmp=root;
        while(tmp!=null){
            if (tmp!=null){
                nodes.push(tmp);
                if (year==tmp.getKey()){
                    DoublyLinkedList studentList =tmp.getStudentList();
                    for (int i = 0; i <studentList.size() ; i++) {
                        if(studentList.getnode(i)!=null){
                            total=total+studentList.getnode(i).getData().getNote();
                            noOfSubjects=noOfSubjects+studentList.getnode(i).getData().getTotalNumberofSubject();
                        }

                    }
                }
                tmp=tmp.getLeftChild();
            }



        }
        if (noOfSubjects>0 && total>0){
            return total/noOfSubjects;
        }
        return 0;
    }
    //___________________
    void PrintStudents(TreeNode root)
    {
    	if (root == null) 
            return; 
  
        /* first recur on left child */
    	PrintStudents(root.getLeftChild()); 
  
        /* then print the data of node */
        System.out.println(root.getStudentList().toString());
        System.out.println("-----");
  
        /* now recur on right child */
        PrintStudents(root.getRightChild()); 
    }
    //___________________

}
//==end of TreeOfList.java==============