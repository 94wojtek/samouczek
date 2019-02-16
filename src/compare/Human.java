package compare;

import org.jetbrains.annotations.Contract;

import java.util.Objects;

public class Human {
    private String name;
    private String surname;
    private String age;

    public Human(String name, String surname, String age) {
        if(name == null) {
            throw new NullPointerException("Name cannot be null.");
        }
        else {
            this.name = name;
        }
        if(surname == null) {
            throw new NullPointerException("Surname cannot be null.");
        }
        else {
            this.surname = surname;
        }
        if (age == null) {
            throw new NullPointerException("PESEL cannot be null.");
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAge() {
        return age;
    }

    @Contract(value = "null -> false", pure = true)
    @Override
    public boolean equals(Object obj) {
        if(obj == null) {
            return false;
        }

        if (obj instanceof Human) {
            Human otherHuman = (Human) obj;
            return name.equals(otherHuman.name) && surname.equals(otherHuman.surname) && age == otherHuman.age;
        }

        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age);
    }

    public boolean compareHashCode(Object obj) {
        if(this.hashCode() == obj.hashCode())
            return true;

        return false;
    }
}
