package day03;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MyGui08 extends JFrame {

	private JPanel contentPane;
	private JTextField tf_mine;
	private JTextField tf_com;
	private JTextField tf_result;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyGui08 frame = new MyGui08();
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
	public MyGui08() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_mine = new JLabel("Mine");
		lbl_mine.setBounds(43, 31, 57, 15);
		contentPane.add(lbl_mine);
		
		JLabel lbl_com = new JLabel("Com");
		lbl_com.setBounds(43, 77, 57, 15);
		contentPane.add(lbl_com);
		
		JLabel lbl_result = new JLabel("Result");
		lbl_result.setBounds(43, 130, 57, 15);
		contentPane.add(lbl_result);
		
		tf_mine = new JTextField();
		tf_mine.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(e.getKeyChar() == KeyEvent.VK_ENTER) {
					gamestart();
				}
			}
		});
		tf_mine.setBounds(140, 28, 116, 21);
		contentPane.add(tf_mine);
		tf_mine.setColumns(10);
		
		tf_com = new JTextField();
		tf_com.setColumns(10);
		tf_com.setBounds(140, 74, 116, 21);
		contentPane.add(tf_com);
		
		tf_result = new JTextField();
		tf_result.setColumns(10);
		tf_result.setBounds(140, 127, 116, 21);
		contentPane.add(tf_result);
		
		JButton btn = new JButton("start game");
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				gamestart();
			}
		});
		btn.setBounds(43, 190, 213, 23);
		contentPane.add(btn);
	}
	
	public void gamestart() {
		String mine = tf_mine.getText();
		String com = "";
		String res = "";
		
		double rnd = Math.random();
		
		if(rnd>0.66) {
			com = "∞°¿ß";
		}else if(rnd>0.33) {
			com = "πŸ¿ß";
		}else {
			com = "∫∏";
		}
		
		
		if(mine.equals(com)) {
			res = "∫Ò±Ë";
		}else {
			if(com.equals("∞°¿ß")) {
				if(mine.equals("πŸ¿ß")) {
					res = "¿Ã±Ë";
				}else if(mine.equals("∫∏")) {
					res = "¡¸";
				}
			}else if(com.equals("πŸ¿ß")) {
				if(mine.equals("∞°¿ß")) {
					res = "¡¸";
				}else if(mine.equals("∫∏")) {
					res = "¿Ã±Ë";
				}
			}else {
				if(mine.equals("∞°¿ß")) {
					res = "¿Ã±Ë";
				}else if(mine.equals("πŸ¿ß")) {
					res = "¡¸";
				}
			}
		}
		
		tf_com.setText(com);
		tf_result.setText(res);
	}

}
