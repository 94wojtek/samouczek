package generic;

public class Human<T, S> {
    private T human1;
    private S human2;

    public Human(T human1, S human2) {
        this.human1 = human1;
        this.human2 = human2;
    }

    public T getHuman1() {
        return human1;
    }

    public S getHuman2() {
        return human2;
    }
}

class Fireman {}
class Policeman{}

class PublicService {
    private Fireman fireman;
    private Policeman policeman;

    PublicService(Fireman f, Policeman p) {
        this.fireman = f;
        this.policeman = p;
    }

    public Fireman getFireman() {
        return fireman;
    }

    public Policeman getPoliceman() {
        return policeman;
    }
}
class Occupation<T> {
    private T employee;

    public Occupation(T employee) {
        this.employee = employee;
    }

    public T getEmployee() {
        return employee;
    }
}

class Main {
    public static void main(String[] args) {
        Occupation<Fireman> firemanOccupation = new Occupation<>(new Fireman());
        Occupation<Policeman> policemanOccupation = new Occupation<>(new Policeman());

        firemanOccupation.getEmployee();

        Human<Occupation<Fireman>, Occupation<Policeman>> occupation =
                new Human<>(
                        new Occupation<>(new Fireman()),
                        new Occupation<>(new Policeman())
                );


        policemanOccupation.getEmployee();

        Occupation policeman = new Occupation(new Policeman());
        Occupation<Policeman> police = policeman;
        Occupation<Fireman> fire = policeman;

        Policeman policeman1 = police.getEmployee();
        Fireman fireman = fire.getEmployee();
    }
}




