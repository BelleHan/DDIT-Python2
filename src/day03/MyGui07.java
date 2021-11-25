package day03;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyGui07 extends JFrame {

	private JPanel contentPane;
	private JTextField tfDan;
	JTextArea ta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyGui07 frame = new MyGui07();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MyGui07() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 248, 414);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl = new JLabel("\uB2E8:");
		lbl.setBounds(29, 29, 57, 15);
		contentPane.add(lbl);
		
		tfDan = new JTextField();
		tfDan.setBounds(74, 26, 116, 21);
		contentPane.add(tfDan);
		tfDan.setColumns(10);
		
		JButton btn = new JButton("\uACB0\uACFC\uBCF4\uAE30");
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String dan = tfDan.getText();
				int ddan = Integer.parseInt(dan);
				String txt = "";
				
				txt += dan+"*1="+(ddan*1)+"\n";
				txt += dan+"*2="+(ddan*2)+"\n";
				txt += dan+"*3="+(ddan*3)+"\n";
				txt += dan+"*4="+(ddan*4)+"\n";
				txt += dan+"*5="+(ddan*5)+"\n";
				
				txt += dan+"*6="+(ddan*6)+"\n";
				txt += dan+"*7="+(ddan*7)+"\n";
				txt += dan+"*8="+(ddan*8)+"\n";
				txt += dan+"*9="+(ddan*9)+"\n";
				
				ta.setText(txt);
				
			}
		});
		btn.setBounds(29, 69, 161, 23);
		contentPane.add(btn);
		
		ta = new JTextArea();
		ta.setBounds(36, 102, 154, 263);
		contentPane.add(ta);
	}
	

}
