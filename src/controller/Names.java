package controller;

import java.util.Random;

public class Names {
    private Random rnd = new Random();

    public String getName() {
        return nameSwitcher(rnd.nextInt(6));
    }

    private String nameSwitcher(int nextInt) {
        switch (nextInt) {
            case 0:
                return "Artur";
            case 1:
                return "Dufus";
            case 2:
                return "McArtur";
            case 3:
                return "Octavius";
            case 4:
                return "Alexander";
            case 5:
                return "Caesar";
            default:
                return "Commode";
        }
    }


}
