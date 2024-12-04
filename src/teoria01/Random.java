package teoria01;

public class Random {
	//Crear un numero aleatorio, estableciendo un minimo y un maximo.
	static int aleatorio() {
		// tipo int      = ( {min} + {castingType} (Math.random() * (   (   {max} - {min}   ) + {min}   )   )   ) ; 
		int randomNumber = (   1   +     (int)     (Math.random() * (   (    100  -   1     ) +   1     )   )   ) ;
		//eliminar espacios ! 
		return randomNumber;
	}
	static int aleatorio2() {
		// Version sin minimos, haciendola mas simple, siendo {max} el número mas alto no incluido, y el minimo 0.
		int randomNumber = (int) (Math.random() * 10);
		return randomNumber;
	}
	public static void main(String[] args) {
		boolean test = true;
		int counter = 0;
		while (test) {
			if (counter == 50) {
				test = false;
			}
			counter += 1;
			System.out.println(aleatorio2());
		}
	}
}
