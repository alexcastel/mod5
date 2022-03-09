import java.util.Vector;
/**
 * 
 * @author Alex Castel
 *
 */
public class Stack {
/**
 *
 * Se trata de una pila con un vector de enteros y un numero que indica el 
 * tamaño
 */
	private int tamaño;
	private Vector<Integer> elementos;

	public Stack() {
		/**
		 * En este método se crea el vector y se inicializa el tamaño a 0
		 */
		elementos = new Vector<Integer>();
		tamaño = 0;
	}

	/**
	 * Esta función nos indica si es cierto que la pila está llena o vacía
	 * @return
	 */
	public boolean stackVacio () {
	
		if (tamaño==0) {
			return true;
		}
		return false;
	}
/**
 * Aquí se nos pide el parámetro para añadir un elemento a la pila
 * @param o
 */
	public void apilar ( Integer o ) {
		elementos.add(tamaño, o);
		tamaño++;
	}

	public Integer desapilar () {
		try {
			if(stackVacio())
				throw new ErrorStackVacio();
			else {
				return elementos.get(--tamaño);
			}
		} catch(ErrorStackVacio error) {
			System.out.println("ERROR: el stack está vacio");
			return null;
		}
	}

	public int getNumElements() {
		return tamaño;
	}
/**
 * Clase que hereda de Exception para definir una excepción
 * @author LENOVO
 *
 */
	@SuppressWarnings("serial")
	class ErrorStackVacio extends Exception {
		public ErrorStackVacio() {
			super();
		}
	}

}


