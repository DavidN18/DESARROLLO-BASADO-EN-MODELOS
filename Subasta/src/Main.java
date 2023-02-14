public class Main {

    public static void main(String [] args){
        //Se crean a los licitadores
        Licitador licitador1 =new Licitador("David");
        Licitador licitador2 =new Licitador("Samantha");
        Licitador licitador3 =new Licitador("Carolina");
        Licitador licitador4 =new Licitador("Jorge");
        //Creacion de los objetos
        ObjetoSubasta objeto1 = new ObjetoSubasta("Xiaomi note 11s",6000.00);
        ObjetoSubasta objeto2 = new ObjetoSubasta("lenovo ideapad 330s",11000.00);
        //Registrar a los licitadores a los objetos
        objeto1.registrarLicitador(licitador1);
        objeto1.registrarLicitador(licitador3);

        objeto2.registrarLicitador(licitador2);
        objeto2.registrarLicitador(licitador4);
        objeto1.registrarLicitador(licitador4);
        //los licitadres hacen sus ofertas
        licitador1.hacerOferta(objeto1,6500.00);
        licitador4.hacerOferta(objeto2,12000.00);
        //Retiro de un licitador
        objeto1.removerLicitador(licitador4);
        //Nueva oferta
        licitador1.hacerOferta(objeto1,6800.00);

    }

}
