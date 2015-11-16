/*
 * 
 * Autor: Jorge García Rojo
 * 
 * Cuando se hace clic en la parte superior derecha del rectángulo se mueva hacia la derecha
 * Cuando se hace clic en la parte superior izquierda del rectángulo se mueva hacia la izquierda
 * 
 */

import java.awt.event.MouseEvent;

import acm.graphics.*;
import acm.util.RandomGenerator;

public class Repaso10 extends acm.program.GraphicsProgram{

	//declaro una variable de instancia para guardar el rectángulo
	GRect rectangulo;
	//declaro una variable de tipo aleatorio
	RandomGenerator aleatorio = new RandomGenerator();

	public void init(){

		setSize (800, 600);
		rectangulo = new GRect(120, 80);
		//inserto el "escuchador" del ratón
		addMouseListeners();



	}

	public void run(){
		//añado el rectángulo en el centro exacto de la pantalla.
		add(rectangulo, 
				getWidth()/2 - rectangulo.getWidth()/2, 
				getHeight()/2 - rectangulo.getHeight()/2
				);

	}


	//añado el método que escucha el evento del clic del ratón

	public void mouseClicked (MouseEvent evento){
		double distanciaAlCentroDelRectangulo = evento.getY() - rectangulo.getY();
		//si en la posición en la que se ha hecho clic está el rectángulo
		//entonces lo relleno
		if (getElementAt(evento.getX(), evento.getY()) == rectangulo){
			if (distanciaAlCentroDelRectangulo > rectangulo.getHeight()/2){

				rectangulo.move(10, 10);			
			}
			
			else{
				rectangulo.move(-10, -10);
			}
			if (distanciaAlCentroDelRectangulo > rectangulo.getWidth()/2){

				rectangulo.move(10, 0);			
			}
			
			else{
				rectangulo.move(-10, 0);
			}
			
		}
	}
}

