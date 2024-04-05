import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class DemoPizza {
    static JCheckBox deliveryCheckBox = new JCheckBox("Delivery");

    public static void main(String[] args) {
        JFrame frame = new JFrame("Pizza Order");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(3,1));

        // Create components
        JPanel sizePanel = new JPanel();
        JPanel toppingsPanel = new JPanel();
        JPanel deliveryPanel = new JPanel();
        JLabel priceLabel = new JLabel("Price: $0");

        // Size options
        ButtonGroup group = new ButtonGroup();
        for(String size: new String[]{"Small", "Medium", "Large"}){
            JRadioButton rb = new JRadioButton(size);
            group.add(rb);
            sizePanel.add(rb);
        }

        // Toppings options
        String[] toppingsList = {"Pepperoni", "Mushrooms", "Onions", "Sausage", "Bacon",
                "Extra cheese", "Black olives", "Green peppers",
                "Pineapple", "Spinach"};
        for (String topping : toppingsList) {
            toppingsPanel.add(new JCheckBox(topping));
        }

        // Delivery option
        deliveryPanel.add(deliveryCheckBox);
        deliveryPanel.add(priceLabel);

        // Add components to frame
        frame.add(sizePanel);
        frame.add(toppingsPanel);
        frame.add(deliveryPanel);

        frame.setVisible(true);
    }
}
