package lentolippuvaraus;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class Varaus{
/**
 * Varaus-luokassa luodaan varaus, jonka tietoihin kuuluu: Lentokone-olio, maa, asiakas-olio, ID ja paikka.
 */
	private Lentokone lentokone;
	private Maat maa;
	private Asiakas asiakas;
	private String id;
	private Paikka paikka;
	/**
	 * Varauksen oletuskonstruktori
	 */
	public Varaus() {
		
	}
	/**
	 * Varaus-olion konstruktori.
	 * @param asiakas 
	 * @param paikka
	 * @param lentokone
	 * @param maa
	 */
	public Varaus(Asiakas asiakas, Paikka paikka, Lentokone lentokone, Maat maa) {
		this.asiakas = asiakas;
		this.paikka = paikka;
		this.lentokone = lentokone;
		this.maa = maa;
		
	}
	/**
	 * Asettaa varaukselle ID:n
	 * @param id
	 */
	public void asetaVarauksenID(String id) {
		this.id = id;
	}
	/**
	 * Palauttaa tietyn asiakkaan ID:n varauksesta
	 * @param asiakas
	 * @return ID, merkkijonona
	 */
	public String annaVarauksenID(Asiakas asiakas) {
		return asiakas.annaID();
	}
	/**
	 * Lukee varauksen tiedostosta.
	 * @param f, tiedosto, jossa varaus on
	 * @return Listan varauksen tiedoista.
	 * @throws IOException
	 */
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
	/**
	 * Ylikirjoittaa toString() metodin, jolla palautetaan varaus-olion tiedot merkkijonona.
	 */
	public String toString() {
		
		return annaVarauksenID(asiakas) + "," + asiakas.annaNimi() + "," + this.paikka.annaNumero() 
		+ "," + this.lentokone.toString() + ","+ this.maa.toString();
	}
	
	

	
	
}
