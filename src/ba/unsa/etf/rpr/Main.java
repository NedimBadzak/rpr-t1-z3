package ba.unsa.etf.rpr;

public class Main {

    public static void main(String[] args) {
        Sat s = null;
        try {
            s = new Sat(21,58,45);
            s.ispisi();
            s.sljedeci();
            s.ispisi();
            s.pomjeriZa(-48);
            s.ispisi();
            s.setSati(0);
            s.setMinute(0);
            s.setSekunde(0);
            s.ispisi();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
