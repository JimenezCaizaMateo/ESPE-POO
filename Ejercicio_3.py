class Personaje:
    def __init__(self,nombre,fuerza,velocidad):
        self.nombre=nombre
        self.fuerza=fuerza
        self.velocidad=velocidad
        
    def __repr__(self):
        return f"{self.nombre} (Fuerza: {self.fuerza}, Velociada: {self.velocidad})"
    
    def __add__(self,otro_pj):
        nuevo_nombre=self.nombre+"-"+otro_pj.nombre
        nueva_fuerza=round(((self.fuerza+otro_pj.fuerza)/2)**2)
        nueva_velocaida=round(((self.velocidad+otro_pj.velocidad)/2)**2)
        return Personaje(nuevo_nombre,nueva_fuerza,nueva_velocaida)
        
personaje1=Personaje("Goku",100,200)
personaje2=Personaje("Vegeta",99,199)

gogeta=personaje1+personaje2
print(gogeta)

        