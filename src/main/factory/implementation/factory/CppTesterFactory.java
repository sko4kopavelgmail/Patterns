package main.factory.implementation.factory;

import main.factory.base.SpecialistLevel;
import main.factory.base.Tester;
import main.factory.base.TesterFactory;
import main.factory.implementation.CppTester;

public class CppTesterFactory implements TesterFactory {

    @Override
    public Tester createTester(SpecialistLevel specialistLevel) {
        switch (specialistLevel) {
            case LEAD: {
                CppTester leadCppTester = new CppTester(specialistLevel);
                leadCppTester.setSalary(70000);
                return leadCppTester;
            }
            case MID: {
                CppTester midCppTester = new CppTester(specialistLevel);
                midCppTester.setSalary(40000);
                return midCppTester;

            }
            case JUN: {
                CppTester junCppTester = new CppTester(specialistLevel);
                junCppTester.setSalary(20000);
                return junCppTester;
            }
        }
        throw new RuntimeException(String.format("%s is not a specialist level", specialistLevel));
    }
}
