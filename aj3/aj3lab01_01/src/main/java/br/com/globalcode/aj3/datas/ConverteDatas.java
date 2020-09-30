package br.com.globalcode.aj3.datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Conversao de datas
 * 
 * @author Globalcode
 */
public class ConverteDatas {

	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("Informe uma padrao de formatacao e uma data");
			System.out.println("Exemplo: yyyy.MM.dd 2004.06.09");
			return;
		}
		String mascara = args[0];
		String textoParaConverter = args[1];
		SimpleDateFormat formatador = new SimpleDateFormat(mascara);
		Date data = null;
		try {
			data = formatador.parse(textoParaConverter);
		} catch (ParseException e) {
			System.out.println("Problema ao realizar conversao de data: "
					+ e.getMessage());
		}
		System.out.println("objeto Date convertido: " + data);
	}
}