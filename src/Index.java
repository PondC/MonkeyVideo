/**
Copyright [2016] [Chutipon]

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 */

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Color;

public class Index extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Index frame = new Index();
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
	public Index() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 965, 492);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEnterStudentId = new JLabel("Enter Student ID");
		lblEnterStudentId.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterStudentId.setFont(new Font("Cordia New", Font.PLAIN, 38));
		lblEnterStudentId.setBounds(144, 94, 209, 50);
		contentPane.add(lblEnterStudentId);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				if (arg0.getKeyChar() == '\n') {
					String id = textField.getText();
					textField.setText("");
					run(id);
				}
			}
		});
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Cordia New", Font.PLAIN, 50));
		textField.setBounds(85, 219, 327, 85);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton button = new JButton("1");
		button.setBackground(Color.WHITE);
		button.setForeground(Color.BLACK);
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				textField.setText(textField.getText() + "1");
			}
		});
		button.setFont(new Font("Cordia New", Font.PLAIN, 40));
		button.setBounds(574, 43, 70, 70);
		contentPane.add(button);
		
		JButton button_1 = new JButton("2");
		button_1.setBackground(Color.WHITE);
		button_1.setForeground(Color.BLACK);
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				textField.setText(textField.getText() + "2");
			}
		});
		button_1.setFont(new Font("Cordia New", Font.PLAIN, 40));
		button_1.setBounds(680, 43, 70, 70);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("3");
		button_2.setBackground(Color.WHITE);
		button_2.setForeground(Color.BLACK);
		button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				textField.setText(textField.getText() + "3");
			}
		});
		button_2.setFont(new Font("Cordia New", Font.PLAIN, 40));
		button_2.setBounds(788, 45, 70, 70);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("4");
		button_3.setBackground(Color.WHITE);
		button_3.setForeground(Color.BLACK);
		button_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				textField.setText(textField.getText() + "4");
			}
		});
		button_3.setFont(new Font("Cordia New", Font.PLAIN, 40));
		button_3.setBounds(574, 147, 70, 70);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("5");
		button_4.setBackground(Color.WHITE);
		button_4.setForeground(Color.BLACK);
		button_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				textField.setText(textField.getText() + "5");
			}
		});
		button_4.setFont(new Font("Cordia New", Font.PLAIN, 40));
		button_4.setBounds(680, 147, 70, 70);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("6");
		button_5.setBackground(Color.WHITE);
		button_5.setForeground(Color.BLACK);
		button_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				textField.setText(textField.getText() + "6");
			}
		});
		button_5.setFont(new Font("Cordia New", Font.PLAIN, 40));
		button_5.setBounds(788, 147, 70, 70);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("7");
		button_6.setBackground(Color.WHITE);
		button_6.setForeground(Color.BLACK);
		button_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				textField.setText(textField.getText() + "7");
			}
		});
		button_6.setFont(new Font("Cordia New", Font.PLAIN, 40));
		button_6.setBounds(574, 249, 70, 70);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("8");
		button_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				textField.setText(textField.getText() + "8");
			}
		});
		button_7.setBackground(Color.WHITE);
		button_7.setForeground(Color.BLACK);
		button_7.setFont(new Font("Cordia New", Font.PLAIN, 40));
		button_7.setBounds(680, 249, 70, 70);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("9");
		button_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				textField.setText(textField.getText() + "9");
			}
		});
		button_8.setBackground(Color.WHITE);
		button_8.setForeground(Color.BLACK);
		button_8.setFont(new Font("Cordia New", Font.PLAIN, 40));
		button_8.setBounds(788, 249, 70, 70);
		contentPane.add(button_8);
		
		JButton button_9 = new JButton("d");
		button_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				try {
					textField.setText(textField.getText().substring(0, textField.getText().length() - 1));
				} catch (Exception e1) {
				}
			}
			@Override
			public void mouseReleased(MouseEvent e) {
			}
		});
		button_9.setBackground(Color.WHITE);
		button_9.setForeground(Color.BLACK);
		button_9.setFont(new Font("Cordia New", Font.PLAIN, 40));
		button_9.setBounds(574, 345, 70, 70);
		contentPane.add(button_9);
		
		JButton button_10 = new JButton("0");
		button_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				textField.setText(textField.getText() + "0");
			}
		});
		button_10.setBackground(Color.WHITE);
		button_10.setForeground(Color.BLACK);
		button_10.setFont(new Font("Cordia New", Font.PLAIN, 40));
		button_10.setBounds(680, 345, 70, 70);
		contentPane.add(button_10);
		
		JButton button_11 = new JButton("e");
		button_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				String id = textField.getText();
				textField.setText("");
				run(id);
			}
		});
		button_11.setBackground(Color.WHITE);
		button_11.setForeground(Color.BLACK);
		button_11.setFont(new Font("Cordia New", Font.PLAIN, 40));
		button_11.setBounds(788, 345, 70, 70);
		contentPane.add(button_11);
	}
	
	public void run(String id) {
		boolean inDB = checkInDB(id);
		if (!isValid(id)) {
			JOptionPane.showMessageDialog(null, "Wrong student ID", "Error: ID input not found", JOptionPane.INFORMATION_MESSAGE);
			textField.setText("");
			return;
		}
		this.setVisible(false);
		String[] input = {id};
		Menu.main(input);
		this.setVisible(true);
	}
	
	public boolean isValid(String id) {
		if (id.length() == 6 && (id.charAt(id.length() - 1) == '1' || id.charAt(id.length() - 1) == '2') && checkInDB(id)) {
			return true;
		}
		return false;
	}
	
	public boolean checkInDB(String id) {
		String subject = (id.charAt(id.length() - 1) == '1') ? "Math" : "Physics";
		try {
			File folder = new File("\\\\monkeycloud\\vdo\\" + id.substring(0, id.length() - 1) + "\\" + subject);
			File[] listOfFiles = folder.listFiles();
//			System.out.println("Pass");
			for (int i = 0; i < listOfFiles.length; i++) {
				if (listOfFiles[i].isFile()) {
//					System.out.println("File " + listOfFiles[i].getName());
				} else if (listOfFiles[i].isDirectory()) {
//					System.out.println("Directory " + listOfFiles[i].getName());
				}
			}
			return true;
		} catch (Exception e) {
//			System.out.println("Fail");
			return false;
		}
	}
}
