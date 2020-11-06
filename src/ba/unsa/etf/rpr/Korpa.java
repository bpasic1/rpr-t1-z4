package ba.unsa.etf.rpr;

public class Korpa {
    private Artikl[] artikli = new Artikl[50]; //max 50 zadato
    private int br= 0;

    public int getBr() {
        return br;
    }

    public boolean dodajArtikl(Artikl a){
        if(br >= 50)
            return false;
        artikli[br] = a;        //mozda moze Artikl(art[i].getnaziv,...)
        br++;
        return true;
    }

    public Artikl[] getArtikli(){
        return artikli;
    }

    public Artikl izbaciArtiklSaKodom(String kod){
        //Artikl nova = new Artikl("0",0,"0");
        for(int i = 0; i < br; i++){
            if(artikli[i].getKod().equals(kod)){
                Artikl nova = new Artikl(artikli[i].getNaziv(), artikli[i].getCijena(), artikli[i].getKod());
                for(int j = i; j < br - 1; j++)
                    artikli[j] = artikli[j + 1];    //mogao null?
            br--;
            return nova;
            }
        }
        return null;
    }

    public int dajUkupnuCijenuArtikala(){
        int ukupno = 0;
        for(int i = 0; i < br; i++){
            ukupno = ukupno + artikli[i].getCijena();
        }
        return ukupno;
    }
}
