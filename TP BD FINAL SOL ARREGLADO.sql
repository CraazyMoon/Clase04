-- Porfavor ignorar los comentarios en bloque, desde ya muchas gracias.

drop database if exists negocio_ropa;
create database negocio_ropa;
use negocio_ropa;


create table clientes(
Id_cliente int auto_increment,
Nombre varchar(50) not null,
Apellido varchar(50) not null,
Dni char(8) not null,
Tel_celular varchar(10),
Email varchar(50),
primary key(id_cliente)
);
create table facturas(
Letra char(1) not null,
Numero int not null,
Fecha date not null,
Monto double not null,
Id_cliente int not null,
Legajo_vendedor int not null,
primary key(letra, numero)
);

create table vendedores(
Legajo int not null auto_increment,
Nombre varchar(50) not null,
Apellido varchar(50) not null,
Dni char(8) not null,
Tel_celular varchar(10),
Email varchar(50),
primary key(legajo)
);

create table articulos(
Codigo int not null,
Producto varchar(100) not null,
Color varchar (50) not null,
Stock int not null,
Stock_minimo int not null,
Stock_maximo int not null,
primary key(codigo)
);

create table ventas(
Letra char(1) not null,
Numero int not null,
Codigo int not null,
Cantidad int not null,
primary key(letra,numero,codigo)
);

alter table facturas 
add constraint FK_facturas_clientes
foreign key(id_cliente) 
references clientes(id_cliente);

alter table facturas 
add constraint FK_facturas_vendedores
foreign key(legajo_vendedor) 
references vendedores(legajo);

alter table ventas 
add constraint FK_ventas_facturas
foreign key(letra, numero) 
references facturas(letra, numero);

alter table ventas 
add constraint FK_ventas_articulos
foreign key(codigo) 
references articulos(codigo);

INSERT INTO clientes (nombre, apellido, dni, tel_celular, email) VALUES
	('Juan', 'Perez', '12345678', '987654321', 'juan.perez@gmail.com'),
    ('María', 'Flores', '87654321', '123456789', 'maria.flores@gmail.com'),
    ('Carlos', 'Rodriguez', '23456789', '567890123', 'carlos.rodriguez@hotmail.com'),
    ('Lucía', 'Franco', '34567812', '654321789', 'lucia.franco@outlook.com'),
    ('Martín', 'Díaz', '98765432', '321789456', null),
    ('Carolina', 'López', '45678123', '789456123', 'carolina.lopez@gmail.com'),
    ('Fernando', 'Martínez', '78901234', '456123789', 'fernando.martinez@yahoo.com.ar'),
    ('Valeria', 'García', '12345678', '123789456', null),
    ('Miguel', 'Sánchez', '56781234', '789456123', 'miguel.sanchez@gmail.com'),
    ('Camila', 'Fernández', '12347890', '456789012', 'camila.fernandez@outlook.com'),
    ('Diego', 'Britos', '78904561', '234567890', null),
    ('Brenda', 'Giménez', '34561230', '567890123', 'brenda.gimenez@gmail.com'),
    ('Marcelo', 'Alvarez', '78904561', '234567890', 'marcelo.alvarez@hotmail.com'),
    ('Romina', 'Smith', '34561230', '567890123', null),
    ('Eduardo', 'Romero', '12034567', '678901234', 'eduardo.romero@gmail.com');


INSERT INTO vendedores (nombre, apellido, dni, tel_celular, email) VALUES
    ('Laura', 'Fernandez', '34567890', '789012345', 'laura.fernandez@gmail.com'),
    ('Roberto', 'Ríos', '45678901', '890123456', null),
    ('Ana', 'Iunti', '56789012', '901234567', null),
    ('Luis', 'Sosa', '90876543', '654321098', 'luis.sosa@gmail.com'),
    ('Silvia', 'Ramírez', '76543210', '210987654', 'silvia.ramirez@outlook.com'),
    ('Pablo', 'Torres', '54321098', '987654321', 'pablo.torres@hotmail.com'),
    ('Laura', 'Rojas', '21098765', '876543210', 'laura.rojas@gmail.com'),
    ('Sebastián', 'Pérez', '45678901', '321098765', 'sebastian.perez@gmail.com'),
    ('Melina', 'Cabrera', '12309876', '543210987', 'melina.cabrera@yahoo.com.ar'),
    ('Ana', 'Vargas', '65432109', '987654321', 'ana.vargas@gmail.com');


INSERT INTO articulos (codigo, producto, color, stock, stock_minimo, stock_maximo) VALUES
    (1, 'Camisa', 'Blanco', 100, 10, 150),
    (2, 'Pantalón', 'Negro', 80, 5, 120),
    (3, 'Zapatos', 'Marrón', 50, 8, 80),
    (4, 'Vestido', 'Rojo', 30, 5, 50),
    (5, 'Corbata', 'Azul', 60, 10, 80),
    (6, 'Bufanda', 'Verde', 40, 8, 60),
    (7, 'Sombrero', 'Negro', 25, 5, 40),
    (8, 'Remera', 'Gris', 20, 5, 30),
    (9, 'Botas', 'Negro', 15, 3, 25),
    (10, 'Gorra', 'Blanco', 35, 7, 55),
    (11, 'Blusa', 'Rosa', 28, 6, 45),
    (12, 'Short', 'Celeste', 22, 4, 35),
    (13, 'Medias', 'Blanco', 50, 10, 70);


