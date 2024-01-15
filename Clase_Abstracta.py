from abc import ABC, abstractclassmethod
class Persona(ABC):
    @abstractclassmethod
    def __init__(self,nombre,edad,sexo,actividad):
        self.nombre=nombre
        self.edad=edad
        self.sexo=sexo
        self.actividad=actividad
        
    @abstractclassmethod
    def hacer_actividad(self):
        pass
    
    def presentarse(self):
        print(f"Hola, me llamo: {self.nombre} y tengo {self.edad} años")
    
class Estudiante(Persona):
    def __init__(self,nombre,edad,sexo,actividad):
        super().__init__(nombre,edad,sexo,actividad)      
        
    def hacer_actividad(self):
        print(f"Estoy estudiando {self.actividad}")  
        
class Trabajador(Persona):
    def __init__(self,nombre,edad,sexo,actividad):
        super().__init__(nombre,edad,sexo,actividad)      
        
    def hacer_actividad(self):
        print(f"Estoy trabajando de {self.actividad}")
        
estudiante1=Estudiante("Juan",12,"Masculino","estadistica")
trabajador1=Trabajador("Pedro",25,"Masculino","diseñador")
estudiante1.presentarse()
estudiante1.hacer_actividad()
trabajador1.presentarse()
trabajador1.hacer_actividad()