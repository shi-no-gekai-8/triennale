package ex_06072021;

public class TestSerial {

	public static void main(String[] args) {
		Serial breakingBad = new Episode("Breaking Bad", "Questione di Chimica", "Senza Ritorno", "Il primo traffico di droga fallito costringe Walt e Jesse a sbarazzarsi di un paio di cadaveri. Nel frattempo, Skyler sospetta che il marito sia sulla cattiva strada", "Conseguenze Radicali");
		Serial peakyBlinders = new Episode("Peaky Blinders", "Episodio 1", "Episodio 2", "Thomas pesta i piedi ad un boss locale e fa scoppiare una guerra con una famiglia di origine gitana. L'ispettore Campbell, intanto, organizza un raid feroce", "Episodio 3");
		Serial prisonBreak = new Episode("Prison Break", "Fratelli", "Da che parte stai?", "Michael cerca di impossessarsi di un farmaco che lo faccia risultare diabetico e di una grossa vite che gli servirà nel piano di evasione", "Il compagno di cella");
		System.out.println(breakingBad.toString());
		System.out.println(breakingBad.isEqualsEpisode("Una malattia scomoda"));
		System.out.println(peakyBlinders.toString());
		System.out.println(peakyBlinders.isEqualsEpisode("Episodio 1"));
		System.out.println(prisonBreak.toString());
		System.out.println(prisonBreak.isEqualsTitle("Prison Break"));
	}

}
