Algoritmo EliminarVocales
	Definir frace Como Caracter
	Leer frace
	Eliminar_Vocales_Repetidas(frace)
	
FinAlgoritmo

SubProceso Eliminar_Vocales_Repetidas(f por referencia)
	
	Definir a, e, i, Q, u,   j  Como Real
	Definir Vocal Como Caracter
	a = 0
	e= 0
	i= 0
	q= 0
	u= 0
	Para j=0 Hasta Longitud(f)
		Segun Subcadena(f,j,j)
			"a":
				a = a+1
			"e":
				e = e +1
			"i":
				i = i+1
			"o":
				Q = Q+1
			"u":
				u = u+1
		FinSegun
	FinPara
	
	si a > 1
		Vocal = "a"
	FinSi
	si e > 1
		vocal = "e"
	FinSi
	si i > 1
		vocal = "i"
	FinSi
	si q > 1
		vocal = "o"
	FinSi
	si u > 1
		vocal = "u"
	FinSi
	si vocal <> ""
		borrar_vocal(vocal,f)
	FinSi
	
	Escribir f
FinSubProceso

SubProceso borrar_vocal(v,f Por Referencia)
	Definir i Como Real
	
	para i= 0 Hasta Longitud(f)
		si Subcadena(f,i,i) = v
			f = Concatenar(Subcadena(f,0,i-1),Subcadena(f,i+1,Longitud(f)))
			i = i -1
		FinSi
	FinPara
	
	
	
FinSubProceso

