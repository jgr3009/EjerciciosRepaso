


public class EjerciciosBasicos extends acm.program.ConsoleProgram{
	
	
	public void run(){
		
		/*println (fiestaArdillas(30,false));
		println (fiestaArdillas(50,false));
		println (fiestaArdillas(70,true));*/
		
		
		println (multa(60,false));
		println (multa(65,false));
		println (multa(65,true));
		
		
	}
	
	private int multa (int velocidad, boolean cumpleaños){
		
		if (cumpleaños){
			velocidad = velocidad -5;
		}
		
		if (velocidad <=60){
			return 0;
		}
		if (velocidad >60 && velocidad <=80){
			return 1;
		}
		if (velocidad >80){
			return 2;
		}
		return 0;
	}

	
	
	
	
	
	
	
	
	
	
	
	private boolean fiestaArdillas (int bellotas, boolean finDeSemana){
		/*if (!finDeSemana && bellotas>40 && bellotas<60){
			return (true);
		}*/
		if (finDeSemana){
			return true;
		}
		else if (bellotas >= 40 && bellotas <= 60){
			return true;
		}
				
		return false;
	}
	

}
