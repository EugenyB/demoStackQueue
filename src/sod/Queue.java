package sod;

import model.Student;

public class Queue {
    private Student[] students1;
    private Student[] students2;
    private int ptr1;
    private int ptr2;

    public Queue() {
        students1 = new Student[100];
        students2 = new Student[100];
    }

    public void offer(Student student) {
        students1[ptr1++] = student;
    }

    public Student remove() {
        if (ptr2 == 0) {
            while (ptr1>0) {
                students2[ptr2++] = students1[--ptr1];
            }
        }
        return students2[--ptr2];
    }

    public boolean isEmpty() {
        return ptr1+ptr2==0;
    }
}
