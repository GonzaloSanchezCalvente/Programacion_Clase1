


def nombre():
    nombre = input("Pon tu nombre: ")

    print(f"tu nombre es: {nombre}")

def ejercicio_1():
    
    edad = int(input("introduce la edad: "))
    
    if edad >= 18:
        print("Eres mayor de edad")
    else:
        print("no eres mayor de edad")
        

def ejercicio_2():
    
    dia = input("introduce dia de la semana: ")
    
    if dia == "viernes" or  "sabado" or  "domingo":
        print(f"{dia} Es fin de semana")
    else:
        print(f"{dia} No es fin de semana") 

def ejercicio_3():
    
    numero = int(input("numero: "))
    
    if numero < 0:
        print(f"{numero} es negativo")
    else:
        print(f"{numero} es positivo")
        
def ejercicio_4():
    
    caracter = input("Introduce un caracter: ")
    
    if caracter == "a" or "e" or "i" or "o" or "u":
        print(f"{caracter} es vocal")
    else:
        print(f"{caracter} no es vocal")
        
def ejercicio_5():
    
    nota = int(input("nota: "))
    
    if nota > 10 or nota < 0:
        int(input("Valor no valido, introduzca un numero del 0 al 10: "))
    
    if nota >= 5:
        print("Estas aprobado")
    else:
        print("Estas suspenso")
        
ejercicio_1()
ejercicio_2()
ejercicio_3()
ejercicio_4()
ejercicio_5()
        