public class Motoca {
	
	private String buzina;
	private String nome;
	private int tempo;
	private int idade;
	private int potencia;
	private boolean temMotorista;
	
	
    public Motoca(int potencia){
    	this.potencia = potencia;
    	
    	String nome="";
    	String buzina="";
    	boolean temMotorista=false;
    }

    public Pessoa getPessoa() {
        return null;
    }

    public int getTempo() {
        return tempo;
    }

    public int getPotencia() {
        return potencia;
    }

    public boolean subir(Pessoa pessoa){
        if(temMotorista) {
        	return false;
        }else {
        	temMotorista=true;
        	this.idade=pessoa.getIdade();
        	this.nome=pessoa.getNome();
        	return true;
        }
    }

    public boolean descer(){
        if(!temMotorista) {
        	return false;
        }else {
        	this.tempo=0;
        	this.idade=0;
        	this.nome="";
        	temMotorista=false;
        	return true;
        }
    }/*public boolean descer(){
    	 if(temMotorista=false) {
         	this.tempo=0;
         	this.idade=0;
         	this.nome="";
    	 }else {
    		 return false;
    	 }
        
    }   */

    public void colocarTempo(int tempo){
    	this.tempo+=tempo;
    }

    public boolean dirigir(int tempo){
            if(temMotorista) {
	    		if(this.idade<11&&this.tempo>0&&this.tempo>tempo) {
		            this.tempo-=tempo;
		           	return true;
	    		}else {
	    			this.tempo=0;
	    			System.out.println("entrou");
	    			return false;
	            }
            }else return false;
    }
    /*public boolean dirigir(int tempo){
            if(temMotorista&&this.idade<11&&this.tempo>0&&this.tempo>tempo) {
		            this.tempo-=tempo;
		           	return true;
	    		}else {
	    			this.tempo=0;
	    			System.out.println("entrou");
	    			return false;
	            }
            }else return false;
    }    */

    public String buzinar(){
    	if(!temMotorista) {
    		buzina="";
    		return buzina;
    	}else {
	    	buzina+="P";
	        for(int i = 0; i < potencia;i++) {
	        	buzina+="e";
	        }
	        buzina+="m";
	        return buzina;
    	}
    }
}
