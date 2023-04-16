import javax.swing.JOptionPane;

class Input_Dialog {
    public static void main(String[] args) {
        String name;
        name = JOptionPane.showInputDialog("My name is Huy. What's your name?");
        JOptionPane.showMessageDialog(null,"Nice to meet you " + name);
        System.exit(0);
    }
}
