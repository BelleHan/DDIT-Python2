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

public class MyGui05 extends JFrame {

	private JPanel contentPane;
	private JTextField tfa;
	private JTextField tfb;
	private JTextField tfc;
	private JTextField tfd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyGui05 frame = new MyGui05();
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
	public MyGui05() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 543, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tfa = new JTextField();
		tfa.setText("1");
		tfa.setBounds(12, 20, 57, 21);
		contentPane.add(tfa);
		tfa.setColumns(10);
		
		JLabel lbla = new JLabel("\uC5D0\uC11C");
		lbla.setBounds(81, 23, 41, 15);
		contentPane.add(lbla);
		
		tfb = new JTextField();
		tfb.setText("4");
		tfb.setBounds(118, 20, 57, 21);
		contentPane.add(tfb);
		tfb.setColumns(10);
		
		JLabel lblb = new JLabel("\uAE4C\uC9C0");
		lblb.setBounds(187, 23, 41, 15);
		contentPane.add(lblb);
		
		tfc = new JTextField();
		tfc.setText("2");
		tfc.setBounds(220, 20, 57, 21);
		contentPane.add(tfc);
		tfc.setColumns(10);
		
		JButton btn = new JButton("\uC758 \uBC30\uC218 \uD569\uC740");
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int a = Integer.parseInt(tfa.getText());
				int b = Integer.parseInt(tfb.getText());
				int c = Integer.parseInt(tfc.getText());
				int sum = 0;
				
				for(int i=a; i<=b; i++) {
					if(i%c==0) {
						sum += i;
					}
				}
				
				tfd.setText(Integer.toString(sum));
						
			}
		});
		btn.setBounds(289, 19, 120, 23);
		contentPane.add(btn);
		
		tfd = new JTextField();
		tfd.setBounds(421, 20, 94, 21);
		contentPane.add(tfd);
		tfd.setColumns(10);
	}

}
