import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

class NotepadClass
{
	private String text;

	public NotepadClass(String t)
	{
		text = t;
	}

	public String getText()
	{
		return text;
	}
}

/*-----------------------------------------------*/

class NotepadGUI
{
	JFrame frame;
	JPanel panel;
	JTextArea textArea;
	NotepadClass note;

	public void buildGUI()
	{
		frame = new JFrame("Notepad");
		panel = new JPanel();
		textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);

		JScrollPane scroller = new JScrollPane(textArea);
		scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scroller.setVisible(true);

		panel.add(scroller);

		JMenuBar menuBar = new JMenuBar();
		JMenuItem newMenu = new JMenuItem("New");
		newMenu.addActionListener(new NewMenu());
		JMenuItem openMenu = new JMenuItem("Open");
		openMenu.addActionListener(new OpenMenu());
		JMenuItem saveMenu = new JMenuItem("Save");
		saveMenu.addActionListener(new SaveMenu());

		menuBar.add(newMenu);
		menuBar.add(openMenu);
		menuBar.add(saveMenu);

		frame.setJMenuBar(menuBar);
		frame.getContentPane().add(BorderLayout.CENTER, textArea);
		frame.setVisible(true);
		frame.setSize(600, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}


	public class NewMenu implements ActionListener
	{
		public void actionPerformed(ActionEvent ev)
		{
			textArea.setText("");
		}
	}


	public class OpenMenu implements ActionListener
	{
		public void actionPerformed(ActionEvent ev)
		{
			JFileChooser fileOpen = new JFileChooser();
			fileOpen.showOpenDialog(frame);
			loadFile(fileOpen.getSelectedFile());
		}
	}

	private void loadFile(File file)
	{
		try
		{
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String content = null;
			String line = null;
			while ((line=reader.readLine()) != null)
				content += line;
			textArea.setText(content);
			reader.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}


	public class SaveMenu implements ActionListener
	{
		public void actionPerformed(ActionEvent ev)
		{
			note = new NotepadClass(textArea.getText());

			JFileChooser fileSave = new JFileChooser();
			fileSave.showSaveDialog(frame);
			saveFile(fileSave.getSelectedFile());
		}
	}


	private void saveFile(File file)
	{
		try
		{
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			writer.write(note.getText());
			writer.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}

/*-----------------------------------------*/

public class Notepad
{
	public static void main(String[] args)
	{
		NotepadGUI run = new NotepadGUI();
		run.buildGUI();
	}
}