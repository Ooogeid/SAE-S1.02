import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextPane;
import java.awt.GridLayout;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.EtchedBorder;

public class Application_4 extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Application_4 dialog = new Application_4();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Application_4() {
		setBounds(100, 100, 450, 400);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new GridLayout(3, 1, 0, 0));
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel);
			panel.setLayout(new BorderLayout(0, 0));
			{
				JLabel lblNewLabel_1 = new JLabel("Informations personnelles:");
				lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
				panel.add(lblNewLabel_1, BorderLayout.NORTH);
			}
			{
				JTextPane textPane = new JTextPane();
				panel.add(textPane, BorderLayout.CENTER);
			}
		}
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel);
			panel.setLayout(new BorderLayout(0, 0));
			{
				JLabel lblNewLabel_2 = new JLabel("Recap. Commande:");
				lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
				panel.add(lblNewLabel_2, BorderLayout.NORTH);
			}
			{
				JTextPane textPane = new JTextPane();
				panel.add(textPane, BorderLayout.CENTER);
			}
		}
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel);
			panel.setLayout(new BorderLayout(0, 0));
			{
				JTextPane textPane = new JTextPane();
				panel.add(textPane, BorderLayout.CENTER);
			}
			{
				JLabel lblNewLabel_3 = new JLabel("...");
				lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
				panel.add(lblNewLabel_3, BorderLayout.NORTH);
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton cancelButton = new JButton("Quitter");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
		{
			JPanel panel = new JPanel();
			getContentPane().add(panel, BorderLayout.NORTH);
			{
				JLabel lblNewLabel = new JLabel("FACTURE");
				lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
				panel.add(lblNewLabel);
			}
		}
	}

}
