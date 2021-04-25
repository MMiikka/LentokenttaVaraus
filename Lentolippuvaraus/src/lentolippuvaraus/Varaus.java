package lentolippuvaraus;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class Varaus{

	private Lentokone lentokone;
	private Maat maa;
	private Asiakas asiakas;
	private String id;
	private Paikka paikka;
	
	public Varaus() {
		
	}
	
	public Varaus(Asiakas asiakas, Paikka paikka, Lentokone lentokone, Maat maa) {
		this.asiakas = asiakas;
		this.paikka = paikka;
		this.lentokone = lentokone;
		this.maa = maa;
		
	}
	
	public void asetaVarauksenID(String id) {
		this.id = id;
	}
	
	public String annaVarauksenID(Asiakas asiakas) {
		return asiakas.annaID();
	}
	
	public List<String> lueVaraus(File f) throws IOException {
		List<String> rivit = new ArrayList<>();
		rivit = Files.readAllLines(f.toPath());
		String[]tieto = new String[rivit.size()];
		for(String s : rivit) {
			tieto = s.split(",");
			System.out.println(tieto[1]);
		}
		
	rivit.add(tieto[1]);

	
			return rivit;
	}
	
	public String toString() {
		
		return annaVarauksenID(asiakas) + "," + asiakas.annaNimi() + "," + this.paikka.annaNumero() 
		+ "," + this.lentokone.toString() + ","+ this.maa.toString();
	}
	
	

	
	
}