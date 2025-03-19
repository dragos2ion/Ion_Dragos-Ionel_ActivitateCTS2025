import java.util.List;

public class Pantof extends APantof{

    public Pantof(ETipPantof tipPantof, int nrPantof, float dimensiuneToc, ETipMaterial material, List<ETipMaterial> materialeSuplimentare, List<String> listaMesajeText) {
        super(tipPantof, nrPantof, dimensiuneToc, material, materialeSuplimentare, listaMesajeText);
    }

    @Override
    public float calculPret() {
        return 0;
    }

    @Override
    public void addMesaj(String mesaj) {
        listaMesajeText.add(mesaj);

    }

    @Override
    public void addMaterial(ETipMaterial tipMaterial){
      materialeSuplimentare.add(tipMaterial);
    }


}
