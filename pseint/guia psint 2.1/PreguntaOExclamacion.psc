Algoritmo PreguntaOExclamacion
	Definir frase, simbolo Como Caracter
	Escribir "Escriba una frase para analisar"
	Leer frase
	
	si Longitud(frase) <= 4
		simbolo= "!"
	SiNo
		simbolo="?"
	FinSi
	Escribir Concatenar(frase,simbolo)
FinAlgoritmo
