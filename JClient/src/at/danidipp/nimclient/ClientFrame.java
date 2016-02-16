package at.danidipp.nimclient;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.awt.event.ActionEvent;

public class ClientFrame extends JFrame {

	private JPanel contentPane;
	private JButton btn30;
	private JButton btn31;
	private JButton btn32;
	private JButton btn33;
	private JButton btn34;
	private JButton btn35;
	private JButton btn36;
	private JButton btn20;
	private JButton btn21;
	private JButton btn22;
	private JButton btn23;
	private JButton btn24;
	private JButton btn10;
	private JButton btn11;
	private JButton btn12;
	private JButton btn00;
	private JButton btnEndRound;
	
	private boolean[][] buttonStates = {{true}, {true, true, true}, {true, true, true, true, true}, {true, true, true, true, true, true, true}};
	private boolean[][] oldButtonStates =  {{true}, {true, true, true}, {true, true, true, true, true}, {true, true, true, true, true, true, true}};
	private JButton btnReset;
	private boolean currentPlayer1 = true;
	private boolean gameModeCoOp;
	private String player1Name = "Player 1";
	private String player2Name = "Player 2";
	private String serverIp = "localhost";
	private int serverPort = 10110;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClientFrame frame = new ClientFrame();
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
	public ClientFrame() {
		setTitle("NIM Game");
		
		try {
		    this.setIconImage(ImageIO.read(new File("res/icon.png")));
		}
		catch (IOException exc) {
		    exc.printStackTrace();
		}
		
		initComponents();
		
		initGameRules();
	}
	private void initGameRules() {
		
		Object[] modeOptions = {"vs Machine", "vs Human"};
		int modeSelection = JOptionPane.showOptionDialog(this, "Select Game Mode",  "Initialize Game", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, modeOptions, modeOptions[0]);
		
		if (modeSelection == 0){		//vs Machine selected
			gameModeCoOp = false;
			
			String[] ipParts;
			do {
				serverIp = JOptionPane.showInputDialog("Server IP:", "localhost");
				ipParts =  serverIp.split(":");		//removing Port, if applicable
				serverPort = ipParts[1].isEmpty() ? 10110 : Integer.parseInt(ipParts[1]); //writes the custom port in the field variable for later use
			} while (!isIp4Address(ipParts[0]));
			
			
		} else if (modeSelection == 1){	//vs Human selected
			
		}
		
		
	}

	private boolean isIp4Address(String address) {
		// TODO Auto-generated method stub
	    if (address.isEmpty()) {
	        return false;
	    }
	    try {
	        Object res = InetAddress.getByName(address);
	        return res instanceof Inet4Address || res instanceof Inet6Address;
	    } catch (final UnknownHostException ex) {
	        return false;
	    }
	}

