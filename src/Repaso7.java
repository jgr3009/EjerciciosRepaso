/*
 * 
 * Autor: Jorge Garc�a Rojo
 * 
 * Cuando se hace clic en el rect�ngulo central, genera un nuevo rect�ngulo aleatorio
 * 
 */

import java.awt.event.MouseEvent;

import acm.graphics.*;
import acm.util.RandomGenerator;

public class Repaso7 extends acm.program.GraphicsProgram{

	//declaro una variable de instancia para guardar el rect�ngulo
	GRect rectangulo;
	//declaro una variable de tipo aleatorio
	RandomGenerator aleatorio = new RandomGenerator();

	public void init(){

		setSize (800, 600);
		rectangulo = new GRect(120, 80);
		//inserto el "escuchador" del rat�n
		addMouseListeners();



	}

	public void run(){
		//a�ado el rect�ngulo en el centro exacto de la pantalla.
		add(rectangulo, 
				getWidth()/2 - rectangulo.getWidth()/2, 
				getHeight()/2 - rectangulo.getHeight()/2
				);

	}


	//a�ado el m�todo que escucha el evento del clic del rat�n

	public void mouseClicked (MouseEvent evento){

		//si en la posici�n en la que se ha hecho clic est� el rect�ngulo
		//entonces lo relleno
		if (getElementAt(evento.getX(), evento.getY()) == rectangulo){
			GRect auxiliar = new GRect (aleatorio.nextInt(200),
										aleatorio.nextInt(200));
			auxiliar.setFilled(true);
			auxiliar.setFillColor(aleatorio.nextColor());
			add(auxiliar, 
					aleatorio.nextInt(800),
					aleatorio.nextInt(800));
			
		
		}
	}
}
