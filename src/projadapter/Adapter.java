package projadapter;

public class Adapter implements IData {
	
	Data dt = new Data();
	
	@Override
	public void setData(String data) {
		String divdt[]=data.split("/"); 
		dt.setAno(Integer.parseInt(divdt[0]));
		dt.setMes(Integer.parseInt(divdt[1])); 
		dt.setDia(Integer.parseInt(divdt[2]));
		 
	}
	@Override
	public void setDiaMes(String data) {
		String divdt[] = data.split("/");
		dt.setMes(Integer.parseInt(divdt[1]));
		dt.setDia(Integer.parseInt(divdt[0]));
	}
	@Override
	public void setMesAno(String data) {
		String divdt[] = data.split("/");
		dt.setAno(Integer.parseInt(divdt[1]));
		dt.setMes(Integer.parseInt(divdt[0]));
	}
	@Override
	public void setDiaAno(String data) {
		String divdt[] = data.split("/");
		dt.setAno(Integer.parseInt(divdt[1]));
		dt.setDia(Integer.parseInt(divdt[0]));
	}
	@Override
	public String toString() {
		return "Data [" + dt.ano + " / " + dt.mes + " / " + dt.dia + "]";
	}
}
