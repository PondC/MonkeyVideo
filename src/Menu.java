import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.io.File;
import java.util.ArrayList;

import javax.swing.JButton;

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
		String subject = (id.charAt(id.length() - 1) == '1') ? "Math" : "Physics";
		
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 1003, 589);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblStudentId = new JLabel("Student ID");
		lblStudentId.setFont(new Font("Cordia New", Font.PLAIN, 45));
		lblStudentId.setBounds(26, 29, 145, 45);
		contentPane.add(lblStudentId);
		
		JLabel lblSubject = new JLabel("Subject");
		lblSubject.setFont(new Font("Cordia New", Font.PLAIN, 40));
		lblSubject.setBounds(196, 29, 109, 45);
		contentPane.add(lblSubject);
		
		JButton btnVdo_1 = new JButton("VDO1");
		btnVdo_1.setBounds(84, 162, 159, 93);
		contentPane.add(btnVdo_1);
		
		JButton btnVdo_2 = new JButton("VDO2");
		btnVdo_2.setBounds(417, 162, 159, 93);
		contentPane.add(btnVdo_2);
		
		JButton btnVdo_3 = new JButton("VDO3");
		btnVdo_3.setBounds(758, 162, 159, 93);
		contentPane.add(btnVdo_3);
		
		JButton btnVdo_4 = new JButton("VDO4");
		btnVdo_4.setBounds(84, 360, 159, 93);
		contentPane.add(btnVdo_4);
		
		JButton btnVdo_5 = new JButton("VDO5");
		btnVdo_5.setBounds(417, 360, 159, 93);
		contentPane.add(btnVdo_5);
		
		JButton btnVdo_6 = new JButton("VDO6");
		btnVdo_6.setBounds(758, 360, 159, 93);
		contentPane.add(btnVdo_6);
	}
	
	public ArrayList<String> getFileInFolder(String id) {
		String subject = (id.charAt(id.length() - 1) == '1') ? "Math" : "Physics";
		File folder = new File("\\\\monkeycloud\\vdo\\" + id.substring(0, id.length() - 1) + "\\" + subject);
		ArrayList<String> listOfFileName = new ArrayList<String>();
		File[] listOfFiles = folder.listFiles();
		for (int i = 0; i < listOfFiles.length; i++) {
			listOfFileName.add(listOfFiles[i].getName());
		}
		return listOfFileName;
	}
}
