import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import java.awt.Font;

public class Application_3 extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Application_3 dialog = new Application_3();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Application_3() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JLabel lblNewLabel = new JLabel("Informations personnelles");
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
			contentPanel.add(lblNewLabel, BorderLayout.NORTH);
		}
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(new BorderLayout(0, 0));
			{
				JPanel panel_1 = new JPanel();
				panel.add(panel_1, BorderLayout.WEST);
				panel_1.setLayout(new GridLayout(8, 0, 0, 0));
				{
					JLabel lblNewLabel_1 = new JLabel("Nom:");
					panel_1.add(lblNewLabel_1);
				}
				{
					JLabel lblNewLabel_2 = new JLabel("Prénom:");
					panel_1.add(lblNewLabel_2);
				}
				{
					JLabel lblNewLabel_3 = new JLabel("Adresse 1:");
					panel_1.add(lblNewLabel_3);
				}
				{
					JLabel lblNewLabel_4 = new JLabel("Adresse 2:");
					panel_1.add(lblNewLabel_4);
				}
				{
					JLabel lblNewLabel_5 = new JLabel("Code postal:    ");
					panel_1.add(lblNewLabel_5);
				}
				{
					JLabel lblNewLabel_6 = new JLabel("Ville:");
					panel_1.add(lblNewLabel_6);
				}
				{
					JLabel lblNewLabel_7 = new JLabel("Téléphone:");
					panel_1.add(lblNewLabel_7);
				}
				{
					JLabel lblNewLabel_8 = new JLabel("E-Mail:");
					panel_1.add(lblNewLabel_8);
				}
			}
			{
				JPanel panel_1 = new JPanel();
				panel.add(panel_1, BorderLayout.CENTER);
				panel_1.setLayout(new GridLayout(8, 0, 0, 0));
				{
					textField = new JTextField();
					panel_1.add(textField);
					textField.setColumns(10);
				}
				{
					textField_1 = new JTextField();
					panel_1.add(textField_1);
					textField_1.setColumns(10);
				}
				{
					textField_2 = new JTextField();
					panel_1.add(textField_2);
					textField_2.setColumns(10);
				}
				{
					textField_3 = new JTextField();
					panel_1.add(textField_3);
					textField_3.setColumns(10);
				}
				{
					textField_4 = new JTextField();
					panel_1.add(textField_4);
					textField_4.setColumns(10);
				}
				{
					textField_5 = new JTextField();
					panel_1.add(textField_5);
					textField_5.setColumns(10);
				}
				{
					textField_6 = new JTextField();
					panel_1.add(textField_6);
					textField_6.setColumns(10);
				}
				{
					textField_7 = new JTextField();
					panel_1.add(textField_7);
					textField_7.setColumns(10);
				}
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
