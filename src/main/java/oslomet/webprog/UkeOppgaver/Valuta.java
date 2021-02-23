package oslomet.webprog.UkeOppgaver;

public class Valuta {
    private Double kurs;

    public Valuta(Double kurs){
        this.kurs = kurs;
    }

    public Double regnUt(Double amount){
        return amount*kurs;
    }
}
