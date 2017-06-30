
/**
 *  3 ergasia
 *  icsd08011
 *  @author Athina Verroiopoulou
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class stoixeia_etaireias extends JFrame implements ActionListener{

     ArrayList<full_time> EFT=new ArrayList<full_time>();  //ftiaxnw listes 
     ArrayList<part_time> EPT=new ArrayList<part_time>();
     //prwto menou genikis epilogis
    JButton printFoulTime=new JButton(" FullTime employee");
    JButton printPartTime=new JButton(" PartTime employee");
    JButton print=new JButton("print");
    JButton save=new JButton("save");
    JButton undo=new JButton("undo");
    
    //xwrizw to parathiro se grammes
    JPanel row1=new JPanel();
    JPanel row2=new JPanel();
    JPanel row3=new JPanel();
    JPanel row4=new JPanel();
    JPanel row5=new JPanel();
    JPanel row6=new JPanel();
    
   //ti periexei o kathe ypallilos kai vazw ti einai i kathe grammi(keimeno)
    
    JLabel name=new JLabel("person's name");
    JLabel ID=new JLabel("ID");
    JLabel tmima=new JLabel("section");
    JLabel proipiresia=new JLabel("experience of employee");
    JLabel wres_apasxolisis=new JLabel("hours of work");
    JLabel  misthos_wra=new JLabel("MoneyPerHour");
    
    //vazw grammes gia na grapsw
    JTextField nameTXT=new JTextField(40);
    JTextField IDTXT=new JTextField(40);
    JTextField tmimaTXT=new JTextField(40);
    JTextField proipiresiaTXT=new JTextField(40);
    JTextField  wres_apasxolisisTXT=new JTextField(40);
    JTextField misthos_wraTXT=new JTextField(40);
    //pws xwrizw to panel
    GridLayout layout1=new GridLayout(1,1);
    GridLayout layout2=new GridLayout(5,1);
    GridLayout layout3=new GridLayout(6,1);
    Container pane = getContentPane();  
    
       public stoixeia_etaireias(){  //constructor
           
        super("Company details");
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        pane.setLayout(layout1);
        //prosthiki koumpion kai p ta thelw sto parathiro
        row1.add(printFoulTime);
        row1.add(printPartTime);
        row1.add(print);
        pane.add(row1);
        
        pack();
        //energopoiisi leitourgias twn koumpiwn
        
        printFoulTime.addActionListener(this);
        printPartTime.addActionListener(this);
        print.addActionListener(this);
        save.addActionListener(this);
        undo.addActionListener(this);
       }
    //ti kanei to kathe koumpi kai p vriskete
     public void actionPerformed(ActionEvent e){
        if(e.getSource()==printFoulTime){  //an epilexw ergazomeno plirous apasxolisis
            pane.setLayout(layout2);
            //afairw tis proigoumenes grammes
            row1.removeAll();
            row4.removeAll();
            row5.removeAll();
            //vazw alla se kathe grammi
            row1.add(name);             row1.add(nameTXT);
            row2.add(ID);               row2.add(IDTXT);
            row3.add(tmima);            row3.add(tmimaTXT);
            row4.add(proipiresia);      row4.add(proipiresiaTXT);
            row5.add(save);
            row5.add(undo);
            pane.add(row1);
            pane.add(row2);
            pane.add(row3);
            pane.add(row4);
            pane.add(row5);
            validate();
            repaint();
            pack();
        }
        if(e.getSource()== printPartTime){ //an epilexw ergazomeno merikis apasxolisis
            pane.setLayout(layout3);
            row1.removeAll();
            row4.removeAll();
            row1.add(name);                row1.add(nameTXT);
            row2.add(ID);                  row2.add(IDTXT);
            row3.add(tmima);               row3.add(tmimaTXT);
            row4.add( wres_apasxolisis);   row4.add( wres_apasxolisisTXT);
            row5.add(misthos_wra);         row5.add(misthos_wraTXT);
            row6.add(save);
            row6.add(undo);
            pane.add(row1);
            pane.add(row2);
            pane.add(row3);
            pane.add(row4);
            pane.add(row5);
            pane.add(row6);
            validate();
            repaint();
            pack();
        }
        if(e.getSource()== print){  //an epilexw ektypwsi
            System.out.println("FullTime Employees");
            for(int i=0;i<EFT.size();i++){  //psaxnei tin lista sto megethos tis 
                System.out.println(EFT.get(i).toString()); //ektypwnei oti exei vrethei
            }
            System.out.println("PartTime Employees");
            for(int i=0;i<EPT.size();i++){
                System.out.println(EPT.get(i).toString());
            }
        }
        if(e.getSource()==save){  //an epilexw apothikeusi
            if(pane.getLayout()==layout2){ //prostetei sti lista
                EFT.add(new full_time(nameTXT.getText(),IDTXT.getText(),tmimaTXT.getText(),Integer.parseInt(proipiresiaTXT.getText())));
            }
            if(pane.getLayout()==layout3){
                EPT.add(new part_time(nameTXT.getText(),IDTXT.getText(),tmimaTXT.getText(),Integer.parseInt( wres_apasxolisisTXT.getText()),Double.parseDouble(misthos_wraTXT.getText())));
            }
            nameTXT.setText("");
            IDTXT.setText("");
            tmimaTXT.setText("");
            proipiresiaTXT.setText("");
            wres_apasxolisisTXT.setText("");
            misthos_wraTXT.setText("");
            row1.removeAll();
            pane.removeAll();
            pane.setLayout(layout1);
            row1.add(printFoulTime);
            row1.add(printPartTime);
            row1.add(print);
            pane.add(row1);
            validate();
            repaint();
            pack();
        }
        if(e.getSource()==undo){ //an epilexw to pisw koumpi
            nameTXT.setText("");
            IDTXT.setText("");
            tmimaTXT.setText("");
            proipiresiaTXT.setText("");
            wres_apasxolisisTXT.setText("");
            misthos_wraTXT.setText("");
            row1.removeAll();
            pane.removeAll();
            pane.setLayout(layout1);
            row1.add(printFoulTime);
            row1.add(printPartTime);
            row1.add(print);
            pane.add(row1);
            validate();
            repaint();
            pack();
        }
    }                
       //i main m 
    public static void main(String[] args) {
            new stoixeia_etaireias();           
            
      }  }
