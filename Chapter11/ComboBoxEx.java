import javax.swing.*;

public class ComboBoxEx extends JFrame {
    private String [] fruits = {"apple", "banana", "kiwi", "mango", "pear", "peach", "berry", "strawberry", "blackberry"};
    private String [] names = {"kitae", "jaemoon", "hyosoo", "namyun"};
    public ComboBoxEx() {
        setTitle("콤보박스 만들기 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JComboBox<String> strCombo = new JComboBox<String>(fruits);
        c.add(strCombo);

        JComboBox<ImageIcon> imgCombo = new JComboBox<ImageIcon>();
        imgCombo.addItem(new ImageIcon("images/icon1.png"));
        imgCombo.addItem(new ImageIcon("images/icon2.png"));
        imgCombo.addItem(new ImageIcon("images/icon3.png"));
        imgCombo.addItem(new ImageIcon("images/icon4.png"));
        c.add(imgCombo);

        setSize(300, 200);
        setVisible(true);
    }
    public static void main(String[] args) {
        new ComboBoxEx();
    }
}
