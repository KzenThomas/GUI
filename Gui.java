package Schooll;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Gui {
	int i = 0;
	JTextArea jta = new JTextArea(5, 20);

	public static void main(String[] args) {
		Gui gui = new Gui();

		JFrame frame = new JFrame();
		frame.setSize(600, 800);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		JPanel panel = new JPanel();
		frame.add(panel);
		JLabel textlabel = new JLabel("dfjopsfkkfjojqsfjdfqjifJIOQFDOJIDJHIOSDFJHISDFNIOSD");
		panel.add(textlabel);
		JButton button = new JButton("klik");
		JButton buttonDel = new JButton("Verwijder vanaf 50");

		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String textomtetonen = "Mijntekst";
				gui.jta.setText(textomtetonen);
				gui.counter();
			}
		});

		buttonDel.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				gui.verwijdervanaf50();
			}
		});

		panel.add(button);
		panel.add(buttonDel);
		gui.jta.setSize(400, 400);
		JScrollPane scrl = new JScrollPane(gui.jta);
		scrl.setSize(400, 400);
		scrl.setPreferredSize(new Dimension(400, 400));
		panel.add(scrl);
		frame.setVisible(true);
	}

	public void counter() {
		String text = "";
		for (i = 0; i < 101; i++) {
			text += i + "\n";

		}
		jta.setText(text);
	}

	public void verwijdervanaf50() {
		String text = "";
		for (i = 0; i < 101; i++) {
			text += i + "\n";
			if (i > 49) {
				break;
			}else {
				continue;
			}

		}
		jta.setText(text);
	}
}
