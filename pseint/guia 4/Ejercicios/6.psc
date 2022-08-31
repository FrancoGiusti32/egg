Algoritmo sin_titulo
	menu
FinAlgoritmo


SubProceso menu
	Dimension Vector(20)
	Definir opciones, frase, Vector, Letra Como Caracter
	Definir i, slot Como Real
	repetir
	Escribir "Que desea hacer? "
	Escribir " "
	Escribir "A ingresar cadena de un maximo de 20 caracteres"
	Escribir "B insertar un caracter en x posicion de dicha cadena de ser posible"
	Escribir "C leer la cadena"
	Escribir "F salir"
	Leer opciones
	Segun Minusculas(opciones)
		"a":
			Escribir "ingrese la frase"
			leer frase
			Para i = 0 Hasta 19
				Vector(i)=Subcadena(frase,i,i)
			FinPara
			opciones= "x"
		"b":
			Escribir "escriba el caracter a añadir y la pocición donde añadirlo"
			Leer Letra
			Leer slot
			si Vector(slot) = "" o Vector(slot) = " "
				vector(slot)=Letra
				Escribir "Hecho!"
			SiNo
				Escribir "Espacio ocupado"
			FinSi
			opciones= "x"
		"c":
			Para i = 0 Hasta 19
				Escribir Sin Saltar Vector(i)
			FinPara
		"f":
			Escribir "Hasta Luegoo!"
		De Otro Modo:
			opciones = "x"
			Escribir "Sleccione una de nuestras opciones"
	FinSegun
	mientras que opciones = "x"
FinSubProceso
	