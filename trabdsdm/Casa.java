import java.lang.Comparable;
public class Casa implements Comparable <Casa>{


	private String proprietario;
	private String endereco;
	private double metros;
	private int ano;

	public Casa(String proprietario, String endereco, double metros, int ano){

		this.setProprietario(proprietario);
		this.setEndereco(endereco);
		this.setMetros(metros);
		this.setAno(ano);
		
	}
	
	public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public String getProprietario(){
        return this.proprietario;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

     public String getEndereco() {
        return this.endereco;
    }

    public void setMetros(double metros) {
        this.metros = metros;
    }

    public double getMetros() {
        return this.metros;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getiptu(){
    	return getMetros() * 7;
    }

    public int compareTo(Casa casa){

        if (this.metros > casa.getMetros()) {
            return -1;
            
        }
        if (this.metros < casa.getMetros()) {
            return 1;
        }
        return 0;

    }

}