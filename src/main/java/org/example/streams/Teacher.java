package org.example.streams;

public class Teacher {
    private int id;
    private String name;
    private String department;
    private int startDate;

    private static int counter = 0;

    public Teacher(String name, String department, int startDate) {
        this.id = ++counter;
        this.name = name;
        this.department = department;
        this.startDate = startDate;
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getStartDate() {
        return startDate;
    }

    public void setStartDate(int startDate) {
        this.startDate = startDate;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", startDate=" + startDate +
                '}';
    }
}
