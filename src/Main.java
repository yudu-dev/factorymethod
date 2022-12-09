import developers.Developer;
import factory.CppDeveloperFactory;
import factory.DeveloperFactory;
import factory.JavaDeveloperFactory;

public class Main {
    public static void main(String[] args) {
        DeveloperFactory developerFactoryFirst = createDeveloperBySpeciality("Java");
        Developer developerFirst = developerFactoryFirst.createDeveloper();
        developerFirst.writeCode();

        DeveloperFactory developerFactorySecond = createDeveloperBySpeciality("Cpp");
        Developer developerSecond = developerFactorySecond.createDeveloper();
        developerSecond.writeCode();

        DeveloperFactory developerFactoryAnother = createDeveloperBySpeciality("Python");
        Developer developerAnother = developerFactoryAnother.createDeveloper();
        developerAnother.writeCode();
    }

    static DeveloperFactory createDeveloperBySpeciality(String specialty) {
        if (specialty.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        } if (specialty.equalsIgnoreCase("cpp")) {
            return new CppDeveloperFactory();
        } else {
            throw new RuntimeException(specialty + " is unknown speciality");
        }
    }
}