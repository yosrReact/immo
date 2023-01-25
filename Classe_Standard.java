public class Classe_Standard()
{
    private int Code_Classe;
    private String Type_Bien;
    private int Prix_Maximum;

    public Classe_Standard()
    {
        this.Type_Bien = Type_bien;
        this.Code_Classe = Code_Classe;
        this.Prix_Maximum = Prix_Maximum;
    }

    public int getCode_Classe()
    {
        return Code_Classe;
    }

    public char getType_Bien()
    {
        return Type_Bien;
    }

    public int getPrix_Maximum()
    {
        return Prix_Maximum;
    }

    public int setCode_Classe()
    {
        this.Code_Classe = Code_Classe;
    }

    public String setType_Bien()
    {
        this.Type_Bien = Type_Bien;
    }
    
    public int setPrix_Maximum()
    {
        this.Prix_Maximum = Prix_Maximum;
    }
}