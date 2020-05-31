package main.factory;

import main.factory.base.Developer;
import main.factory.base.DeveloperFactory;
import main.factory.base.SpecialistLevel;
import main.factory.base.Tester;
import main.factory.base.TesterFactory;
import main.factory.implementation.factory.CppDeveloperFactory;
import main.factory.implementation.factory.CppTesterFactory;
import main.factory.implementation.factory.JavaDeveloperFactory;
import main.factory.implementation.factory.JavaTesterFactory;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperFactory("java");
        TesterFactory testerFactory = createTesterFactory("java");
        List<Developer> developersTeam = new ArrayList<>();
        List<Tester> testersTeam = new ArrayList<>();
        int totalSalary = 0;

        collectDevelopersTeam(developerFactory, developersTeam);
        collectTestersTeam(testerFactory, testersTeam);

        totalSalary += developersTeam.stream().mapToInt(Developer::getSalary).sum();
        System.out.println(totalSalary);
        totalSalary += testersTeam.stream().mapToInt(Tester::getSalary).sum();
        System.out.println(totalSalary);
    }

    private static void collectTestersTeam(TesterFactory testerFactory, List<Tester> testersTeam) {
        for (int i = 0; i <= 5; i++) {
            testersTeam.add(testerFactory.createTester(SpecialistLevel.MID));
        }
        for (int i = 0; i <= 1; i++) {
            testersTeam.add(testerFactory.createTester(SpecialistLevel.LEAD));
        }
        for (int i = 0; i <= 2; i++) {
            testersTeam.add(testerFactory.createTester(SpecialistLevel.JUN));
        }
    }

    private static void collectDevelopersTeam(DeveloperFactory developerFactory, List<Developer> developersTeam) {
        for (int i = 0; i <= 10; i++) {
            developersTeam.add(developerFactory.createDeveloper(SpecialistLevel.MID));
        }
        for (int i = 0; i <= 2; i++) {
            developersTeam.add(developerFactory.createDeveloper(SpecialistLevel.LEAD));
        }
        for (int i = 0; i <= 2; i++) {
            developersTeam.add(developerFactory.createDeveloper(SpecialistLevel.JUN));
        }
    }

    private static DeveloperFactory createDeveloperFactory(String factoryName) {
        if ("java".equalsIgnoreCase(factoryName)) {
            return new JavaDeveloperFactory();
        } else if ("c++".equalsIgnoreCase(factoryName)) {
            return new CppDeveloperFactory();
        } else {
            throw new RuntimeException(factoryName + "is not a factoryName");
        }
    }

    private static TesterFactory createTesterFactory(String factoryName) {
        if ("java".equalsIgnoreCase(factoryName)) {
            return new JavaTesterFactory();
        } else if ("c++".equalsIgnoreCase(factoryName)) {
            return new CppTesterFactory();
        } else {
            throw new RuntimeException(factoryName + "is not a factoryName");
        }
    }

}
