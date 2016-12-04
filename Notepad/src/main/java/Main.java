import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


/**
 * Created by Sam on 04.12.2016.
 */
public class Main implements ActionListener {
    JLabel jlab;
    private JPanel panelMain;

    Main(){
        //создать новый контейнер типа JFrame
        JFrame jfrm = new JFrame("Swing notepad");

        //указываем диспетчер поточной компановки типа FlowLayout
        jfrm.setLayout(new FlowLayout());

        jfrm.setSize(600, 400);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //создаем метку для отображения результатов выбора из меню
        jlab = new JLabel();

        //создаем строку меню
        JMenuBar jMenuBar = new JMenuBar();

        JMenu jmFile = new JMenu("File");
        JMenuItem jmiOpen = new JMenuItem("Open");
        JMenuItem jmiClose = new JMenuItem("Close");
        JMenuItem jmiSave = new JMenuItem("Save");
        JMenuItem jmiExit = new JMenuItem("Exit");
        jmFile.add(jmiOpen);
        jmFile.add(jmiClose);
        jmFile.add(jmiSave);
        jmFile.addSeparator();
        jmFile.add(jmiExit);
        jMenuBar.add(jmFile);



        jfrm.add(jlab);
        jfrm.setJMenuBar(jMenuBar);
        jfrm.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Main();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {

    }
}
