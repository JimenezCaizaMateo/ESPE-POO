#class Ave:
#    def volar(self):
#        return "estoy volando"
    
#class Pinguino(Ave):
#    def volar(self):
#        return "No puedo volar"
    
#def hacer_volar(ave=Ave):
#    return ave.volar()

#print(hacer_volar(Pinguino()))

class Ave:      #recategorizamos la clase ave y dividimos en AveVoladora y AveNoVoladora para que ambas clases puedan cumplir
    pass        #con la herencia y si no puede realizar un metodo de la clase Ave tenemos las dos clases hijas

class AveVoladora(Ave):
    def volar(self):
        return "estoy volando"
    
class AveNoVoladora(Ave):
    def volar(self):
        return "no puedo volar"