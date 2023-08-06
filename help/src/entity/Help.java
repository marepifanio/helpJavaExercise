package entity;

    /*
        Tente isso 4-1

        Um sistema de ajuda simples.
    */
public class Help {

    public void helpOn(int what) {

        switch (what) {
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
            case '6':
                System.out.println("The break: \n");
                System.out.println("break; or break label;");
                break;
            case '7':
                System.out.println("The continue:\n");
                System.out.println("continue; or continue label;");
                break;
        }

    }

    public void showMenu() {
        System.out.println("Help on:");
        System.out.println("\t1. if");
        System.out.println("\t2. switch");
        System.out.println("\t3. for");
        System.out.println("\t4. while");
        System.out.println("\t5. do-while");
        System.out.println("\t6. break");
        System.out.println("\t7. continue\n");
        System.out.println("Choose one (q to quit): ");
    }

    public boolean isValid(int ch) {
        if (ch < '1' | ch > '7' & ch != 'q') return false;
        return true;
    }
}
