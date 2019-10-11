/**
*Text genereted by Simple GUI Extension for BlueJ
*/
import javax.swing.UIManager.LookAndFeelInfo;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.border.Border;
import javax.swing.*;


public class GUI_project extends JFrame {

    private JMenuBar menuBar;
    private JButton buttonLeft;
    private JButton buttonRight;
    private JLabel jlLinkeSpur;
    private JLabel jlRechteSpur;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private JTextArea jtKennzeichenListeLinks;
    private JTextArea jtKennzeichenListeRechts;
    private JTextField jtLinksKennzeichen;
    private JTextField jtRechtsKennzeichen;
    private Autobahn a;
    //Constructor 
    public GUI_project(Autobahn pA){

        a = pA;
        this.setTitle("GUI_project");
        this.setSize(628,493);
        //menu generate method
        generateMenu();
        this.setJMenuBar(menuBar);

        //pane with null layout
        JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(628,493));
        contentPane.setBackground(new Color(51,51,51));


        buttonLeft = new JButton();
        buttonLeft.setBounds(83,168,115,37);
        buttonLeft.setBackground(new Color(214,217,223));
        buttonLeft.setForeground(new Color(0,0,0));
        buttonLeft.setEnabled(true);
        buttonLeft.setFont(new Font("sansserif",0,12));
        buttonLeft.setText("Erzeugen");
        buttonLeft.setVisible(true);
        
        buttonRight = new JButton();
        buttonRight.setBounds(430,168,115,37);
        buttonRight.setBackground(new Color(214,217,223));
        buttonRight.setForeground(new Color(0,0,0));
        buttonRight.setEnabled(true);
        buttonRight.setFont(new Font("sansserif",0,12));
        buttonRight.setText("Erzeugen");
        buttonRight.setVisible(true);

        jlLinkeSpur = new JLabel();
        jlLinkeSpur.setBounds(64,58,158,36);
        jlLinkeSpur.setBackground(new Color(138,29,62));
        jlLinkeSpur.setForeground(new Color(204,0,0));
        jlLinkeSpur.setEnabled(true);
        jlLinkeSpur.setFont(new Font("New Times Roman",0,30));
        jlLinkeSpur.setText("LinkeSpur");
        jlLinkeSpur.setVisible(true);
        
        jlRechteSpur = new JLabel();
        jlRechteSpur.setBounds(406,58,158,36);
        jlRechteSpur.setBackground(new Color(138,29,62));
        jlRechteSpur.setForeground(new Color(204,0,0));
        jlRechteSpur.setEnabled(true);
        jlRechteSpur.setFont(new Font("New Times Roman",0,30));
        jlRechteSpur.setText("RechteSpur");
        jlRechteSpur.setVisible(true);
        
        jtKennzeichenListeLinks = new JTextArea();
        jtKennzeichenListeLinks.setBounds(47,221,193,103);
        jtKennzeichenListeLinks.setBackground(new Color(255,255,255));
        jtKennzeichenListeLinks.setForeground(new Color(0,0,0));
        jtKennzeichenListeLinks.setEnabled(true);
        jtKennzeichenListeLinks.setFont(new Font("sansserif",0,12));
        jtKennzeichenListeLinks.setText("Hier erscheinen die Kennzeichen");
        
        jtKennzeichenListeRechts = new JTextArea();
        jtKennzeichenListeRechts.setBounds(388,221,193,103);
        jtKennzeichenListeRechts.setBackground(new Color(255,255,255));
        jtKennzeichenListeRechts.setForeground(new Color(0,0,0));
        jtKennzeichenListeRechts.setEnabled(true);
        jtKennzeichenListeRechts.setFont(new Font("sansserif",0,12));
        jtKennzeichenListeRechts.setText("Hier erscheinen die Kennzeichen");

        jtKennzeichenListeLinks.setBorder(BorderFactory.createBevelBorder(1));
        jtKennzeichenListeLinks.setVisible(true);

        jtLinksKennzeichen = new JTextField();
        jtLinksKennzeichen.setBounds(66,114,144,31);
        jtLinksKennzeichen.setBackground(new Color(255,255,255));
        jtLinksKennzeichen.setForeground(new Color(0,0,0));
        jtLinksKennzeichen.setEnabled(true);
        jtLinksKennzeichen.setFont(new Font("sansserif",0,12));
        jtLinksKennzeichen.setText("KennzeichenEingeben");
        jtLinksKennzeichen.setVisible(true);
        
        jtRechtsKennzeichen = new JTextField();
        jtRechtsKennzeichen.setBounds(418,114,144,31);
        jtRechtsKennzeichen.setBackground(new Color(255,255,255));
        jtRechtsKennzeichen.setForeground(new Color(0,0,0));
        jtRechtsKennzeichen.setEnabled(true);
        jtRechtsKennzeichen.setFont(new Font("sansserif",0,12));
        jtRechtsKennzeichen.setText("KennzeichenEingeben");
        jtRechtsKennzeichen.setVisible(true);

        //adding components to contentPane panel
        contentPane.add(buttonLeft);
        contentPane.add(buttonRight);
        contentPane.add(jlLinkeSpur);
        contentPane.add(jlRechteSpur);
        contentPane.add(jtKennzeichenListeLinks);
        contentPane.add(jtKennzeichenListeRechts);
        contentPane.add(jtLinksKennzeichen);
        contentPane.add(jtRechtsKennzeichen);

        //adding panel to JFrame and seting of window position and close operation
        this.add(contentPane);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
        
        buttonLeft.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                a.autoErstellenLinks(jtLinksKennzeichen.getText());
            }
          } 
        );
        buttonRight.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                a.autoErstellenRechts(jtRechtsKennzeichen.getText());
            }
          } 
        );
   }

    public void addAutoLinks(String pKennzeichen)
    {
        jtKennzeichenListeLinks.setText(pKennzeichen);
    }
    public void addAutoRechts(String pKennzeichen)
    {
        jtKennzeichenListeRechts.setText(pKennzeichen);
    }
    
    
    //method for generate menu
    public void generateMenu(){
        menuBar = new JMenuBar();





    }

       /*

     public static void main(String[] args){
        System.setProperty("swing.defaultlaf", "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new GUI_project(Autobahn a);
            }
        });
    }
    */

}
