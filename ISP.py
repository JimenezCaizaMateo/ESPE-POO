from abc import ABC, abstractmethod

class Trabajador(ABC):
    
    @abstractmethod
    def trabajar(self):
        pass

class Durmiente(ABC):
    @abstractmethod
    def dormir(self):
        pass

class Comedor(ABC):
    
    @abstractmethod
    def comer(self):
        pass
    
class Humano(Trabajador,Durmiente,Comedor):
        
    def comer(self):
        print("el humano esta comiendo")
     
    def dormir(self):
        print("el humano esta durmiendo")
    
    def trabajar(self):
        print("el humano esta trabajando")
    
class Robot(Trabajador):
   
    def trabajar(self):
        print("el robot esta trabajando")
        
robot1=Robot()
humano1=Humano()

robot1.trabajar()
humano1.comer()
humano1.dormir()