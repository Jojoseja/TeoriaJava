package teoria001;

public class TiposDatos {
	//Hay varios tipos de Datos que se pueden usar, se dividen en primitivos y no-primitivos
		//Primitivos
			//Relacionados con números:
				//byte -> Enteros desde -128 hasta 127
				byte num1 = 127;
				//short -> Enteros desde -32.768 hasta 32.767 
				short num2 = -32768;
				//int -> Enteros desde -2.147.483.648 hasta 2.147.483.647
				int num3 = 2147483647;
				//long -> Enteros desde -9.223.372.036.854.775.808 hasta 9.223.372.036.854.775.807, se representa con una L al final
				long num4 = -9223372036854775808L;
				//float -> Fraccionales hasta 6/7 cifras decimales, se representa con una f al final
				float num5 = 8.132112f;
				//double -> Fraccionales hasta 15/16 cifras decimales
				double num6 = 9.8917629918817746512;
				
			//Otros:
				//boolean -> Almacena verdadero o falso
				boolean var1 = true;
				//char -> Almacena un carácter ASCII u otro caracter
				char var2;
				
		//No-Primitivos:
				//String -> Almacena una sucesión de carácteres
				String var3 = "Hello World";
				//Arrays -> Almacena una sucesión de tipos de datos, puede ser de cualquier tipo, incluido de otros tipos de Arrays
				int[] var4 = {1,2,3};    //Esta manera indica los datos que hay
				int[] var5 = new int[3]; //Esta manera crea un Array sin indicar los datos, solo el tamaño
				//classes -> Es un tipo de dato enfocado a objetos, incluye enum, Scanner y cualquier clase que se cree.
				enum diasSemana {Lunes, Martes, Miercoles, Jueves, Viernes, Sabado, Domingo};
				}