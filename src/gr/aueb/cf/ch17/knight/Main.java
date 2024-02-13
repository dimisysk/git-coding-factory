package gr.aueb.cf.ch17.knight;

import gr.aueb.cf.ch17.IDecision;
import gr.aueb.cf.ch17.IPrincess;

public class Main {

    public static void main(String[] args) {
        IKnight saintJim = new knight();
        IKnight saintGeorge = new knight();
        IPrincess princessMary = new Princess();


        saintJim.embarkOnMission(new IMission() {
            @Override
            public void embark() {
                System.out.println("kill the dragon");
            }

            @Override
            public void save() {
                System.out.println("save the princess");

            }

            @Override
            public void comeBack() {
                System.out.println("Get the princess back");

            }
        });

        saintGeorge.embarkOnMission(new IMission() {
            @Override
            public void embark() {
                System.out.println("kill the dragon");
            }

            @Override
            public void save() {
                System.out.println("save the princess");
            }

            @Override
            public void comeBack() {
                System.out.println("Get the princess back");

            }
        });

        princessMary.makeYourDecision(() -> System.out.println("Kiss the knight"));
        princessMary.makeYourDecision(Main::gameOver);
    }

    public static void gameOver() {
        System.out.println("Congrats you finish your job");
    }
}
