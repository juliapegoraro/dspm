
public class Condominio extends Casa{

	String nomeCond;


    public Condominio(String proprietario, String endereco, double metros, int ano){
    	super(proprietario, endereco, metros, ano);
		 

	}



    @Override
     public double getiptu(){
        return getMetros() * 9;
    }
}