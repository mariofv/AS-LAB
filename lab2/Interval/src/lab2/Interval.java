package lab2;


public class Interval {

	private int horaInici;
	private int minutsInici;
	private int horaFinal;
	private int minutsFinal;
	
	Interval(int horaInici, int minutsInici, int horaFinal, int minutsFinal) throws IntervalIncorrecteException{
		if(formatIncorrecte(horaInici,minutsInici) || formatIncorrecte(horaFinal,minutsFinal)) {
			throw new IntervalIncorrecteException();
		}
		
		if(horaFinal < horaInici) throw new IntervalIncorrecteException();
		if(horaFinal == horaInici){
			if(minutsFinal <= minutsInici) throw new IntervalIncorrecteException();
		}
		
		this.horaInici = horaInici;
		this.minutsInici = minutsInici;
		this.horaFinal = horaFinal;
		this.minutsFinal = minutsFinal;
		
		
	}

	public int temps(){
		return calculminuts(horaFinal,minutsFinal)-calculminuts(horaInici,minutsInici);
	}

	public String periodeDia() {
		String periodeHoraInici = getPeriode(horaInici, minutsInici);
		String periodeHoraFinal = getPeriode(horaFinal, minutsFinal);
		if (periodeHoraInici.equals(periodeHoraFinal)) {
			return periodeHoraFinal;
		}
		else {
			return "Diversos Periodes";
		}
	}
	
	private boolean formatIncorrecte(int hora, int minuts) {
		return hora < 00 || hora > 23 || minuts < 00 || minuts > 59;
	}
	
	private int calculminuts(int hora, int minuts){
		return minuts+(hora*60);
		
	}
	
	private String getPeriode(int hora, int minuts) {
	
		if (hora >= 8 && (hora < 12 || (hora == 12 && minuts == 0))) {
			return "Mati";
		}
		else if (hora >= 12 && (hora < 20 || (hora == 20 && minuts == 0))) {
			return "Tarda";
		}
		else if (hora >= 20 || hora < 8) {
			return "Nit";
		}
		else {
			return "Aixo es impossible";
		}
	
	}
	
	public int matiInterval() throws IntervalIncorrecteException {
		if(periodeDia() == "Mati"){
			return temps();
		}
		else throw new IntervalIncorrecteException();
	}
}
	
