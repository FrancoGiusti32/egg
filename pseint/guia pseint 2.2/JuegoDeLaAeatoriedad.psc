Algoritmo JuegoDeLaAeatoriedad
	Definir x, num Como Real
	x = Aleatorio(1,10)
	Escribir "Bienvenido al juego de la aleatoredad, usted tendra que adivinar el numero [x] de entre 1 y 10  basandose en las indicaciones de si es mayor o menor al numero ingresado"
	Hacer
		Hacer
			Escribir "Escriba el Numero que desea intentar"
			Leer num
		Mientras Que num < 1
		si num < x
			Escribir "[X] Es un numero Mayor al ingresado, porfavor intente de nuevo"
		FinSi
		si num > x
			Escribir "[X] Es un numero Menor al ingresado, porfavor intente de nuevo"
		FinSi
	Mientras Que x <> num
	
	Escribir "Felicidades! Encontraste a [", x "]"
FinAlgoritmo
