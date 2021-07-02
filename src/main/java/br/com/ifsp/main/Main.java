package br.com.ifsp.main;

import br.com.ifsp.fonts.FontManager;
import br.com.ifsp.view.MenuView;

import java.awt.Font;
import javax.swing.UIManager;

public class Main {
	public static void main(String[] args) {
		FontManager fontManager = new FontManager();
		Font futuraPT16 = fontManager.carregarFont("/fontes/FuturaPT.otf", Font.PLAIN, 16);
		Font futuraPT14 = fontManager.carregarFont("/fontes/FuturaPT.otf", Font.PLAIN, 14);
		Font futuraPT14Bold = fontManager.carregarFont("/fontes/FuturaPT.otf", Font.BOLD, 14);
		Font futuraPT13 = fontManager.carregarFont("/fontes/FuturaPT.otf", Font.PLAIN, 13);
		UIManager.put("dateChooserCombo", futuraPT13);
		UIManager.put("Button.font", futuraPT16);
		UIManager.put("RadioButton.font", futuraPT13);
		UIManager.put("CheckBox.font", futuraPT13);
		UIManager.put("ComboBox.font", futuraPT13);
		UIManager.put("Label.font", futuraPT14);
		UIManager.put("Panel.font", futuraPT16);
		UIManager.put("Table.font", futuraPT13);
		UIManager.put("TableHeader.font", futuraPT14Bold);
		UIManager.put("TextField.font", futuraPT13);
		UIManager.put("FormattedTextField.font", futuraPT13);
		UIManager.put("TextArea.font", futuraPT13);
		new MenuView().setVisible(true);
	}
}
