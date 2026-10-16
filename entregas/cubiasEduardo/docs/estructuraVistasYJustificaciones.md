# Estructura visas y justificaciones

## Lista con objetos
```java

class Eleccion {
    String nombre;
    int votos;

    public Eleccion(String nombre);
    public votar();
}

class Lista {
    
    public Lista();
    private agregarCandidato();
    private boolean candidatoExiste();
    private Eleccion buscarCandidato(String nombre);
    public votar(String nombre) { 
        // (candidatoExiste()) entonces pasar a votar directamente
        // si no lo encontramos en buscarCandidato(nombre) entonces agregamosCandidato 
    };  
}

Candidatos candidato...
elecciones.votar('San Miguel');

```

- Almacena el nombre de los candidatos/opción elegida (string) y el número de votaciones (int).
- Es dinámico, puede tener una cantidad n de candidatos/opciones.



## Justificación
- Debido a la aleatoriedad de elementos que está sujeta a tiempo de compilación**,** he decidido recomendar listas con objetos.
- Una lista exige un nivel de cómputo adicional que los arreglos no, pero por el contexto este costo computacional es despreciable.
