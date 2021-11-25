package day03;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;

public class MyGui09 extends JFrame {

	private JPanel contentPane;
	private JTextField tf;
	String phone = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyGui09 frame = new MyGui09();
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
	public MyGui09() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 246, 228);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tf = new JTextField();
		tf.setHorizontalAlignment(SwingConstants.RIGHT);
		tf.setBounds(12, 10, 209, 21);
		contentPane.add(tf);
		tf.setColumns(10);
		
		JButton btn1 = new JButton("1");
		btn1.setBounds(12, 41, 56, 23);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setBounds(92, 41, 56, 23);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setBounds(165, 41, 56, 23);
		contentPane.add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.setBounds(12, 73, 56, 23);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setBounds(92, 73, 56, 23);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setBounds(165, 74, 56, 23);
		contentPane.add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.setBounds(12, 106, 56, 23);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setBounds(92, 106, 56, 23);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setBounds(165, 107, 56, 23);
		contentPane.add(btn9);
		
		JButton btn0 = new JButton("0");
		btn0.setBounds(12, 139, 56, 23);
		contentPane.add(btn0);
		
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				numClick(e);
			}
		});
		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				numClick(e);
			}
		});
		btn3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				numClick(e);
			}
		});
		btn4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				numClick(e);
			}
		});
		btn5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				numClick(e);
			}
		});
		btn6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				numClick(e);
			}
		});
		btn7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				numClick(e);
			}
		});
		btn8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				numClick(e);
			}
		});
		btn9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				numClick(e);
			}
		});
		btn0.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				numClick(e);
			}
		});
		
		
		JButton btnCall = new JButton("call");
		btnCall.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String tel = tf.getText();
				JOptionPane.showMessageDialog(null, "calling " + tel);
			}
		});
		btnCall.setBounds(92, 139, 126, 23);
		contentPane.add(btnCall);
	}
	
	public void numClick(MouseEvent e) {
		JButton temp = (JButton)e.getSource();
		String str_old = tf.getText();
		String str_new = temp.getText();
		tf.setText(str_old+str_new);
	}

}
