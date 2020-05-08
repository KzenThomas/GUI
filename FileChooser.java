package school;

import java.io.*;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.filechooser.*;

public class FileChooser {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton button = new JButton("FileChooser");
		JTextArea area = new JTextArea();

		frame.setSize(500, 700);
		frame.setVisible(true);

		frame.add(panel);
		panel.add(button);
		panel.add(area);
		
		UIManager.put("ScrollPane.background", Color.GREEN);
		UIManager.put("List.background", Color.ORANGE);
		UIManager.put("List.foreground", Color.BLACK);

		button.addActionListener(new ActionListener() {
			final JFileChooser chooser = new JFileChooser("C:\\java\\MyJava\\src\\school\\test.txt");
			 File file = chooser.getSelectedFile();
			public void actionPerformed(ActionEvent e) {
				int returnVal = chooser.showOpenDialog(frame);
				if (returnVal == JFileChooser.APPROVE_OPTION) {
					try {
						BufferedReader br = new BufferedReader(new FileReader(file));
						String st;
						while ((st = br.readLine()) != null)
							area.setText(st);
					} catch (FileNotFoundException e1) {
						e1.printStackTrace();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				} else {
				}
			}
		});
	}	

}

		

