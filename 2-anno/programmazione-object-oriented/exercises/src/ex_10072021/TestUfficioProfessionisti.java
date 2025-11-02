package ex_10072021;

import java.util.ArrayList;
import java.util.Random;

public class TestUfficioProfessionisti {
	public static void main(String[] args) {
	ArrayList<Cliente> listaClienti = new ArrayList<Cliente>();
	Random generator = new Random();
	Cliente c1 = new Cliente("CNFGOA96H45G331V");
	Cliente c2 = new Cliente("FRCNKM75B49B011I");
	Cliente c3 = new Cliente("RWRSBF31E05M184Q");
	Cliente c4 = new Cliente("GFNHWB58D69D468G");
	Cliente c5 = new Cliente("MWTKTT27C26Z215T");
	Cliente c6 = new Cliente("BTNNFG83C65B281B");
	Cliente c7 = new Cliente("LWZXTN72H16I652C");
	Cliente c8 = new Cliente("XQVRMZ70C58L403C");
	Cliente c9 = new Cliente("TTHPFD65M61F674F");
	Cliente c10 = new Cliente("HRGRLZ49T06C713N");
	Cliente c11 = new Cliente("FHRBBV57T29I540D");
	Cliente c12 = new Cliente("FNAVPR99S10F511B");
	Cliente c13 = new Cliente("BHVZNL29T63D005B");
	Cliente c14 = new Cliente("SFSSTZ92M18H755H");
	Cliente c15 = new Cliente("FDHLFE74B19F106U");
	Cliente c16 = new Cliente("ZFKPDY68E41E244E");
	Cliente c17 = new Cliente("DZZMNR82C47F843E");
	Cliente c18 = new Cliente("TJFZNQ53E58C934Z");
	Cliente c19 = new Cliente("GIUNZV54S30D514Z");
	Cliente c20 = new Cliente("SFDZGB73H51A491V");
	Cliente c21 = new Cliente("QBNMSV33E55B711Y");
	Cliente c22 = new Cliente("YVGXZT27L03G108R");
	Cliente c23 = new Cliente("QNGFJA76L25G844K");
	Cliente c24 = new Cliente("ZPEKMS45R12G049X");
	Cliente c25 = new Cliente("FZJBWS60T50F844Q");
	Cliente c26 = new Cliente("BSCXGL34D44C509J");
	Cliente c27 = new Cliente("FTRDCL48D23G995L");
	Cliente c28 = new Cliente("XRMSLT78E54B963C");
	Cliente c29 = new Cliente("SNQYTK86B64E807D");
	Cliente c30 = new Cliente("DFXLBL45P10I760G");
	listaClienti.add(c1);
	listaClienti.add(c2);
	listaClienti.add(c3);
	listaClienti.add(c4);
	listaClienti.add(c5);
	listaClienti.add(c6);
	listaClienti.add(c7);
	listaClienti.add(c8);
	listaClienti.add(c9);
	listaClienti.add(c10);
	listaClienti.add(c11);
	listaClienti.add(c12);
	listaClienti.add(c13);
	listaClienti.add(c14);
	listaClienti.add(c15);
	listaClienti.add(c16);
	listaClienti.add(c17);
	listaClienti.add(c18);
	listaClienti.add(c19);
	listaClienti.add(c20);
	listaClienti.add(c21);
	listaClienti.add(c22);
	listaClienti.add(c23);
	listaClienti.add(c24);
	listaClienti.add(c25);
	listaClienti.add(c26);
	listaClienti.add(c27);
	listaClienti.add(c28);
	listaClienti.add(c29);
	listaClienti.add(c30);
	StudioTecnico st = new StudioTecnico();
	TecnicoIscrittoAlbo tia1 = new TecnicoIscrittoAlbo("A1", "Alfonso", "Zappia", "Meccanica");
	TecnicoIscrittoAlbo tia2 = new TecnicoIscrittoAlbo("A2", "Davide", "Amitrano", "Trasporti e Logistica");
	TecnicoIscrittoAlbo tia3 = new TecnicoIscrittoAlbo("A3", "Harry", "Potter", "Elettronica");
	TecnicoNonIscrittoAlbo tnia1 = new TecnicoNonIscrittoAlbo("B1", "Tony", "Stark");
	TecnicoNonIscrittoAlbo tnia2 = new TecnicoNonIscrittoAlbo("B2", "Steve", "Rogers");
	TecnicoNonIscrittoAlbo tnia3 = new TecnicoNonIscrittoAlbo("B3", "Natasha", "Romanoff");
	TecnicoNonIscrittoAlbo tnia4 = new TecnicoNonIscrittoAlbo("B4", "Emma", "Watson");
	TecnicoNonIscrittoAlbo tnia5 = new TecnicoNonIscrittoAlbo("B5", "Robert", "Downey Jr");
	TecnicoNonIscrittoAlbo tnia6 = new TecnicoNonIscrittoAlbo("B6", "Clint", "Eastwood");
	TecnicoNonIscrittoAlbo tnia7 = new TecnicoNonIscrittoAlbo("B7", "Bryan", "Cranston");
	TecnicoNonIscrittoAlbo tnia8 = new TecnicoNonIscrittoAlbo("B8", "Emily", "Blunt");
	TecnicoNonIscrittoAlbo tnia9 = new TecnicoNonIscrittoAlbo("B9", "Bradley", "Cooper");
	TecnicoNonIscrittoAlbo tnia10 = new TecnicoNonIscrittoAlbo("B10", "Tom", "Ellis");
	st.aggiungiProfessionista(tia1);
	st.aggiungiProfessionista(tia2);
	st.aggiungiProfessionista(tia3);
	st.aggiungiProfessionista(tnia1);
	st.aggiungiProfessionista(tnia2);
	st.aggiungiProfessionista(tnia3);
	st.aggiungiProfessionista(tnia4);
	st.aggiungiProfessionista(tnia5);
	st.aggiungiProfessionista(tnia6);
	st.aggiungiProfessionista(tnia7);
	st.aggiungiProfessionista(tnia8);
	st.aggiungiProfessionista(tnia9);
	st.aggiungiProfessionista(tnia10);
	st.effettuaIncontro(tia1, c25);
	System.out.println(tia1.toString());
	System.out.println(c25.toString());
	st.effettuaIncontro(tia1, c26);
	System.out.println(tia1.toString());
	st.effettuaIncontro(tnia10, c10);
	System.out.println(tnia10.toString());
	System.out.println(c10.toString());
	st.ordinaPerIncontri();
	System.out.println(st.tecnicoMaxIncontri());
	tia1.firma(c30);
	System.out.println(c30.toString());
	for(Cliente c : listaClienti) {
		System.out.println(c.toString());
	}
	/*
	int tecnicoACaso = generator.nextInt(12);
	int clienteACaso = generator.nextInt(29);
	Tecnico istanziaTecnico = st.getListaTecnici().get(tecnicoACaso);
	Cliente istanziaCliente = listaClienti.get(clienteACaso);
	for(int i=0;i<=40;i++) {
		st.effettuaIncontro(istanziaTecnico, istanziaCliente);
	}
	for(Cliente c : listaClienti) {
		System.out.println(c.toString());
	}
	*/
	}
}
