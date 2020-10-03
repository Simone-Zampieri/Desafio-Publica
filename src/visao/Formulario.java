package visao;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controle.Controle;
import modelo.Jogo;
import validar.ValidaCadastro;

import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;
import java.awt.Color;
import java.awt.Font;
import javax.swing.table.DefaultTableModel;

public class Formulario extends JFrame {

	private JPanel contentPane;
	private JTextField txtPlacar;
	private JTextField txtMinTemp;
	private JTextField txtMaxTemp;
	private JTextField txtMinRecorde;
	private JTextField txtMaxRecorde;
	private JTable table;

	/**
	 * Create the frame.
	 */

	public Formulario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 623, 347);
		contentPane = new JPanel();
		contentPane.setForeground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setFont(new Font("Tahoma", Font.BOLD, 12));
		tabbedPane.setForeground(new Color(0, 0, 139));
		tabbedPane.setBounds(6, 6, 601, 266);
		contentPane.add(tabbedPane);

		JPanel pnlCadastro = new JPanel();
		pnlCadastro.setForeground(new Color(0, 0, 139));
		tabbedPane.addTab("Cadastro", null, pnlCadastro, null);
		pnlCadastro.setLayout(null);

		JLabel lblPlacar = new JLabel("Placar");
		lblPlacar.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPlacar.setForeground(new Color(0, 0, 205));
		lblPlacar.setBounds(16, 20, 61, 16);
		pnlCadastro.add(lblPlacar);

		JLabel lblMinTemp = new JLabel("Mínimo da temporada");
		lblMinTemp.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblMinTemp.setForeground(new Color(0, 0, 205));
		lblMinTemp.setBounds(16, 50, 168, 16);
		pnlCadastro.add(lblMinTemp);

		JLabel lblMaxTemp = new JLabel("Máximo da temporada");
		lblMaxTemp.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblMaxTemp.setForeground(new Color(0, 0, 205));
		lblMaxTemp.setBounds(16, 80, 152, 16);
		pnlCadastro.add(lblMaxTemp);

		JLabel lblMinRecorde = new JLabel("Quebra de recorde Min.");
		lblMinRecorde.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblMinRecorde.setForeground(new Color(0, 0, 205));
		lblMinRecorde.setBounds(16, 110, 168, 16);
		pnlCadastro.add(lblMinRecorde);

		JLabel lblMaxRecorde = new JLabel("Quebra de recorde Max.");
		lblMaxRecorde.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblMaxRecorde.setForeground(new Color(0, 0, 205));
		lblMaxRecorde.setBounds(16, 140, 168, 16);
		pnlCadastro.add(lblMaxRecorde);

		txtPlacar = new JTextField();
		txtPlacar.setForeground(Color.BLUE);
		txtPlacar.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
			}
		});
		txtPlacar.setBounds(200, 15, 226, 26);
		pnlCadastro.add(txtPlacar);
		txtPlacar.setColumns(10);

		txtMinTemp = new JTextField();
		txtMinTemp.setForeground(Color.BLUE);
		txtMinTemp.setBounds(200, 46, 226, 26);
		pnlCadastro.add(txtMinTemp);
		txtMinTemp.setColumns(10);

		txtMaxTemp = new JTextField();
		txtMaxTemp.setForeground(Color.BLUE);
		txtMaxTemp.setBounds(200, 75, 226, 26);
		pnlCadastro.add(txtMaxTemp);
		txtMaxTemp.setColumns(10);

		txtMinRecorde = new JTextField();
		txtMinRecorde.setForeground(Color.BLUE);
		txtMinRecorde.setBounds(200, 105, 225, 26);
		pnlCadastro.add(txtMinRecorde);
		txtMinRecorde.setColumns(10);

		txtMaxRecorde = new JTextField();
		txtMaxRecorde.setForeground(Color.BLUE);
		txtMaxRecorde.setBounds(200, 135, 226, 26);
		pnlCadastro.add(txtMaxRecorde);
		txtMaxRecorde.setColumns(10);

		JPanel pnlListagem = new JPanel();
		tabbedPane.addTab("Listagem", null, pnlListagem, null);
		pnlListagem.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 6, 580, 179);
		pnlListagem.add(scrollPane);

		table = new JTable();
		table.setForeground(Color.BLUE);
		table.setModel(
				new DefaultTableModel(new Object[][] {}, new String[] { "Jogo", "Placar", "M\u00EDnimo de temporada",
						"M\u00E1ximo de temporada", "M\u00EDnimo de Recorde", "M\u00E1ximo de Recorde" }));
		scrollPane.setViewportView(table);

		JPanel pnlResultado = new JPanel();
		tabbedPane.addTab("Resultado", null, pnlResultado, null);
		pnlResultado.setLayout(null);

		JLabel lblRecordeQuebrado = new JLabel("Recordes quebrados: " + Controle.recordesQuebrados());
		lblRecordeQuebrado.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblRecordeQuebrado.setForeground(new Color(30, 144, 255));
		lblRecordeQuebrado.setBounds(20, 23, 395, 16);
		pnlResultado.add(lblRecordeQuebrado);

		JLabel lblMaximoTemporada = new JLabel("Calculo Máximo da Temporada: " + Controle.calculoMaximoTemporada());
		lblMaximoTemporada.setForeground(new Color(30, 144, 255));
		lblMaximoTemporada.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMaximoTemporada.setBounds(20, 60, 395, 28);
		pnlResultado.add(lblMaximoTemporada);

		JLabel lblMinimoTemporada = new JLabel("Calculo Mínimo da Temporada: " + Controle.calculoMinimoTemporada());
		lblMinimoTemporada.setForeground(new Color(30, 144, 255));
		lblMinimoTemporada.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMinimoTemporada.setBounds(20, 105, 395, 28);
		pnlResultado.add(lblMinimoTemporada);

		table.setModel(Controle.listar());

		//

		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnCadastrar.setForeground(Color.BLUE);
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// Obter os dados
				int placar = Integer.parseInt(txtPlacar.getText());
				int minTemporada = Integer.parseInt(txtMinTemp.getText());
				int maxTemporada = Integer.parseInt(txtMaxTemp.getText());
				int minRecorde = Integer.parseInt(txtMinRecorde.getText());
				int maxRecorde = Integer.parseInt(txtMaxRecorde.getText());

				// Instanciar objeto do modelo Jogo
				Jogo j = new Jogo(placar, minTemporada, maxTemporada, minRecorde, maxRecorde);

				// Validar jogo
				ValidaCadastro vc = new ValidaCadastro(j);
				boolean negativo = vc.valoresNegativos();
				boolean menorMil = vc.valoresMaioresOuIguaisA1000();

				if (negativo == false || menorMil == false) {
					JOptionPane.showMessageDialog(null, "Informações inválidas, favor revisar");
				} else {

					// Efetuar o cadastro
					Controle.cadastrar(j);

					// Atualizar a tabela
					table.setModel(Controle.listar());

					// Exibir a quantidade de recordes quebrados
					lblRecordeQuebrado.setText("A quantidade de recordes quebrados: " + Controle.recordesQuebrados());

					lblMaximoTemporada.setText("Calculo Maximo da Temporada: " + Controle.calculoMaximoTemporada());

					lblMinimoTemporada.setText("Calculo Minimo da Temporada: " + Controle.calculoMinimoTemporada());

					// Mensagem
					JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso!");
				}
			}
		});
		btnCadastrar.setBounds(225, 182, 117, 29);
		pnlCadastro.add(btnCadastrar);

	}
}
