package ch.ibw.java.oop.lektion1;

public class Adresse {
    private static String name, street, town, mail, commentary;
    private static int houseNumber, postalCode;

    /*
    public Adresse(String name, String street, String town, String mail, String commentary, int houseNumber, int postalCode){
        this.name = name;
        this.street = street;
        this.town = town;
        this.mail = mail;
        this.commentary = commentary;
        this.houseNumber = houseNumber;
        this.postalCode = postalCode;
    }

     */


    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Adresse.name = name;
    }

    public static String getStreet() {
        return street;
    }

    public static void setStreet(String street) {
        Adresse.street = street;
    }

    public static String getTown() {
        return town;
    }

    public static void setTown(String town) {
        Adresse.town = town;
    }

    public static String getMail() {
        return mail;
    }

    public static void setMail(String mail) {
        Adresse.mail = mail;
    }

    public static String getCommentary() {
        return commentary;
    }

    public static void setCommentary(String commentary) {
        Adresse.commentary = commentary;
    }

    public static int getHouseNumber() {
        return houseNumber;
    }

    public static void setHouseNumber(int houseNumber) {
        Adresse.houseNumber = houseNumber;
    }

    public static int getPostalCode() {
        return postalCode;
    }

    public static void setPostalCode(int postalCode) {
        Adresse.postalCode = postalCode;
    }
}
