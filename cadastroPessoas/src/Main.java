// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


import car.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        List<Person> studants = new ArrayList<Person>();
        boolean exit = true;
        while (exit){
            Person studant = new Person();
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite o nome completo do estudante");
            studant.name = scanner.nextLine();
            studants.add(studant);
            System.out.println("Obrigado por digitar o nome completo do " + studant.name);


            System.out.println("Deseja cadastrar mais um? S/SIM e N/NÃO");
            String option = scanner.next();
            if(option.equals("N")){
                exit = false;
            }

        }



    }
}