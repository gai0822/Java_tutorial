package Gatech;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Node<Integer> NodeInt = new Node<Integer>();
        NodeInt.setValue(10);
        System.out.println(NodeInt.getValue());

        Node<Double> NodeDouble = new Node<Double>();
        NodeDouble.setValue(15.0);
        System.out.println(NodeDouble.getValue());

    }
}
