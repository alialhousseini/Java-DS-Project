# Java-DS-Project

### Project
Student ID at XYZ University is composed of **nine digits** including year of admission and students
number. In this project, we aim to implement a structure that improves operations of inserting and
searching for a student. To enhance these operations, we will build a **tree of DoublyLinkedList
(TreeOfLists)** to combine advantages of both structures. Each node in the tree contains the following
fields:
* leftChild: reference to the left child node.
* rightChild: reference to the right child node.
* key: is an integer represents the year of admission (4 digits), i.e all students who were admitted in
the same year will be in this node.
* data: is a doubly linked list contains students objects.

Every student has an id (long), name (String), and an array list of subjects.
Subject has id (int), title (String), credit hours (int), and grade (double).

![GitHub Logo](/images/logo.png)

### Implementation
You need to:
1. Create a new class Student, and Subject, class student should have toString method that returns
student id +” “+ student’s name.
2. Build class TreeOfLists which will use class Tree, and class Doublylikedlist.
You should not change these two classes, where class Tree has only the public methods: insert,
search, delete, and traverse. The class DoublyLinkedlist has the public methods: first, last,
isEmpty, size, addFirst, addLast, removeFirst, removeLast.

Class TreeOfLists should have the following method:

a. insert(Student) to insert a new student. It should be inserted based on his ID in a tree node
that has doubly linked list represents students in that year, if no node created yet for that
year (i.e. this is the first student) then a new node should be created, you can insert at the
beginning or at the end.
b. find( int id) it returns a student with that ID or null.
c. delete(int id ): it deletes the students with the input id and returns true, or returns false if
there is no students with that id. If that student is the only one in that node, then node should
be also deleted.
d. addSubject(id, sub) the method will receive student’s id and a subject object, it adds that
subject to the student’s arraylist of subjects and returns true, if there is no students with the
subject, it returns false.2
e. Avg(int year): which returns the average grade of all students in that year. The average will
the total of all grades/ no. of subjects for all students in that year. If no students, the method
should return zero.
f. PirntStudents: which prints all students (ids and names), the students should be printed
based on their years of admissions in an ascending order, for example first print all students
who were admitted in 2017, then 2018, …etc. You need to add method toString to class
DoublyLinkedlist that returns a string represents data of each object in the list,
g. Test your structure in a test application (contains main method).
