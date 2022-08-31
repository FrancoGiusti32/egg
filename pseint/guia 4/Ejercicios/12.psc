
	Algoritmo sin_titulo
		Dimension x(3,3)
		Definir x , frase Como Caracter
		Definir i,j, contador Como Real
		Repetir
			Escribir "Escriba la frase de 9 caracteres a ingresar en la matris"
			Leer frase
		Mientras Que Longitud(frase) <> 9
		contador=0
		para i = 0 Hasta 2
			para j = 0 hasta 2
				x(i,j) = Subcadena(frase,contador,contador)
				contador = contador+1
			FinPara
		FinPara
		para i = 0 Hasta 2
			para j = 0 hasta 2
				Escribir x(i,j), "/" Sin Saltar
			FinPara
			Escribir ""
		FinPara
		
FinAlgoritmo

