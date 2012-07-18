package com.twu28.biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: HP
 * Date: 14/7/12
 * Time: 4:58 PM
 * To change this template use File | Settings | File Templates.
 */
import javax.swing.*;
import java.awt.*;

public class Welcome extends JWindow {
             private boolean DidWelcome=false;
    private int duration;

    public Welcome(int d) {
        duration = d;
    }

    public void showSplash() {

        JPanel content = (JPanel)getContentPane();
        content.setBackground(Color.white);

        int width = 750;
        int height =500;
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screen.width-width)/2;
        int y = (screen.height-height)/2;
        setBounds(x,y,width,height);
        JLabel head2=new JLabel("WELCOME TO",JLabel.CENTER);

        JLabel head=new JLabel("BANGALORE PUBLIC LIBRARY",JLabel.CENTER);
        JLabel head1=new JLabel("BiBlIoTeChA",JLabel.CENTER);
        JLabel label = new JLabel(new ImageIcon("biblioteca.gif"));


        JLabel tail = new JLabel
                ("Supported by Central Library, Bangalore-834006", JLabel.CENTER);
        tail.setFont(new Font("Sans-Serif", Font.BOLD, 26));
        head.setFont(new Font("Sans-Serif", Font.BOLD, 30));
        head1.setFont(new Font("Sans-Serif", Font.BOLD, 28));
        head2.setFont(new Font("Sans-Serif", Font.BOLD, 30));
        GridBagConstraints gbc=new GridBagConstraints();
        GridBagLayout gridbag = new GridBagLayout();
        content.setLayout(gridbag);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        content.add(head2,gbc);
        content.add(head,gbc);
        content.add(head1,gbc);

        content.add(new JLabel("  "),gbc);
        content.add(new JLabel("  "),gbc);
        content.add(label, gbc);
        content.add(new JLabel("  "),gbc);
        content.add(new JLabel("  "),gbc);
        content.add(tail,gbc);
        Color oraRed = new Color(156, 20, 20,  255);
        content.setBorder(BorderFactory.createLineBorder(oraRed, 10));

        setVisible(true);

        try { Thread.sleep(duration); } catch (Exception e) {}

        setVisible(false);

    }

    public int showSplashAndExit() {

        showSplash();
        try
        {
            Runtime.getRuntime().exec("java Mainwindow");

        }
        catch(Exception e)
        {
            System.out.println("Error creating the FileInfo panel: " +e);
            e.printStackTrace();
        }
        return 99;
    }

   /* public static int main() {
        Welcome splash = new Welcome(4000);
        splash.showSplashAndExit();
         return 99;
    }
     */
}
