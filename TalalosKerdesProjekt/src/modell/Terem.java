package modell;

public class Terem {
    
    private boolean[] ladak;
    
    public Terem(){
        TeremAlakit();
    }

    private void TeremAlakit() {
        /*három ládának a helyét foglalni*/
        ladak = new boolean[3];
        /*egyik ládában sincs kincs*/
        Lada lada = new Lada();
        for (int i = 0; i < ladak.length; i++) {
            ladak[i] = lada.isVanKincs();
        }
        /*a középső (később ezüst) ládába rakok kincset, mivel mindig ebben lesz a kincs*/
        ladak[1] = true;
    }
    
    public boolean[] getLadak() {
        return ladak;
    }
}
