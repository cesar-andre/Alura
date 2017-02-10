package br.com.caelum.empresa.leitor;

import java.io.ByteArrayInputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

import br.com.caelum.empresa.modelo.Funcionario;
import br.com.caelum.empresa.modelo.Gasto;

public class ImportadorDeGastos {
	
	private SimpleDateFormat df = new SimpleDateFormat("ddMMyyyy");

	public List<Gasto> importa(ByteArrayInputStream entrada) throws ParseException {
		Scanner leitor = new Scanner(entrada);
		ArrayList<Gasto> gastos = new ArrayList<Gasto>();

		while (leitor.hasNextLine()) {
			String line = leitor.nextLine();
			String tipo = line.substring(0, 6);
			String dataDespesaTxt = line.substring(6, 14);
			String valorTxt = line.substring(14, 23);
			String matriculaTxt = line.substring(23, 26);
			String nomeTxt = line.substring(26, 56);
			String dataNascTxt = line.substring(56);
			double valor = Double.parseDouble(valorTxt);
			int matricula = Integer.parseInt(matriculaTxt);
			Calendar dataNascimento = converteDataTxt(dataNascTxt);
			Calendar dataDespesa = converteDataTxt(dataDespesaTxt);
			Funcionario funcionario = new Funcionario(nomeTxt, matricula, dataNascimento);
			gastos.add(new Gasto(valor, tipo, funcionario, dataDespesa));
		}

		return gastos;
	}

	private Calendar converteDataTxt(String dataNascTxt) throws ParseException {
		Calendar dataNascimento = Calendar.getInstance();
		dataNascimento.setTime(df.parse(dataNascTxt));
		return dataNascimento;
	}

}
