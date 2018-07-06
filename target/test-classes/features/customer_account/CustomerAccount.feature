Feature: Dado que quiero ir de cazeria
	Como un cazador
	Yo necesito registarme oficialmente

Scenario: Registrar un cazador nuevo
Given el cazador desea registrarse en Nevada
When confirme que no tiene un registro previamente creado
And llena el formulario de registro
Then el podra registrarse oficialmente en Nevada
