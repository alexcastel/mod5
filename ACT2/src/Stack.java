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
 * tama�o
 */
	private int tama�o;
	private Vector<Integer> elementos;

	public Stack() {
		/**
		 * En este m�todo se crea el vector y se inicializa el tama�o a 0
		 */
		elementos = new Vector<Integer>();
		tama�o = 0;
	}

	/**
	 * Esta funci�n nos indica si es cierto que la pila est� llena o vac�a
	 * @return
	 */
	public boolean stackVacio () {
	
		if (tama�o==0) {
			return true;
		}
		return false;
	}
/**
 * Aqu� se nos pide el par�metro para a�adir un elemento a la pila
 * @param o
 */
	public void apilar ( Integer o ) {
		elementos.add(tama�o, o);
		tama�o++;
	}

	public Integer desapilar () {
		try {
			if(stackVacio())
				throw new ErrorStackVacio();
			else {
				return elementos.get(--tama�o);
			}
		} catch(ErrorStackVacio error) {
			System.out.println("ERROR: el stack est� vacio");
			return null;
		}
	}

	public int getNumElements() {
		return tama�o;
	}
/**
 * Clase que hereda de Exception para definir una excepci�n
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


