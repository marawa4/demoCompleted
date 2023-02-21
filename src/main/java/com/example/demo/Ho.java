package com.example.demo;

public class Ho {
    public static void main(String[] args) {
        Vertis<Double> s = new Vertis<Double>(39.9);
        System.out.println(s.postCat());
    }

    static class Vertis<T> {
        T cat;

        Vertis(T cat) {
            this.cat = cat;
        }

        public T getCat() {
            return cat;
        }

        public String postCat() {
            return cat.toString();
        }
    }
}
