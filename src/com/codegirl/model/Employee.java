package com.codegirl.model;

/**
 * Created by Şeyma Yılmaz on 13.8.2017.
 */
public class Employee {

    private String name;
    private double maas;
    private String departmant;

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMaas() {
        return maas;
    }

    public void setMaas(double maas) {
        this.maas = maas;
    }

    public String getDepartmant() {
        return departmant;
    }

    public void setDepartmant(String departmant) {
        this.departmant = departmant;
    }
}
