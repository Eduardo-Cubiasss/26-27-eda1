# Estructura visas y justificaciones

## Lista con objetos
```java

class Candidatos {
    String nombre;
    int votos;

    public Candidatos();

    public votar(nombreCandidato);
}

Candidatos elecciones = new Candidatos()
elecciones.votar('San Miguel');

```

- Almacena el nombre del candidatos/opción elegida (string) y el numero de votaciones (int).
- Es dinamico, puede tener n cantidad de candidatos/opciones.


## Justificación
- Debido a la aletoriedad de elementos que esta sujeta a tiempo de compilación he decidido recomendar listas con objetos.
- Una lista exigue un nivel de computo adicional que los arreglos no, pero por el contexto este costo computacional es despreciable. 