	private void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 315);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btn30 = new JButton("|");
		btn30.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn30ActionPerformed(e);
			}
		});
		btn30.setBounds(10, 201, 50, 50);
		contentPane.add(btn30);
		
		btn31 = new JButton("|");
		btn31.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn31ActionPerformed(e);
			}
		});
		btn31.setBounds(70, 201, 50, 50);
		contentPane.add(btn31);
		
		btn32 = new JButton("|");
		btn32.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn32ActionPerformed(e);
			}
		});
		btn32.setBounds(130, 201, 50, 50);
		contentPane.add(btn32);
		
		btn33 = new JButton("|");
		btn33.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn33ActionPerformed(e);
			}
		});
		btn33.setBounds(190, 201, 50, 50);
		contentPane.add(btn33);
		
		btn34 = new JButton("|");
		btn34.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn34ActionPerformed(e);
			}
		});
		btn34.setBounds(250, 201, 50, 50);
		contentPane.add(btn34);
		
		btn35 = new JButton("|");
		btn35.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn35ActionPerformed(e);
			}
		});
		btn35.setBounds(310, 201, 50, 50);
		contentPane.add(btn35);
		
		btn36 = new JButton("|");
		btn36.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn36ActionPerformed(e);
			}
		});
		btn36.setBounds(370, 201, 50, 50);
		contentPane.add(btn36);
		
		btn20 = new JButton("|");
		btn20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn20ActionPerformed(e);
			}
		});
		btn20.setBounds(70, 140, 50, 50);
		contentPane.add(btn20);
		
		btn21 = new JButton("|");
		btn21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn21ActionPerformed(e);
			}
		});
		btn21.setBounds(130, 140, 50, 50);
		contentPane.add(btn21);
		
		btn22 = new JButton("|");
		btn22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn22ActionPerformed(e);
			}
		});
		btn22.setBounds(190, 140, 50, 50);
		contentPane.add(btn22);
		
		btn23 = new JButton("|");
		btn23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn23ActionPerformed(e);
			}
		});
		btn23.setBounds(250, 140, 50, 50);
		contentPane.add(btn23);
		
		btn24 = new JButton("|");
		btn24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn24ActionPerformed(e);
			}
		});
		btn24.setBounds(310, 140, 50, 50);
		contentPane.add(btn24);
		
		btn10 = new JButton("|");
		btn10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn10ActionPerformed(e);
			}
		});
		btn10.setBounds(130, 79, 50, 50);
		contentPane.add(btn10);
		
		btn11 = new JButton("|");
		btn11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn11ActionPerformed(e);
			}
		});
		btn11.setBounds(190, 79, 50, 50);
		contentPane.add(btn11);
		
		btn12 = new JButton("|");
		btn12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn12ActionPerformed(e);
			}
		});
		btn12.setBounds(250, 79, 50, 50);
		contentPane.add(btn12);
		
		btn00 = new JButton("|");
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn00ActionPerformed(e);
			}
		});
		btn00.setBounds(190, 18, 50, 50);
		contentPane.add(btn00);
		
		btnEndRound = new JButton("End Round");
		btnEndRound.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnEndRoundActionPerformed(e);
			}
		});
		btnEndRound.setBounds(303, 18, 110, 50);
		contentPane.add(btnEndRound);
		
		btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnResetActionPerformed(e);
			}
		});
		btnReset.setBounds(10, 18, 110, 50);
		contentPane.add(btnReset);
	}
	
	
	protected void btn00ActionPerformed(ActionEvent e) {
		buttonStates[0][0] = !buttonStates[0][0];
		btn00.setText(buttonStates[0][0] ? "|" : "");
	}
	
	protected void btn10ActionPerformed(ActionEvent e) {
		buttonStates[1][0] = !buttonStates[1][0];
		btn10.setText(buttonStates[1][0] ? "|" : "");
	}
	
	protected void btn11ActionPerformed(ActionEvent e) {
		buttonStates[1][1] = !buttonStates[1][1];
		btn11.setText(buttonStates[1][1] ? "|" : "");
	}
	
	protected void btn12ActionPerformed(ActionEvent e) {
		buttonStates[1][2] = !buttonStates[1][2];
		btn12.setText(buttonStates[1][2] ? "|" : "");
	}
	
	protected void btn20ActionPerformed(ActionEvent e) {
		buttonStates[2][0] = !buttonStates[2][0];
		btn20.setText(buttonStates[2][0] ? "|" : "");
	}
	
	protected void btn21ActionPerformed(ActionEvent e) {
		buttonStates[2][1] = !buttonStates[2][1];
		btn21.setText(buttonStates[2][1] ? "|" : "");
	}
	
	protected void btn22ActionPerformed(ActionEvent e) {
		buttonStates[2][2] = !buttonStates[2][2];
		btn22.setText(buttonStates[2][2] ? "|" : "");
	}
	
	protected void btn23ActionPerformed(ActionEvent e) {
		buttonStates[2][3] = !buttonStates[2][3];
		btn23.setText(buttonStates[2][3] ? "|" : "");
	}
	
	protected void btn24ActionPerformed(ActionEvent e) {
		buttonStates[2][4] = !buttonStates[2][4];
		btn24.setText(buttonStates[2][4] ? "|" : "");
	}
	
	protected void btn30ActionPerformed(ActionEvent e) {
		buttonStates[3][0] = !buttonStates[3][0];
		btn30.setText(buttonStates[3][0] ? "|" : "");
	}
	
	protected void btn31ActionPerformed(ActionEvent e) {
		buttonStates[3][1] = !buttonStates[3][1];
		btn31.setText(buttonStates[3][1] ? "|" : "");
	}
	
	protected void btn32ActionPerformed(ActionEvent e) {
		buttonStates[3][2] = !buttonStates[3][2];
		btn32.setText(buttonStates[3][2] ? "|" : "");
	}
	
	protected void btn33ActionPerformed(ActionEvent e) {
		buttonStates[3][3] = !buttonStates[3][3];
		btn33.setText(buttonStates[3][3] ? "|" : "");
	}
	
	protected void btn34ActionPerformed(ActionEvent e) {
		buttonStates[3][4] = !buttonStates[3][4];
		btn34.setText(buttonStates[3][4] ? "|" : "");
	}
	
	protected void btn35ActionPerformed(ActionEvent e) {
		buttonStates[3][5] = !buttonStates[3][5];
		btn35.setText(buttonStates[3][5] ? "|" : "");
	}
	
	protected void btn36ActionPerformed(ActionEvent e) {
		buttonStates[3][6] = !buttonStates[3][6];
		btn36.setText(buttonStates[3][6] ? "|" : "");
	}
	
	protected void btnResetActionPerformed(ActionEvent e) {
		for (int i = 0; i < buttonStates.length; i++) {
			for (int j = 0; j < buttonStates[i].length; j++) {
				
				if (buttonStates[i][j] != oldButtonStates[i][j]){
					switch (""+i+j) {
					case "00":
						btn00ActionPerformed(e);
						break;
						
					case "10":
						btn10ActionPerformed(e);
						break;
					case "11":
						btn11ActionPerformed(e);
						break;
					case "12":
						btn12ActionPerformed(e);
						break;
						
					case "20":
						btn20ActionPerformed(e);
						break;
					case "21":
						btn21ActionPerformed(e);
						break;
					case "22":
						btn22ActionPerformed(e);
						break;
					case "23":
						btn23ActionPerformed(e);
						break;
					case "24":
						btn24ActionPerformed(e);
						break;
						
					case "30":
						btn30ActionPerformed(e);
						break;
					case "31":
						btn31ActionPerformed(e);
						break;
					case "32":
						btn32ActionPerformed(e);
						break;
					case "33":
						btn33ActionPerformed(e);
						break;
					case "34":
						btn34ActionPerformed(e);
						break;
					case "35":
						btn35ActionPerformed(e);
						break;
					case "36":
						btn36ActionPerformed(e);
						break;

					default:
						break;
					}
				}
			}
		}
	}
	
	protected void btnEndRoundActionPerformed(ActionEvent e) {
		
		checkLegalMoves(e);
		
		btn00.setEnabled(buttonStates[0][0]);
		
		btn10.setEnabled(buttonStates[1][0]);
		btn11.setEnabled(buttonStates[1][1]);
		btn12.setEnabled(buttonStates[1][2]);
		
		btn20.setEnabled(buttonStates[2][0]);
		btn21.setEnabled(buttonStates[2][1]);
		btn22.setEnabled(buttonStates[2][2]);
		btn23.setEnabled(buttonStates[2][3]);
		btn24.setEnabled(buttonStates[2][4]);
		
		btn30.setEnabled(buttonStates[3][0]);
		btn31.setEnabled(buttonStates[3][1]);
		btn32.setEnabled(buttonStates[3][2]);
		btn33.setEnabled(buttonStates[3][3]);
		btn34.setEnabled(buttonStates[3][4]);
		btn35.setEnabled(buttonStates[3][5]);
		btn36.setEnabled(buttonStates[3][6]);
		
		shiftButtonStates();
		
		managePlayers();
		
	}


	private void checkLegalMoves(ActionEvent e) {
		
		if(numberOfChangedlines() == 0){
			JOptionPane.showMessageDialog(this,"No moves selected", "Error", JOptionPane.WARNING_MESSAGE);
			return;
		}
		
		if(numberOfChangedlines() > 1){
			Object[] options = {"OK", "Reset"};
			int optionSelection = JOptionPane.showOptionDialog(this, "Don't select strikes in more than one row!",  "Error", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
			if(optionSelection == 1){	//Selected "Reset"

				btnResetActionPerformed(e);
				return;
			}
			
			return;
		}
		
	}

	private void managePlayers() {

		if(gameModeCoOp){
			if (currentPlayer1) {
				super.setTitle("NIM Game | " + player1Name);
			}else{
				super.setTitle("NIM Game | " + player2Name);
			}
		}else{
			if (currentPlayer1) {
				super.setTitle("NIM Game | " + player1Name);
			}else{
				super.setTitle("NIM Game | Server");
			}
		}
		currentPlayer1 = !currentPlayer1;
	}

	private int numberOfChangedlines() { //counts lines with changed buttons
		int numberOfChangedLines = 0;
		for (int i = 0; i < buttonStates.length; i++) {
			for (int j = 0; j < buttonStates[i].length; j++) {
				
				if (buttonStates[i][j] != oldButtonStates[i][j]){
					numberOfChangedLines++;
					break;
				}
				
			}
		}
		return numberOfChangedLines;
	}

	private void shiftButtonStates() { //Replaces old button states with current ones.
		for (int i = 0; i < buttonStates.length; i++) {
			for (int j = 0; j < buttonStates[i].length; j++) {
				
				oldButtonStates[i][j] = buttonStates[i][j];
				
			}
		}
	}
}
