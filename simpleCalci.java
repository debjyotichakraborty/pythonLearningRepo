package refresherPractice;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class simpleCalci extends JFrame implements EventListener {
	private static final long serialVersionUID = -4835910679446496258L;
	String displayText = "";
    char inputNum11[]= new char[10];
    char inputNum12[]= new char[10];
    char inputNum21[]= new char[10];
    char inputNum22[]= new char[10];
    short i1=0,i2=0;
    boolean opEnt = false, periodEnt=false, result=false, reentry=false;
    char operator;
    char dotMarker1, dotMarker2;
    float carryOver = 0.0f;
    JTextField c = new JTextField(displayText,18);
    JFrame f = new JFrame("Calc");
    JPanel p = new JPanel();

    float strConv(char inStrNum1[], char dotMarker, char inStrNum2[]){
        String inputString = new String(inStrNum1);
        inputString=inputString.trim();
        String inputString2 = new String(inStrNum2);
        inputString2=inputString2.trim();
        if (dotMarker=='.')
            inputString = inputString.concat(String.valueOf(dotMarker));
        inputString = inputString.concat(inputString2);
        float inputNum=Float.parseFloat(inputString);
        return inputNum;
    }

    void onClick(JButton actionEval){
        actionEval.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	System.out.println("key pressed is "+actionEval.getText());
            	if (result == true) {
            		result = false;
            		opEnt = false;
        			periodEnt = false;
            		switch (actionEval.getText()) {
            		case "1":
            		case "2":
            		case "3":
            		case "4":
            		case "5":
            		case "6":
            		case "7":
            		case "8":
            		case "9":
            		case "0":
            			for ( i1=0;i1<inputNum11.length;i1++) inputNum11[i1] = ' ';
            			for ( i1=0;i1<inputNum12.length;i1++) inputNum12[i1] = ' ';
            			for ( i1=0;i2<inputNum21.length;i2++) inputNum21[i1] = ' ';
            			for ( i1=0;i2<inputNum22.length;i2++) inputNum22[i1] = ' ';
            			dotMarker1 = ' ';
            			dotMarker2 = ' ';
            			break;
            		case "+":
            		case "-":
            		case "/":
            		case "*":
            		case "%":
            		case "^":
            			reentry = true; 
            			for ( i1=0;i2<inputNum21.length;i2++) inputNum21[i1] = ' ';
            			for ( i1=0;i2<inputNum22.length;i2++) inputNum22[i1] = ' ';
            			dotMarker2 = ' ';
            			break;
            		}
            	}
            	
                switch (actionEval.getText()){
                case "=":{
	                    if (result==false) 
	                    {
	                       result=true;
	                       float inputFloat1 = 0.0f;
	                       if (reentry)                             
	                       	inputFloat1 = carryOver;
	                       else
	                       	inputFloat1 = strConv(inputNum11, dotMarker1, inputNum12);
	                       System.out.println(inputFloat1);
	                       float inputFloat2 = 0.0f;
	                       float output = 0.0f;
	                       if (opEnt==true)
		                       {
	                    	   System.out.println("inputNum21 = "+inputNum21.toString());
	                    	   System.out.println("inputNum22 = "+inputNum22.toString());
		                           inputFloat2 = strConv(inputNum21, dotMarker2, inputNum22);
		                           System.out.println(inputFloat2);
		                           output = mathOp(inputFloat1, operator, inputFloat2);
		                       }
	                       else
	                           output=inputFloat1;
	                       carryOver = output;
	                       displayText = String.valueOf(output);
	                       c.setText(displayText);
	                       System.out.println("***** RESULT ***** = "+output);
	                     }
                    	break;
                	}
                    case "+":{
                        if (opEnt == false){
                            opEnt = true;
                            operator='+';
                            periodEnt = false;
                            i1=i2=0;
                            displayText = displayText.concat(actionEval.getText());
                            c.setText(displayText);
                        }
                        break;
                    }
                    case "-":{
                        if (opEnt == false) {
                            opEnt = true;
                            operator='-';
                            periodEnt = false;
                            i1=i2=0;
                            displayText = displayText.concat(actionEval.getText());
                            c.setText(displayText);
                        }
                        break;
                    }
                    case "*":{
                        if (opEnt == false) {
                            opEnt = true;
                            operator='*';
                            periodEnt = false;
                            i1=i2=0;
                            displayText = displayText.concat(actionEval.getText());
                            c.setText(displayText);
                        }
                        break;
                    }
                    case "/":{
                        if (opEnt == false) {
                            opEnt = true;
                            operator='/';
                            periodEnt = false;
                            i1=i2=0;
                            displayText = displayText.concat(actionEval.getText());
                            c.setText(displayText);
                        }
                        break;
                    }
                    case "%":{
                        if (opEnt == false) {
                            opEnt = true;
                            operator='%';
                            periodEnt = false;
                            i1=i2=0;
                            displayText = displayText.concat(actionEval.getText());
                            c.setText(displayText);
                        }
                        break;                    }
                    case "^":{
                        if (opEnt == false) {
                            opEnt = true;
                            operator='^';
                            periodEnt = false;
                            i1=i2=0;
                            displayText = displayText.concat(actionEval.getText());
                            c.setText(displayText);
                        }
                        break;
                    }
                    case ".":{
                        if (periodEnt == false) {
                            periodEnt = true;
                            if (opEnt == false)
                                dotMarker1 = '.';
                            else
                            {
                                dotMarker2 = '.';
                            }
                            displayText = displayText.concat(actionEval.getText());
                            c.setText(displayText);
                        }
                        break;
                    }
                    case "0":{
                        if (periodEnt == false)
                            if (opEnt == false)
                                inputNum11[i1++] = '0';
                            else
                                inputNum21[i1++] = '0';
                        else
                            if (opEnt == false)
                                inputNum12[i2++] = '0';
                            else
                                inputNum22[i2++] = '0';
                        displayText = displayText.concat(actionEval.getText());
                        c.setText(displayText);
                        break;
                    }
                    case "1":{
                        if (periodEnt == false)
                            if (opEnt == false)
                                inputNum11[i1++] = '1';
                            else
                                inputNum21[i1++] = '1';
                        else
                            if (opEnt == false)
                                inputNum12[i2++] = '1';
                            else
                                inputNum22[i2++] = '1';
                        displayText = displayText.concat(actionEval.getText());
                        c.setText(displayText);
                        break;
                    }
                    case "2":{
                        if (periodEnt == false)
                            if (opEnt == false)
                                inputNum11[i1++] = '2';
                            else
                                inputNum21[i1++] = '2';
                        else
                            if (opEnt == false)
                                inputNum12[i2++] = '2';
                            else
                                inputNum22[i2++] = '2';
                        displayText = displayText.concat(actionEval.getText());
                        c.setText(displayText);
                        break;
                    }
                    case "3":{
                        if (periodEnt == false)
                            if (opEnt == false)
                                inputNum11[i1++] = '3';
                            else
                                inputNum21[i1++] = '3';
                        else
                            if (opEnt == false)
                                inputNum12[i2++] = '3';
                            else
                                inputNum22[i2++] = '3';
                        displayText = displayText.concat(actionEval.getText());
                        c.setText(displayText);
                        break;
                    }
                    case "4":{
                        if (periodEnt == false)
                            if (opEnt == false)
                                inputNum11[i1++] = '4';
                            else
                                inputNum21[i1++] = '4';
                        else
                            if (opEnt == false)
                                inputNum12[i2++] = '4';
                            else
                                inputNum22[i2++] = '4';
                        displayText = displayText.concat(actionEval.getText());
                        c.setText(displayText);
                        break;
                    }
                    case "5":{
                        if (periodEnt == false)
                            if (opEnt == false)
                                inputNum11[i1++] = '5';
                            else
                                inputNum21[i1++] = '5';
                        else
                        if (opEnt == false)
                            inputNum12[i2++] = '5';
                        else
                            inputNum22[i2++] = '5';
                        displayText = displayText.concat(actionEval.getText());
                        c.setText(displayText);
                        break;
                    }
                    case "6":{
                        if (periodEnt == false)
                            if (opEnt == false)
                                inputNum11[i1++] = '6';
                            else
                                inputNum21[i1++] = '6';
                        else
                            if (opEnt == false)
                                inputNum12[i2++] = '6';
                            else
                                inputNum22[i2++] = '6';
                        displayText = displayText.concat(actionEval.getText());
                        c.setText(displayText);
                        break;
                    }
                    case "7":{
                        if (periodEnt == false)
                            if (opEnt == false)
                                inputNum11[i1++] = '7';
                            else
                                inputNum21[i1++] = '7';
                        else
                            if (opEnt == false)
                                inputNum12[i2++] = '7';
                            else
                                inputNum22[i2++] = '7';
                        displayText = displayText.concat(actionEval.getText());
                        c.setText(displayText);
                        break;
                    }
                    case "8":{
                        if (periodEnt == false)
                            if (opEnt == false)
                                inputNum11[i1++] = '8';
                            else
                                inputNum21[i1++] = '8';
                        else
                            if (opEnt == false)
                                inputNum12[i2++] = '8';
                            else
                                inputNum22[i2++] = '8';
                        displayText = displayText.concat(actionEval.getText());
                        c.setText(displayText);
                        break;
                    }
                    case "9":{
                        if (periodEnt == false)
                            if (opEnt == false)
                                inputNum11[i1++] = '9';
                            else
                                inputNum21[i1++] = '9';
                        else
                            if (opEnt == false)
                                inputNum12[i2++] = '9';
                            else
                                inputNum22[i2++] = '9';
                        displayText = displayText.concat(actionEval.getText());
                        c.setText(displayText);
                        break;
                    }
                }
                System.out.println("display text = "+displayText);
            }
        });
    }

    void buildKeyPad(){
        JButton plusButton = new JButton("+");
        JButton minusButton = new JButton("-");
        JButton asterikButton = new JButton("*");
        JButton slashButton = new JButton("/");
        JButton percentButton = new JButton("%");
        JButton powerButton = new JButton("^");
        JButton digit1Button = new JButton("1");
        JButton digit2Button = new JButton("2");
        JButton digit3Button = new JButton("3");
        JButton digit4Button = new JButton("4");
        JButton digit5Button = new JButton("5");
        JButton digit6Button = new JButton("6");
        JButton digit7Button = new JButton("7");
        JButton digit8Button = new JButton("8");
        JButton digit9Button = new JButton("9");
        JButton digit0Button = new JButton("0");
        JButton equalButton = new JButton("=");
        JButton periodButton = new JButton(".");

        c.setEditable(false);
        c.setPreferredSize(new Dimension(200,50));
        c.setText(displayText);
        c.setBackground(Color.CYAN);
        c.setForeground(Color.BLACK);

        f.setSize(210,250);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);

        p.setSize(200,220);
        p.setBackground(Color.GRAY);

        p.add(c);
        p.add(plusButton);
        p.add(minusButton);
        p.add(asterikButton);
        p.add(slashButton);
        p.add(percentButton);
        p.add(powerButton);
        p.add(digit1Button);
        p.add(digit2Button);
        p.add(digit3Button);
        p.add(digit4Button);
        p.add(digit5Button);
        p.add(digit6Button);
        p.add(digit7Button);
        p.add(digit8Button);
        p.add(digit9Button);
        p.add(digit0Button);
        p.add(equalButton);
        p.add(periodButton);

        f.add(p);
        f.setLocationRelativeTo(null);
        f.setVisible(true);

        onClick(plusButton);
        onClick(minusButton);
        onClick(asterikButton);
        onClick(slashButton);
        onClick(percentButton);
        onClick(powerButton);
        onClick(digit1Button);
        onClick(digit2Button);
        onClick(digit3Button);
        onClick(digit4Button);
        onClick(digit5Button);
        onClick(digit6Button);
        onClick(digit7Button);
        onClick(digit8Button);
        onClick(digit9Button);
        onClick(digit0Button);
        onClick(periodButton);
        onClick(equalButton);
    }

    float mathOp(float num1, char operator, float num2){
        float res=0.0f;
        switch (operator) {
            case '+': {
                res=num1+num2;
                break;
            }
            case '-': {
                res=num1-num2;
                break;
            }
            case '*': {
                res=num1*num2;
                break;
            }
            case '/': {
                res=num1/num2;
                break;
            }
            case '%': {
                res=num1%num2;
                System.out.println("num1 = "+num1);
                System.out.println("num2 = "+num2);
                System.out.println("remainder = "+res);
                break;
            }
            case '^': {
                res = (float) Math.pow((double) num1,(double) num2);
                break;
            }
        }
        return(res);
    }


    public static void main(String[] args) {
        simpleCalci calculator = new simpleCalci();
        calculator.buildKeyPad();
    }
}