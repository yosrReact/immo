public class Classe_Standard()
{
    private int code_Classe;
    private String type_Bien;
    private int prix_Maximum;

    public Classe_Standard()
    {
        this.type_Bien = type_bien;
        this.code_Classe = code_Classe;
        this.prix_Maximum = prix_Maximum;
    }

    public int getCode_Classe()
    {
        return code_Classe;
    }

    public char getType_Bien()
    {
        return type_Bien;
    }

    public int getPrix_Maximum()
    {
        return prix_Maximum;
    }

    public int setCode_Classe()
    {
        this.code_Classe = code_Classe;
    }

    public String setType_Bien()
    {
        this.type_Bien = type_Bien;
    }
    
    public int setPrix_Maximum()
    {
        this.prix_Maximum = prix_Maximum;
    }
}