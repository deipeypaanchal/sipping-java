class Avengers {
    public void quote() {
        System.out.println("Avengers assemble");
    }
}

class CaptainAmerica extends Avengers {
    public void quote() {
        System.out.println("I can do this all day");
    }
}

class TonyStark extends Avengers {
    public void quote(String marvel) {
        System.out.println("I am Iron Man");
    }
}

public class Polymorphism {
    public static void main(String[] args) {

        Avengers a  = new Avengers();
        a.quote();

        CaptainAmerica b = new CaptainAmerica();
        b.quote();

        TonyStark c = new TonyStark();
        c.quote();
    }
}