import java.awt.EventQueue;
import javax.swing.JFrame;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import java.awt.Color;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	
	
	double first;
	double second;
	double result;
	String operation;
	String answer;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public Calculator() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 576, 637);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Scientific Calculator");
		lblNewLabel.setForeground(new Color(0, 0, 205));
		lblNewLabel.setBackground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 30));
		lblNewLabel.setBounds(81, 10, 481, 23);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setEnabled(false);
		textField.setFont(new Font("Arial Black", Font.BOLD, 20));
		textField.setBounds(10, 60, 539, 70);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnroot = new JButton("\u221A");
		btnroot.setEnabled(false);
		btnroot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.sqrt(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnroot.setFont(new Font("Calibri", Font.BOLD, 22));
		btnroot.setBounds(448, 301, 101, 49);
		frame.getContentPane().add(btnroot);
		
		JButton btn1divx = new JButton("1/x");
		btn1divx.setEnabled(false);
		btn1divx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=1/(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btn1divx.setFont(new Font("Calibri", Font.BOLD, 22));
		btn1divx.setBounds(448, 360, 101, 49);
		frame.getContentPane().add(btn1divx);
		
		JButton btnxpowery = new JButton("x^y");
		btnxpowery.setEnabled(false);
		btnxpowery.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="X^Y";
			}
		});
		btnxpowery.setFont(new Font("Calibri", Font.BOLD, 22));
		btnxpowery.setBounds(10, 301, 101, 49);
		frame.getContentPane().add(btnxpowery);
		
		JButton btnxpo3 = new JButton("x^3");
		btnxpo3.setEnabled(false);
		btnxpo3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=(Double.parseDouble(textField.getText()));
				a=a*a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnxpo3.setFont(new Font("Calibri", Font.BOLD, 22));
		btnxpo3.setBounds(221, 301, 107, 49);
		frame.getContentPane().add(btnxpo3);
		
		JButton btnxsquare = new JButton("x^2");
		btnxsquare.setEnabled(false);
		btnxsquare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=(Double.parseDouble(textField.getText()));
				a=a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnxsquare.setFont(new Font("Calibri", Font.BOLD, 22));
		btnxsquare.setBounds(119, 301, 97, 49);
		frame.getContentPane().add(btnxsquare);
		
		JButton btnfact = new JButton("n!");
		btnfact.setEnabled(false);
		btnfact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Double.parseDouble(textField.getText());
				double fact=1;
				while(a!=0)
				{
					fact=fact*a;
					a--;
				}
				textField.setText("");
				textField.setText(textField.getText()+fact);
			}
		});
		btnfact.setFont(new Font("Calibri", Font.BOLD, 22));
		btnfact.setBounds(448, 242, 101, 49);
		frame.getContentPane().add(btnfact);
		
		JButton btnplsmin = new JButton("+/-");
		btnplsmin.setEnabled(false);
		btnplsmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Double.parseDouble(String.valueOf(textField.getText()));
				a=a*(-1);
				textField.setText(String.valueOf(a));
			}
		});
		btnplsmin.setFont(new Font("Calibri", Font.BOLD, 22));
		btnplsmin.setBounds(221, 541, 107, 49);
		frame.getContentPane().add(btnplsmin);
		
		JButton btnsin = new JButton("Sin");
		btnsin.setEnabled(false);
		btnsin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.sin(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnsin.setFont(new Font("Calibri", Font.BOLD, 22));
		btnsin.setBounds(10, 183, 101, 49);
		frame.getContentPane().add(btnsin);
		
		JButton btnsinh = new JButton("Sinh");
		btnsinh.setEnabled(false);
		btnsinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.sinh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnsinh.setFont(new Font("Calibri", Font.BOLD, 22));
		btnsinh.setBounds(10, 242, 101, 49);
		frame.getContentPane().add(btnsinh);
		
		JButton btnClear = new JButton("C");
		btnClear.setEnabled(false);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Calibri", Font.BOLD, 22));
		btnClear.setBounds(338, 183, 98, 49);
		frame.getContentPane().add(btnClear);
		
		JButton btn8 = new JButton("8");
		btn8.setEnabled(false);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Arial Black", Font.BOLD, 22));
		btn8.setBounds(119, 361, 97, 49);
		frame.getContentPane().add(btn8);
		
		JButton btn5 = new JButton("5");
		btn5.setEnabled(false);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Arial Black", Font.BOLD, 22));
		btn5.setBounds(119, 420, 97, 49);
		frame.getContentPane().add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.setEnabled(false);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Arial Black", Font.BOLD, 22));
		btn2.setBounds(119, 479, 97, 49);
		frame.getContentPane().add(btn2);
		
		JButton btn0 = new JButton("0");
		btn0.setEnabled(false);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("Arial Black", Font.BOLD, 22));
		btn0.setBounds(10, 541, 104, 49);
		frame.getContentPane().add(btn0);
		
		JButton btncos = new JButton("Cos");
		btncos.setEnabled(false);
		btncos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.cos(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btncos.setFont(new Font("Calibri", Font.BOLD, 22));
		btncos.setBounds(119, 183, 97, 49);
		frame.getContentPane().add(btncos);
		
		JButton btncosh = new JButton("Cosh");
		btncosh.setEnabled(false);
		btncosh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.cosh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btncosh.setFont(new Font("Calibri", Font.BOLD, 22));
		btncosh.setBounds(120, 242, 96, 49);
		frame.getContentPane().add(btncosh);
		
		JButton btnBack = new JButton("\uF0E7");
		btnBack.setEnabled(false);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String bspace=null;
				if(textField.getText().length()>0)
				{
					StringBuilder str=new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					bspace=str.toString();
					textField.setText(bspace);
				}
			}
		});
		btnBack.setFont(new Font("Wingdings", Font.BOLD, 22));
		btnBack.setBounds(448, 183, 97, 49);
		frame.getContentPane().add(btnBack);
		
		JButton btn9 = new JButton("9");
		btn9.setEnabled(false);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Arial Black", Font.BOLD, 22));
		btn9.setBounds(221, 361, 107, 49);
		frame.getContentPane().add(btn9);
		
		JButton btn6 = new JButton("6");
		btn6.setEnabled(false);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Arial Black", Font.BOLD, 22));
		btn6.setBounds(222, 420, 106, 49);
		frame.getContentPane().add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.setEnabled(false);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Arial Black", Font.BOLD, 22));
		btn3.setBounds(221, 479, 107, 49);
		frame.getContentPane().add(btn3);
		
		JButton btndot = new JButton(".");
		btndot.setEnabled(false);
		btndot.setFont(new Font("Arial Black", Font.BOLD, 22));
		btndot.setBounds(119, 541, 97, 49);
		frame.getContentPane().add(btndot);
		
		JButton btntan = new JButton("Tan");
		btntan.setEnabled(false);
		btntan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.tan(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btntan.setFont(new Font("Calibri", Font.BOLD, 22));
		btntan.setBounds(221, 183, 107, 49);
		frame.getContentPane().add(btntan);
		
		JButton btntanh = new JButton("Tanh");
		btntanh.setEnabled(false);
		btntanh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.tanh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btntanh.setFont(new Font("Calibri", Font.BOLD, 22));
		btntanh.setBounds(221, 242, 107, 49);
		frame.getContentPane().add(btntanh);
		
		JButton btnplus = new JButton("+");
		btnplus.setEnabled(false);
		btnplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
			}
		});
		btnplus.setFont(new Font("Arial Black", Font.BOLD, 22));
		btnplus.setBounds(341, 420, 98, 49);
		frame.getContentPane().add(btnplus);
		
		JButton btnsub = new JButton("-");
		btnsub.setEnabled(false);
		btnsub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		btnsub.setFont(new Font("Arial Black", Font.BOLD, 22));
		btnsub.setBounds(449, 420, 98, 49);
		frame.getContentPane().add(btnsub);
		
		JButton btnmul = new JButton("*");
		btnmul.setEnabled(false);
		btnmul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		btnmul.setFont(new Font("Arial Black", Font.BOLD, 22));
		btnmul.setBounds(341, 479, 98, 49);
		frame.getContentPane().add(btnmul);
		
		JButton btndiv = new JButton("/");
		btndiv.setEnabled(false);
		btndiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		btndiv.setFont(new Font("Arial Black", Font.BOLD, 22));
		btndiv.setBounds(449, 479, 98, 49);
		frame.getContentPane().add(btndiv);
		
		JButton btneql = new JButton("=");
		btneql.setEnabled(false);
		btneql.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				second=Double.parseDouble(textField.getText());
				if(operation=="+")
				{
					result=first+second;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operation=="-")
				{
					result=first-second;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operation=="*")
				{
					result=first*second;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operation=="/")
				{
					result=first/second;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operation=="%")
				{
					result=first%second;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operation=="X^Y")
				{
					double result=1;
					result=Math.pow(first,second);
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
			}
		});
		btneql.setFont(new Font("Arial Black", Font.BOLD, 22));
		btneql.setBounds(392, 535, 98, 49);
		frame.getContentPane().add(btneql);
		
		JButton btnexpo = new JButton("e^x");
		btnexpo.setEnabled(false);
		btnexpo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.exp(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnexpo.setFont(new Font("Calibri", Font.BOLD, 22));
		btnexpo.setBounds(336, 301, 102, 49);
		frame.getContentPane().add(btnexpo);
		
		JButton btnlog = new JButton("Log");
		btnlog.setEnabled(false);
		btnlog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.log(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnlog.setFont(new Font("Calibri", Font.BOLD, 22));
		btnlog.setBounds(336, 242, 102, 49);
		frame.getContentPane().add(btnlog);
		
		JButton btnpercent = new JButton("%");
		btnpercent.setEnabled(false);
		btnpercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
			}
		});
		btnpercent.setFont(new Font("Calibri", Font.BOLD, 22));
		btnpercent.setBounds(337, 361, 102, 49);
		frame.getContentPane().add(btnpercent);
		
		JButton btn7 = new JButton("7");
		btn7.setEnabled(false);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Arial Black", Font.BOLD, 22));
		btn7.setBounds(10, 360, 102, 49);
		frame.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.setEnabled(false);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Arial Black", Font.BOLD, 22));
		btn4.setBounds(10, 420, 102, 49);
		frame.getContentPane().add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.setEnabled(false);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Arial Black", Font.BOLD, 22));
		btn1.setBounds(10, 479, 102, 49);
		frame.getContentPane().add(btn1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("ON");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btn0.setEnabled(true);
				btn1.setEnabled(true);
				btn2.setEnabled(true);
				btn3.setEnabled(true);
				btn4.setEnabled(true);
				btn5.setEnabled(true);
				btn6.setEnabled(true);
				btn7.setEnabled(true);
				btn8.setEnabled(true);
				btn9.setEnabled(true);
				
				btndot.setEnabled(true);
				btnplsmin.setEnabled(true);
				btnplus.setEnabled(true);
				btnsub.setEnabled(true);
				btndiv.setEnabled(true);
				btnmul.setEnabled(true);
				btneql.setEnabled(true);

				btnpercent.setEnabled(true);
				btnClear.setEnabled(true);
				btnBack.setEnabled(true);

				btnroot.setEnabled(true);
				btn1divx.setEnabled(true);
				btnlog.setEnabled(true);
				btnsinh.setEnabled(true);
				btncosh.setEnabled(true);
				btntanh.setEnabled(true);
				btnxpowery.setEnabled(true);
				btnxpo3.setEnabled(true);
				btnxsquare.setEnabled(true);
				btnfact.setEnabled(true);
				btnexpo.setEnabled(true);
				btnsin.setEnabled(true);
				btncos.setEnabled(true);
				btntan.setEnabled(true);
				textField.setEnabled(true);
			}
		});
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setFont(new Font("Arial", Font.BOLD, 13));
		rdbtnNewRadioButton.setBounds(336, 136, 103, 21);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnOff = new JRadioButton("OFF");
		rdbtnOff.setSelected(true);
		rdbtnOff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn0.setEnabled(false);
				btn1.setEnabled(false);
				btn2.setEnabled(false);
				btn3.setEnabled(false);
				btn4.setEnabled(false);
				btn5.setEnabled(false);
				btn6.setEnabled(false);
				btn7.setEnabled(false);
				btn8.setEnabled(false);
				btn9.setEnabled(false);
				
				btndot.setEnabled(false);
				btnplsmin.setEnabled(false);
				btnplus.setEnabled(false);
				btnsub.setEnabled(false);
				btndiv.setEnabled(false);
				btnmul.setEnabled(false);
				btneql.setEnabled(false);

				btnpercent.setEnabled(false);
				btnClear.setEnabled(false);
				btnBack.setEnabled(false);

				btnroot.setEnabled(false);
				btn1divx.setEnabled(false);
				btnlog.setEnabled(false);
				btnsinh.setEnabled(false);
				btncosh.setEnabled(false);
				btntanh.setEnabled(false);
				btnxpowery.setEnabled(false);
				btnxpo3.setEnabled(false);
				btnxsquare.setEnabled(false);
				btnfact.setEnabled(false);
				btnexpo.setEnabled(false);
				btnsin.setEnabled(false);
				btncos.setEnabled(false);
				btntan.setEnabled(false);
				textField.setEnabled(false);


				
			}
		});
		buttonGroup.add(rdbtnOff);
		rdbtnOff.setFont(new Font("Arial", Font.BOLD, 13));
		rdbtnOff.setBounds(446, 136, 103, 21);
		frame.getContentPane().add(rdbtnOff);
	}
}