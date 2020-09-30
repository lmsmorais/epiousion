package br.com.globalcode.aj3.datas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

// a) importacao de bibliotecas

/**
 * Classe que realiza a formatacao de datas
 * 
 * @author Globalcode
 */
public class FormataDatas {

	public static void main(String[] args) {

		// b) Criacao do objeto Calendar
		Calendar cal = Calendar.getInstance();
		int minutos = cal.get(Calendar.MINUTE);
		
		int mes = cal.get(Calendar.MONTH);
		
		Date d = cal.getTime();
		
		

		// c) Alteracao dos dados do calendario para
		// 03 de março de 1997, as 18h57m0s
		cal.set(Calendar.YEAR, 1997);
		
		cal.set(Calendar.DAY_OF_MONTH, 03);
		
		cal.set(Calendar.HOUR_OF_DAY, 03);
		
	
		// d) Obtencao do Date a partir do Calendar
		Date data = cal.getTime();
		
		System.out.println("data: " + data);

		// e) Construcao do objeto para formatacao especifica
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("data formatada com SimpleDateFormat: "
				+ formatador.format(data));
		System.out.println("data atual formatada com SimpleDateFormat: "
				+ formatador.format(new Date()));

		// f) Construcao do objeto para formatacao padrao
		DateFormat formatador2 = DateFormat.getDateInstance(DateFormat.MEDIUM);
		
		System.out.println("data formatada com DateFormat: "
				+ formatador2.format(data));
		System.out.println("data atual formatada com DateFormat: "
				+ formatador.format(new Date()));

	}
}
