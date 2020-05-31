package main.factory.implementation.factory;

import main.factory.base.Developer;
import main.factory.base.DeveloperFactory;
import main.factory.base.SpecialistLevel;
import main.factory.implementation.CppDeveloper;
import main.factory.implementation.JavaDeveloper;

public class JavaDeveloperFactory implements DeveloperFactory {

    @Override
    public Developer createDeveloper(SpecialistLevel specialistLevel) {
        switch (specialistLevel) {
            case JUN: {
                JavaDeveloper junJavaDeveloper = new JavaDeveloper(specialistLevel);
                junJavaDeveloper.setSalary(30000);
                return junJavaDeveloper;
            }
            case MID: {
                JavaDeveloper midJavaDeveloper = new JavaDeveloper(specialistLevel);
                midJavaDeveloper.setSalary(55000);
                return midJavaDeveloper;
            }
            case LEAD: {
                JavaDeveloper leadJavaDeveloper = new JavaDeveloper(specialistLevel);
                leadJavaDeveloper.setSalary(85000);
                return leadJavaDeveloper;
            }
        }
        throw new RuntimeException(String.format("%s is not a specialist level", specialistLevel));

    }
}
