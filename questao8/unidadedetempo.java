

public class ConversaoDeUnidadesDeTempo {
	//Atributos
	static int minuto,hora,segundo,dia,mes,semana;
	static double ano;

	ConversaoDeUnidadesDeTempo(){}
	
	private static int getMinuto() {
		return minuto;
	}

	private static void setMinuto(int minuto) {
		ConversaoDeUnidadesDeTempo.minuto = minuto;
	}

	private static int getHora() {
		return hora;
	}

	private static void setHora(int hora) {
		ConversaoDeUnidadesDeTempo.hora = hora;
	}

	private static int getSegundo() {
		return segundo;
	}

	private static void setSegundo(int segundo) {
		ConversaoDeUnidadesDeTempo.segundo = segundo;
	}
	private static int getDia() {
		return dia;
	}

	private static void setDia(int dia) {
		ConversaoDeUnidadesDeTempo.dia = dia;
	}

	private static int getMes() {
		return mes;
	}

	private static void setMes(int mes) {
		ConversaoDeUnidadesDeTempo.mes = mes;
	}

	private static int getSemana() {
		return semana;
	}

	private static void setSemana(int semana) {
		ConversaoDeUnidadesDeTempo.semana = semana;
	}

	private static double getAno() {
		return ano;
	}

	private static void setAno(double ano) {
		ConversaoDeUnidadesDeTempo.ano = ano;
	}

	public static int segMinuto () {
		return minuto = (60*segundo);
	}
	
	public static int minHoras () {
		return hora = (60*minuto);
	}
	public static int horaDias () {
		return dia = (24*hora);
	}
	public static int diaSemanas () {
		return semana = (7*dia);
	}
	public static int diaMes () {
		return mes = (30*dia);
	}
	public static double diaAno () {
		return ano = (365.25*dia);
	}
}