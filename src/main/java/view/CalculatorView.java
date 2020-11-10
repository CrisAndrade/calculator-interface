package view;

import model.Calculator;

import javax.swing.*;
import javax.swing.plaf.synth.SynthLookAndFeel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CalculatorView extends JFrame{
    private JPanel rootPainel;
    private JButton CEButton;
    private JButton clearButtom;
    private JButton deleteButton;
    private JButton a7Button;
    private JButton a4Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton sumButtom;
    private JButton subButtom;
    private JButton enterButtom;
    private JButton multButtom;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JLabel numberBox;
    private JPanel Teclado;
    private JScrollPane Pianel;
    private JButton a0Button;
    private JButton dotButtom;
    private JButton divButtom;

    public Calculator calculator = new Calculator();

    public CalculatorView() throws UnsupportedLookAndFeelException {
        UIManager.setLookAndFeel(new SynthLookAndFeel());

        this.setTitle("Calculator");
        this.setSize(380, 600);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);

        this.add(this.rootPainel);

        a1Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent mouseEvent) {
                calculator.addNumber("1");
                updateNumber();
            }
        });
        a2Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent mouseEvent) {
                calculator.addNumber("2");
                updateNumber();
            }
        });
        a3Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent mouseEvent) {
                calculator.addNumber("3");
                updateNumber();
            }
        });
        a4Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent mouseEvent) {
                calculator.addNumber("4");
                updateNumber();
            }
        });
        a5Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent mouseEvent) {
                calculator.addNumber("5");
                updateNumber();
            }
        });
        a6Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent mouseEvent) {
                calculator.addNumber("6");
                updateNumber();
            }
        });
        a7Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent mouseEvent) {
                calculator.addNumber("7");
                updateNumber();
            }
        });
        a8Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent mouseEvent) {
                calculator.addNumber("8");
                updateNumber();
            }
        });
        a9Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent mouseEvent) {
                calculator.addNumber("9");
                updateNumber();
            }
        });
        a0Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent mouseEvent) {
                calculator.addNumber("0");
                updateNumber();
            }
        });
        dotButtom.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent mouseEvent) {
                calculator.addNumber(".");
                updateNumber();
            }
        });
        deleteButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent mouseEvent) {
                calculator.removeNumber();
                updateNumber();
            }
        });
        clearButtom.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent mouseEvent) {
                calculator.clearNumberString();
                updateNumber();
            }
        });
        CEButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent mouseEvent) {
                calculator.cancelEntry();
                updateNumber();
            }
        });
        divButtom.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent mouseEvent) {
                calculator.divisionButtom();
                updateNumber();
            }
        });
        multButtom.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent mouseEvent) {
                calculator.multiplicationButtom();
                updateNumber();
            }
        });
        subButtom.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                calculator.subtractionButtom();
                updateNumber();
            }
        });
        sumButtom.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent mouseEvent) {
                calculator.sumButtom();
                updateNumber();
            }
        });
        enterButtom.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent mouseEvent) {
                calculator.enter();
                updateNumber();
            }
        });
    }

    public void updateNumber() {
        numberBox.setText(this.calculator.getNumberString());
    }
}
