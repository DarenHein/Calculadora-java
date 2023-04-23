import javax.swing.JFrame;
import javax.swing.border.Border;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*; ; 

public class Ventana extends JFrame {

    private int ancho = 300; 
    private int largo = 500; 
    private JPanel panel; 
    private JButton b,b1,b2,b3,b4,b5,b6,b7,b8,b9,bmas,bmenos,bigual,bmulti,bdivi;
    private JTextField c ;

    public Ventana(){

        /* are una calculadora completamente funcional aqui solo abra la parte grafica en la otra ventana estara la parte logica de esta desenme suerte */
        this.setSize(ancho,largo);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Calcudora");
        this.setResizable(false);
        paneles(); 

    }
    public void paneles(){
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.BLACK);
        this.getContentPane().add(panel); 
        campos();
        botones(); 
         
    }
    public void campos(){
        c = new JTextField(""); 
        c.setBounds(0,20,300,80); 
        c.setBorder(null); 
        c.setBackground(Color.black);
        c.setBorder(BorderFactory.createLineBorder(Color.orange, 3));
        c.setFont(new Font("arial",Font.BOLD,22));
        c.setForeground(Color.orange);
        panel.add(c); 

    }
    public void botones(){

        b = new JButton("1"); 
        b.setBackground(Color.black);
        b.setBorder(null);
        b.setForeground(Color.ORANGE);
        b.setBorder(BorderFactory.createLineBorder(Color.orange, 3));
        b.setBounds(20, 350, 50, 50);
        b.setFont(new Font("arial",Font.BOLD,35));
        b.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String num = b.getText(); 
                c.setText(num);

            }
            
        });
        panel.add(b); 

        b1 = new JButton("2"); 
        b1.setBackground(Color.black);
        b1.setBorder(null);
        b1.setForeground(Color.ORANGE);
        b1.setBorder(BorderFactory.createLineBorder(Color.orange, 3));
        b1.setBounds(90, 350, 50, 50);
        b1.setFont(new Font("arial",Font.BOLD,35));
        b1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String num = b1.getText(); 
                c.setText(num);

            }
            
        });
        panel.add(b1); 

        b2 = new JButton("3"); 
        b2.setBackground(Color.black);
        b2.setBorder(null);
        b2.setForeground(Color.ORANGE);
        b2.setBorder(BorderFactory.createLineBorder(Color.orange, 3));
        b2.setBounds(160, 350, 50, 50);
        b2.setFont(new Font("arial",Font.BOLD,35));
        b2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String num = b2.getText(); 
                c.setText(num);

            }
            
        });
        panel.add(b2); 

        
         

       

    }
    
}