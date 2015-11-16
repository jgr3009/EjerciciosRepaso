/*
 * 
 * Autor: Jorge Garc�a Rojo
 * 
 * Cuando se hace clic en la parte derecha del rect�ngulo se mueva hacia la derecha
 * Cuando se hace clic en la parte izquierda del rect�ngulo se mueva hacia la izquierda
 * 
 */

import java.awt.event.MouseEvent;

import acm.graphics.*;
import acm.util.RandomGenerator;

public class Repaso8 extends acm.program.GraphicsProgram{

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
		double distanciaAlCentroDelRectangulo = evento.getX() - rectangulo.getX();
		//si en la posici�n en la que se ha hecho clic est� el rect�ngulo
		//entonces lo relleno
		if (getElementAt(evento.getX(), evento.getY()) == rectangulo){
			if (distanciaAlCentroDelRectangulo > rectangulo.getWidth()/2){

				rectangulo.move(10, 0);			
			}
			
			else{
				rectangulo.move(-10, 0);
			}
			
		}
	}
}

