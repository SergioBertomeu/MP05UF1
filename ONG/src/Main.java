import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner ent = new Scanner(System.in);

    public static void main(String[] args) {

        int opcio;
        ONG ong = new ONG();

        //Datos de prueba
        ong.getBancAliments().agregarAliment(new Aliment("arroz", 100));
        ong.getBancAliments().agregarAliment(new Aliment("alubias", 500));
        ong.agregarAsociacion(new Asociacio("Asociacion 1", "9999999", 100));
        ong.agregarAsociacion(new Asociacio("Asociacion 2", "8888888", 500));

        do {
            System.out.println("*** MENU ONG ***");
            System.out.println("1. Donar aliments");
            System.out.println("2. Banc d'aliments");
            System.out.println("3. Asociacions");
            System.out.println("4. Sortir");
            System.out.println("Seleccione una opcio: ");

            opcio = ent.nextInt();
            ent.nextLine();
            switch (opcio){
                case 1:
                    menuDonarAliments(ong);
                    break;

                case 2:
                    menuBancAliments(ong);
                    break;

                case 3:
                    menuAsociacions(ong);
                    break;
            }
        }
        while(opcio != 4);
    }

    public static void menuAsociacions(ONG ong){

        int opcio;

        do {

            System.out.println(">>> MENU Associacions <<< ");
            System.out.println("1. Agregar asociacio");
            System.out.println("2. Solicitar envio");
            System.out.println("3. Listar asociacions");
            System.out.println("4. Listar tots los pedidos");
            System.out.println("5. Listar pedidos per data");
            System.out.println("6. Listar pedidos per asociacio");
            System.out.println("7. <- Tornar al menú principal");
            System.out.println("Trieu l'opció desitjada: ");

            opcio = ent.nextInt();
            ent.nextLine();
            switch (opcio){
                case 1:
                    menuAgregarAsociacio(ong);
                    break;

                case 2:
                    menuSollicitarEnvioAliments(ong);
                    break;

                case 3:
                    ong.mostrarAsociacions();
                    break;

                case 4:
                    ong.mostrarPedidos();
                    break;

                case 5:
                    System.out.println("Dats del pedido (dd/mm/yyyy): ");
                    String strFecha = ent.nextLine();
                    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    LocalDate data = LocalDate.parse(strFecha, dtf);
                    ong.mostrarPedidos(data);
                    break;

                case 6:
                    Asociacio asociacio = seleccionarAsociacio(ong);
                    if(asociacio != null)
                        asociacio.mostrarPedidos();
                    break;
            }

        }while(opcio != 7);
    }

    private static Asociacio seleccionarAsociacio(ONG ong){
        if(!ong.teAsociacions()){
            System.out.println("Heu de crear almenys una associació per fer l'enviament");
            return null;
        }

        System.out.println("Asociacions de la ONG");
        ong.mostrarAsociacions();
        int quantitatAssociacions = ong.quantitatAssociacions();
        System.out.println((quantitatAssociacions+1) + ". Sortir");
        System.out.println("Selecciona una associació: ");
        int opcio = ent.nextInt();
        if(opcio >= 1 && opcio <= quantitatAssociacions){
            return ong.getAsociacions().get(opcio-1);
        }
        System.out.println("Opcio incorrecta!");
        return null;
    }

    public static void menuSollicitarEnvioAliments(ONG ong){
        int opcio;
        Pedido nouPedido = new Pedido();
        int quantitatAliments = ong.getAliments().size();

        Asociacio asociacio = seleccionarAsociacio(ong);
        if(asociacio == null)
            return;
        System.out.println("Envío a la asociacio " + asociacio);

        do{
            if(!nouPedido.comandaBuida()){
                System.out.println("Pedido de aliments");
                nouPedido.mostrarPedido();
            }

            System.out.println("Seleccionar aliments para envio");
            opcio = menuAliments(ong);
            if(opcio >= 1 && opcio <= quantitatAliments){
                Aliment alimentSel = ong.getAliments().get(opcio-1);
                System.out.println("Element seleccionat: " + alimentSel.getNom());
                System.out.println("Quantitat (kg): ");
                int quantitat = ent.nextInt();
                ent.nextLine();

                //Es té aquesta quantitat daquest aliment?
                if(quantitat > alimentSel.getStock()){
                    System.out.println("No es disposa de aqueta quantitat en stock");
                }
                else{
                    //Afegir l'aliment a la comanda
                    if(nouPedido.totalPedido() + quantitat <= 300){
                        nouPedido.agregarAliment(new Aliment(alimentSel.getNom(), quantitat));
                        alimentSel.enviar(quantitat);
                    }
                    else{
                        System.out.println("Esta quantitat supera los 300 kg del pedido.");
                    }
                }
            }
        }
        while(opcio != (quantitatAliments+1));

        if(!nouPedido.comandaBuida()){
            System.out.println("Comanda realitzada correctament!");
            asociacio.agregarPedido(nouPedido);
            nouPedido.mostrarPedido();
        }
    }

    public static void menuAgregarAsociacio(ONG ong){
        int distancia;
        String nom, telefono;

        System.out.println(">>> NoVA ASOCIACIO");
        System.out.println("Nom: ");
        nom = ent.nextLine();
        System.out.println("Telefono: ");
        telefono = ent.nextLine();
        System.out.println("Distancia al banc d'alimentos: ");
        distancia = ent.nextInt();

        ong.agregarAsociacion(new Asociacio(nom, telefono, distancia));
        System.out.println("La asociacio s'ha agregat correctament!\n");
    }

    private static void agregarAliment(BancAliments bancAliments){
        String nomAliment;
        System.out.println("Nom aliment: ");
        nomAliment = ent.nextLine();
        if(bancAliments.agregarAliment(new Aliment(nomAliment)))
            System.out.println("El aliment "+nomAliment+" s'ha agregat correctament!");
        else
            System.out.println("L'aliment "+nomAliment+" ja existeix!");
    }

    private static void modificarAliment(BancAliments bancAliments){
        int idxAliment;
        Aliment selAliment;
        String nouNom;

        if(!bancAliments.teAliments()){
            System.out.println("El banc d'aliments no té aliments");
            return;
        }

        System.out.println("Aliments disponibles");
        bancAliments.mostrarAliments();
        System.out.println("Seleccione l'aliment a modificar: ");
        idxAliment = ent.nextInt()-1;
        ent.nextLine();

        selAliment = bancAliments.getAliment(idxAliment);
        if(selAliment != null){
            System.out.println("Nou nom per al " + selAliment.getNom() + ": ");
            nouNom = ent.nextLine();
            if(bancAliments.modificarAliment(selAliment.getNom(), nouNom))
                System.out.println("L'aliment "+selAliment.getNom()+" s'ha modificat correctament!");
            else
                System.out.println("L'aliment "+selAliment.getNom()+" no s'ha trobat!");
        }
        else{
            System.out.println("Opción incorrecta");
        }
    }

    private static void eliminarAliment(BancAliments bancAliments){
        int idxAliment;
        Aliment selAliment;

        if(!bancAliments.teAliments()){
            System.out.println("El banc d'aliments no té aliments");
            return;
        }

        System.out.println("Aliments disponibles");
        bancAliments.mostrarAliments();
        System.out.println("Seleccione l'aliment a eliminar: ");
        idxAliment = ent.nextInt()-1;
        ent.nextLine();

        selAliment = bancAliments.getAliment(idxAliment);
        if(selAliment != null){
            bancAliments.eliminarAliment(selAliment);
            System.out.println("L'aliment s'ha eliminat correctament");
        }
        else{
            System.out.println("Opción incorrecta");
        }
    }

    public static void menuBancAliments(ONG ong){
        int opcio;
        BancAliments bancAliments = ong.getBancAliments();

        do{
            System.out.println("MENU Banco de Alimentos");
            System.out.println("1. Agregar aliment");
            System.out.println("2. Modificar aliment");
            System.out.println("3. Eliminar aliment");
            System.out.println("4. Mostrar aliments");
            System.out.println("5. Sortir");
            System.out.println("Seleccione la opcio deseada: ");

            opcio = ent.nextInt();
            ent.nextLine();

            switch (opcio){
                case 1:
                    agregarAliment(bancAliments);
                    break;

                case 2:
                    modificarAliment(bancAliments);
                    break;

                case 3:
                    eliminarAliment(bancAliments);
                    break;

                case 4:
                    System.out.println("Aliments disponibles");
                    bancAliments.mostrarAliments();
                    break;
            }

        }while(opcio != 5);
    }

    public static void menuDonarAliments(ONG ong){
        int opcion;
        int cantidadAliments = ong.getAliments().size();

        if(!ong.getBancAliments().teAliments()){
            System.out.println("El banc d'aliments no té aliments");
            System.out.println("Heu d'afegir els aliments al banc d'aliments per poder introduir les donacions");
            return;
        }

        do{
            System.out.println(">>> MENU Donar aliments <<<");
            opcion = menuAliments(ong);
            if(opcion >= 1 && opcion <= cantidadAliments){
                String nomAliment = ong.getAliments().get(opcion-1).getNom();
                System.out.println("Quantitat de " + nomAliment + " a donar (kg): ");
                int cantidad = ent.nextInt();
                ong.getAliments().get(opcion-1).donar(cantidad);
                System.out.println("S'han donad " + cantidad + " kg de " + nomAliment);
            }
        }
        while(opcion != (cantidadAliments+1));
    }


    private static int menuAliments(ONG ong){

        ArrayList<Aliment> aliments = ong.getAliments();

        ong.getBancAliments().mostrarAliments();
        System.out.println((aliments.size()+1) + ". Tornar");
        System.out.println("Seleccione un aliment: ");

        return ent.nextInt();
    }

}
