package testWindow_jdk16;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JDesktopPane;
import javax.swing.JScrollBar;
import javax.swing.JTextField;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JSpinner;
import javax.swing.JTextPane;
import javax.swing.JToggleButton;
import javax.swing.JEditorPane;
import javax.swing.JButton;
import java.awt.Canvas;

public class login {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 599, 346);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		

        
		
		
		
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(422, 110, 18, 24);
		frame.getContentPane().add(comboBox);
		
		JLabel label_1 = new JLabel("\u4E2D\u4FE1");
		label_1.setBounds(149, 13, 82, 90);
		label_1.setForeground(Color.RED);
		label_1.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 41));
		frame.getContentPane().add(label_1);
		
		JLabel label = new JLabel("\u56FE\u4E66\u7BA1\u7406\u8F6F\u4EF6");
		label.setBounds(237, 13, 252, 90);
		label.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 41));
		frame.getContentPane().add(label);
		
		textField = new JTextField();
		textField.setBounds(279, 110, 161, 24);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("\u767B\u5F55\u540D");
		lblNewLabel.setBounds(210, 113, 72, 18);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel label_2 = new JLabel("\u767B\u5F55\u5BC6\u7801");
		label_2.setBounds(210, 150, 72, 18);
		frame.getContentPane().add(label_2);
		
		JButton button = new JButton("\u767B\u5F55");
		button.setBounds(210, 231, 113, 27);
		frame.getContentPane().add(button);
		button.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.dispose();
				new MainWindow();
			}
		});
		
		
		JButton button_1 = new JButton("\u9000\u51FA");
		button_1.setBounds(337, 231, 113, 27);
		frame.getContentPane().add(button_1);
		button_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.dispose();
			}
		});
		
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 131, 311);
        JLabel imagelabel = new JLabel(new ImageIcon(this.getClass().getResource("1.png")));
		panel.add(imagelabel);
		
		frame.getContentPane().add(panel);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(279, 147, 161, 24);
		frame.getContentPane().add(passwordField);
		
		
		
	}
}
