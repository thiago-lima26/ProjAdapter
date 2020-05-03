package projadapter;

public class Main {

	public static void main(String[] args) {
		
		IData dt = new Adapter();
        dt.setData("2000/02/27");
        System.out.println(dt);
        
        dt.setDiaAno("28/2018");
        System.out.println(dt);
        
        dt.setDiaMes("29/08");
        System.out.println(dt);
        
        dt.setMesAno("12/2019");
        System.out.println(dt);
        
        Data dt2 = new Data();
        dt2.setData("01/01/1900");
        System.out.println("\n" + dt2);
	}
}