INSERT INTO facturas (letra, numero, fecha, monto, id_cliente, legajo_vendedor) VALUES
    ('A', 1, '2023-01-01', 150.00, 1, 1),
    ('B', 1, curdate(), 200.00, 2, 2),
    ('B', 2, '2023-02-03', 100.00, 1, 3),
    ('A', 2, '2023-06-04', 120.00, 4, 4),
    ('C', 1, curdate(), 180.00, 15, 5),
    ('A', 3, '2023-11-06', 90.00, 13, 6),
    ('A', 4, '2023-01-01', 200.00, 7, 7),
    ('B', 3, '2023-09-10', 150.00, 8, 8),
    ('C', 2, '2023-08-09', 120.00, 9, 9),
    ('C', 3, '2023-03-25', 160.00, 10, 10),
    ('A', 5, '2023-07-30', 190.00, 1, 1),
    ('B', 4, '2023-04-02', 110.00, 11, 2),
    ('C', 4, '2023-01-13', 130.00,7, 3),
	('B', 5, '2023-12-14', 160.00, 3, 10),
    ('C', 5, '2023-12-14', 190.00, 6, 1),
    ('C', 6, '2023-12-15', 130.00,14, 3);


INSERT INTO ventas (letra, numero, codigo, cantidad) VALUES
    ('A', 1, 1, 5),
    ('B', 1, 2, 3),
    ('C', 1, 3, 2),
    ('A', 2, 4, 2),
    ('B', 2, 8, 3),
    ('C', 2, 6, 1),
    ('A', 3, 7, 4),
    ('B', 3, 8, 2),
    ('A', 4, 9, 3),
    ('A', 5, 10, 2),
    ('B', 4, 11, 3),
    ('C', 3, 8, 1),
    ('C', 4, 13, 4);
    /*
    Arrancanding..
    */
-- Primer punto:   
select * from clientes;

-- Segundo punto:
select * from clientes 
where 	 email is not null 
order by nombre,apellido;

-- Tercer punto:
select * from clientes where apellido like '%z';

-- Cuarto punto:
select * from vendedores;

-- Quinto punto:
select * from vendedores where nombre like '_a%';

/*
Hasta aca estuvo facilon :D
*/

-- Sexto punto:
select distinct c.*
from 		clientes c
left join 	facturas f on c.id_cliente=f.id_cliente
where 		f.id_cliente is null;

-- Septimo punto:
select * from facturas order by fecha;

-- Octavo punto:
select distinct c.Id_cliente, c.Nombre, c.Apellido
from 	clientes c
join 	facturas f on c.id_cliente=f.id_cliente
join 	ventas v on f.numero=v.numero
join 	articulos a on v.codigo=a.codigo
where 	producto like 'remera';

/*
ia stoi harta
*/

-- Noveno punto:
select distinct a.*
from 		articulos a
left join 	ventas v on	a.codigo=v.codigo
where 		v.codigo is null;

-- Decimo punto:
select concat(year(fecha),'/',month(fecha)) Mes,
sum(monto) 	Total,
count(*) 	Cantidad
from 		facturas
group by	mes
order by    total desc;

/*
     D:<
*/
-- Onceavo punto:
select  a.Producto, count(*) 'Cantidad de ventas'
from  	articulos a 
join 	ventas v on a.codigo=v.codigo
join 	facturas f on v.letra=f.letra
group by a.Producto;

-- Doceavo punto:
select  c.*
from 	clientes c
join 	facturas f on c.id_cliente = f.id_cliente
where 	f.fecha = (select min(fecha) from facturas);

-- Treceavo punto:
select    c.Nombre, c.Apellido, count(*) 'Cantidad de facturas'
from 	  clientes c
left join facturas f on c.id_cliente=f.id_cliente
group by  c.id_cliente;

-- Catorceavo punto:
alter table articulos
add column Precio_venta double,
add column Precio_costo double;

/*
Falta pocooooooooooooo :)
*/

-- Quinceavo punto:
set 	sql_safe_updates=0;
update 	articulos 
set 	stock_minimo=100, stock_maximo=500;

-- Decimosexto punto:
delete 		a
from 		articulos a
left join 	ventas v on a.codigo=v.codigo
where 		v.codigo is null;
set 		sql_safe_updates=1;

-- Decimoseptimo punto:
select 	Nombre, Apellido, Email 
from 	clientes where email like '%gmail%'
union
select 	Nombre, Apellido, Email 
from 	vendedores where email like '%gmail%';

-- Decimoctavo punto:
select * from articulos where stock=(select max(stock) from articulos);

/*
Alabado sea jebus que porfin termine TTuTT
*/