import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener // implementing interface to do actions while pressing on buttons
{
	boolean isOperatorClicked=false;  // initially this value is false. if any of the operator is pressed, 
	                                  // we need to change it to true   
	
	String oldValue;  // to store old value present before clicking operator
	
	String mathOperation; // to store which operation is performed
	
	JFrame jf;  // making jf as instance an instance variable.
	JLabel displayLabel;
	JButton sevenButton;  // making sevenButton instance variable to call in the @Override public void actionPerformed(ActionEvent e)
	JButton eightButton;
	JButton nineButton;
	JButton fourButton;
	JButton fiveButton;
	JButton sixButton;
	JButton oneButton;
	JButton twoButton;
	JButton threeButton;
	JButton dotButton;
	JButton zeroButton;
	JButton equalButton;
	JButton divButton;
	JButton mulButton;
	JButton minusButton;
	JButton plusButton;
	JButton clearButton;
	
	
	public Calculator() 
	
	{
	    jf=new JFrame("CALCULATOR"); // JFrame is a Class to create window frame
		jf.setLayout(null);
		jf.setSize(335, 530);  // jf.setSize(width,height) --> specify the width and height of the frame
		jf.setLocation(300, 150); // 300 = in X axis. 150 = in Y axis
		
		// to create the input using JLabel, Using JLabel  we can only Input values to calculator using Mouse pointer 
		
		 displayLabel=new JLabel();  // the text passed inside parameterized constructor will appear as the name of label in screen
		displayLabel.setBounds(0, 0, 321, 105);   // setBounds(x axis location,y axis ,width,height)  width
		 		// setBounbds used to set x,y,w,h at same time or we can use SetSize and setLocation separately
		displayLabel.setBackground(Color.black); //setting background color for the label
		displayLabel.setOpaque(true); // to display the applied color  
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);// to align the text  to right side of calculator
		displayLabel.setForeground(Color.white);  	//changing the text color
		
		displayLabel.setFont(new Font("Serif", Font.PLAIN, 40));  // changing text and font of JLabel
		
		jf.add(displayLabel); // adding displayLabel  object to the JFrame

		
		
		
		
		// creating Buttons using JBtton
		
		sevenButton=new JButton("7"); 
		sevenButton.setBackground(Color.ORANGE);
		sevenButton.setBounds(5,180, 80, 80); //(x,y,w,h)
		sevenButton.setFont(new Font("Arial",Font.PLAIN,30)); // 30 is the size
		sevenButton.addActionListener(this); // adding actionListner to show 7 while clicking on  sevenButton 
		jf.add(sevenButton);
		
		 eightButton=new JButton("8"); 
		 eightButton.setBackground(Color.ORANGE);
		eightButton.setBounds(85,180,80,80);  
		eightButton.setFont(new Font("Arial",Font.PLAIN,30));
		eightButton.addActionListener(this);
		jf.add(eightButton);
		
		nineButton=new JButton("9"); 
		nineButton.setBackground(Color.ORANGE);
		nineButton.setBounds(165,180,80,80); 
		nineButton.setFont(new Font("Arial",Font.PLAIN,30));
		nineButton.addActionListener(this);
		jf.add(nineButton);
		
		fourButton=new JButton("4"); 
		fourButton.setBackground(Color.ORANGE);
		fourButton.setBounds(5, 260, 80, 80); //(x,y,w,h)
		fourButton.setFont(new Font("Arial",Font.PLAIN,30));
		fourButton.addActionListener(this);
		jf.add(fourButton);
		
		fiveButton=new JButton("5");
		fiveButton.setBackground(Color.ORANGE);
		fiveButton.setFont(new Font("Arial",Font.PLAIN,30));
		fiveButton.setBounds(85, 260, 80, 80); //(x,y,w,h)
		fiveButton.addActionListener(this);
		jf.add(fiveButton);
		
		sixButton=new JButton("6"); 
		sixButton.setBackground(Color.ORANGE);
		sixButton.setFont(new Font("Arial",Font.PLAIN,30));
		sixButton.setBounds(165,260, 80, 80); //(x,y,w,h)
		sixButton.addActionListener(this);
		jf.add(sixButton);
		
	    oneButton=new JButton("1"); 
	    oneButton.setBackground(Color.ORANGE);
		oneButton.setFont(new Font("Arial",Font.PLAIN,30));
		oneButton.setBounds(5, 340, 80, 80); //(x,y,w,h)
		oneButton.addActionListener(this);
		jf.add(oneButton);

	    twoButton=new JButton("2");
	    twoButton.setBackground(Color.ORANGE);
		twoButton.setFont(new Font("Arial",Font.PLAIN,30));
		twoButton.setLocation(85, 340);  // also we can set  X and Y like this
		twoButton.setSize(80, 80);  
		twoButton.addActionListener(this);
		jf.add(twoButton);
		
		 threeButton=new JButton("3");
		 threeButton.setBackground(Color.ORANGE);
		threeButton.setFont(new Font("Arial",Font.PLAIN,30));
		threeButton.setBounds(165,340,80,80);
		threeButton.addActionListener(this);
		jf.add(threeButton);
		
		dotButton=new JButton(".");
		dotButton.setBackground(Color.ORANGE);
		dotButton.setBounds(165,420,80,70);
		dotButton.setFont(new Font("Arial",Font.PLAIN,30));
		dotButton.addActionListener(this);
		jf.add(dotButton); 
		
		zeroButton=new JButton("0");
		zeroButton.setBackground(Color.ORANGE);
		zeroButton.setFont(new Font("Arial",Font.PLAIN,30));
		zeroButton.setBounds(5, 420, 160, 70);
		zeroButton.addActionListener(this);
		jf.add(zeroButton);
		
		
		equalButton=new JButton("=");
		equalButton.setBackground(Color.WHITE);
		equalButton.setFont(new Font("Arial",Font.PLAIN,30));
		equalButton.setBounds(245, 340, 70, 150);
		equalButton.addActionListener(this);
		jf.add(equalButton);
		
		
		divButton=new JButton("/"); 
		divButton.setBackground(Color.lightGray);
		divButton.setBounds(165,110,80,70);  
		divButton.setFont(new Font("Arial",Font.PLAIN,30));
		divButton.addActionListener(this);
		jf.add(divButton); 
		
		mulButton=new JButton("x"); 
		mulButton.setBackground(Color.lightGray);
		mulButton.setBounds(245,110,70,70); 
		mulButton.setFont(new Font("Arial",Font.PLAIN,30));
		mulButton.addActionListener(this);
		jf.add(mulButton); 

		minusButton=new JButton("-"); 
		minusButton.setBackground(Color.lightGray);
		minusButton.setBounds(245,180,70,80);  
		minusButton.setFont(new Font("Arial",Font.PLAIN,30));
		minusButton.addActionListener(this);
		jf.add(minusButton); 
		
		plusButton=new JButton("+"); 
		plusButton.setBackground(Color.lightGray);
		plusButton.setBounds(245,260,70,80);  
		plusButton.setFont(new Font("Arial",Font.PLAIN,30));
		plusButton.addActionListener(this);	
		jf.add(plusButton);
		
		clearButton=new JButton("AC"); 
		clearButton.setBackground(Color.red);
		clearButton.setBounds(5,110,160,70);  
		clearButton.setFont(new Font("Arial",Font.PLAIN,30));
		clearButton.addActionListener(this);	
		jf.add(clearButton); 
		
		jf.setVisible(true); // to see the frame
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // to stop running of program after  closing the created window 
	}
	
	public static void main(String[] args)
	{
		new Calculator(); //just creating object of Calculator to work constructor , not assigning to any object name
	}

	@Override
	public void actionPerformed(ActionEvent e)  // abstract method in the interface ActionListner
	{
		if(e.getSource()== sevenButton) // to perform action ( display the seven in screen while clicking on WebApp )
		{
			if(isOperatorClicked) 
			{
				displayLabel.setText("7");  // setting new 7 value if operator is clicked
				isOperatorClicked=false; // to type remaining values continuously
			}
			else
			{
				displayLabel.setText(displayLabel.getText()+"7");  // getting the content of the display Label and setting using setter 
			}
			
		}
		
		else if (e.getSource() == eightButton)  
		{
			if(isOperatorClicked)
			{
				displayLabel.setText("8");
				isOperatorClicked=false;
			}
			else
			{
			displayLabel.setText(displayLabel.getText()+"8");
			}
		}
		
		else if (e.getSource()== nineButton)
		{
			if(isOperatorClicked)
			{
				displayLabel.setText("9");
				isOperatorClicked=false;
			}
			else
			{
			displayLabel.setText(displayLabel.getText()+"9");
			}
		}
		
		else if (e.getSource()== fourButton)
		{
			if(isOperatorClicked)
			{
				displayLabel.setText("4");
				isOperatorClicked=false;
			}
			else
			{
			displayLabel.setText(displayLabel.getText()+"4");
			}
		}
		else if (e.getSource() == fiveButton)
		{
			if(isOperatorClicked)
			{
				displayLabel.setText("5");
				isOperatorClicked=false;
			}
			else
			{
			displayLabel.setText(displayLabel.getText()+"5");
			}
		}
		else if (e.getSource()==sixButton)
		{
			if(isOperatorClicked)
			{
				displayLabel.setText("6");
				isOperatorClicked=false;
			}
			else
			{
			displayLabel.setText(displayLabel.getText()+"6");
			}
		}
		else if (e.getSource()==oneButton)
		{
			if(isOperatorClicked)
			{
				displayLabel.setText("1");
				isOperatorClicked=false;
			}
			else
			{
			displayLabel.setText(displayLabel.getText()+"1");
			}
		} 
		else if (e.getSource()==twoButton)
		{
			if(isOperatorClicked)
			{
				displayLabel.setText("2");
				isOperatorClicked=false;
			}
			else
			{
			displayLabel.setText(displayLabel.getText()+"2");
			}
		}
		else if (e.getSource()==threeButton)
		{
			if(isOperatorClicked)
			{
				displayLabel.setText("3");
				isOperatorClicked=false;
			}
			else
			{
			displayLabel.setText(displayLabel.getText()+"3");
			}
		}
		else if (e.getSource()==dotButton)
		{
			displayLabel.setText(displayLabel.getText()+".");
		}
		else if (e.getSource()==zeroButton)
		{
			displayLabel.setText(displayLabel.getText()+"0");
		}
		
		// calculating inside equal button to arithmetic operations
		else if (e.getSource()==equalButton)
		{
			
			String newValue=displayLabel.getText(); // storing the value entered after clicking operator
			
			// converting both values to float
			float oldValueF=Float.parseFloat(oldValue);
			float newValueF=Float.parseFloat(newValue);
			
			if (mathOperation=="+") {
				float result=newValueF+oldValueF; 
				
				// for displaying in the screen ,we again converting to string
				displayLabel.setText(result+"");  // converting result to string
			}
			else if(mathOperation=="-")
			{
				float result=oldValueF-newValueF;
				displayLabel.setText(result+"");
				
			}
			else if (mathOperation == "x")
			{
				float result=oldValueF*newValueF;
				displayLabel.setText(result+"");
			}
			else if (mathOperation=="/")
			{
				float result=oldValueF/newValueF;
				displayLabel.setText(result+"");
			}
			
			
		}
		else if (e.getSource()==divButton)
		{
			mathOperation="/";
			isOperatorClicked=true;
			oldValue=displayLabel.getText();
		}
		else if (e.getSource()==mulButton)
		{
			mathOperation="x";
			isOperatorClicked=true;
			oldValue=displayLabel.getText();
		}
		else if (e.getSource()==minusButton)
		{
			mathOperation="-";
			isOperatorClicked=true;
			oldValue=displayLabel.getText();
		}
		else if (e.getSource()==plusButton)
		{
			mathOperation="+";
			isOperatorClicked=true;
			oldValue=displayLabel.getText();  // storing old value present before clicking operator
		}
		else if (e.getSource() == clearButton) 
		{
			displayLabel.setText(""); // clearing screen
		}
	}

}
