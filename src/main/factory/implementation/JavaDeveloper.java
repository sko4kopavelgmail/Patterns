package main.factory.implementation;

import main.factory.base.Developer;
import main.factory.base.SpecialistLevel;

public class JavaDeveloper implements Developer {

    private SpecialistLevel specialistLevel;

    private int salary;

    public JavaDeveloper(SpecialistLevel specialistLevel) {
        this.specialistLevel = specialistLevel;
    }

    @Override
    public void writeCode() {
        System.out.println(String.format("Java developer %s writes java code", specialistLevel));
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
