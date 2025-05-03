package enums;

public enum Momento {
    INICIO("inicio"),
    TERMINO("termino");

    private String value;

    Momento(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
