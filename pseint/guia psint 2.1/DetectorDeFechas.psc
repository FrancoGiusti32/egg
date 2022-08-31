Algoritmo DetectorDeFechas
	Definir Dia, Mes, Ano, FechaTotal Como caracter
	Definir Dia1, Ano1 Como Real
	
	Escribir "Esciba la fecha separada por [/] ej: [06/12/2004]"
	Leer FechaTotal
	
	Dia = SubCadena(FechaTotal,0,1)
	Mes = SubCadena(FechaTotal,3,4)
	Ano = SubCadena(FechaTotal,6,9)
	
	Segun Mes Hacer
		"01":
			Mes = "enero"
		"02":
			Mes = "febrero"
		"03":
			Mes = "marzo"
		"04":
			Mes =  "abril"
		"05":
			Mes =  "mayo"
		"06":
			Mes =  "junio"
		"07":
			Mes =  "julio"
		"08":
			Mes =  "agosto"
		"09":
			Mes =  "septiembre"
		"10": 
			Mes =  "octubre"
		"11":
			Mes =  "noviembre"
		"12":
			Mes =  "diciembre"
			
		De Otro Modo:
			Mes = "[ERROR]" 
			
	FinSegun

	Dia1 = ConvertirANumero(Dia)
	Ano1 = ConvertirANumero(Ano)
	
	si Dia1 < 0
		Dia= "[ERROR]"
	SiNo
		si Dia1 > 31
			Dia= "[ERROR]"
		FinSi
	FinSi
	
	si Ano1 < 0
		Ano= "[ERROR]"
	SiNo
		si Ano1 > 2022
			Ano= "[ERROR]"
		FinSi
	FinSi
	
	Escribir Dia, " de ", mes, " del " Ano
	
FinAlgoritmo