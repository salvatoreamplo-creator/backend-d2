package es1;

public class es1 {
    public static boolean stringaPariDispari(String s) {
        if (s.length() % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean annoBisestile(int anno) {
        if (anno % 400 == 0) {
            return true;
        } else if (anno % 100 == 0) {
            return false;
        } else if (anno % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String testo = "anno ";
        int anno = 2028;

        System.out.println("La stringa è pari? " + stringaPariDispari(testo));
        System.out.println("L'anno è bisestile? " + annoBisestile(anno));
    }
}

