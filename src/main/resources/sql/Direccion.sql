CREATE TABLE Direccion (
    DireccionID 	SERIAL PRIMARY KEY,
    Calle 			VARCHAR(100),
    NoInterior 		VARCHAR(10),
    NoExterior 		VARCHAR(10),
    CodigoPostal 	VARCHAR(5),
    Cruzamientos 	VARCHAR(10),
    Ciudad 			VARCHAR(50),
    Colonia 		VARCHAR(50),
    Pais	 		VARCHAR(50),
    Estado	 		VARCHAR(50)
);
