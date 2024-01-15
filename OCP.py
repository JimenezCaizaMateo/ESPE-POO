class Notificador:
    def __init__(self,usuario,mensaje):     #el OCP cuample con la escalabilidad de la clase
        self.usuario=usuario
        self.mensaje=mensaje
        
    def notificar(self):
        raise NotImplementedError
    
class NotificadorEmail(Notificador):
    def Notificar(self):
        print(f"Enviar mensaje por mail a {self.usuario.email}")
        
class NotificadorSMS(Notificador):
    def Notificar(self):
        print(f"Enviar mensaje por sms a {self.usuario.sms}")
        
class NotificadorWhattsApp(Notificador):
    def Notificar(self):
        print(f"Enviar mensaje por WhattsApp a {self.usuario.whattsapp}")