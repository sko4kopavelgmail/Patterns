package main.factory.implementation;

import main.factory.base.SpecialistLevel;
import main.factory.base.Tester;

public class CppTester implements Tester {

    private SpecialistLevel specialistLevel;

    private int salary;

    public CppTester(SpecialistLevel specialistLevel) {
        this.specialistLevel = specialistLevel;
    }

    @Override
    public void testCode() {
        System.out.println("C++ tester tests c++ code");
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
