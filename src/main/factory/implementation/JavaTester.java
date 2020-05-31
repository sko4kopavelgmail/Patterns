package main.factory.implementation;

import main.factory.base.SpecialistLevel;
import main.factory.base.Tester;

public class JavaTester implements Tester {

    private SpecialistLevel specialistLevel;

    private int salary;

    public JavaTester(SpecialistLevel specialistLevel) {
        this.specialistLevel = specialistLevel;
    }

    @Override
    public void testCode() {
        System.out.println(String.format("Java tester %s tests java code", specialistLevel));
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
