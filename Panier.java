import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JRadioButton;
import java.awt.GridLayout;

public class Panier extends JDialog {
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Panier dialog = new Panier();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Panier() {
		setBounds(100, 100, 499, 425);
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("Votre panier");
		lblNewLabel.setFont(new Font("Lucida Calligraphy", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 8));
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\diego\\Downloads\\Panier_ptit.png"));
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		getContentPane().add(panel_1, BorderLayout.SOUTH);
		
		JButton btnContinuerLesAchats = new JButton("Continuer les achats");
		btnContinuerLesAchats.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 12));
		panel_1.add(btnContinuerLesAchats);
		
		JButton btnNewButton = new JButton("Vider panier");
		btnNewButton.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 12));
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Valider panier");
		btnNewButton_1.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 12));
		panel_1.add(btnNewButton_1);
		
		JPanel panel_2 = new JPanel();
		getContentPane().add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new GridLayout(2, 1, 0, 0));
		
		table = new JTable();
		table.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 14));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"produit", "prix", "quantit\u00E9", "total"},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column"
			}
		));
		panel_2.add(table);
		
		JPanel panel_3 = new JPanel();
		panel_2.add(panel_3);
		panel_3.setLayout(new GridLayout(2, 1, 0, 0));
		
		JLabel lblNewLabel_2 = new JLabel("Options de livraison : ");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		panel_3.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 14));
		
		JLabel lblNewLabel_3 = new JLabel("");
		panel_3.add(lblNewLabel_3);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Standard (Gratuit)");
		rdbtnNewRadioButton.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 12));
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Rapide (4,99 €)");
		rdbtnNewRadioButton_1.setHorizontalAlignment(SwingConstants.LEFT);
		panel_3.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 12));
	}

}
