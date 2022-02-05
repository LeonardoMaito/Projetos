/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leonardomaito.provaaare;

import java.util.Scanner;

/**
 *
 * @author Leonardo Maito
 */
public class RPG {

    //variaveis de status
    double hp, def, heal = 15, backStab = 1.5, hpBoss = 90, defBoss = 0.25;

    //Variaveis de ataque
    double max = 40, min = 20;
    double bossMax = 50, bossMin = 0;

    //Variaveis de escolha
    String playerChoice;

    void start() {
        //Checando se o HP de ambos é acima de 0 para continuar ou acabar o jogo
        checkCondition();
        //Sem esse IF parece nao funcionar muito bem, melhor deixar
        if (hp > 0 && hpBoss > 0) {
            Scanner choice = new Scanner(System.in);
            System.out.println("Jogada sua: Atacar, Defender ou conferir status");
            playerChoice = choice.nextLine();

            if (playerChoice.equalsIgnoreCase("Atacar")) {
                attack();
            } else if (playerChoice.equalsIgnoreCase("Defender")) {
                //Aumentar a o status de defesa
                defend();
                System.out.format("HP defesa atual: " + String.format("%.2f", def) + "\n");
                bossMove();
            } else if (playerChoice.equalsIgnoreCase("Status")) {
                //Conferir status
                stats();
            }
        }
    }

    void checkCondition() {
        if (hp <= 0) {
            System.out.format("Game Over");
        } else if (hpBoss <= 0) {
            System.out.format("Vitória!");
        }
    }

    void stats() {

        System.out.format("HP atual: " + String.format("%.2f", hp) + "\n");
        System.out.format("Defesa atual: " + String.format("%.2f", def) + "\n");
        start();

    }

    void attack() {
        //Dano baseado em números randoms
        double atk = (Math.random() * ((max - min) + 1));
        System.out.format("Vida do inimigo antes do ataque: " + String.format("%.2f", hpBoss) + "\n");
        if (atk >= 15) {
            criticalHit(atk);

        } else {

            //Calculo de ataque levando em consideração a defesa do inimigo
            atk = (atk * defBoss);
            hpBoss = (hpBoss - atk);
            System.out.print("Vida do inimigo após ataque:" + String.format("%.2f", hpBoss) + "\n");
            bossMove();
        }
    }

    double defend() {

        //Simplesmente aumenta a defesa
        return def = def + 0.08;
    }

    void bossMove() {

        double bossAtk = (Math.random() * ((bossMax - bossMin) + 1));
        //Mesma ideia do ataque do personagem principal

        System.out.format("O inimigo faz sua jogada" + "\n");

        bossAtk = (bossAtk * def);
        hp = (hp - bossAtk);

        System.out.format("Sua vida após ataque: " + String.format("%.2f", hp) + "\n");
        start();
    }

    void criticalHit(double atk) {

        System.out.format("Crítico! Jogue novamente" + "\n");

        //Esse IF é para verificar se o personagem tem dano de backstab, ou seja, o Rogue
        if (backStab > 0) {

            hpBoss = (hpBoss - (atk * backStab));
            hp = hp + heal;
            System.out.format("Dano com backstab causado: " + String.format("%.2f", atk * backStab) + "\n");
            start();

        } else {
            // Se não possuir dano de backstab, apenas causa dano normal e é curado
            hpBoss = (hpBoss - atk);
            System.out.format("Dano causado: " + String.format("%.2f", atk) + "\n");
            hp = hp + heal;
            System.out.format("HP recuperado: " + String.format("%.2f", heal) + "\n");
            start();
        }

    }

    public static void main(String[] args) {
        String heroChoice;
        RPG knight = new RPG();
        RPG mage = new RPG();
        RPG rogue = new RPG();

        knight.hp = 65;
        knight.def = 0.2;
        knight.backStab = 0;
        knight.heal = 1;

        mage.hp = 55;
        mage.def = 0.10;
        mage.backStab = 0;
        mage.heal = 15;

        rogue.hp = 45;
        rogue.def = 0.08;
        rogue.backStab = 1.5;
        rogue.heal = 1;

        Scanner hero = new Scanner(System.in);
        System.out.println("Escolha seu herói: Knight, Mage ou Rogue");
        heroChoice = hero.nextLine();

        if (heroChoice.equalsIgnoreCase("Knight")) {
            knight.start();
        } else if (heroChoice.equalsIgnoreCase("Mage")) {
            mage.start();
        } else if (heroChoice.equalsIgnoreCase("Rogue")) {
            rogue.start();
        }

    }
}
