package ba.unsa.etf.rpr;


public class Sat {
    private int sati, minute, sekunde;

    public Sat(int sati, int minute, int sekunde) throws Exception {
        postavi(sati, minute, sekunde);
    }

    private void postavi(int sati, int minute, int sekunde) throws Exception {
        provjeri(sati, minute, sekunde);
        this.sati = sati;
        this.minute = minute;
        this.sekunde = sekunde;
    }

    private void provjeri(int sati, int minute, int sekunde) throws Exception {
        if(sati < 0 || sati > 23) throw new Exception("Sati nisu validni!");
        if(minute < 0 || minute > 59) throw new Exception("Minute nisu validne!");
        if(sekunde < 0 || sekunde > 59) throw new Exception("Sekunde nisu validne!");

    }

    public void sljedeci() {
        sekunde++;
        if (sekunde == 60) {
            sekunde = 0;
            minute++;
        }
        if (minute == 60) {
            minute = 0;
            sati++;
        }
        if (sati == 24) sati = 0;
    }

    public void prethodni() {
        sekunde--;
        if (sekunde == -1) {
            sekunde = 59;
            minute--;
        }
        if (minute == -1) {
            minute = 59;
            sati--;
        }
        if (sati == -1) sati = 23;
    }

    public void pomjeriZa(int pomak) {
        if (pomak > 0) for (int i = 0; i < pomak;  i++) sljedeci();
		else for (int i = 0; i < -pomak; i++) prethodni();
    }

    public int getSati() {
        return sati;
    }

    public int getMinute() {
        return minute;
    }

    public int getSekunde() {
        return sekunde;
    }

    public void setSati(int sati) throws Exception {
        provjeri(sati, minute, sekunde);
        this.sati = sati;
    }

    public void setMinute(int minute) throws Exception {
        provjeri(sati, minute, sekunde);
        this.minute = minute;
    }

    public void setSekunde(int sekunde) throws Exception {
        provjeri(sati, minute, sekunde);
        this.sekunde = sekunde;
    }

    public void ispisi()
    {
        System.out.println(sati + ":" + minute + ":" + sekunde);
    }
};

