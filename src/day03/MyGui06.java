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

public class MyGui06 extends JFrame {

	private JPanel contentPane;
	private JTextField tfMine;
	private JTextField tfCom;
	private JTextField tfResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyGui06 frame = new MyGui06();
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
	public MyGui06() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMine = new JLabel("\uB098:");
		lblMine.setBounds(24, 27, 49, 15);
		contentPane.add(lblMine);
		
		JLabel lblCom = new JLabel("\uCEF4:");
		lblCom.setBounds(24, 72, 49, 15);
		contentPane.add(lblCom);
		
		JLabel lblResult = new JLabel("\uACB0\uACFC:");
		lblResult.setBounds(24, 112, 49, 15);
		contentPane.add(lblResult);
		
		tfMine = new JTextField();
		tfMine.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(e.getKeyChar() == KeyEvent.VK_ENTER) {
					gamestart();
				}
			}
		});

		tfMine.setBounds(107, 24, 116, 21);
		contentPane.add(tfMine);
		tfMine.setColumns(10);
		
		tfCom = new JTextField();
		tfCom.setColumns(10);
		tfCom.setBounds(107, 69, 116, 21);
		contentPane.add(tfCom);
		
		tfResult = new JTextField();
		tfResult.setColumns(10);
		tfResult.setBounds(107, 109, 116, 21);
		contentPane.add(tfResult);
		
		JButton btn = new JButton("\uAC8C\uC784\uD558\uAE30");
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				gamestart();
			}
		});
		btn.setBounds(24, 160, 199, 23);
		contentPane.add(btn);
	}
	
	
	public void gamestart() {
		String com = "";
		String mine = "";
		String result = "";
		mine = tfMine.getText();
		
		double ran = Math.random();
		
		if(ran > 0.5) {
			tfCom.setText("È¦");
		}else {
			tfCom.setText("Â¦");
		}
		
		com = tfCom.getText();
		
		if(mine.equals(com)) {
			tfResult.setText("ÀÌ±ט");
		}else {
			tfResult.setText("Áü");
		}
	}

}
