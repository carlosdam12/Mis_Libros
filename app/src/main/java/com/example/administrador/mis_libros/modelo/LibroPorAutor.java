package com.example.administrador.mis_libros.modelo;

import java.util.Comparator;

/**
 * Created by alumno2 on 30/01/2018.
 */

public  class LibroPorAutor implements Comparator<Libros> {
    @Override
    public int compare(Libros o, Libros o1) {
        return o.autor.toUpperCase().compareTo(o1.autor.toUpperCase()) ;
    }

}
