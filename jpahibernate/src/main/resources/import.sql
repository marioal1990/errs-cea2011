insert into Editorial(id, nombre) values (1, 'editorial1')
insert into Editorial(id, nombre) values (2, 'editorial2')
insert into Editorial(id, nombre) values (3, 'editorial3')
		
insert into Autor(id, nombre) values (1, 'autor1')
insert into Autor(id, nombre) values (2, 'autor2')
		
insert into Cliente(id, nombre, DNI, direccion) values (1, 'cliente1', 'DNI1', 'direccion1')
insert into Cliente(id, nombre, DNI, direccion) values (2, 'cliente2', 'DNI2', 'direccion2')
		
insert into Libro(id, nombre, precio, fechaPublicacion, editorial_id) values (1, 'libro1', 10.50, '2009/12/12',1)
insert into Libro(id, nombre, precio, fechaPublicacion, editorial_id) values (2, 'libro2', 20.50, '2010/12/12',2)
insert into Libro(id, nombre, precio, fechaPublicacion, editorial_id) values (3, 'libro3', 30.50, '2011/12/12',3)
insert into Pedido(id, fecha, pagado, tipoPago, cliente_id) values (1,  '2011/12/12',true,'tarjeta', 1)
insert into Pedido(id, fecha, pagado, tipoPago, cliente_id) values (2,  '2012/12/12',false,'metalico', 2)
insert into PedidoLinea(id, cantidad, libro_id, pedido_id)  values (1, 5, 1, 1)
insert into PedidoLinea(id, cantidad, libro_id, pedido_id)  values (2, 10, 2, 1)
insert into LIBROS_AUTORES( libro_id, autor_id) values (1,1)
insert into LIBROS_AUTORES( libro_id, autor_id) values (2,1)
insert into LIBROS_AUTORES( libro_id, autor_id) values (2,2)






insert into Profesor (id, name) values (1, 'Juan Antonio')
insert into Profesor (id, name) values (2, 'Pepe')



insert into Alumno (id, name, nacimiento, profesor_id) values (1, 'Marta', '2009/12/12', 1)
insert into Alumno (id, name, nacimiento, profesor_id) values (2, 'Joaquin', '2009/12/12', 1)
insert into Alumno (id, name, nacimiento, profesor_id) values (3, 'Paco', '2009/12/12', 1)
insert into Alumno (id, name, nacimiento, profesor_id) values (4, 'Diego', '2009/12/12', 1)
insert into Alumno (id, name, nacimiento, profesor_id) values (5, 'Rafael', '2009/12/12', 1)
insert into Alumno (id, name, nacimiento, profesor_id) values (6, 'David', '2009/12/12', 2)
insert into Alumno (id, name, nacimiento, profesor_id) values (7, 'Andres', '2009/12/12',2)


insert into Ciudad (id, codigo) values (1, 'Sevilla')
insert into Ciudad (id, codigo) values (2, 'Córdoba')
insert into Ciudad (id, codigo) values (3, 'Cádiz')
insert into Ciudad (id, codigo) values (4, 'Huelva')

insert into Inmobiliaria (id, cif, nombre) values (1, 'xxx','Inmobiliaria 1')
insert into Inmobiliaria (id, cif, nombre) values (2, 'www','Inmobiliaria 2')

insert into Barrio (id, nombre, ciudad_id, inmobiliaria_id) values (1, 'Montelar', 1, 1)
insert into Barrio (id, nombre, ciudad_id, inmobiliaria_id) values (2, 'Kansas City', 1, 2)
insert into Barrio (id, nombre, ciudad_id, inmobiliaria_id) values (3, 'Andalucía', 2, 1)
insert into Barrio (id, nombre, ciudad_id, inmobiliaria_id) values (4, 'El Cristo', 2, 2)
insert into Barrio (id, nombre, ciudad_id, inmobiliaria_id) values (5, 'Centro', 3, 1)

insert into Casa (id, direccion, cp, barrio_id) values (1, 'Clara Campoamor', '41111', 1)
insert into Casa (id, direccion, cp, barrio_id) values (2, 'Kansas City', '41222', 2)
insert into Casa (id, direccion, cp, barrio_id) values (3, '28 de febrero', '41333', 3)
insert into Casa (id, direccion, cp, barrio_id) values (4, 'Los Pinos', '41444', 4)
insert into Casa (id, direccion, cp, barrio_id) values (5, 'Isaac Peral', '41555', 5)

insert into Habitacion (id, casa_id, tieneVentana) values (1, 1, true)
insert into Habitacion (id, casa_id, tieneVentana) values (2, 2, true)
insert into Habitacion (id, casa_id, tieneVentana) values (3, 3, false)
insert into Habitacion (id, casa_id, tieneVentana) values (4, 4, true)
insert into Habitacion (id, casa_id, tieneVentana) values (5, 5, false)
insert into Habitacion (id, casa_id, tieneVentana) values (6, 1, true)

insert into Chat (id, tema, fecha) values (1, 'Java', '2011/12/12')
insert into Chat (id, tema, fecha) values (2, 'Oracle', '2010/12/12')

insert into Color (id, Html_Code, nombre) values (1,'#FF0000','rojo')
insert into Color (id, Html_Code, nombre) values (2,'#FF8000','naranja')
insert into Color (id, Html_Code, nombre) values (3,'#000000','negro')
insert into Color (id, Html_Code, nombre) values (4,'#FFFF00','amarillo')

insert into Usuario (id, nombre, nick, mail, clave, color_id) values (1,'usuario 1','roc','roc@hotmail.com','xxx',1)
insert into Usuario (id, nombre, nick, mail, clave, color_id) values (2,'usuario 2','emi','emi@hotmail.com','yyy',2)
insert into Usuario (id, nombre, nick, mail, clave, color_id) values (3,'usuario 3','rocio','rocio@hotmail.com','zzz',1)
insert into Usuario (id, nombre, nick, mail, clave, color_id) values (4,'usuario 4','emiroc','emiroc@hotmail.com','qqq',3)

insert into Mensaje (id, texto, fecha, chat_id, usuario_id) values (1,'aaa','2011/07/12',2,1)
insert into Mensaje (id, texto, fecha, chat_id, usuario_id) values (2,'bbb','2012/01/12',2,3)
insert into Mensaje (id, texto, fecha, chat_id, usuario_id) values (3,'ccc','2012/01/12',1,2)
insert into Mensaje (id, texto, fecha, chat_id, usuario_id) values (4,'ddd','2010/12/01',2,1)
insert into Mensaje (id, texto, fecha, chat_id, usuario_id) values (5,'eee','2011/12/01',1,2)
insert into Mensaje (id, texto, fecha, chat_id, usuario_id) values (6,'fff','2011/12/01',1,4)







