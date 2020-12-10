import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class File extends JFrame
{
    JPanel[] pnl = new JPanel[5];
    JButton button1 = new JButton("New File");
    JButton button2 = new JButton("Read File");
    JButton button3 = new JButton("Write File");
    JButton button4 = new JButton("Save File");
    JButton button5 = new JButton("Exit File");

    public File()
    {
        super("Redactor");
        TextDocument files = new TextDocument();
        setLayout(new GridLayout(1,2));
        for(int i = 0 ; i < pnl.length ; i++)
        {
            int r = (int) (Math.random() * 255);
            int b = (int) (Math.random() * 255);
            int g = (int) (Math.random() * 255);
            int d = (int) (Math.random() * 255);
            pnl[i] = new JPanel();
            pnl[i].setBackground(new Color(r,g,b,d));
            add(pnl[i]);
        }
        setSize(700,75);
        pnl[0].add(button1);
        pnl[1].add(button2);
        pnl[2].add(button3);
        pnl[3].add(button4);
        pnl[4].add(button5);

        button1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                TextDocument file1 = new TextDocument();
                files.New();
            }
        });

        button2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                files.Read();
            }
        });

        button3.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                files.Write();
            }
        });

        button4.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                files.Save();
            }
        });

        button5.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                files.Exit();
            }
        });
    }
}