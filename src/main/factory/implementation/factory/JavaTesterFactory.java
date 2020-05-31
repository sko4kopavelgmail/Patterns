package main.factory.implementation.factory;

import main.factory.base.SpecialistLevel;
import main.factory.base.Tester;
import main.factory.base.TesterFactory;
import main.factory.implementation.JavaTester;

public class JavaTesterFactory implements TesterFactory {

    @Override
    public Tester createTester(SpecialistLevel specialistLevel) {
        switch (specialistLevel) {
            case JUN: {
                JavaTester junJavaTester = new JavaTester(specialistLevel);
                junJavaTester.setSalary(25000);
                return junJavaTester;
            }
            case MID: {
                JavaTester midJavaTester = new JavaTester(specialistLevel);
                midJavaTester.setSalary(45000);
                return midJavaTester;
            }
            case LEAD: {
                JavaTester leadJavaTester = new JavaTester(specialistLevel);
                leadJavaTester.setSalary(75000);
                return leadJavaTester;
            }
        }
        throw new RuntimeException(String.format("%s is not a specialist level", specialistLevel));

    }
}
