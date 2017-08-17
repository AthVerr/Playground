
/**
 *2ergasia
 * icsd08011
 * @author Athina Verroiopoulou
 */

import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.*;
import java.awt.Event;
import java.awt.event.ActionListener;
import java.math.*;

public class pedio extends JFrame {
    
    double PI=3.14159265;    
    private double number,riza,tetragwno,imitono,sinimitono;
  
    JPanel row1 = new JPanel();  
    JLabel re_Label = new JLabel("Dose enan akeraio ",JLabel.CENTER);  //prostesi keimenou
    
    JPanel row2 = new JPanel();  //prostesi plaisiou gia eisagwgi arithou
    JTextField num1 = new JTextField(10);

    JPanel row3=new JPanel();  //koumpia stin 3 grammi
    JButton square = new JButton("tetragwniki riza");
    JButton x_2 = new JButton("tetragwno");

    JPanel row4=new JPanel();  //koumpia stin 4 grammi
    JButton sin = new JButton("imitono");
    JButton cos = new JButton("sinimitono");
    
        public pedio(){
        super("Calculator"); //titlos parathirou
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        Container pane =getContentPane(); //pws tha eiani to panel
        GridLayout layout = new GridLayout(4,2);
        pane.setLayout(layout);

        FlowLayout layout1 = new FlowLayout(); //o titlos
        row1.setLayout(layout1);
        row1.add(re_Label);
        pane.add(row1);

        FlowLayout layout2=new FlowLayout(); //paidio  gia na valw ton arithmo
        row2.setLayout(layout2);
        row2.add(num1);
        pane.add(row2);
//koumpia
        FlowLayout layout3 = new FlowLayout();
        row3.setLayout(layout3);
        row3.add(square);
        row3.add(x_2);
        pane.add(row3);

         FlowLayout layout4 = new FlowLayout();
        row4.setLayout(layout4);
        row4.add(sin);
        row4.add(cos);
        pane.add(row4);
        
        setContentPane(pane);
        pack();
        //energopoiei tin leitourgia twn koumpiwn
      thehandler handler = new thehandler();
      square.addActionListener(handler);
      x_2.addActionListener(handler);
      sin.addActionListener(handler);
      cos.addActionListener(handler);       
        
        
        }
        
       private class thehandler implements ActionListener{
       public void actionPerformed(ActionEvent evt) {
          
                  
            if(evt.getSource() == square){                //gia  tin riza
           number=new Float(num1.getText());   //pairnei apo to keimeno ton arithmo 
           riza=Math.sqrt(number);  //ypologismos rizas
           if(riza>0){  //sinthiki
             JOptionPane.showMessageDialog(null,"i riza einai: "+riza);  
           }else{
             JOptionPane.showMessageDialog(null,"Den orizete:");         
           }
            }
            else if(evt.getSource() ==  x_2){     //gia to tetragwno
                number=new Float(num1.getText()); 
                tetragwno=Math.pow(number,2);
                 if(tetragwno>0){
               JOptionPane.showMessageDialog(null,"to tetragwno einai: "+tetragwno);
            }else{
            JOptionPane.showMessageDialog(null,"Den orizete:");        
           }}
            
             else if(evt.getSource() ==  sin){ //gia to imitono
                number=new Float(num1.getText());  
                imitono=Math.sin(number*PI/180); //metatropi
                 if(imitono>-1 && imitono<1){      //sinthiki
               JOptionPane.showMessageDialog(null,"to imitono einai: "+imitono);
            } else{
         JOptionPane.showMessageDialog(null,"Den orizete:");    
           }}
            else if(evt.getSource() ==  cos){ //gia to sinimitono
                number=new Float(num1.getText());  
                  sinimitono=Math.cos(number*PI/180);
                   if(sinimitono>-1 && sinimitono<1){                
               JOptionPane.showMessageDialog(null,"to sinimitono einai: "+sinimitono);
            }else{
            JOptionPane.showMessageDialog(null,"Den orizete:");       
           }}
           
            else     System.out.printf("lathos");  
        }

}}
