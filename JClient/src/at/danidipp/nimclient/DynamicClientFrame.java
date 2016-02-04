package at.danidipp.nimclient;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.Font;

public class DynamicClientFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DynamicClientFrame frame = new DynamicClientFrame();
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
	public DynamicClientFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 312);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		
		JButton btn00 = new JButton(" | ");
		btn00.setFont(new Font("Segoe UI Black", Font.PLAIN, 32));
		panel.add(btn00);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.X_AXIS));
		
		JButton btn10 = new JButton(" | ");
		btn10.setFont(new Font("Segoe UI Black", Font.PLAIN, 32));
		panel_1.add(btn10);
		
		JButton btn11 = new JButton(" | ");
		btn11.setFont(new Font("Segoe UI Black", Font.PLAIN, 32));
		panel_1.add(btn11);
		
		JButton btn12 = new JButton(" | ");
		btn12.setFont(new Font("Segoe UI Black", Font.PLAIN, 32));
		panel_1.add(btn12);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2);
		panel_2.setLayout(new BoxLayout(panel_2, BoxLayout.X_AXIS));
		
		JButton btn20 = new JButton(" | ");
		btn20.setFont(new Font("Segoe UI Black", Font.PLAIN, 32));
		panel_2.add(btn20);
		
		JButton btn21 = new JButton(" | ");
		btn21.setFont(new Font("Segoe UI Black", Font.PLAIN, 32));
		panel_2.add(btn21);
		
		JButton btn22 = new JButton(" | ");
		btn22.setFont(new Font("Segoe UI Black", Font.PLAIN, 32));
		panel_2.add(btn22);
		
		JButton btn23 = new JButton(" | ");
		btn23.setFont(new Font("Segoe UI Black", Font.PLAIN, 32));
		panel_2.add(btn23);
		
		JButton btn24 = new JButton(" | ");
		btn24.setFont(new Font("Segoe UI Black", Font.PLAIN, 32));
		panel_2.add(btn24);
		
		JPanel panel_3 = new JPanel();
		contentPane.add(panel_3);
		panel_3.setLayout(new BoxLayout(panel_3, BoxLayout.X_AXIS));
		
		JButton btn30 = new JButton(" | ");
		btn30.setFont(new Font("Segoe UI Black", Font.PLAIN, 32));
		panel_3.add(btn30);
		
		JButton btn31 = new JButton(" | ");
		btn31.setFont(new Font("Segoe UI Black", Font.PLAIN, 32));
		panel_3.add(btn31);
		
		JButton btn32 = new JButton(" | ");
		btn32.setFont(new Font("Segoe UI Black", Font.PLAIN, 32));
		panel_3.add(btn32);
		
		JButton btn33 = new JButton(" | ");
		btn33.setFont(new Font("Segoe UI Black", Font.PLAIN, 32));
		panel_3.add(btn33);
		
		JButton btn34 = new JButton(" | ");
		panel_3.add(btn34);
		btn34.setFont(new Font("Segoe UI Black", Font.PLAIN, 32));
		
		JButton btn35 = new JButton(" | ");
		btn35.setFont(new Font("Segoe UI Black", Font.PLAIN, 32));
		panel_3.add(btn35);
		
		JButton btn36 = new JButton(" | ");
		btn36.setFont(new Font("Segoe UI Black", Font.PLAIN, 32));
		panel_3.add(btn36);
		
		JPanel panel_4 = new JPanel();
		contentPane.add(panel_4);
		
		JButton btnReset = new JButton("Reset");
		panel_4.add(btnReset);
	}

}
