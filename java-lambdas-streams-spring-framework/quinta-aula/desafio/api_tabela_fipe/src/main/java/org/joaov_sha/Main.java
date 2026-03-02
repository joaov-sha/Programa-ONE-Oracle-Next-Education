package org.joaov_sha;

import java.util.Scanner;

import org.joaov_sha.controller.MenuController;

public class Main {
    public static void main(String[] args) {
        MenuController mc = new MenuController();
        Scanner s = new Scanner(System.in);

        mc.showMenu();
        int opcao = s.nextInt();
        mc.selectOption(opcao);

        s.close();
        System.exit(0);
    }
}