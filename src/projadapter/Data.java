package projadapter;

public class Data{
    
    int dia,mes,ano;
    
    Data(){
        
    }
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if(dia>0 && dia<32 && this.mes>0 && this.mes<13 && this.ano>0 && ((this.mes==1 || this.mes==3 || 
                this.mes==5 || this.mes==7 || this.mes==8 || this.mes==10 || this.mes==12) || ((this.mes==4 || 
                this.mes==6 || this.mes==9 || this.mes==11) && dia<=30) || (this.mes==2 &&(dia<=29 && 
                this.ano%4==0)|| dia<=28)))
            this.dia = dia;
        else
            throw new IllegalArgumentException("Dia Inválido!!!");
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if (mes>=1&&mes<=12)
            this.mes = mes;
        else 
            throw new IllegalArgumentException("Mês Inválido!!!");
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
    	this.ano = ano;
    }

    public void setData(String data) {
        String divdt[]=data.split("/");
        setAno(Integer.parseInt(divdt[2]));
        setMes(Integer.parseInt(divdt[1]));
        setDia(Integer.parseInt(divdt[0]));
    }
    
    @Override
	public String toString() {
		return "Data [" + dia + " / " + mes + " / " + ano + "]";
	}
	
}