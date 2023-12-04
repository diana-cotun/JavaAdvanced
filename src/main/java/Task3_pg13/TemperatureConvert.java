package Task3_pg13;

public enum TemperatureConvert implements Converter {

    C_F,
    C_K,
    K_C,
    F_C,
    F_K,
    K_F;

    private float inputTemp;
    private float outputTemp;




    @Override
    public float convert(float tempIn) {
        return 0;
    }
}
