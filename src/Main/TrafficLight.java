package Main;

// Клас світлофора
public class TrafficLight {
    private TrafficLightColor color;

    // Метод для зміни кольору світлофора
    public void changeColor() {
        switch (color) {
            case RED:
                color = TrafficLightColor.GREEN;
                break;
            case YELLOW:
                color = TrafficLightColor.RED;
                break;
            case GREEN:
                color = TrafficLightColor.YELLOW;
                break;
        }
    }

    // Метод для отримання поточного кольору світлофора
    public TrafficLightColor getColor() {
        return color;
    }

    // Конструктор для початкового установлення кольору
    public TrafficLight() {
        color = TrafficLightColor.RED; // Початковий колір - червоний
    }
}
