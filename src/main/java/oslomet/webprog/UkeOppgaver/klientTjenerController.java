package oslomet.webprog.UkeOppgaver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class klientTjenerController {

    private final Integer[] tempArray = new Integer[]{-3,-2,2,7,12,16,18,17,12,7,3,-2};

    @GetMapping("/Oppg1/")
    public int getTemp(int index){
        return tempArray[index];
    }

    private ArrayList<Valuta> valutaRegister = new ArrayList<>();

    @GetMapping("/initOppg2/")
        public void initRegister(){
            Valuta NOK = new Valuta(10.31);
            Valuta EUR = new Valuta(1.0);
            valutaRegister.add(NOK);
            valutaRegister.add(EUR);
        }

    @GetMapping("/Oppg2/")
    public Double regnValuta(String innValuta){

        return valutaRegister.get(innValuta);
    }
}
