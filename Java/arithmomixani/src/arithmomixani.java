
/**
 *1ergasia
 * icsd08011
 * @author Athina Verroiopoulou
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


 public class arithmomixani extends JFrame implements ActionListener {

     JTextField resultField;//gia ta apotelesmata
	double operand,operand2;	
        int operator;  //einai enas telestis gia na kserw an exw +,-,*,/
        Object source;     
 //koumpia stin arithmomixani
  JButton addButton,minusButton,multiplyButton,divideButton,equalsButton,dotButton; 
JButton one,two,three,four,five,six,seven,eight,nine,zero;    

    public arithmomixani() {
  //constructor
        super();
         JPanel operandPanel;
        JPanel buttonPanel1;
        JPanel buttonPanel2;
        JPanel buttonPanel3;
        JPanel buttonPanel4;
    
        Container cp;    
        cp = getContentPane(); 
        cp.setLayout(new GridLayout(5, 1));
    
        operandPanel = new JPanel();
        operandPanel.setLayout(new FlowLayout());
           //grammi panw p emfanizontai apotelesmata
        resultField = new JTextField("0", 25);
        resultField.setHorizontalAlignment(SwingConstants.RIGHT);

        operandPanel.add(resultField);
        cp.add(operandPanel);

  
        buttonPanel1 = new JPanel();
        buttonPanel1.setLayout(new FlowLayout());
        seven = new JButton(" 7 ");//prostetw koumpi
        seven.addActionListener(this); //vazw to ti kanw to koumpi
        buttonPanel1.add(seven);
        eight = new JButton(" 8 ");
        eight.addActionListener(this);
        buttonPanel1.add(eight);
        nine = new JButton(" 9 ");
        nine.addActionListener(this);
        buttonPanel1.add(nine);
        divideButton = new JButton(" / ");
        divideButton.addActionListener(this);
        buttonPanel1.add(divideButton);        
        cp.add(buttonPanel1);//topothetisi sto panel

        buttonPanel2 = new JPanel();
        buttonPanel2.setLayout(new FlowLayout());
                //prostetw pali ta koumpia kai to ti kanoun kai ta vazw sto panel
        four = new JButton(" 4 ");
        four.addActionListener(this);
        buttonPanel2.add(four);
        five = new JButton(" 5 ");
        five.addActionListener(this);
        buttonPanel2.add(five);
        six = new JButton(" 6 ");
        six.addActionListener(this);
        buttonPanel2.add(six);
        multiplyButton = new JButton(" * ");
        multiplyButton.addActionListener(this);
        buttonPanel2.add(multiplyButton);        
        cp.add(buttonPanel2);


        buttonPanel3 = new JPanel();
        buttonPanel3.setLayout(new FlowLayout());
        one = new JButton(" 1 ");
        one.addActionListener(this);
        buttonPanel3.add(one);
        two = new JButton(" 2 ");
        two.addActionListener(this);
        buttonPanel3.add(two);
        three = new JButton(" 3 ");
        three.addActionListener(this);
        buttonPanel3.add(three);
        minusButton = new JButton(" - ");
        minusButton.addActionListener(this);
        buttonPanel3.add(minusButton);        
        cp.add(buttonPanel3);

        buttonPanel4 = new JPanel();
        buttonPanel4.setLayout(new FlowLayout());
        zero = new JButton(" 0 ");
        zero.addActionListener(this);
        buttonPanel4.add(zero);
        dotButton = new JButton(" . ");
        dotButton.addActionListener(this);
        buttonPanel4.add(dotButton);
  equalsButton = new JButton(" = ");
        equalsButton.addActionListener(this);
        buttonPanel4.add(equalsButton);        
        addButton = new JButton(" + ");
        addButton.addActionListener(this);
        buttonPanel4.add(addButton);        
        cp.add(buttonPanel4);
    }
  //methodos gia ta apotelesmata kai to ti kanei to kathe koumpi
    public void Result() {
        boolean validOperands=true;          
  
        if (validOperands) {
            if (source ==addButton) {//gia tin prostesi
                operand =Double.parseDouble(resultField.getText());
		resultField.setText("0");
		operator = 1;//vazw ena gia na kserw oti einai to + gia to equal
            }
            else if (source ==minusButton) {//gia tin aferesi
             	operand =Double.parseDouble(resultField.getText());
		resultField.setText("0");
		operator = 2;
            }
            else if (source ==multiplyButton) {//gia ton pollaplasiasmo
	        operand = Double.parseDouble(resultField.getText());
		resultField.setText("0");
		operator = 3;
            }
            else if (source ==divideButton) {//gia tin dieresi
             	operand = Double.parseDouble(resultField.getText());
		resultField.setText("0");
		operator = 4;
            }
           
           else if (source ==equalsButton) {  //gia tin isotita
             	operand2 = Double.parseDouble(resultField.getText());
		switch(operator){
		case 1:
		resultField.setText(Double.toString(operand + operand2));
		operand = 0.0;operand2 = 0.0;
		break;
		case 2:
		resultField.setText(Double.toString(operand - operand2));
		operand = 0.0;operand2 = 0.0;
		break;
		case 3:
		resultField.setText(Double.toString(operand * operand2));
		operand = 0.0;operand2 = 0.0;
		break;
		case 4:
                if (operand2 != 0.0){
                   resultField.setText(Double.toString(operand / operand2));
		operand = 0.0;operand2 = 0.0;}
                else{
                  resultField.setText("0");}
		break;}	
                //kai twra exw ena ena ta koumpia me noumera

            }
	
	     //kai twra exw ena ena ta koumpia me noumera
    	    else if (source == one) {
		if (resultField.getText().equals("0"))
			resultField.setText("1");
		else	resultField.setText(resultField.getText() + "1");
	    }
            else if (source == two) {
		if (resultField.getText().equals("0"))
			resultField.setText("2");
		else	resultField.setText(resultField.getText() + "2");
	    }
	else if (source == three) {
		if (resultField.getText().equals("0"))
			resultField.setText("3");
		else	resultField.setText(resultField.getText() + "3");
	    }
        else if (source == four) {
		if (resultField.getText().equals("0"))
			resultField.setText("4");
		else	resultField.setText(resultField.getText() + "4");
	    }
	else if (source == five) {
		if (resultField.getText().equals("0"))
			resultField.setText("5");
		else	resultField.setText(resultField.getText() + "5");
	    }
            
            else if (source == six) {
		if (resultField.getText().equals("0"))
			resultField.setText("6");
                else resultField.setText(resultField.getText() + "6");
	    }
	else if (source == seven) {
		if (resultField.getText().equals("0"))
			resultField.setText("7");
		else	resultField.setText(resultField.getText() + "7");
	    }
	else if (source == eight) {
		if (resultField.getText().equals("0"))
			resultField.setText("8");
		else	resultField.setText(resultField.getText() + "8");
	    }
	else if (source == nine) {
		if (resultField.getText().equals("0"))
			resultField.setText("9");
		else	resultField.setText(resultField.getText() + "9");
	    }
            
            else if (source == zero) {
		if (resultField.getText().equals("0"))
			resultField.setText("0");
		else	resultField.setText(resultField.getText() + "0");
	    }
	else if (source == dotButton) {
		if (resultField.getText().equals("0"))
			resultField.setText("0.");
		else if (resultField.getText().indexOf('.') == -1){
			resultField.setText(resultField.getText() + ".");
		}
		else{}}		    
	
         } else      resultField.setText("lathos telestis");
    }    
     
    public void actionPerformed(ActionEvent evt) {  //trexei to Result kai kanei ta koumpia energa

        source = evt.getSource();
        Result();
    }
   
    public static void main(String[] args) {

        arithmomixani c = new arithmomixani();  //antikeimeno c tou calculator
        c.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        c.setSize(300, 300); //diastaseis parathirou
        c.setVisible(true);
    }
}