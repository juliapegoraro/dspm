
public class Comercial extends Casa{

    public Comercial(String proprietario, String endereco, double metros, int ano){
    	super(proprietario, endereco, metros, ano);  

	}

    @Override
    public double getiptu(){
        return getMetros() * 8.5;
    }
}