package Main;

public class Main {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();

        // Виведення поточного стану світлофора
        System.out.println("Початковий колір: " + trafficLight.getColor().getDescription());

        // Зміна кольору та виведення нового стану світлофора
        trafficLight.changeColor();
        System.out.println("Новий колір: " + trafficLight.getColor().getDescription());

        // Зміна кольору та виведення нового стану світлофора
        trafficLight.changeColor();
        System.out.println("Новий колір: " + trafficLight.getColor().getDescription());
    }
}
