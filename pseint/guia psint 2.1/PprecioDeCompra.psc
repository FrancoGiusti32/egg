Algoritmo PprecioDeCompra
	
	Definir precio Como Real
	Definir Mes Como Caracter
	
	Escribir "escriba el mes y el valor de su compra"
	Leer Mes	
	Leer precio
	
	si mes = "septiembre"
		precio = (precio-(precio/10))
	SiNo
		si mes = "octubre"
			precio = (precio-(precio/10))
		SiNo
			si mes = "nobiembre"
				precio = (precio-(precio/10))
			FinSi
		FinSi
	FinSi
	
	
	Escribir "el precio del preducto es: ", precio
	
FinAlgoritmo
