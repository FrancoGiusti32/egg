/*Candado C*/

select  count(j.codigo) from jugador j, equipo e
	where j.nombre_equipo = e.nombre and j.procedencia like "%Michigan%" and e.conferencia = "East"
		;
    
select count(codigo), peso from jugador
	where peso >= 195;

/*Posicion = 1*/

/*Clave*/

select floor((avg(s.Puntos_por_partido))+count(s.Asistencias_por_partido)+sum(Tapones_por_partido)) from estadistica s, jugador j, equipo e
	where s.jugador = j.codigo and j.nombre_equipo = e.nombre and e.division = "Central"
