public class Emplacement{

	private String adresse;
	private String nom;
	private String coordonnee;

	public Emplacement(){

	}

	public String getAdresse(){
		return adresse;
	}
	
	public String getNom(){
		return nom;
	}

	public String getCoordonnee(){
		return coordonnee;
	}

	public void setAdresse(String s){
                adresse=s;
        }

        public void setNom(String s){
                nom=s;
        }

        public void setCoordonnee(String s){
                coordonnee=s;
        }
