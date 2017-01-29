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

import java.awt.Desktop;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;

@SuppressWarnings("serial")
public class Menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu(args[0]);
//					Menu frame = new Menu("159991");
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
	public Menu(String id) {
		String subject = "null";
		if (id.charAt(id.length() - 1) == '1') {
			subject = "Math";
		}else if (id.charAt(id.length() - 1) == '2') {
			subject = "Physics";
		}
		
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 1200, 800);
		contentPane = new JPanel();
		contentPane.setBackground((id.charAt(id.length() - 1) == '1') ? new Color(255, 204, 153) : new Color(204, 153, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblStudentId = new JLabel(id.substring(0, id.length() - 1));
		lblStudentId.setHorizontalAlignment(SwingConstants.LEFT);
		lblStudentId.setFont(new Font("Cordia New", Font.PLAIN, 45));
		lblStudentId.setBounds(81, 66, 281, 84);
		contentPane.add(lblStudentId);
		
		JLabel lblSubject = new JLabel(subject);
		lblSubject.setHorizontalAlignment(SwingConstants.CENTER);
		lblSubject.setFont(new Font("Cordia New", Font.PLAIN, 40));
		lblSubject.setBounds(331, 88, 166, 45);
		contentPane.add(lblSubject);
		
		String[] VDOName = getVDOName(id);
		ArrayList<File> listOfFiles = getFile(id);
		
		JButton btnVdo_1 = new JButton((VDOName[0] == null) ? "No Video" : VDOName[0]);
		btnVdo_1.setFont(new Font("Cordia New", Font.PLAIN, 35));
		btnVdo_1.setBackground(Color.WHITE);
		btnVdo_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				try {
					Desktop.getDesktop().open(listOfFiles.get(0));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnVdo_1.setBounds(81, 201, 300, 150);
		contentPane.add(btnVdo_1);
		
		JButton btnVdo_2 = new JButton((VDOName[1] == null) ? "No Video" : VDOName[1]);
		btnVdo_2.setFont(new Font("Cordia New", Font.PLAIN, 35));
		btnVdo_2.setBackground(Color.WHITE);
		btnVdo_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				try {
					Desktop.getDesktop().open(listOfFiles.get(1));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnVdo_2.setBounds(453, 201, 300, 150);
		contentPane.add(btnVdo_2);
		
		JButton btnVdo_3 = new JButton((VDOName[2] == null) ? "No Video" : VDOName[2]);
		btnVdo_3.setFont(new Font("Cordia New", Font.PLAIN, 35));
		btnVdo_3.setBackground(Color.WHITE);
		btnVdo_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				try {
					Desktop.getDesktop().open(listOfFiles.get(2));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnVdo_3.setBounds(830, 201, 300, 150);
		contentPane.add(btnVdo_3);
		
		JButton btnVdo_4 = new JButton((VDOName[3] == null) ? "No Video" : VDOName[3]);
		btnVdo_4.setFont(new Font("Cordia New", Font.PLAIN, 35));
		btnVdo_4.setBackground(Color.WHITE);
		btnVdo_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				try {
					Desktop.getDesktop().open(listOfFiles.get(3));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnVdo_4.setBounds(81, 489, 300, 150);
		contentPane.add(btnVdo_4);
		
		JButton btnVdo_5 = new JButton((VDOName[4] == null) ? "No Video" : VDOName[4]);
		btnVdo_5.setFont(new Font("Cordia New", Font.PLAIN, 35));
		btnVdo_5.setBackground(Color.WHITE);
		btnVdo_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				try {
					Desktop.getDesktop().open(listOfFiles.get(4));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnVdo_5.setBounds(453, 489, 300, 150);
		contentPane.add(btnVdo_5);
		
		JButton btnVdo_6 = new JButton((VDOName[5] == null) ? "No Video" : VDOName[5]);
		btnVdo_6.setFont(new Font("Cordia New", Font.PLAIN, 35));
		btnVdo_6.setBackground(Color.WHITE);
		btnVdo_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				try {
					Desktop.getDesktop().open(listOfFiles.get(5));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnVdo_6.setBounds(830, 489, 300, 150);
		contentPane.add(btnVdo_6);
	}
	
	
	public String[] getVDOName(String id) {
		String[] fileName = new String[6];
		ArrayList<String> fileNameList = getFileNameInFolder(id);
		for (int i = 0; i < fileName.length; i++) {
			try {
				fileName[i] = (fileNameList.get(i)).substring(0, fileNameList.get(i).length() - 7);
			} catch (Exception e) {
			}
		}
		return fileName;
	}
	
	public ArrayList<File> getFile(String id) {
//		String subject = getSubject(id);
//		File folder = new File(Index.DB_LOCATION + id.substring(0, id.length() - 1) + "\\" + subject);
		File folder = new File(Index.DB_LOCATION + id);
		ArrayList<File> listOfFile = new ArrayList<File>();
		File[] listOfFiles = folder.listFiles();
		for (int i = 0; i < listOfFiles.length; i++) {
			if (listOfFiles[i].getName().equals("log.csv")) continue;
			listOfFile.add(listOfFiles[i]);
		}
		return listOfFile;
	}
	
	public ArrayList<String> getFileNameInFolder(String id) {
		ArrayList<File> listOfFiles = getFile(id);
		ArrayList<String> listOfFileName = new ArrayList<String>();
		for (int i = 0; i < listOfFiles.size(); i++) {
			listOfFileName.add(listOfFiles.get(i).getName());
		}
		return listOfFileName;
	}
	
//	public String getSubject(String id) {
//		return (id.charAt(id.length() - 1) == '1') ? "Math" : "Physics";
//	}
}
