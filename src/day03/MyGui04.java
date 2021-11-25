package day03;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyGui04 extends JFrame {

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
					MyGui04 frame = new MyGui04();
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
	public MyGui04() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tfa = new JTextField();
		tfa.setBounds(12, 36, 65, 21);
		contentPane.add(tfa);
		tfa.setColumns(10);
		
		JLabel lbl = new JLabel("\uC5D0\uC11C");
		lbl.setBounds(89, 39, 57, 15);
		contentPane.add(lbl);
		
		tfb = new JTextField();
		tfb.setBounds(125, 36, 65, 21);
		contentPane.add(tfb);
		tfb.setColumns(10);
		
		JButton btn = new JButton("\uAE4C\uC9C0 \uD569\uC740");
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int a = Integer.parseInt(tfa.getText());
				int b = Integer.parseInt(tfb.getText());
				int sum = 0;
				for(int i=a; i<=b; i++) {
					sum += i;
				}
				tfc.setText(Integer.toString(sum));
			}
		});
		btn.setBounds(202, 35, 113, 23);
		contentPane.add(btn);
		
		tfc = new JTextField();
		tfc.setBounds(327, 36, 80, 21);
		contentPane.add(tfc);
		tfc.setColumns(10);
	}

}
