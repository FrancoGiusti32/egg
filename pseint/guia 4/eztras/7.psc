Algoritmo suma_de_arreglos
	Definir i, vecto, n Como Entero
	Leer n
	Dimension vecto(n)
	para i = 0 Hasta n-1
		Leer vecto(i)
	FinPara
	i=0
	Escribir suma(vecto,n,i)
FinAlgoritmo

Funcion resulatdo = suma(v,n,i)
	Definir ant, resulatdo Como Entero
	si i = n
		Escribir "suma terminada"
	SiNo
		ant = suma(v,n,i+1)
		resulatdo = v(i) + ant
	FinSi
	
FinFuncion
	