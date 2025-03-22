public class Eticheta implements IEticheta{
    private String dataExpirare;
    private String importator;
    private String ingrediente;
    private String gramaj;

    public void setGramaj(String gramaj) {
        this.gramaj = gramaj;
    }

    public void setIngrediente(String ingrediente) {
        this.ingrediente = ingrediente;
    }

    public void setImportator(String importator) {
        this.importator = importator;
    }

    public void setDataExpirare(String dataExpirare) {
        this.dataExpirare = dataExpirare;
    }


    @Override
    public String toString() {
        return "Eticheta{" +
                "dataExpirare='" + dataExpirare + '\'' +
                ", importator='" + importator + '\'' +
                ", ingrediente='" + ingrediente + '\'' +
                ", gramaj='" + gramaj + '\'' +
                '}';
    }

    @Override
    public void printareEticheta() {

    }
}
