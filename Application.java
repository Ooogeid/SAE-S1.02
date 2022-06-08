import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;

import java.awt.BorderLayout;
import javax.swing.JList;
import javax.swing.JProgressBar;
import java.awt.Color;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import net.miginfocom.swing.MigLayout;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.CardLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.Component;

public class Application {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Application window = new Application();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Application() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//JPanel panel = new JPanel();
		//panel.setBackground(Color.WHITE);
		//frame.getContentPane().add(panel, BorderLayout.CENTER);
		
		Articles articles = GenerationFromages.générationBaseFromages();
		Articles sauvegarde = new Articles();
		sauvegarde.addFromages(articles.getLesFromages());
		
		//articles.trierArticles();
		articles.getLesFromages().sort(null);
		
		ArrayList<String> fromages = new ArrayList<String>();
		for (Fromage i : articles.getLesFromages()) {
			fromages.add(i.getDésignation());
		}
		String[] res = new String[fromages.size()];
		for (int i = 0; i<fromages.size();i++) {
			res[i] = fromages.get(i);
		}
		//panel.setLayout(new BorderLayout(0, 0));
		
		
		JList list = new JList(res);
		list.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("prou");
				Fromage fromage = (Fromage) list.getSelectedValue();
				Application_2 fenetre = new Application_2();
				fenetre.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				fenetre.setVisible(true);
			}
		});
		list.setValueIsAdjusting(true);
		list.setBackground(Color.WHITE);
		//panel.add(list, BorderLayout.CENTER);
		
		JButton button = new JButton("New button");
		frame.getContentPane().add(button, BorderLayout.NORTH);
		
		/*JPanel panel = new JPanel();
		//frame.getContentPane().add(panel, BorderLayout.SOUTH);
		panel.setLayout(new GridLayout(0, 4, 0, 0));
		
		JButton btnNewButton = new JButton("Chèvre");
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Vache");
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Brebis");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Tous");
		panel.add(btnNewButton_3);*/
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.NORTH);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Fromages");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel, BorderLayout.CENTER);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\lucas\\Desktop\\Informatique\\Java\\Fromage\\src\\Fromage.png"));
		panel_1.add(lblNewLabel_2, BorderLayout.WEST);
		
		JPanel panel = new JPanel();
		panel_1.add(panel, BorderLayout.SOUTH);
		panel.setLayout(new GridLayout(0, 4, 0, 0));
		
		JButton btnNewButton = new JButton("Chèvre");
		
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Vache");
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Brebis");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Tous");
		panel.add(btnNewButton_3);
		
		JPanel panel_4 = new JPanel();
		panel_1.add(panel_4, BorderLayout.EAST);
		panel_4.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnNewButton_4_1 = new JButton("");
		btnNewButton_4_1.setIcon(new ImageIcon("C:\\Users\\lucas\\Desktop\\Informatique\\Java\\Fromage\\src\\Panier_ptit.png"));
		panel_4.add(btnNewButton_4_1);
		
		JLabel lblNewLabel_5_1 = new JLabel("0,00€");
		panel_4.add(lblNewLabel_5_1);
		
		JPanel panel_2 = new JPanel();
		frame.getContentPane().add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panel_2.add(scrollPane);
		scrollPane.setViewportView(list);
		
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
					articles.getLesFromages().sort(null);;
					
					ArrayList<String> fromages = new ArrayList<String>();
					for (Fromage i : articles.getLesFromages()) {
						if (i.getTypeFromage() == TypeLait.CHEVRE) {
							fromages.add(i.getDésignation());
						}
					}
					String[] res = new String[fromages.size()];
					for (int i = 0; i<fromages.size();i++) {
						res[i] = fromages.get(i);
					}
					//panel.setLayout(new BorderLayout(0, 0));
					JList list = new JList(res);
					scrollPane.setViewportView(list);
					lblNewLabel.setText("Fromages de chèvre");
					panel_1.add(lblNewLabel, BorderLayout.CENTER);
					list.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							System.out.println("prou");
						}
					});
					}
			});
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
					articles.getLesFromages().sort(null);;
					
					ArrayList<String> fromages = new ArrayList<String>();
					for (Fromage i : articles.getLesFromages()) {
						if (i.getTypeFromage() == TypeLait.VACHE) {
							fromages.add(i.getDésignation());
						}
					}
					String[] res = new String[fromages.size()];
					for (int i = 0; i<fromages.size();i++) {
						res[i] = fromages.get(i);
					}
					//panel.setLayout(new BorderLayout(0, 0));
					JList list = new JList(res);
					scrollPane.setViewportView(list);
					lblNewLabel.setText("Fromages de vache");
					panel_1.add(lblNewLabel, BorderLayout.CENTER);
					list.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							System.out.println("prou");
						}
					});
				}
		});
		
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
					articles.getLesFromages().sort(null);;
					
					ArrayList<String> fromages = new ArrayList<String>();
					for (Fromage i : articles.getLesFromages()) {
						if (i.getTypeFromage() == TypeLait.BREBIS) {
							fromages.add(i.getDésignation());
						}
					}
					String[] res = new String[fromages.size()];
					for (int i = 0; i<fromages.size();i++) {
						res[i] = fromages.get(i);
					}
					//panel.setLayout(new BorderLayout(0, 0));
					JList list = new JList(res);
					scrollPane.setViewportView(list);
					lblNewLabel.setText("Fromages de brebis");
					panel_1.add(lblNewLabel, BorderLayout.CENTER);
					list.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							System.out.println("prou");
						}
					});
			}
		});
		
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
					articles.getLesFromages().sort(null);;
					
					ArrayList<String> fromages = new ArrayList<String>();
					for (Fromage i : articles.getLesFromages()) {
						fromages.add(i.getDésignation());
					}
					String[] res = new String[fromages.size()];
					for (int i = 0; i<fromages.size();i++) {
						res[i] = fromages.get(i);
					}
					//panel.setLayout(new BorderLayout(0, 0));
					JList list = new JList(res);
					scrollPane.setViewportView(list);
					lblNewLabel.setText("Fromages");
					panel_1.add(lblNewLabel, BorderLayout.CENTER);
					list.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							System.out.println("prou");
						}
					});
					}
		});
	}

}
