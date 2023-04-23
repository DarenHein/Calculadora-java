import javax.swing.JFrame;
import javax.swing.border.Border;

import java.awt.Color;
import java.awt.Font;

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
        c = new JTextField("Puto el kevin"); 
        c.setBounds(0,0,300,80); 
        c.setBorder(null); 
        c.setBackground(Color.black);
        c.setFont(new Font("arial",Font.BOLD,22));
        c.setForeground(Color.orange);
        panel.add(c); 

    }
    public void botones(){

        b = new JButton("1"); 
        b.setBackground(Color.black);
        b.setBorder(null);
        b.setForeground(Color.ORANGE);
        b.setBounds(0, 100, 70, 70);
        b.setFont(new Font("arial",Font.BOLD,35));
        panel.add(b); 

       

    }
    
}