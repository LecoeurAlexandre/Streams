package org.example;


import org.example.streams.Course;
import org.example.streams.Student;
import org.example.streams.Teacher;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Alain Térieur", "Mathematics", 2010);
        Teacher teacher2 = new Teacher("Alex Térieur", "Physics", 2015);
        Teacher teacher3 = new Teacher("Anne Onyme", "Chemistry", 2005);
        Teacher teacher4 = new Teacher("Eva Nouie", "Informatique", 2003);

        Course course1 = new Course("Calculus", teacher1, 15);
        Course course2 = new Course("Mechanics", teacher2, 10);
        Course course3 = new Course("Organic Chemistry", teacher3, 12);
        Course course4 = new Course("Java", teacher4, 12);

        Student student1 = new Student("Alice Lapin", 18);
        Student student2 = new Student("Bob Splif", 20);
        Student student3 = new Student("Charly Chocolatier", 19);
        Student student4 = new Student("David Goliath", 21);
        Student student5 = new Student("Eve Levtoi", 22);

        student1.addCourse(course1);
        student1.addCourse(course2);
        student2.addCourse(course3);
        student2.addCourse(course1);
        student3.addCourse(course4);
        student3.addCourse(course3);
        student3.addCourse(course1);
        student4.addCourse(course2);
        student4.addCourse(course3);
        student4.addCourse(course1);
        student4.addCourse(course4);
        student5.addCourse(course2);
        student5.addCourse(course1);
        student5.addCourse(course3);

        List<Student> students = Arrays.asList(student1, student2, student3, student4, student5);
        List<Teacher> teachers = Arrays.asList(teacher1, teacher2, teacher3, teacher4);
        List<Course> courses = Arrays.asList(course1, course2, course3, course4);

        //Sélectionner étudiants qui ont plus de 20 ans
        List<String> students1 = students.stream()
                .filter(s -> s.getAge()>20)
                .map(s -> s.getName())
                .collect(Collectors.toList());
        System.out.println(students1);

        //Transformer Teachers en une liste de noms
        List<String> allTeachers = teachers.stream()
                .map(t -> t.getName())
                .collect(Collectors.toList());
        System.out.println(allTeachers);

        // Transformer Teachers en une liste de matières enseignées
        List<String> allDepartments = teachers.stream()
                .map (t -> t.getDepartment())
                .collect(Collectors.toList());
        System.out.println(allDepartments);

        // Liste des teachers en passant par liste des cours
        List<Teacher> allTeachersByCourses = courses.stream()
                .map(c-> c.getTeacher())
                .collect(Collectors.toList());
        System.out.println(allTeachersByCourses);

        //Calculer somme des durées de cours
        Integer sumCourses = courses.stream()
                .mapToInt(c -> c.getDuration())
                .sum();
        System.out.println("Somme des durées de cours : "+sumCourses);

        //Sélectionner la liste des cours de plus de 11h, récupérer liste de leurs noms triés par ordre alphabétique
        List<String> longCourses = courses.stream()
                .filter(c-> c.getDuration()>11)
                .map(c-> c.getName())
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Les cours de plus de 11h : "+longCourses);

    }
}