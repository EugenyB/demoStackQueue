package main;

import model.Student;
import sod.Stack;

public class Main {

    public static void main(String[] args) {
	    new Main().run();
    }

    private void run() {
        Student[] students = createStudentsArray();
        printArray(students);

        Stack stack = new Stack(10);
        for (Student student : students) {
            stack.push(student);
        }

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

    private Student[] createStudentsArray() {
        return new Student[]{
            new Student(1,"Иванов", 80),
            new Student(2,"Сидоров", 90),
            new Student(3,"Петренко", 60),
            new Student(4,"Петров", 75),
            new Student(5,"Котов", 52)
        };
    }

    private void printArray(Student[] students) {
        System.out.println("----------- Students ----------------");
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("-------------------------------------");
    }
}
