
public class Apartamento extends Condominio{

	private int andar;

	public Apartamento(String proprietario, String endereco, double metros, int ano){
    	super(proprietario, endereco, metros, ano); 

	}


    @Override
    public double getiptu(){
        return getMetros() * 8.5;
    }
}