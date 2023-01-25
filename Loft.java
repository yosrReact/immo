package EsbTest;

public class Loft {
	private String adresse;
	private String description;
	private Integer etage;
	private Integer nChambre;

	public Loft(String adr, String desc, Integer etg) {
		this.adresse = adr;
		this.description = desc;
		this.etage = etg;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getEtage() {
		return etage;
	}

	public void setEtage(Integer etage) {
		this.etage = etage;
	}

	public String getAdresse() {
		return adresse;
	}

}
