import java.util.Scanner;

public  class JEmpire {

    static int bois = 0;
    static int pierre = 0;
    static int or = 50;
    static int nourriture = 100;
    static int habitant = 1;
    static int tour = 0;
    static boolean mineConstruite = false;
    static boolean jeuEnCours = true;

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        afficherIntro();
        while (jeuEnCours) {
            tour++;
            afficherRessource();
            afficherMenu();
            int choix = Lirechoix();
            traiteChoix(choix);
            faireManger();
            verifierDefaite();
        }
        sc.close();
    }


    static void afficherIntro() {
        System.out.println("================================");
        System.out.println("-----Bienvenue dans JEMPIRE-----");
        System.out.println("================================");
        System.out.println(" Faite prospéré votre collonie ");
        System.out.println(" Construisez un château pour remporter la victoire !");
        System.out.println("------------------------------\n");
    }


    static void afficherRessource() {
        System.out.println("\n ---------Ressources---------");
        System.out.println("Bois :" + bois);
        System.out.println("Pierre :" + pierre);
        System.out.println("Or :" + or);
        System.out.println("Nourriture :" + nourriture);
        System.out.println("Habitant :" + habitant);
        System.out.println("mine :" + (mineConstruite ? "Construite " : " pas construite"));
        System.out.println("Tour :" + tour);
    }

    static void afficherMenu() {
        System.out.println("\n -------- Que voulez-vous faire ? --------");
        System.out.println("1. Explorer la forêt | Aucun | ( +5 Bois, +3 Nourriture)");
        System.out.println("2. Créer une mine | -10 Bois | (Débloque l'accès à la pierre pour les tours suivants)");
        System.out.println("3. Travailler à la mine | -5 Nourriture | +5 Pierre, +2 Or (Seulement si mine construite !)");
        System.out.println("4. Recruter un soldat | -30 Or | +1 Habitant ");
        System.out.println("5. Commercer | -5 Pierre | +10 Or");
        System.out.println("6. CONSTRUIRE LE CHÂTEAU | -100 Bois, -100 Pierre, -200 Or, -40 Habitants | VICTOIRE IMMÉDIATE !");
        System.out.println("\n votre choix est :");

    }


    static int Lirechoix() {
        int choix = 0;
        while (choix < 1 || choix > 6) {
            try {
                choix = Integer.parseInt(sc.nextLine().trim());
                if (choix < 1 || choix > 6) {
                    System.out.println("Veuillez entrer un choix valide entre 1 et 6 !:");
                }

            } catch (NumberFormatException e) {
                System.out.println("Veuillez entre 1 et 6 !");
            }
        }
        return choix;
    }

    static void traiteChoix(int choix) {
        switch (choix) {
            case 1:
                explorerForet();
                break;
            case 2:
                creerMine();
                break;
            case 3:
                travaillerMine();
                break;
            case 4:
                recruterSoldat();
                break;
            case 5:
                commerce();
                break;
            case 6:
                construireChateaux();
                break;
        }
    }

    static void explorerForet() {
        bois += 5;
        nourriture += 3;
        System.out.println("\n > Vos éclaireurs viennent avec du bois et de la nourriture ! ");
        System.out.println(" Bois +5 | Nourriture +3 ");
    }

    static void creerMine() {
        if (mineConstruite) {
            System.out.println("\n > La mine est déjà construite !");
            return;
        } else if (bois < 10) {

            System.out.println("\n > Pas assez de bois ! Il vous faut 10 bois. (Actuel : " + bois + ")");
            return;
        }
        bois -= 10;

        mineConstruite = true;
        System.out.println("\n > Vos ouvriers ont creusé une mine dans la colline !");
        System.out.println(" Bois -10 | Mine débloquée");
    }


    static void travaillerMine() {
        if (!mineConstruite) {
            System.out.println("\n > Vous n'avez pas de mine encore ! Construisez-en une d'abord (choix 2).");
            return;
        } else if (nourriture < 5) {
            System.out.println("\n > Pas assez de nourriture ! Il vous faut 5 Nourriture. (Actuel : " + nourriture + ")");
            return;
        }
        nourriture -= 5;
        pierre += 5;
        or += 2;
        System.out.println("\n > Vos mineurs ont travaillé dur dans les tunnels ! ");
        System.out.println("\n > Nourriture -5 | Pierre +5 | Or +2 ");
    }

    static void recruterSoldat() {
        if (or < 30) {
            System.out.println("\n > Pas assez d'or ! Il faut 30 Or. (Actuel : " + or + ")");
            return;
        }
        or -= 30;
        habitant += 1;
        System.out.println("\n > Un nouveau soldat rejoint vos rangs ! ");
        System.out.println("\n > Or -30 | Habitants +1 ");
    }

    static void commerce() {
        if (pierre < 5) {
            System.out.println("\n > Pas assez de pierre ! Il vous faut 5 Pierre. (Actuel : " + pierre + ")");
            return;
        }
        pierre -= 5;
        or += 10;
        System.out.println("\n> Vos marchands ont vendu des matériaux au marché !");
        System.out.println("\n> Pierre -5 | Or +10");
    }

    static void construireChateaux() {
        if (bois < 100 & pierre < 200 & or < 200 & habitant < 2) {
            System.out.println("\n> Construction du chateaux IMPOSSIBLE");
            return;
        }
        bois -= 100;
        pierre -= 100;
        or -= 200;
        habitant -= 2;
        System.out.println("\n>=============================================");
        System.out.println("\n>||       FELICITATION GOUVERNEUR           ||");
        System.out.println("\n>||             o         o                 ||");
        System.out.println("\n>||                  |                      ||");
        System.out.println("\n>||              _______/                   ||");
        System.out.println("\n>||                                         ||");
        System.out.println("\n>||     *** VICTOIRE IMMEDIATE ! ***        ||");
        System.out.println("\n>=============================================");
    }

    static void faireManger() {
        if (!jeuEnCours)
            return;
        System.out.println("\n > Vos habitants mangent ! (-" + habitant + " nourriture)");
        if (nourriture >= habitant) {
            nourriture -= habitant;

        } else {
            nourriture = 0;
            habitant = 0;
            System.out.println("\n> Catastrophe vos habitants on sucombé a la famine !");
        }
    }

    static void verifierDefaite() {
        if (habitant<=0 && jeuEnCours) {
            System.out.println("\n>==============================================");
            System.out.println("\n>||               GAME OVER                  ||");
            System.out.println("\n>||              o        o                  ||");
            System.out.println("\n>||                   |                      ||");
            System.out.println("\n>||                 ______                   ||");
            System.out.println("\n>||                /                         ||");
            System.out.println("\n>||  Votre collonie a disparue dans l'oublie ||");
            System.out.println("\n>||                                          ||");
            System.out.println("\n>||  l'histoire ne se souviendra pas de vous ||");
            System.out.println("\n>==============================================");
            jeuEnCours = false;
        }
    }


    }

