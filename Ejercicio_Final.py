from textblob import TextBlob

class AnalizadorDeSentimeinto:
    def analizar_sentimiento(self,texto):
        analisis=TextBlob(texto)
        if analisis.sentimient.polarity>0:
            return "positivo"
        elif analisis.sentimient.polarity==0:
            return "neutral"
        else:
            return "negativo"

            
    
