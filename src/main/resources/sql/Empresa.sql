CREATE TABLE Empresa (
    EmpresaID 		SERIAL PRIMARY KEY,
    RazonSocial 	VARCHAR(18),
    Contacto 		VARCHAR(100),
    TelefonoFijo 	VARCHAR(10),
    Celular 		VARCHAR(10),
    DireccionID 	INT,
    Email 			VARCHAR(50),
    FOREIGN KEY(DireccionID) REFERENCES Direccion(DireccionID)
);
