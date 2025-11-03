import java.sql.*;
public class progettoAmitranoZappia {
		public static void main(String[] arg){
			progettoAmitranoZappia.esercizio();
		}
		
		public static void esercizio() {
			Connection con = null ;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/centrosportivo","root","pass");
			}
			catch(Exception e){
				System.err.println("Connessione fallita! "); 
	            System.err.println(e.getMessage());
			}
			try {
				String query1 = "INSERT INTO `centrosportivo`.`svolgimento` (`CodiceStruttura`, `CodiceAttività`, `DataPrenotazione`, `OraPrenotazione`, `DurataPrenotazione`) VALUES ('5648', '9012', '2019-01-26', '19:30:00', '02:45:00');";
				String query2 = "SELECT `CodiceStruttura`, `DataPrenotazione`, `OraPrenotazione` FROM `centrosportivo`.`svolgimento` WHERE `CodiceStruttura` = '1023' AND `DataPrenotazione` = '2018-12-05' AND `OraPrenotazione` = '09:45:00';";
				String query3 = "SELECT subtime(120000, cast(sum(addtime(000000, DurataPrenotazione))AS TIME)) AS `TempoTotale` FROM `centrosportivo`.`svolgimento` WHERE `CodiceStruttura` = '1023' AND `DataPrenotazione` = '2018-12-05';";
				String query4 = "SELECT count(*) AS GiorniOccupata FROM centrosportivo.svolgimento WHERE OraPrenotazione = '15:30:00' AND date_format(DataPrenotazione, '%Y-%d') = '2018-05';";
				String query5 = "INSERT INTO `centrosportivo`.`attivitàsportiva` (`CodiceAttività`, `Descrizione`) VALUES ('1258', 'Alpinismo');";
				String query6 = "SELECT CodiceAttività, cast(sum(addtime(000000, DurataPrenotazione))AS TIME) AS `TempoTotale` FROM centrosportivo.svolgimento WHERE date_format(DataPrenotazione, '%Y') = '2018' GROUP BY CodiceAttività;";
				String query7_1 = "INSERT INTO `centrosportivo`.`centro` (`Nome`, `Città`, `CAP`, `Via`, `#NumeroCivico`, `#Fax`, `#Telefono`) VALUES ('Drivers Drive', 'Pagani', '84016', 'Via Filettine', '29', '81915689', '81915689');";
				String query7_2 = "INSERT INTO `centrosportivo`.`locazione` (`NomeCentro`, `CodiceAttività`) VALUES ('Drivers Drive', '7654');";
				String query8 = "INSERT INTO `centrosportivo`.`istruttore` (`CodiceFiscale`, `Nome`, `Cognome`, `Contratto`, `#Telefono`, `AnniEsperienza`, `Documento`, `TipoDocumento`) VALUES ('RSLTRN64A54H431T', 'Rosalia', 'Torino', 'Quinquennale', '3248927139', '6', 'Attestato', 'diploma liceo scientifico');";
				String query9 = "SELECT CodiceStruttura, count(CodiceAttività) AS NumeroAttività FROM centrosportivo.svolgimento WHERE date_format(DataPrenotazione, '%Y') = '2018' GROUP BY CodiceStruttura;";
				String query10 = "SELECT CodiceFiscale, Nome, Cognome FROM centrosportivo.istruttore WHERE DisciplinaSpecializzazione = 'Nuoto';";
				String query11_1 = "DELETE FROM`centrosportivo`.`responsabile` WHERE (`CodiceFiscale` = 'MRNDNT80C06F913O');";
				String query11_2 = "INSERT INTO `centrosportivo`.`responsabile` (`CodiceFiscale`, `Nome`, `Cognome`, `Contratto`, `#Telefono`) VALUES ('TRMDLD46L14Z404B', 'Donald', 'Trump', 'Quadriennale', '6467443100');";
				String query11_3 = "INSERT INTO `centrosportivo`.`gestione` (`NomeCentro`, `CodiceFiscale`) VALUES ('Training Ground', 'TRMDLD46L14Z404B');";
				String query12 = "UPDATE `centrosportivo`.`svolgimento` SET `OraPrenotazione` = '16:30:00' WHERE (`CodiceStruttura` = '1023') and (`CodiceAttività` = '5432');";
				String query13_1 = "INSERT INTO `centrosportivo`.`corso` (`CodiceAttività`, `Periodicità`, `Durata`) VALUES ('1258', '3/settimana', '3 mesi');";
				String query13_2 = "INSERT INTO `centrosportivo`.`assegnazione` (`CodiceFiscale`, `CodiceAttività`) VALUES ('PCCLNS99S27A509Y', '1258');";
				String query14 = "select distinct struttura.CodiceStruttura, Areale, TipologiaCampo, NomeCentro, AttrezzatureSala, 360-count(distinct DataPrenotazione) as GiorniLiberi from centrosportivo.struttura join centrosportivo.svolgimento where DataPrenotazione between '2018-06-15' and '2018-12-05' group by CodiceStruttura, NomeCentro;";
				String query15 = "select distinct struttura.CodiceStruttura, Areale, TipologiaCampo, NomeCentro, AttrezzatureSala, cast(sum(DurataPrenotazione) as TIME) as OreOccupate from centrosportivo.struttura join centrosportivo.svolgimento where DataPrenotazione between '2018-06-15' and '2020-01-09' group by struttura.CodiceStruttura, NomeCentro;";
				Statement pquery = con.createStatement();
				System.out.println("Operazione 1");												//op1
				pquery.executeUpdate(query1);
				System.out.println("Operazione 2");												//op2
				ResultSet result2 = pquery.executeQuery(query2);
				int count=0;
				while (result2.next()){
					String codiceStruttura = result2.getString("CodiceStruttura");
					String dataPrenotazione = result2.getString("DataPrenotazione");
					String oraPrenotazione = result2.getString("OraPrenotazione");
					System.out.println("La struttura non è prenotabile in questa data: ");
					System.out.println(codiceStruttura+" \t "+dataPrenotazione+" \t "+oraPrenotazione+" \t " );
					count++;
				}
				if(count==0) {
					System.out.println("La struttura è prenotabile.");
				}
				System.out.println("Operazione 3");												//op3
				ResultSet result3 = pquery.executeQuery(query3);
				while (result3.next()){
					String tempoTotale = result3.getString("TempoTotale");
					System.out.println("La struttura è libera per "+ tempoTotale + " ore");
				}
				System.out.println("Operazione 4");												//op4
				ResultSet result4 = pquery.executeQuery(query4);
				while (result4.next()){
					int giorniOccupata = result4.getInt("GiorniOccupata");
					int giorniDisponibile =360-giorniOccupata;
					System.out.println("La struttura in quest'orario è libera per "+ giorniDisponibile + " giorni");
				}
				System.out.println("Operazione 5");												//op5
				pquery.executeUpdate(query5);
				System.out.println("Operazione 6");												//op6
				ResultSet result6 = pquery.executeQuery(query6);
				System.out.println("\nCodiceAttività	\tTempoTotale");
				while (result6.next()){
					String CodiceAttività = result6.getString("CodiceAttività");
					String TempoTotale = result6.getString("TempoTotale");
					System.out.println(CodiceAttività+" \t\t\t"+TempoTotale);
				}
				System.out.println("Operazione 7");												//op7
				pquery.executeUpdate(query7_1);
				pquery.executeUpdate(query7_2);
				System.out.println("Operazione 8");												//op8
				pquery.executeUpdate(query8);
				System.out.println("Operazione 9");												//op9
				ResultSet result9 = pquery.executeQuery(query9);
				System.out.println("\nCodiceStruttura\tNumeroAttività");
				while (result9.next()){
					String CodiceStruttura = result9.getString("CodiceStruttura");
					String NumeroAttività = result9.getString("NumeroAttività");
					System.out.println(CodiceStruttura+" \t\t\t"+NumeroAttività);
				}
				System.out.println("Operazione 10");											//op10
				ResultSet result10 = pquery.executeQuery(query10);
				System.out.println("\nCodiceFiscale\t\tNome\t\tCognome");
				while (result10.next()){
					String CodiceFiscale = result10.getString("CodiceFiscale");
					String Nome = result10.getString("Nome");
					String Cognome = result10.getString("Cognome");
					System.out.println(CodiceFiscale+"\t"+Nome+"\t\t"+Cognome);
				}
				System.out.println("Operazione 11");											//op11
				pquery.executeUpdate(query11_1);
				pquery.executeUpdate(query11_2);
				pquery.executeUpdate(query11_3);
				System.out.println("Operazione 12");											//op12
				pquery.executeUpdate(query12);
				System.out.println("Operazione 13");											//op13
				pquery.executeUpdate(query13_1);
				pquery.executeUpdate(query13_2);
				System.out.println("Operazione 14");											//op14
				System.out.println("\nCodiceStruttura\tAreale\t\tTipologiaCampo\tNomeCentro\t\tAttrezzatureSala\tGiorniLiberi");
				ResultSet result14 = pquery.executeQuery(query14);
				while (result14.next()){
					String CodiceStruttura = result14.getString("CodiceStruttura");
					String Areale = result14.getString("Areale");
					String TipologiaCampo = result14.getString("TipologiaCampo");
					String NomeCentro = result14.getString("NomeCentro");
					String AttrezzatureSala = result14.getString("AttrezzatureSala");
					String GiorniLiberi = result14.getString("GiorniLiberi");
					System.out.println(CodiceStruttura+"\t\t"+Areale+"\t\t"+TipologiaCampo+"\t\t"+NomeCentro+"\t\t"+AttrezzatureSala+"\t\t"+GiorniLiberi);
				}
				System.out.println("Operazione 15");											//op15
				System.out.println("\nCodiceStruttura\tAreale\t\tTipologiaCampo\tNomeCentro\t\tAttrezzatureSala\tOreOccupate");
				ResultSet result15 = pquery.executeQuery(query15);
				while (result15.next()){
					String CodiceStruttura = result15.getString("CodiceStruttura");
					String Areale = result15.getString("Areale");
					String TipologiaCampo = result15.getString("TipologiaCampo");
					String NomeCentro = result15.getString("NomeCentro");
					String AttrezzatureSala = result15.getString("AttrezzatureSala");
					String OreOccupate = result15.getString("OreOccupate");
					System.out.println(CodiceStruttura+"\t\t"+Areale+"\t\t"+TipologiaCampo+"\t\t"+NomeCentro+"\t\t"+AttrezzatureSala+"\t\t"+OreOccupate);
				}
				con.close();
			}
			catch (Exception e){
				System.err.println("Query fallita! "); 
	            System.err.println(e.getMessage());
			}
		}
	}


