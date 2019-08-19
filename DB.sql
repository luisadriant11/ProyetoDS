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
    
INSERT INTO t_cliente (Cli_id,Cli_Cedula,Cli_Nombre,Cli_Apellido,Cli_Direccion,Cli_Telefono,Cli_email,Cli_fecha_Nacimiento) VALUES (1,"8959050878","Logan","Jimenez","650-8741 Phasellus Carretera","2421909124","eu.placerat.eget@lobortisquam.org","1996/02/17"),(2,"0961497551","Robert","Horton","917-5991 Non, C/","6033364099","scelerisque.neque@mauriserateget.co.uk","1948/10/10"),(3,"5962770560","Fulton","Moses","Apartado núm.: 424, 8695 Hendrerit Av.","6551483279","et.netus.et@scelerisquemollisPhasellus.org","1928/11/15"),(4,"1294800956","Aquila","Cook","609-9681 Nulla Avda.","6416205827","malesuada.vel.convallis@velvulputateeu.co.uk","1964/08/23"),(5,"0621920649","Warren","Lott","Apartado núm.: 776, 3227 Ac Carretera","7701634349","fringilla.ornare.placerat@iaculisaliquet.co.uk","1933/12/14"),(6,"2055321584","Merritt","Morrow","Apartado núm.: 753, 5469 Convallis, ","2095642214","Aenean.eget@enim.edu","1929/12/29"),(7,"7916391403","Jacob","Jenkins","8006 Erat C.","8245311131","per.inceptos@Praesenteu.edu","1967/07/02"),(8,"0219514865","Lucian","Fuller","Apdo.:111-6290 Amet Ctra.","8708455712","Integer.vitae.nibh@aceleifendvitae.co.uk","1926/06/29"),(9,"7912997381","Isaac","Cantu","Apdo.:751-836 Euismod Avenida","3908000064","rutrum.eu.ultrices@mauris.edu","1996/01/26"),(10,"8232041861","Eaton","Irwin","944-7902 Curabitur Avda.","1870344302","elit.dictum.eu@ridiculus.org","1938/09/21");
INSERT INTO t_articulo (Art_ID,Art_Modelo,Art_Descripcion,Art_Precio,Art_Stock,Art_Categ,Art_Marca,Art_Color) VALUES (1,"Dawson","adipiscing elit. Curabitur sed tortor.",661,1,"telefono","Borland","amarillo"),(2,"Cooley","Sed et libero. Proin mi.",675,5,"consolaVideoJuegos","Microsoft","naranja"),(3,"Lynch","fermentum risus, at fringilla purus",826,1,"telefono","Cakewalk","violeta"),(4,"Moore","aliquet, sem ut cursus luctus,",231,4,"telefono","Adobe","naranja"),(5,"Hale","Morbi sit amet massa. Quisque",629,3,"telefono","Altavista","amarillo"),(6,"Mercer","eget magna. Suspendisse tristique neque",104,2,"camara","Lavasoft","verde"),(7,"Morton","nulla ante, iaculis nec, eleifend",873,8,"consolaVideoJuegos","Lavasoft","rojo"),(8,"Dale","Fusce dolor quam, elementum at,",148,2,"telefono","Finale","rojo"),(9,"Henry","id, erat. Etiam vestibulum massa",129,5,"camara","Sibelius","naranja"),(10,"Kennedy","eu, euismod ac, fermentum vel,",780,10,"consolaVideoJuegos","Lavasoft","naranja");
INSERT INTO t_sucursal (Local_ID,Local_Telefono,Local_Direccion,esMatriz,esSucursal) VALUES (1,"2746184417","Apartado núm.: 219, 2563 Ante Ctra.",1,0),(2,"7248196111","526 Eu Ctra.",0,0),(3,"0799441621","3307 Tempor Ctra.",1,0),(4,"0678346445","7559 Eu Avenida",0,0),(5,"2412381854","937-7509 Ultrices Avenida",0,1),(6,"6959565031","650-1422 Phasellus ",0,1),(7,"6253883268","Apartado núm.: 827, 3138 Luctus C/",0,1),(8,"5760070408","Apdo.:838-5988 Aenean ",0,0),(9,"9104066172","9883 Scelerisque Ctra.",0,0),(10,"9345103627","3938 Mattis. ",1,0);
INSERT INTO t_usuario (id_user,nombre,fecha_nacimiento,telefono,direccion,correo,usuario,pass,tipo,esSuper,Local_ID,cedula) VALUES (1,"Zachery","2006/04/01","6262871098","962 Ipsum. Avenida","nulla.Integer@etultricesposuere.ca","Alan","JPB50UJK8XD","v",1,1,"6246252533"),(2,"Abel","2005/08/31","5152025688","Apartado núm.: 881, 9354 Tristique Avenida","Aliquam@consequatlectus.com","Demetrius","AKA35TOP8KP","v",1,2,"5428013609"),(3,"Troy","2000/03/15","0604897470","731-5059 Mauris C.","Class.aptent.taciti@gravidamolestie.co.uk","Vincent","OLC28CCH2PH","a",0,3,"0523811425"),(4,"Troy","1978/06/19","1763752288","708-5452 Felis ","volutpat@fermentumfermentum.org","Chelsea","NQZ51KBE2IH","v",1,4,"9934621350"),(5,"Cody","1978/01/15","5411854166","Apartado núm.: 453, 3356 Eros. Avda.","ante@temporarcuVestibulum.com","Kirk","TPR74IWJ2BK","a",1,5,"2953236917"),(6,"Caldwell","2006/06/25","3733055940","814-9661 Cras Calle","lorem.ac@eget.com","Faith","FLG28DVX1LG","a",0,6,"8747032710"),(7,"Caldwell","2007/04/15","4970831103","Apdo.:616-2898 Consectetuer Calle","congue@Sednulla.co.uk","Wilma","VZH86FLK6LU","a",0,7,"7167576017"),(8,"Brett","1994/09/03","1222551320","Apartado núm.: 567, 8846 Malesuada C.","adipiscing.elit@Integer.org","Sharon","PBV33ZNT7DE","v",1,8,"2950836083"),(9,"Steven","1984/01/27","7323621343","9145 Posuere C/","ornare.lectus@infaucibusorci.edu","Fay","GOK97DPV6YR","g",1,9,"1346263795"),(10,"Bruce","1958/09/04","3169370895","Apartado núm.: 879, 5199 Sit Avda.","enim@diamvelarcu.net","Michael","AAP14IFJ5ZD","v",0,10,"1805581109");
