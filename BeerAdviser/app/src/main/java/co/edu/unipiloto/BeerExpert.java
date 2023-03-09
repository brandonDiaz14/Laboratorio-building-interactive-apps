package co.edu.unipiloto;

public class BeerExpert {
    public String getBrands(String beer) {
        if (beer.equals("Carton")) {
            return "Seleccionaste Carton \n" +
                    "Tiene un precio de $500 el kilo \n" ;
        } else if (beer.equals("Vidrio")) {
            return "Seleccionaste Vidrio \n" +
                    "Tiene un precio de $150 el kilo \n" ;
        } else if (beer.equals("Papel")) {
            return "Seleccionaste Papel \n" +
                    "Tiene un precio de $800 el kilo \n" ;
        } else if (beer.equals("Metal")) {
            return  "Seleccionaste Metal \n" +
                    "Tiene un precio de $500 el kilo \n" ;
        }else if (beer.equals("Aluminio")) {
            return "Seleccionaste Aluminio \n" +
                    "Tiene un precio de $900 el kilo \n" ;
        }

        return "No select item";
    }
}
