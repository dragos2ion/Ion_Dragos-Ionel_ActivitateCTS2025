import java.util.ArrayList;
import java.util.List;

public class Cuptor {
    private static Cuptor instance = null;
    private List<Preparat> listaAsteptare = null;

    private Cuptor() {
        this.listaAsteptare = new ArrayList<>();
    }

    public static Cuptor getInstance(){
        if(instance == null){
            instance = new Cuptor();
        }
        return instance;
    }

    public void addPreparat(Preparat p){
        if(p!=null){
            this.listaAsteptare.add(p);
        }
    }

    @Override
    public String toString() {
        return "Cuptor{" +
                "listaAsteptare=" + listaAsteptare +
                '}';
    }
}
