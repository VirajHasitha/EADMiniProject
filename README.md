# EADMiniProject
AZD Engines Company 

//Database

CREATE TABLE EngineModel(
	ModelID int primary key not null,
	EngineName varchar(50) not null,
	EngineDescription varchar(500),
	FuelType varchar(50) not null,
	Cylinders int not null,
	CubicCapacity float not null,
	Quantity int,
	Cost real not null,
	SellingPrice real,
	Discount real,
	AuthorizePerson varchar(50),
	EngineImage varchar(200)
);

CREATE TABLE EngineType(
	EngineID int AUTO_INCREMENT primary key,
	ModelID int,
        foreign key(ModelID) references EngineModel(ModelID)
);
CREATE TABLE EngineParts(
	PartID int primary key not null,
	PartName varchar(50) not null,
	PartDescription varchar(500),
	Cost real not null,
	Quantity int,
        EngineImage varchar(200)
);

CREATE TABLE PartType(
	PartID int ,
	ModelID int,
        Primary key(PartID,ModelID),
        foreign key(ModelID) references EngineModel(ModelID),
        foreign key(PartID) references EngineParts(PartID)
);

insert into EngineModel(ModelID,EngineName,FuelType,Cylinders,CubicCapacity,Cost) values(1,"A","diesel",2,30,10000);
insert into EngineModel(ModelID,EngineName,FuelType,Cylinders,CubicCapacity,Cost) values(2,"B","diesel",4,40,40000);
insert into EngineModel(ModelID,EngineName,FuelType,Cylinders,CubicCapacity,Cost) values(3,"C","petrol",6,60,50000);
insert into EngineModel(ModelID,EngineName,FuelType,Cylinders,CubicCapacity,Cost) values(4,"D","petrol",3,60,20000);
insert into EngineModel(ModelID,EngineName,FuelType,Cylinders,CubicCapacity,Cost) values(5,"E","diesel",1,20,120000);
insert into EngineModel(ModelID,EngineName,FuelType,Cylinders,CubicCapacity,Cost) values(6,"F","petrol",5,50,15000);


insert into EngineParts(PartID,PartName,PartDescription,Cost,Quantity) values(10,"Bolts","A",100,200);
insert into EngineParts(PartID,PartName,PartDescription,Cost,Quantity) values(11,"Gears","B",300,300);
insert into EngineParts(PartID,PartName,PartDescription,Cost,Quantity) values(12,"Nuts","C",250,400);
insert into EngineParts(PartID,PartName,PartDescription,Cost,Quantity) values(13,"Wheels","D",150,600);
insert into EngineParts(PartID,PartName,PartDescription,Cost,Quantity) values(14,"Cylinders","E",1000,800);
insert into EngineParts(PartID,PartName,PartDescription,Cost,Quantity) values(15,"Screws","F",50,1500);
insert into EngineParts(PartID,PartName,PartDescription,Cost,Quantity) values(16,"Washers","G",500,200);

insert into PartType(PartID,ModelID) values(10,1);
insert into PartType(PartID,ModelID) values(11,1);
insert into PartType(PartID,ModelID) values(15,2);
insert into PartType(PartID,ModelID) values(16,2);
insert into PartType(PartID,ModelID) values(13,3);
insert into PartType(PartID,ModelID) values(12,3);
insert into PartType(PartID,ModelID) values(11,4);
insert into PartType(PartID,ModelID) values(14,4);
insert into PartType(PartID,ModelID) values(16,5);
insert into PartType(PartID,ModelID) values(16,5);
insert into PartType(PartID,ModelID) values(10,6);
insert into PartType(PartID,ModelID) values(14,6);
