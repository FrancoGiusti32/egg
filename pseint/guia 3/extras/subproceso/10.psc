Algoritmo Espacio
	Definir Oracion Como Caracter
	Leer Oracion
	Separacion(oracion)
	Escribir oracion
FinAlgoritmo

SubProceso Separacion(p Por Referencia)
	Definir i Como Real

	para i = 0 hasta Longitud(p)
		si	Subcadena(p,i,i) <> " "
			p = Concatenar((Concatenar ((Subcadena(p,0,i))," ")),(SubCadena(p,i+1,longitud(p))))
		FinSi
	FinPara

FinSubProceso
	