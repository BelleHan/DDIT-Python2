package day03;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyGui03 extends JFrame {

	private JPanel contentPane;
	private JTextField tfa;
	private JTextField tfb;
	private JTextField tfc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyGui03 frame = new MyGui03();
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
	public MyGui03() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tfa = new JTextField();
		tfa.setText("1");
		tfa.setBounds(12, 21, 66, 21);
		contentPane.add(tfa);
		tfa.setColumns(10);
		
		tfb = new JTextField();
		tfb.setText("2");
		tfb.setColumns(10);
		tfb.setBounds(154, 21, 66, 21);
		contentPane.add(tfb);
		
		tfc = new JTextField();
		tfc.setColumns(10);
		tfc.setBounds(315, 21, 66, 21);
		contentPane.add(tfc);
		
		JLabel lbl = new JLabel("+");
		lbl.setBounds(100, 24, 42, 15);
		contentPane.add(lbl);
		
		JButton btn = new JButton("=");
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int num1 = Integer.parseInt(tfa.getText());
				int num2 = Integer.parseInt(tfb.getText());
				int res = num1 + num2;			
				tfc.setText(Integer.toString(res));
			}
		});
		btn.setBounds(237, 20, 66, 23);
		contentPane.add(btn);
	}
}
