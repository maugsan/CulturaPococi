
drop database IF EXISTS cultura_pococi2013;
create database cultura_pococi2013;
use cultura_pococi2013;

drop table IF EXISTS usuarioNormal;
create table usuarioNormal(
	correo varchar(20),
	nombre varchar(15),
	contrasenia varchar(20),
	colaborador varchar(1),
	constraint PK_usuarioNormal primary key(correo)
);


drop table if exists categoria;
create table categoria(
	nombreCategoria varchar(20),
	idCategoria int auto_increment,
	constraint PK_categoria primary key(idCategoria)
);


drop table if exists usuarioAdministrador;
create table usuarioAdministrador(
	correo varchar(20),
	contrasenia varchar(20),
	constraint PK_usuarioAdministrador primary key(correo)
);



drop table if exists distritos;
create table distritos(
	nombreDistrito varchar(30) primary key
	
);


drop table if exists intereses;
create table intereses(
	nombreInteres varchar(30),
	constraint PK_intereses primary key(nombreInteres)
);


drop table if exists r_interesesUsuario;
create table r_interesesUsuario(
	idCategoria int,
	correo varchar(20),
	constraint FK_categoria_idCategoria_i foreign key(idCategoria) references categoria (idcategoria),
	constraint FK_usurioNormal_correo_i foreign key(correo) references usuarioNormal (correo),
	constraint PK_r_interesesUsuario primary key(idCategoria,correo)
);


drop table if exists boletin;
create table boletin(
	fecha datetime,
	correo varchar(20),
	constraint PK_boletin primary key(fecha),
	constraint FK_usuarioAdministrador_correo_b foreign key(correo)
	references usuarioAdministrador(correo)
);


drop table if exists articulo;
create table articulo(
	idArticulo int auto_increment,
	imagen blob, 
	categoria int,
	titulo varchar(255),
	autor varchar(50),
	contenido varchar(255),
	fecha datetime,
	constraint PK_articulo primary key(idArticulo),
	constraint FK_boletin_fecha_a foreign key(fecha) references boletin (fecha)

);


drop table if exists anuncio;
create table anuncio(
	idAnuncio int auto_increment,
	titulo varchar(255),
	prioridad int,
	correo varchar(20),
	contrasenia varchar(20),
	constraint FK_usuarioAdministrador_correo_a foreign key(correo) 
	references usuarioAdministrador(correo),
	constraint PK_anuncio primary key(idAnuncio)

);


drop table if exists programaRadio;
create table programaRadio(
	dia datetime,
	hora time,
	nombre varchar(20),
	correo varchar(20),
	constraint FK_usuarioAdministrador_correo_pr foreign key(correo) 
	references usuarioAdministrador(correo),
	constraint PK_programaRadio primary key(dia,hora)
);


drop table if exists evento;
create table evento(
	idEvento int auto_increment,
	nombre varchar(255),
	lugar varchar(255),
	fecha datetime,   -- a�o, mes, d�a
	hora time,
	informacion varchar(1000),
	correo varchar(20),
	imagen blob,
	constraint PK_evento primary key(idEvento),
	constraint FK_usuarioAdministrador_correo_e foreign key(correo)
	references usuarioAdministrador(correo)
);


drop table if exists evenTieneCat;
create table evenTieneCat(
	idEvento int,
	idCategoria int,
	constraint FK_evento_idEvento foreign key (idEvento) references evento(idEvento),
	constraint FK_categoria_idCategoria_r foreign key (idCategoria) references categoria(idCategoria),
	constraint PK_eventoTieneCategoria primary key(idEvento, idCategoria)
);



drop table if exists perfil;
create table perfil(
	nombrePerfil varchar(20),
	idCategoria int,
	fechaDeCreacion datetime,
	biografia varchar(255),
	imagenDePortada blob,
	correo varchar(20),
	nombreDistrito varchar(30),
	constraint FK_categoria_idCategoria foreign key (idCategoria) references categoria(idCategoria),
	constraint FK_distrito_nombreDistrito foreign key (nombreDistrito) references distritos(nombreDistrito),
	constraint FK_perfil_correo foreign key (correo) references usuarioNormal(correo),
	constraint PK_perfil primary key(nombrePerfil)
);



