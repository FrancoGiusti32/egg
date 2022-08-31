Algoritmo EscribirUnaFraseSeparada
	Definir i, j Como Real
	Definir frase1 como cadena
	Escribir "escriba la frase a separar"
	Leer frase1

	para  i = Longitud(frase1) hasta 0 con paso -1
		Escribir Sin Saltar SubCadena(frase1,i,i), " "
	FinPara
FinAlgoritmo
