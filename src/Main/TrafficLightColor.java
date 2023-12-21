package Main;

public enum TrafficLightColor {
    RED("STOP"),
    YELLOW("WAIT"),
    GREEN("GO");

    private final String description;

    // Конструктор Enum з описом кольору
    TrafficLightColor(String description) {
        this.description = description;
    }

    // Метод, що повертає опис кольору
    public String getDescription() {
        return description;
    }
}
