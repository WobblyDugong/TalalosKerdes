package teszt;

import modell.Terem;

public class FeleletTeszt {
    
    public static void main(String[] args) {
        ezustLadaHelyeTeszt();
    }

    private static void ezustLadaHelyeTeszt() {
        /*ezüst láda mindig középre kerül(true érték)*/
        System.out.println("Terem alakítás tesztje");
        Terem terem = new Terem();
        assert terem.getLadak()[1]==true : "rossz helyen van az ezüst láda";
        System.out.println("A teszt sikeres");
    }
}
