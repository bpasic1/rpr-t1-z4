package ba.unsa.etf.rpr;

public class Supermarket {
    private Artikl[] artikli = new Artikl[1000]; //max 1000 zadato
    private int br= 0;

    public boolean dodajArtikl(Artikl a){
        if(br >= 1000)
            return false;
        artikli[br] = a;
        br++;
        return true;
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

    public Artikl[] getArtikli(){
        return artikli;
    }
}
