package tema7_parte3.ejercicioGamers;

public class Test {
    public static void main(String[] args) {

        Discord discord = new Discord(); //Se cargan los jugadores
        discord.addGamer(new Gamer("Martin","martin@gmail.com","Repo",Nivel.DIOS));
        discord.listGamers();
        discord.saveGamers();

        System.out.println("Búsqueda --------------");
        System.out.println(discord.findGamer("MartiN"));



    }
}
