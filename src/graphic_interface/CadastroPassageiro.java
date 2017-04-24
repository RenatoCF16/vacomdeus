package graphic_interface;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.*;
import javax.swing.text.MaskFormatter;

import validation.*;
import general.*;

public class CadastroPassageiro extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Passageiro passageiro = new Passageiro();

	public CadastroPassageiro() {
		/*
		 * titulo do frame setTitle("Cadastro de Passageiro");
		 * incognita
		 * setSize(800,600);
		 * 
		 * this.setLocationRelativeTo(null);
		 * 
		 * setResizable(false);
		 * 
		 * JPanel grupo1 = new JPanel();
		 * 
		 * setLayout(a);
		 * 
		 * setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		 */

		Container janela = getContentPane();
		
		this.setTitle("Cadastro de Passsageiro");
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		
		// Define os rótulos dos botões
		JLabel labelNome = new JLabel("Nome: ");
		JLabel labelEmail = new JLabel("Email: ");
		JLabel labelTel = new JLabel("Telefone: ");
		JLabel labelCpf = new JLabel("CPF: ");
		JLabel labelDataNascimento = new JLabel("Nascimento: ");
		labelNome.setBounds(50, 40, 150, 20);
		labelEmail.setBounds(50, 80, 150, 20);
		labelTel.setBounds(50, 120, 150, 20);
		labelCpf.setBounds(50, 160, 150, 20);
		labelDataNascimento.setBounds(50, 200, 150, 20);

		/*instacia da variavel fora do Try Catch, uma vez q ela deve ser usada no escopo atual*/
		MaskFormatter mascaraTel = null;
		MaskFormatter mascaraData = null;
		
		try {
			/*formato para a mascara de telefone*/
			mascaraTel = new MaskFormatter("(##)#####-####");
			
			/*formato para a mascara de data*/
			mascaraData = new MaskFormatter("##/##/####");
			
			/*seta o caractere padrao para espacos vazios*/
			mascaraTel.setPlaceholderCharacter('_');
		} catch (Exception e) {
			System.exit(0);
		}
		
		/*Cria os campos de texto*/
		JTextField jTextNome = new JTextField();
		JTextField jTextEmail = new JTextField();
		JFormattedTextField jTextTel = new JFormattedTextField(mascaraTel);
		JTextField jTextCpf = new JTextField();
		JFormattedTextField jTextDataNascimento = new JFormattedTextField(mascaraData); 
		jTextNome.setBounds(150, 40, 150, 20);
		jTextEmail.setBounds(150, 80, 150, 20);
		jTextTel.setBounds(150, 120, 150, 20);
		jTextCpf.setBounds(150, 160, 150, 20);
		jTextDataNascimento.setBounds(150, 200, 150, 20);

		JButton jConfirmButton = new JButton("Confirmar");
		jConfirmButton.setBounds(100, 240, 150, 20);

		// Adiciona os rótulos e os campos de textos com máscaras na tela
		janela.add(labelNome);
		janela.add(labelEmail);
		janela.add(labelTel);
		janela.add(labelCpf);
		janela.add(labelDataNascimento);
		janela.add(jTextNome);
		janela.add(jTextEmail);
		janela.add(jTextTel);
		janela.add(jTextCpf);
		janela.add(jTextDataNascimento);
		janela.add(jConfirmButton);

		jConfirmButton
				.addActionListener(new ButtonHandler(jTextCpf, jTextDataNascimento, jTextEmail, jTextNome, jTextTel));

		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public class ButtonHandler implements ActionListener {

		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
		
		private JTextField cpf = new JTextField();
		private JTextField dataNascimento = new JTextField();
		private JTextField email = new JTextField();
		private JTextField nome = new JTextField();
		private JTextField telefone = new JTextField();

		String bosta;

		ButtonHandler(JTextField cpf, JTextField dataNascimento, JTextField email, JTextField nome,
				JTextField telefone) {
			this.cpf = cpf;
			this.dataNascimento = dataNascimento;
			this.email = email;
			this.nome = nome;
			this.telefone = telefone;
			this.bosta = cpf.getText();
		}

		public void actionPerformed(ActionEvent evento) {
			
			formatador.setLenient(false);
			
			try {
				/*verifica se o CPF e valido, se nao lança excessao*/
				if (!ValidacaoCPF.isCPFFormat(this.cpf.getText()))
					throw new Exception("CPF fora do formato! Inclua os pontos e traço.");
				
				/*verifica se o CPF e valido, se nao lança excessao*/
				if (!ValidacaoCPF.isCPF(this.cpf.getText()))
					throw new Exception("O CPF é inválido!");
				
				/*verifica se o email e valido, se nao lança excessao*/
				if(!ValidacaoEmail.isEmail(this.email.getText()))
					throw new Exception("O Email digitado é inválido");
				
				/*verifica se a data esta correta*/
				try {
					Date data = formatador.parse(this.dataNascimento.getText());
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Um ou mais dados estão incorretos: A data de nascimento é inválida!");
				}
				
			} catch (Exception e) {
				/*lanca uma excessa descrevendo o erro*/
				JOptionPane.showMessageDialog(null, "Um ou mais dados estão incorretos: "+e.getMessage());
			}
		}
	}
	
		
}