drop table if exists publicacion;
create table publicacion(
	nombrePerfil varchar(20),
	idPublicacion int auto_increment,
	fechaPublicacion datetime,
	correo varchar(20),
	descripcion varchar(255),
	verificacion int,
	musica varchar(255),
	video varchar(255),
	texto varchar(10000),
	imagen blob,
	idCategoria int,
	constraint FK_perfil_nombrePerfil foreign key (nombrePerfil) references perfil(nombrePerfil),
	constraint PK_publicacion primary key(idPublicacion),
	constraint FK_usuarioAdministrador_correo_p foreign key(correo)
	references usuarioAdministrador(correo)
);




-- INSERT
insert into usuarioAdministrador values ("ybarboza27@gmail.com","yuli");
	insert into usuarioAdministrador values ("maugsan@gmail.com","mau");
			insert into usuarioAdministrador values ("caro@gmail.com","caro");





-- SELECT 
select * from usuarioNormal;
select * from categoria;
select * from usuarioAdministrador;
select * from distritos;
select * from intereses;
select * from r_interesesUsuario;
select * from boletin;
select * from articulo;
select * from anuncio;
select * from programaRadio;
select * from evento;
select * from evenTieneCat;
select * from perfil;
select * from publicacion;




-- PROCEDIMIENTOS

-- Inserta nuevos intereses
drop procedure if exists pinsertarIntereses;
delimiter $$
 create procedure pinsertarIntereses(
	in pnombreIntereses varchar(30)
)
	begin
		insert into intereses values (pnombreIntereses);
	end $$
 delimiter ;

call pinsertarIntereses("Pintura");

-- Borra intereses
drop procedure if exists pBorrarIntereses;
delimiter $$
create procedure pBorrarIntereses(
	in pnombreInteres varchar(30)
)
begin
	delete from intereses  where nombreInteres=pnombreInteres;
end $$
delimiter ;

call pBorrarIntereses("Pintura");


-- Procedimiento de insertar USUARIOS_NORMALES
drop procedure if exists pInsertarUsuarioNormal;
delimiter $$
create procedure pInsertarUsuarioNormal(
	in pcorreo varchar (20),
	in pnombre varchar(15),
	in pcontrasenia varchar(20),
	in pcolaborador varchar(1)
)
begin
	insert into usuarioNormal values (pcorreo,pnombre,pcontrasenia,pcolaborador);
end $$
delimiter ;
call pInsertarUsuarioNormal("ybarboza27@gmail.com","Juliana","Bufito","s");
call pInsertarUsuarioNormal("maugsan@gmail.com","mau","mau","s");
call pInsertarUsuarioNormal("caro@gmail.com","caro","caro","s");


-- Elimina un usuario Normal FALTA TERMINAR
drop procedure if exists pEliminarUsuarioNormal;
delimiter $$ 
create procedure pEliminarUsuarioNormal(
	in pcorreo varchar(20)
)
begin
	delete from usuarionormal where correo=pcorreo;
	delete from perfil where correo=pcorreo;
end $$ 
delimiter ;

call pEliminarUsuarioNormal("ybarboza27@gmail.com");

insert into evento (nombre, lugar,fecha, hora, informacion,correo) values ("Fiesta","Pital",'12/05/21','01:20:00',"Concierto","ybarboza27@gmail.com");
insert into evento (nombre,lugar,fecha, hora, informacion,correo) values ("Baile","Veracruz",'12/04/20','07:40:00',"Concierto","ybarboza27@gmail.com");
insert into evento (nombre,lugar,fecha, hora, informacion,correo) values ("Bingo","La Victoria",'12/05/21','09:30:00',"Concierto","ybarboza27@gmail.com");

insert into evenTieneCat (idEvento,idCategoria) values (17,1);
insert into evenTieneCat (idEvento,idCategoria) values (18,1);
insert into evenTieneCat (idEvento,idCategoria) values (19,1);

insert into categoria(nombreCategoria) values ("Musica");
insert into categoria(nombreCategoria) values ("Teatro");
insert into categoria(nombreCategoria) values ("Danza");

