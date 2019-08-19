drop database if exists tecnoImportDB;
create database tecnoImportDB;
use tecnoImportDB;

create table t_cliente(
    Cli_id int auto_increment primary key,		
    Cli_Cedula varchar(10) unique not null,
    Cli_Nombre varchar(50) not null,
    Cli_Apellido varchar(50) not null,
    Cli_Direccion varchar(30) not null,
    Cli_Telefono varchar(10) not null,
    Cli_email varchar(20) not null,
    Cli_fecha_Nacimiento date not null
    );

create table t_articulo(
	Art_ID int AUTO_INCREMENT primary key,    
	Art_Modelo varchar(10) not null,
	Art_Descripcion varchar(45) not null,
	Art_Precio double not null,
	Art_Stock integer not null,
	Art_Categ varchar(30) not null,
	Art_Marca varchar(30) not null,
	Art_Color varchar(30) not null
    );
    
create table t_sucursal(
	Local_ID int AUTO_INCREMENT primary key,
	Local_Telefono varchar(10) not null,
	Local_Direccion varchar(45) not null,
	esMatriz boolean not null,
	esSucursal boolean not null
    ); 

CREATE TABLE t_usuario(
  id_user int NOT NULL AUTO_INCREMENT primary key,
  nombre varchar(50) NOT NULL,
  apellido varchar(50) NOT NULL,
  fecha_nacimiento date NOT NULL,
  telefono varchar(20) NOT NULL,
  direccion varchar(50) NOT NULL,
  correo varchar(50) NOT NULL,
  usuario varchar(50) NOT NULL,
  pass varchar(50) NOT NULL,
  tipo varchar(10) NOT NULL,
  esSuper bool DEFAULT NULL,
  Local_ID int not null,
  cedula varchar(20) NOT NULL,
  foreign key(Local_ID) references t_sucursal(Local_ID) 
);
create table t_venta(
	Venta_ID int AUTO_INCREMENT primary key,
	Venta_Fecha date not null,
    Venta_Subtotal double not null,
	Venta_Total double not null,
    Cliente_ID int not null,
    Usua_ID int not null,
	Venta_Cod varchar(50),
    foreign key(Cliente_ID)references t_cliente(Cli_id),
    foreign key(Usua_ID)references t_usuario(id_user)
 );

create table t_pagoCredito(
	PC_ID int AUTO_INCREMENT primary key,
    PC_Fecha date not null,
    PC_Subtotal float not null,
    PC_Impuestos float not null,
    PC_PagoCorriente boolean not null,
    PC_PagoDiferido boolean not null,
    PC_MesesDiferidos int,
	Venta_ID int,
  foreign key(Venta_ID) references t_venta(Venta_ID) 
);

create table t_pagoEfectivo(
	PE_ID int AUTO_INCREMENT primary key,
    PE_Fecha date not null,
    PE_Subtotal float not null,
    PE_Impuestos float not null,
	Venta_ID int,
  foreign key(Venta_ID) references t_venta(Venta_ID) 
);
    
    
create table t_detalle_venta(
	Detalle_ID int AUTO_INCREMENT primary key,
	Venta_ID int not null,
    Articulo_ID int not null,
    foreign key(Venta_ID)references t_venta(Venta_ID),
    foreign key(Articulo_ID)references t_articulo(Art_ID)
    );

create table t_cotizacion(
	Cot_ID int AUTO_INCREMENT primary key,
    Cot_Fecha date not null,
    Cot_Valor double not null,
    Cliente_ID int not null,
    Usua_Codigo int not null,
    foreign key(Cliente_ID)references t_cliente(Cli_id),
    foreign key(Usua_Codigo)references t_usuario(id_user)  
    );
    
create table t_detalleCotizacion(
	Detalle_ID int AUTO_INCREMENT primary key,
    Cot_ID int,
	Articulo_ID int,
	foreign key(Articulo_ID)references t_articulo(Art_ID),
    foreign key(Cot_ID)references t_cotizacion(Cot_ID)
    );
    
