package ctec.view;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import ctec.controller.RecursionController;

public class RecursionPanel extends JPanel
{
	private RecursionController baseController;
	private SpringLayout baseLayout;
	private JButton fibonacciButton;
	private JButton factorialButton;
	private JTextField inputField;
	private JTextArea resultsArea;
	
	public RecursionPanel(RecursionController baseController)
	{
		this.baseController = baseController;	
		baseLayout = new SpringLayout();
		fibonacciButton = new JButton("Get the Fibonacci sequence for this number");
		factorialButton = new JButton("Get n!");
		inputField = new JTextField(20);
		resultsArea = new JTextArea(10, 20);
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(fibonacciButton);
		this.add(factorialButton);
		this.add(inputField);
		this.add(resultsArea);
		this.setBackground(Color.BLUE);
		resultsArea.setWrapStyleWord(true);
		resultsArea.setLineWrap(true);
		resultsArea.setEditable(false);
		resultsArea.setText(baseController.getCalculatedValue());
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.SOUTH, fibonacciButton, -176, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, fibonacciButton, -57, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, factorialButton, -6, SpringLayout.NORTH, fibonacciButton);
		baseLayout.putConstraint(SpringLayout.EAST, factorialButton, -176, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, inputField, -6, SpringLayout.NORTH, factorialButton);
		baseLayout.putConstraint(SpringLayout.EAST, inputField, -91, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, resultsArea, 6, SpringLayout.SOUTH, fibonacciButton);
		baseLayout.putConstraint(SpringLayout.WEST, resultsArea, 0, SpringLayout.WEST, inputField);
	}
	
	private void setupListeners()
	{
		fibonacciButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String userInput = inputField.getText();
				if (checkInput(userInput))
				{
					resultsArea.setText(baseController.doFibonacci(userInput));
				}
			}
		});
		
		factorialButton.addActionListener(new ActionListener()
		{
			public void actionPerfoed(ActionEvent click)
			{
				String userInput = inputField.getText();
				if (checkInput(userInput))
				{
					resultsArea.setText(baseController.doFactorial(userInput));
				}
			}
		});
	}
	
	private boolean checkInput(String input)
	{
		boolean isNumber = false;
		
		try
		{
			Double.parseDouble(input);
			isNumber = true;
		}
		catch(Exception numberException)
		{
			resultsArea.setText("Type in a number");
		}
		return isNumber;
	}
}

