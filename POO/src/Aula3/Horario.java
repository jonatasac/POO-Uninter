package Aula3;

public class Horario {
	private int hora;
	private int minuto;
	private int segundo;
	
	public int getHora() {
		return hora;
	}
	
	public void setHora(int hora) {
		if(hora >= 0 && hora <= 23) {
			this.hora = hora;
		}
		else {
			System.out.println("Hora invalida!");
		}
		this.hora = hora;
	}

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) {
		if(minuto >= 0 && minuto <60) {
			this.minuto = minuto;
		}
		else {
			System.out.println("Minutos invalidos!");
		}
	}

	public int getSegundo() {
		return segundo;
	}

	public void setSegundo(int segundo) {
		if(segundo >= 0 && segundo <60) {
			this.segundo = segundo;
		}
		else {
			System.out.println("Segundos invalidos!");
		}
	}
	
	void info() {
		System.out.println("Agora sao " + hora + " horas e " + minuto + " minutos e " + segundo + " segundos.");
	}
	
}
