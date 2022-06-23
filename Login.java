import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtLogin;
	private JTextField txtSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * 
	 * @throws IOException
	 */
	public Login() throws IOException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 400);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		List<String> login = new LinkedList<String>();
		List<String> senha = new LinkedList<String>();
		
		login.add("farofa");
		senha.add("123");

		// BOTÃO RECUPERAR LOGIN
		JButton btnRecLogin = new JButton("Recuperar login");
		btnRecLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRecLogin.setBackground(SystemColor.menu);
		btnRecLogin.setFont(new Font("Txt_IV50", Font.BOLD, 11));
		btnRecLogin.setToolTipText("CONFIRM");
		btnRecLogin.setBounds(187, 300, 150, 23);
		btnRecLogin.setForeground(new Color(0, 0, 0));
		contentPane.add(btnRecLogin);

		// BOTÃO RECUPERAR SENHA
		JButton btnRecSenha = new JButton("Recuperar senha");
		btnRecSenha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRecSenha.setBackground(SystemColor.menu);
		btnRecSenha.setFont(new Font("Txt_IV50", Font.BOLD, 11));
		btnRecSenha.setToolTipText("CONFIRM");
		btnRecSenha.setBounds(347, 300, 150, 23);
		contentPane.add(btnRecSenha);

		// ÁREA PARA DIGITAR O LOGIN
		txtLogin = new JTextField();
		txtLogin.setHorizontalAlignment(SwingConstants.CENTER);
		txtLogin.setBounds(242, 130, 200, 30);
		txtLogin.setText(null);
		contentPane.add(txtLogin);
		txtLogin.setColumns(10);

		// BOTÃO PARA CONFIRMAR
		JButton btnConfirm = new JButton("CONFIRMAR");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!login.contains(txtLogin.getText()) || !senha.contains(txtSenha.getText())) {
					JOptionPane.showMessageDialog(null, "Senha ou usuário incorretos!");
				} else {
					JOptionPane.showMessageDialog(null, "Bem-vindo!");
				}
			}
		});
		btnConfirm.setBackground(new Color(154, 205, 50));
		btnConfirm.setFont(new Font("Txt_IV50", Font.BOLD, 11));
		btnConfirm.setToolTipText("CONFIRM");
		btnConfirm.setBounds(267, 230, 150, 60);
		contentPane.add(btnConfirm);

		// TÍTULO PARA LOGIN DO SISTEMA
		JLabel lblNewLabel = new JLabel("Hospital Viver Bem");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Impact", Font.PLAIN, 48));
		lblNewLabel.setBounds(142, 25, 400, 50);
		contentPane.add(lblNewLabel);

		// ÁREA PARA DIGITAR A SENHA
		txtSenha = new JPasswordField();
		txtSenha.setHorizontalAlignment(SwingConstants.CENTER);
		txtSenha.setColumns(10);
		txtSenha.setText(null);
		txtSenha.setBounds(242, 190, 200, 30);
		contentPane.add(txtSenha);

		// VERSÃO DO SISTEMA
		JLabel lblNewLabel_1 = new JLabel("v1.0");
		lblNewLabel_1.setBounds(10, 336, 46, 14);
		contentPane.add(lblNewLabel_1);

	}
}