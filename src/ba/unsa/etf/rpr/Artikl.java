package ba.unsa.etf.rpr;

public class Artikl {
    private int cijena;
    private String naziv;
    private String kod;

    public Artikl(String naziv, int cijena, String kod){
        this.naziv = naziv; this.cijena = cijena; this.kod = kod;
    }

    public int getCijena(){
        return cijena;
    }

    public String getNaziv(){
        return naziv;
    }

    public String getKod(){
        return kod;
    }
}
