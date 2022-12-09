package factory;

import developers.Developer;
import developers.JavaDeveloper;

public class JavaDeveloperFactory extends DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
