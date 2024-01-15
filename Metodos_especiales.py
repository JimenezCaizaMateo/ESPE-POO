class Persona:
    def __init__(self,nombre,edad):
        self.nombre=nombre
        self.edad=edad
        
    def __str__(self):
        return f'Persona(nombre={self.nombre},edad={self.edad})' #similar al to String de java
    
    def __add__(self,otro):              #con esto podemos definir el modo en el que interactuan dos objetos de la misma clase
        nuevo_valor=self.edad+otro.edad  #como por ejemplo sumandolos 
        return Persona(self.nombre+otro.nombre,nuevo_valor)
    
    def __repr__(self):
        return f'Persona({self.nombre},{self.edad})'    #representacion del objeto
    
persona1=Persona("Juan", 12)
persona2=Persona("Pedro",13)

nueva_persona=persona1+persona2
print(nueva_persona.nombre)