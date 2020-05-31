package main.factory.implementation;

import main.factory.base.Developer;
import main.factory.base.SpecialistLevel;

public class CppDeveloper implements Developer {

    private SpecialistLevel specialistLevel;

    private int salary;

    public CppDeveloper(SpecialistLevel specialistLevel) {
        this.specialistLevel = specialistLevel;
    }

    @Override
    public void writeCode() {
        System.out.println(String.format("C++ developer (%s) writes c++ code", specialistLevel));
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
