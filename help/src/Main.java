/*
    Tente isso 4-1

    Um sistema de ajuda simples.
*/

import entity.Help;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        char choice, ignore;
        Help hlpobj = new Help();

        for (; ; ) {
            do {
                hlpobj.showMenu();

                choice = (char) System.in.read();

                //Remove caracter indesejado no buffer e entrada
                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');

            } while (!hlpobj.isValid(choice));

            if (choice == 'q') break;

            System.out.println("\n");

            hlpobj.helpOn((choice));
        }
    }
}
