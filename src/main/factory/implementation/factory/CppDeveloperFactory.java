package main.factory.implementation.factory;

import main.factory.base.Developer;
import main.factory.base.DeveloperFactory;
import main.factory.base.SpecialistLevel;
import main.factory.implementation.CppDeveloper;

public class CppDeveloperFactory implements DeveloperFactory {

    @Override
    public Developer createDeveloper(SpecialistLevel specialistLevel) {
        switch (specialistLevel) {
            case JUN: {
                CppDeveloper junCppDeveloper = new CppDeveloper(specialistLevel);
                junCppDeveloper.setSalary(25000);
                return junCppDeveloper;
            }
            case MID: {
                CppDeveloper midCppDeveloper = new CppDeveloper(specialistLevel);
                midCppDeveloper.setSalary(50000);
                return midCppDeveloper;
            }
            case LEAD: {
                CppDeveloper leadCppDeveloper = new CppDeveloper(specialistLevel);
                leadCppDeveloper.setSalary(80000);
                return leadCppDeveloper;
            }
        }
        throw new RuntimeException(String.format("%s is not a specialist level", specialistLevel));
    }

}
