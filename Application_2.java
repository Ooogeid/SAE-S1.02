import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.ImageIcon;
import java.awt.GridLayout;
import java.awt.Font;
import javax.swing.JComboBox;

public class Application_2 extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Application_2 dialog = new Application_2();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Application_2() {
		setBounds(100, 100, 494, 503);
		getContentPane().setLayout(new BorderLayout());
		{
			JPanel panel = new JPanel();
			getContentPane().add(panel, BorderLayout.NORTH);
			panel.setLayout(new BorderLayout(0, 0));
			{
				JLabel lblNewLabel = new JLabel("");
				lblNewLabel.setIcon(new ImageIcon("C:\\AkaHannya\\Travail\\S2\\Java\\SAE\\Fromage\\src\\Fromage.png"));
				panel.add(lblNewLabel, BorderLayout.WEST);
			}
			{
				JLabel lblNewLabel_1 = new JLabel("");
				lblNewLabel_1.setIcon(new ImageIcon("C:\\AkaHannya\\Travail\\S2\\Java\\SAE\\Fromage\\src\\Panier_ptit.png"));
				panel.add(lblNewLabel_1, BorderLayout.EAST);
			}
			{
				JTextPane textPane = new JTextPane();
				panel.add(textPane, BorderLayout.CENTER);
			}
		}
		{
			JPanel panel = new JPanel();
			getContentPane().add(panel, BorderLayout.CENTER);
			panel.setLayout(new BorderLayout(0, 0));
			{
				JPanel panel_1 = new JPanel();
				panel.add(panel_1, BorderLayout.NORTH);
				panel_1.setLayout(new GridLayout(3, 1, 0, 0));
				{
					JLabel lblNewLabel_2 = new JLabel("");
					panel_1.add(lblNewLabel_2);
				}
				{
					JLabel lblNewLabel_3 = new JLabel("");
					panel_1.add(lblNewLabel_3);
				}
				{
					JLabel lblNewLabel_4 = new JLabel("Description");
					lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
					panel_1.add(lblNewLabel_4);
				}
			}
			{
				JPanel panel_1 = new JPanel();
				panel.add(panel_1);
				panel_1.setLayout(new BorderLayout(0, 0));
				{
					JTextPane textPane = new JTextPane();
					panel_1.add(textPane, BorderLayout.CENTER);
				}
				{
					JPanel panel_2 = new JPanel();
					panel_1.add(panel_2, BorderLayout.SOUTH);
					panel_2.setLayout(new GridLayout(4, 3, 0, 0));
					{
						JLabel lblNewLabel_5 = new JLabel("");
						panel_2.add(lblNewLabel_5);
					}
					{
						JLabel lblNewLabel_6 = new JLabel("");
						panel_2.add(lblNewLabel_6);
					}
					{
						JLabel lblNewLabel_7 = new JLabel("Quantité:");
						panel_2.add(lblNewLabel_7);
					}
					{
						JLabel lblNewLabel_8 = new JLabel("");
						panel_2.add(lblNewLabel_8);
					}
					{
						JComboBox comboBox = new JComboBox();
						panel_2.add(comboBox);
					}
					{
						JComboBox comboBox = new JComboBox();
						panel_2.add(comboBox);
					}
					{
						JLabel lblNewLabel_9 = new JLabel("");
						panel_2.add(lblNewLabel_9);
					}
					{
						JLabel lblNewLabel_10 = new JLabel("");
						panel_2.add(lblNewLabel_10);
					}
					{
						JLabel lblNewLabel_11 = new JLabel("");
						panel_2.add(lblNewLabel_11);
					}
					{
						JLabel lblNewLabel_12 = new JLabel("");
						panel_2.add(lblNewLabel_12);
					}
					{
						JButton btnNewButton = new JButton("Ajouter au panier");
						panel_2.add(btnNewButton);
					}
					{
						JButton btnNewButton_1 = new JButton("Annuler");
						panel_2.add(btnNewButton_1);
					}
				}
			}
		}
		{
			JPanel panel = new JPanel();
			getContentPane().add(panel, BorderLayout.SOUTH);
			panel.setLayout(new GridLayout(0, 3, 0, 0));
			{
				JLabel lblNewLabel_13 = new JLabel("");
				panel.add(lblNewLabel_13);
			}
			{
				JLabel lblNewLabel_14 = new JLabel("");
				panel.add(lblNewLabel_14);
			}
			{
				JLabel lblNewLabel_15 = new JLabel("");
				panel.add(lblNewLabel_15);
			}
			{
				JButton btnNewButton_2 = new JButton("Retour à l'accueil");
				panel.add(btnNewButton_2);
			}
			{
				JLabel lblNewLabel_16 = new JLabel("");
				panel.add(lblNewLabel_16);
			}
			{
				JButton btnNewButton_3 = new JButton("Panier");
				panel.add(btnNewButton_3);
			}
			{
				JLabel lblNewLabel_17 = new JLabel("");
				panel.add(lblNewLabel_17);
			}
		}
	}

}
