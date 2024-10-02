package web.model;

public class Car {
    private String model, color;
    private int horsePowers;

    public Car(String model, String color, int horsePowers) {
        this.model = model;
        this.color = color;
        this.horsePowers = horsePowers;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHorsePowers() {
        return horsePowers;
    }

    public void setHorsePowers(int horsePowers) {
        this.horsePowers = horsePowers;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", horsePowers=" + horsePowers +
                '}';
    }
}
