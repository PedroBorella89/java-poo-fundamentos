package secao14_tratamento_de_excecoes.application;

import secao14_tratamento_de_excecoes.entities.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ProgramReservation {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Room number: ");
        int room = sc.nextInt();
        sc.nextLine();
        System.out.print("Check-in date (dd/MM/yyyy): ");
        Date checkin = sdf.parse(sc.nextLine());
        System.out.print("Check-out date (dd/MM/yyyy): ");
        Date checkout = sdf.parse(sc.nextLine());
        Reservation r1 = new Reservation(room, checkin, checkout);

        System.out.println(r1);

        System.out.println();
        System.out.println("Enter the data to update the reservation: ");
        System.out.print("Check-in date (dd/MM/yyyy): ");
        checkin = sdf.parse(sc.nextLine());
        System.out.print("Check-out date (dd/MM/yyyy): ");
        checkout = sdf.parse(sc.nextLine());
        r1.updateDates(checkin, checkout);

        System.out.println("Reservation updated!");
        System.out.println(r1);

        sc.close();
    }
}
