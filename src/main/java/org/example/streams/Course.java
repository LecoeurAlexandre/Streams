package org.example.streams;

public class Course {
    private int id;
    private String name;
    private Teacher teacher;
    private int duration;

    private static int counter = 0;

    public Course( String name, Teacher teacher, int duration) {
        this.id = ++counter;
        this.name = name;
        this.teacher = teacher;
        this.duration = duration;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", teacher=" + teacher +
                ", duration=" + duration +
                '}';
    }
}
