import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {

    JLabel jlab;
    private JMenu menuFile;
    private JMenuItem menuOpen;
    private JMenuItem menuClose;
    private JMenuItem menuSave;
    private JMenuItem menuExit;
    private JMenu menuOptions;
    private JMenu menuHelp;
    private JTextArea theText;
    private JPanel panelMain;

    Main() {
        super("Swing notepad");
        initMenuBar();
        initMainPanel();
        initListeners();

    }

    private void initMenuBar() {
        //создаем метку для отображения результатов выбора из меню
        jlab = new JLabel();
        //создаем строку меню
        JMenuBar jMenuBar = new JMenuBar();

        menuFile = new JMenu("File");
        menuOpen = new JMenuItem("Open");
        menuClose = new JMenuItem("Close");
        menuSave = new JMenuItem("Save");
        menuExit = new JMenuItem("Exit");
        menuFile.add(menuOpen);
        menuFile.add(menuClose);
        menuFile.add(menuSave);
        menuFile.addSeparator();
        menuFile.add(menuExit);
        jMenuBar.add(menuFile);

        menuOptions = new JMenu("Options");

        JMenu jmColors = new JMenu("Colors");
        JMenuItem jmiRed = new JMenuItem("Red");
        JMenuItem jmiGreen = new JMenuItem("Green");
        JMenuItem jmiBlue = new JMenuItem("Blue");
        jmColors.add(jmiRed);
        jmColors.add(jmiGreen);
        jmColors.add(jmiBlue);
        menuOptions.add(jmColors);

        JMenu jmFont = new JMenu("Font");
        JMenuItem jmiTNR = new JMenuItem("Times New Roman");
        JMenuItem jmiColibri = new JMenuItem("Colibri");
        jmFont.add(jmiTNR);
        jmFont.add(jmiColibri);
        menuOptions.add(jmFont);

        jMenuBar.add(menuOptions);

        menuHelp = new JMenu("Help");
        JMenuItem jmiAbout = new JMenuItem("About");
        menuHelp.add(jmiAbout);
        jMenuBar.add(menuHelp);

        add(jlab);
        setJMenuBar(jMenuBar);
    }

    private void initMainPanel() {
        panelMain = new JPanel(new BorderLayout());
        theText = new JTextArea();
        panelMain.add(new JScrollPane(theText), BorderLayout.CENTER);
        getContentPane().add(panelMain);
    }

    private void initListeners() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        menuSave.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //saving

            }
        });
        menuExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        Main mainNote = new Main();
        mainNote.setBounds(200, 200, 800, 500);
        mainNote.setVisible(true);
    }
}
