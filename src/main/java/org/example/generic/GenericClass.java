package org.example.generic;

public class GenericClass<K, V, N, I> {

    public void print(K k, V v, N n, I i) {
        System.out.println(k);
        System.out.println(v);
        System.out.println(n);
        System.out.println(i);
    }

    public void print2(K k, V v, N n, I i) {
        System.out.println(k);
        System.out.println(v);
        System.out.println(n);
        System.out.println(i);
    }
}
