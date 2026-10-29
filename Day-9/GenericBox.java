class Box<T> {

    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

public class GenericBox {

    public static void main(String[] args) {

        // Box for String
        Box<String> nameBox = new Box<>();

        nameBox.setValue("Payal");

        System.out.println("Name: "
                + nameBox.getValue());


        // Box for Integer
        Box<Integer> numberBox = new Box<>();

        numberBox.setValue(100);

        System.out.println("Number: "
                + numberBox.getValue());


        // Box for Double
        Box<Double> priceBox = new Box<>();

        priceBox.setValue(99.50);

        System.out.println("Price: "
                + priceBox.getValue());
    }
}