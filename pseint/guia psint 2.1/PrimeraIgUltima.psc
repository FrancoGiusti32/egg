Algoritmo PrimeraIgUltima
	Definir frase, PrimeraLetra, UltimaLetra Como Caracter
	
	Escribir "escriba una frase que empese y acabe con la misma letra"
	
	Leer frase
	
	PrimeraLetra = SubCadena(frase,0,0)
	
	UltimaLetra= Subcadena(frase,(Longitud(frase)-1),(Longitud(frase)-1))
	
	si PrimeraLetra = UltimaLetra
		Escribir "CORRECTO"
	SiNo
		Escribir "INCORRECTO"
	FinSi
	
FinAlgoritmo
