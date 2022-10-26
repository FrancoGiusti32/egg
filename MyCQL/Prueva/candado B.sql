/*Candado B*/
/*Posicion*/
select  count(jugador) "Posicion" from estadistica 
	where Asistencias_por_partido > (select count(nombre_equipo) from jugador where nombre_equipo = "Heat");

select count(codigo)"clave" from partido
	where temporada like "%99%";