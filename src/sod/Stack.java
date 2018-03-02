package sod;

import model.Student;

public class Stack {
    private Student[] students;
    private int ptr;

    public Stack() {
        students = new Student[100];
    }

    public Stack(int size) {
        students = new Student[size];
    }

    public void push(Student student) {
        students[ptr++] = student;
    }

    public Student pop() {
        Student result = students[--ptr];
        students[ptr] = null;
        return result;
    }

    public boolean isEmpty() {
        return ptr == 0;
    }
}
