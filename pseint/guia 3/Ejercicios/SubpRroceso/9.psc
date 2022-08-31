Algoritmo IntercambioDeCaracteres
	Definir Oracion Como Caracter
	
	Leer Oracion
	
	Intercambio_de_caracteres(oracion)
	
	Escribir oracion
FinAlgoritmo

SubProceso Intercambio_de_caracteres (X Por Referencia)
	Definir i Como Real
	Definir letra Como Caracter
	
	Para i=0 hasta Longitud(x)
		letra = Subcadena(x,i,i)
		si	letra = "a"  o letra = "e"  o letra = "i"  o letra = "o"  o letra = "u"  
			Segun letra
				"a":
					letra = "@"
				"e":
					letra = "#"
				"i":
					letra = "$"
				"o":
					letra = "%"
				"u":
					letra = "*"
			FinSegun
			x = Concatenar(Concatenar(Subcadena(x,0,i-1),letra),Subcadena(x,i+1,Longitud(x)))
		FinSi
	FinPara
	
	
FinSubProceso
	