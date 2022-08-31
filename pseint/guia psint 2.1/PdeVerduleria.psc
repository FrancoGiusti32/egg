Algoritmo PdeVerduleria
	Definir Peso, Valo, Porcentaje, precioXmansana Como Real
	Escribir "Escriba cuantos Kilos desea comprar y el valor de las mansanas:"
	Leer Peso
	Leer precioXmansana

	si	peso < 0
		Escribir "Tu bascula está rota"
	FinSi
	si peso <= 2 y peso > 0
		Valo = precioXmansana
		Escribir "El valor a pagar es: [", Valo "$]"
	SiNo
		si	peso <= 5  y peso > 0
			Porcentaje = 10
			Valo = (precioXmansana-((Porcentaje*100)/precioXmansana))
			Escribir "El valor a pagar es: [", Valo "$]"
		SiNo
			si peso <= 10  y peso > 0
				Porcentaje = 15
				Valo = (precioXmansana-((Porcentaje*100)/precioXmansana))
				Escribir "El valor a pagar es: [", Valo "$]"
			sino 
				si peso > 10  y peso > 0
					Porcentaje = 20
					Valo = (precioXmansana-((Porcentaje*100)/precioXmansana))
					Escribir "El valor a pagar es: [", Valo "$]"
				FinSi
			FinSi
		FinSi
	FinSi
FinAlgoritmo
