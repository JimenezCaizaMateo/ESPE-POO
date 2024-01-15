class Persona():
    def __init__(self,nombre,edad):
        self.__nombre=nombre # '__'para atributos privados o muy privados y '_' para atributos protegios y privados
        self.edad=edad
        
    @property
    def nombre(self):           #es muy similar al get en java
        return self.__nombre
    
    @nombre.setter
    def nombre(self,new_nombre):# es esl metodo set en java         
        self.__nombre=new_nombre
        
    @nombre.deleter             #con esto podemos eliminar el atributo
    def nombre(self):
        del self.__nombre