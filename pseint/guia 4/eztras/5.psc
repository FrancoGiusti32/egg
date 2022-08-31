
Algoritmo sin_titulo
	menu
FinAlgoritmo


SubProceso menu
	Dimension Vector(20)
	Definir opciones, frase, Vector, Letra Como Caracter
	Definir i, x, e , e1 Como Real
	para i = 0 Hasta 19
		Vector(i)=" "
	FinPara
	e=0
	e1=0
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
				Leer x
				si Vector(x-1) = "" o Vector(x-1) = " "
					vector(x)=Letra
					Escribir "Hecho!"
				SiNo
					
					para i = x-1 Hasta 0 con paso -1
						si vector(i) <> " " o Vector(i) <> ""
							e=e+1
						FinSi
						si vector(i) = " " o Vector(i) = ""
							i = 0
						FinSi
					FinPara
					para i = x-1 Hasta 19 con paso 1
						si vector(i) <> " " o Vector(i) <> ""
							e1=e1+1
						FinSi
						si vector(i) = " " o Vector(i) = ""
							i = 19
						FinSi
					FinPara
					si e1 >= e
						Para  i = 1 Hasta x Hacer
							Vector((i-1))=Vector((i))
						FinPara
					SiNo
						para i = 19 hasta (x) Con Paso  -1
							Vector((i))=Vector((i-1))
						FinPara
					FinSi
					Vector(x-1)=Letra
				FinSi
				e=0
				e1=0
				opciones= "x"
			"c":
				Para i = 0 Hasta 19
					Escribir Sin Saltar Vector(i)
				FinPara
				Escribir ""
				opciones= "x"
			"f":
				Escribir "Hasta Luegoo!"
			De Otro Modo:
				opciones = "x"
				Escribir "Sleccione una de nuestras opciones"
		FinSegun
	mientras que opciones = "x"
FinSubProceso

