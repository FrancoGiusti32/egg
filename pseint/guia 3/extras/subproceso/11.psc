Algoritmo EntreMyT
	Definir Letra Como Caracter
	Escribir "Escriba una letra entre [M] y [T]"
	Leer Letra
	Letra_entre_myt(Letra)
	Escribir Letra
FinAlgoritmo

SubAlgoritmo Letra_entre_myt(L Por Referencia)
	si (Minusculas(l) >= "m") y ((minusculas(L)) <= "t")
		l = concatenar("la letra ", concatenar(l," está entre [M] y [T]"))
	sino 
		l = concatenar("la letra ", concatenar(l," no está entre [M] y [T]"))
	FinSi
FinSubAlgoritmo
	