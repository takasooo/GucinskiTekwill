package homework_nr_13;

public class Airplane {

    private final String manufacturer;
    private final String model;
    private final int nrOfEngines;

    public Airplane(String manufacturer, String model, int nrOfEngines) throws Exception {
        if(manufacturer == null || manufacturer.isEmpty())
            throw new InvalidManufacturerException("Manufacturer is empty or null.");
        this.manufacturer = manufacturer;
        if (model == null || model.isEmpty())
            throw new InvalidModelException("Model is empty or null.");
        this.model = model;
        if (nrOfEngines == 0 || nrOfEngines % 2 != 0)
            throw new InvalidNrOfEnginesException("Invalid number of engines.");
        this.nrOfEngines = nrOfEngines;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getNrOfEngines() {
        return nrOfEngines;
    }

    public static Airplane createAirplaneLYBL(String manufacturer, String model, int nrOfEngines) throws Exception {
        if(manufacturer == null || manufacturer.isEmpty() || model == null || model.isEmpty() || nrOfEngines % 2 != 0 || nrOfEngines == 0){
            return null;
        }
        return new Airplane(manufacturer, model, nrOfEngines);
    }

    public static Airplane createAirplaneEAFP(String manufacturer, String model, int nrOfEngines) throws Exception {
        try {
            return new Airplane(manufacturer, model, nrOfEngines);
        } catch (InvalidManufacturerException | InvalidNrOfEnginesException | InvalidModelException ignored){
            return null;
        }
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", nrOfEngines=" + nrOfEngines +
                '}';
    }
}