-- Lista todos los evento con su respectiva información
drop procedure if exists pListaEventos;
delimiter $$
create procedure pListaEventos()
begin
	select e.idEvento,e.nombre,e.lugar,e.fecha,e.hora,e.informacion,e.correo, c.nombreCategoria, c.idCategoria from evento e 
		inner join evenTieneCat et on e.idEvento=et.idEvento inner join categoria c on c.idCategoria=et.idCategoria;
	
end $$
delimiter ;
call pListaEventos();

-- Elimina un evento con el id del evento
drop procedure if exists pEliminarEvento;
delimiter $$
create procedure pEliminarEvento(
	in pidEvento int
)
begin 
		delete from eventienecat where idEvento=pidEvento;
		delete from evento where idEvento=pidEvento;
end $$
delimiter ;
call pEliminarEvento(1);

-- Elimina un evento y luego lo vuelve a ingresar con la actualizacion
drop procedure if exists pActualizarEvento;
delimiter $$
create procedure pActualizarEvento(
	in pidEvento int,
	in pnombre varchar(255),
	in plugar varchar(255),
	in pfecha datetime,   -- año, mes, día
	in phora time,
	in pinformacion varchar(1000),
	in pcorreo varchar(20),
	-- imagen blob
	in pidCategoria int
)
begin 
		delete from eventienecat where idEvento=pidEvento;
		delete from evento where idEvento=pidEvento;
	update evento
	set correo=pcorreo,
		fecha=pfecha,
		hora=phora,
		informacion=pinformacion,
		lugar=plugar,
		nombre=pnombre
	where idEvento=idEvento;

end $$
delimiter ;
call pActualizarEvento(3,"Baile","Pangola",'12/04/20','07:40:00',"Concierto","ybarboza27@gmail.com",1);


-- Inserta nuevos eventos
drop procedure if exists pCrearEventos;
delimiter $$
create procedure pCrearEventos(
	in pnombre varchar(255),
	in plugar varchar(255),
	in pfecha datetime,   -- año, mes, día
	in phora time,
	in pinformacion varchar(1000),
	in pcorreo varchar(20),
	-- imagen blob
	in pidCategoria int
)
begin
		insert into evento (correo,fecha,hora,informacion,lugar,nombre)
			values (pcorreo, pfecha, phora, pinformacion, plugar, pnombre);
		insert into eventienecat (idCategoria,idEvento)values (pidCategoria,LAST_INSERT_ID ());
end $$
delimiter ;
call pCrearEventos("Karaoke","La Merced",'12/04/20','07:40:00',"Concierto","ybarboza27@gmail.com",1);

-- Lista un evento de acuerdo al id que recibe con su respectiva información
drop procedure if exists pListaEvento;
delimiter $$
create procedure pListaEvento(
	in pidEvento int
)
begin
	select e.idEvento,e.nombre,e.lugar,e.fecha,e.hora,e.informacion,e.correo, c.nombreCategoria, c.idCategoria from evento e 
		inner join evenTieneCat et on e.idEvento=et.idEvento inner join categoria c on c.idCategoria=et.idCategoria
			where e.idEvento=pidEvento;
	
end $$
delimiter ;
call pListaEvento(6);

-- Lista de Categorías
drop procedure if exists pListaCategorias;
delimiter $$
create procedure pListaCategorias()
begin
	select nombreCategoria, idCategoria from categoria order by 1;
	
end $$
delimiter ;
call pListaCategorias();

-- ************  PERFILES  ************

drop procedure if exists pEliminar_perfiles;
delimiter $$
create procedure pEliminar_perfiles(
	in nombre varchar(255)
)
begin
	delete from publicacion  where nombrePerfil=nombre;
    delete from perfil  where nombrePerfil=nombre;
end $$
delimiter ;

drop procedure if exists pListaPerfil;

delimiter $$
create procedure pListaPerfil()
begin
	select p.nombrePerfil, p.fechaDeCreacion,p.biografia,p.imagenDePortada,p.correo,p.nombreDistrito,c.nombreCategoria
    from perfil p inner join categoria c
	where p.idCategoria=c.idCategoria;
end $$
delimiter ;



-- ************   FIN PERFILES  ************
