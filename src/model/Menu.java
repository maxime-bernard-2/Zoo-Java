package model;

import model.fences.Fence;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * Classe publique Menu
 *
 */
public class Menu {

	//Attributes
    private final Scanner choice;

    public Menu() {
        this.choice = new Scanner(System.in);
    }

    public void employeeMenu(Employee employee, ArrayList<Fence> fences) throws InterruptedException {
        Menu myMenu = new Menu();

        System.out.println("/------------ Menu Employé ------------/");
        System.out.println("[1] Affiche un enclos");
        System.out.println("[2] Netoie un enclos");
        System.out.println("[3] Nourrir les animaux d'un enclos");
        System.out.println("[4] Echanger un animal d'enclos");
        System.out.println("/-------------------------------------/");
        System.out.print("Choix: ");

        switch (choice.nextInt()) {
            case 1:
                myMenu.menuCheckFence(employee, fences);
                break;
            case 2:
                myMenu.menuCleanFence(employee, fences);
                break;
            case 3:
                myMenu.menuFeedFence(employee, fences);
                break;
            case 4:
                break;
            default:
                employeeMenu(employee, fences);
                break;
        }
    }

    public void showAllFences(ArrayList<Fence> fences) {
        for (int i = 1; i <= fences.size(); i++) {
            System.out.println("[" + i + "] " + fences.get(i - 1).getName());
        }
    }

    public void menuCheckFence(Employee employee, ArrayList<Fence> fences) throws InterruptedException {
        System.out.println("/------------ Afficher un enclos ------------/");
        showAllFences(fences);
        System.out.println("/--------------------------------------------/");
        System.out.print("Choix: ");

        int userchoice = choice.nextInt();

        if (userchoice > fences.size() || userchoice < 1) {
            System.out.println("Mauvais choix, recommence ! (il me faut un chiffre valide)");
            TimeUnit.SECONDS.sleep(2);
            menuCheckFence(employee, fences);
        } else {
            employee.checkFence(fences.get(userchoice - 1));
            System.out.println("\n[1] Retour au menu");
            choice.next();
            employeeMenu(employee, fences);
        }
    }

    public void menuCleanFence(Employee employee, ArrayList<Fence> fences) throws InterruptedException {
        System.out.println("/------------ Netoyer un enclos ------------/");
        showAllFences(fences);
        System.out.println("/--------------------------------------------/");
        System.out.print("Choix: ");

        int userchoice = choice.nextInt();

        if (userchoice > fences.size() || userchoice < 1) {
            System.out.println("Mauvais choix, recommence ! (il me faut un chiffre valide)");
            TimeUnit.SECONDS.sleep(2);
            menuCleanFence(employee, fences);
        } else {
            employee.cleanFence(fences.get(userchoice - 1));
            System.out.println("\n[1] Retour au menu");
            choice.next();
            employeeMenu(employee, fences);
        }
    }

    public void menuFeedFence(Employee employee, ArrayList<Fence> fences) throws InterruptedException {
        System.out.println("/------------ Nourrir un enclos ------------/");
        showAllFences(fences);
        System.out.println("/--------------------------------------------/");
        System.out.print("Choix: ");

        int userchoice = choice.nextInt();

        if (userchoice > fences.size() || userchoice < 1) {
            System.out.println("Mauvais choix, recommence ! (il me faut un chiffre valide)");
            TimeUnit.SECONDS.sleep(2);
            menuFeedFence(employee, fences);
        } else {
            employee.feedFence(fences.get(userchoice - 1));
            System.out.println("\n[1] Retour au menu");
            choice.next();
            employeeMenu(employee, fences);
        }
    }

}
