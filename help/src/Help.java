import java.io.IOException;

    /*
        Tente isso 3-1

        Um sistema de ajuda simples.
    */
public class Help {
    public static void main(String[] args) throws IOException {
        char choice, ignore;

        do {
            System.out.println("Help on:");
            System.out.println("\t1. if");
            System.out.println("\t2. switch");
            System.out.println("\t3. for");
            System.out.println("\t4. while");
            System.out.println("\t5. do-while\n");
            System.out.println("Choose one: ");

            choice = (char) System.in.read();
            do {
                ignore = (char) System.in.read();
            }while (ignore != '\n');
        }while (choice < '1' | choice > '5');

        switch (choice) {
            case '1':
                System.out.println("The if:\n");
                System.out.println("if(condition) statement;");
                System.out.println("else statement;");
                break;
            case '2':
                System.out.println("The switch:\n");
                System.out.println("switch(expression) {");
                System.out.println("\tcase constant:");
                System.out.println("\t\tstatement sequence");
                System.out.println("\t\tbreak;");
                System.out.println("\t// ...");
                System.out.println("}");
                break;
            case '3':
                System.out.println("The for:\n");
                System.out.print("for(init; condition; interation) ");
                System.out.println("statement;");
                break;
            case '4':
                System.out.println("The while:\n");
                System.out.println("while(condition) statement;");
                break;
            case '5':
                System.out.println("The do-while:\n");
                System.out.println("do {");
                System.out.println("\tstatement;");
                System.out.println("} while (condition);");
                break;
        }
    }
}
