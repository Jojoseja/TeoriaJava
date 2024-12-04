package teoria01;

public class Random {
	//Crear un numero aleatorio, estableciendo un minimo y un maximo.
	static int aleatorio1() {
		// tipo int      = ( {min} + {castingType} (Math.random() * (   (   Rango    ) + {en caso de querer incluir el maximo del rango posible}   )   )   ) ; 
		int randomNumber = (  10   +     (int)     (Math.random() * (   (    10    )  +  1   )   )   ) ;
		//eliminar espacios ! 
		return randomNumber;
	}
	// Version sin minimos, haciendola mas simple, siendo {max} el número mas alto no incluido, y el minimo 0.
	static int aleatorio2() {
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
			System.out.println(aleatorio1());
		}
	}
}
