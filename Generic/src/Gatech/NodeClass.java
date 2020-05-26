package Gatech;

public class NodeClass<T> {

    private T value;

    public NodeClass() {
    }

    public NodeClass(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public static void main(String[] args) {
        NodeClass<Integer> NodeInt = new NodeClass<Integer>();
        NodeInt.setValue(10);
        System.out.println(NodeInt.getValue());
    }
}
