package factory;

import developers.CppDeveloper;
import developers.Developer;

public class CppDeveloperFactory extends DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new CppDeveloper();
    }
}
