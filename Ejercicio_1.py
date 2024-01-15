class Estudiante:
    def __init__(self,nombre,edad,grado):
        self.nombre=nombre
        self.edad=edad
        self.grado=grado
    def estudiar(self):
            print("estudiando")
            
nombre  =input("Digame su nombre")
edad    =input("Ingrese su edad")
grado   =input("Ingrese su grado")
estudiante=Estudiante(nombre,edad,grado)

print(f"""
      Datos estudiante: \n\n
      Nombre:{estudiante.nombre}\n
      Edad:{estudiante.edad}\n
      Grado:{estudiante.grado}\n
      """)

while True:
        estudiar=input()
        if(estudiar.lower()=="estudiar"):
           estudiante.estudiar()
