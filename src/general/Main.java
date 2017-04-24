package general;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.Closeable;
import java.util.ArrayList;
import javax.swing.*;

import graphic_interface.*;
import validation.ValidacaoCPF;

public class Main {

	public static void main(String[] args) {
		boolean deuCertoMeu = false;
		/*
		 * int g = -1; while(g<0) { String input =
		 * JOptionPane.showInputDialog("va a merda"); if(input.length()>0) {
		 * g++; System.out.println("fodace meu irmao"); } else {
		 * System.out.println("seu nome arrombado"); } }
		 */

		JFrame janela = new CadastroPassageiro();

		janela.setVisible(true);
	}

}
