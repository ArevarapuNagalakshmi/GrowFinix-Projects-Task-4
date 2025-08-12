package com.Students.Students.Dto;

import java.util.Objects;

public class StudentDto {
    private Long id;
    private String name;
    private String branch;
    private double marks;

    public StudentDto(Long id, String name, String branch, double marks) {
        this.id = id;
        this.name = name;
        this.branch = branch;
        this.marks = marks;
    }

    public StudentDto() {
        super();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        StudentDto that = (StudentDto) o;
        return Double.compare(marks, that.marks) == 0 && Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(branch, that.branch);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, branch, marks);
    }

    @Override
    public String toString() {
        return "StudentDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", branch='" + branch + '\'' +
                ", marks=" + marks +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }
}
