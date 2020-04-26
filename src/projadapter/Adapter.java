package projadapter;

public class Adapter extends Data {
	
	@Override
	public void setData(String data) {
		String divdt[]=data.split("/"); 
		setAno(Integer.parseInt(divdt[0]));
		setMes(Integer.parseInt(divdt[1])); 
		setDia(Integer.parseInt(divdt[2]));
		 
	}
	@Override
	public void setDiaMes(String data) {
		String divdt[] = data.split("/");
		setMes(Integer.parseInt(divdt[1]));
		setDia(Integer.parseInt(divdt[0]));
	}
	@Override
	public void setMesAno(String data) {
		String divdt[] = data.split("/");
		setAno(Integer.parseInt(divdt[1]));
		setMes(Integer.parseInt(divdt[0]));
	}
	@Override
	public void setDiaAno(String data) {
		String divdt[] = data.split("/");
		setAno(Integer.parseInt(divdt[1]));
		setDia(Integer.parseInt(divdt[0]));
	}
	@Override
	public String toString() {
		return "Data [" + ano + " / " + mes + " / " + dia + "]";
	}
}
