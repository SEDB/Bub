/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.inf.gres;

import java.util.ArrayList;

/**
 *
 * @author Jackson Antonio do Prado Lima <jacksonpradolima at gmail.com>
 * @version 1.0
 */
public class Bub {

    private ArrayList<Integer> elements;

    public Bub() {
        elements = new ArrayList<Integer>();
    }

    /**
     * Put an element into array
     *
     * @param value
     * @throws IllegalArgumentException
     */
    public void add(int value) throws IllegalArgumentException {
        if (value < 0) {
            throw new IllegalArgumentException();
        }
        elements.add(value);
    }

    public void bubbleSort() {
        int out, in;
        for (out = elements.size() - 1; out > 0; out--) {
            for (in = 0; in < out; in++) {
                int x = elements.get(in);
                int y = elements.get(in + 1);
                if (x > y) {
                    swap(in, in + 1);
                }
            }
        }
    }

    public int get(int i) {
        return elements.get(i);
    }

    public ArrayList<Integer> getVector() {
        return elements;
    }

    public int size() {
        return this.elements.size();
    }

    private void swap(int i, int j) {
        int temp = elements.get(i);
        elements.set(i, elements.get(j));
        elements.set(j, temp);
    }
}
