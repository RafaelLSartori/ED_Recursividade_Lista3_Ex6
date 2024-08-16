package view;

import controller.Ex6;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Ex6 m = new Ex6();
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite quantas vezes a série irá se repetir: "));
        double resp = m.frecserie(num);
        System.out.println(resp);
    }
}