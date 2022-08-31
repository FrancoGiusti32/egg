Algoritmo LetraEnFrase
	Definir  letra, frase Como Caracter
	Escribir "escriba una frase y la letra a buscar en ella"
	Leer frase
	Leer letra
	Escribir Letras_en_la_frase(frase, letra)
FinAlgoritmo

Funcion Cantidad = Letras_en_la_frase(c, l)
	Definir Cantidad, i Como Real
	cantidad = 0
	para i=0 hasta Longitud(c)
		si Subcadena(c, i, i) = l
			Cantidad = Cantidad+1 
		FinSi
	FinPara
FinFuncion
	