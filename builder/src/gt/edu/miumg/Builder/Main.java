package gt.edu.miumg.Builder;

public class Main {
    public static void main(String[] args) {

        Email email = new Email.builderEmail()
                .adddestinatarios("dfajardob@miumg.edu.gt")
                .adddestinatarios("fajardo17delmy@gmail.com")
                .setasunto(" Entregar desafio")
                .setcuerpo(" El objetivo de este reto es implementar una clase Email que represente un correo electrónico y utilizar el patrón de diseño Builder para construir instancias de esta clase." +
                        "\n")
                .setadjuntos("diagramadebUILDER.pgn")
                .build();




        System.out.println("Destinatarios: " + email.getDestinatarios());
        System.out.println("Asunto: " + email.getAsunto());
        System.out.println("Cuerpo: " + email.getCuerpo());
        System.out.println("Adjuntos: " + email.getAdjuntos());
    }
}