package in.appmaster.trader;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import in.appmaster.trader.utils.Constants;


public  class Test {

	public static void main(String[] args) {
		String resp = "";
		
		/*String resp = "SYMBOL,NAME OF COMPANY, SERIES, DATE OF LISTING, PAID UP VALUE, MARKET LOT, ISIN NUMBER, FACE VALUE\r\n" + 
				"20MICRONS,20 Microns Limited,EQ,06-OCT-2008,5,1,INE144J01027,5\r\n" + 
				"21STCENMGM,21st Century Management Services Limited,BE,03-MAY-1995,10,1,INE253B01015,10\r\n" + 
				"3IINFOTECH,3i Infotech Limited,EQ,22-APR-2005,10,1,INE748C01020,10\r\n" + 
				"3MINDIA,3M India Limited,EQ,13-AUG-2004,10,1,INE470A01017,10\r\n" + 
				"5PAISA,5Paisa Capital Limited,BE,16-NOV-2017,10,1,INE618L01018,10\r\n" + 
				"63MOONS,63 moons technologies limited,EQ,20-JUN-2005,2,1,INE111B01023,2\r\n" + 
				"8KMILES,8K Miles Software Services Limited,EQ,29-JAN-2014,5,1,INE650K01021,5\r\n" + 
				"A2ZINFRA,A2Z Infra Engineering Limited,EQ,23-DEC-2010,10,1,INE619I01012,10\r\n" + 
				"AARTIDRUGS,Aarti Drugs Limited,EQ,19-SEP-2003,10,1,INE767A01016,10\r\n" + 
				"AARTIIND,Aarti Industries Limited,EQ,08-FEB-1995,5,1,INE769A01020,5\r\n" + 
				"AARVEEDEN,Aarvee Denims & Exports Limited,EQ,21-NOV-2006,10,1,INE273D01019,10\r\n" + 
				"ABAN,Aban Offshore Limited,EQ,29-MAR-1995,2,1,INE421A01028,2\r\n" + 
				"ABB,ABB India Limited,EQ,08-FEB-1995,2,1,INE117A01022,2\r\n" + 
				"ABBOTINDIA,Abbott India Limited,EQ,08-JAN-2010,10,1,INE358A01014,10\r\n" + 
				"ABCAPITAL,Aditya Birla Capital Limited,EQ,01-SEP-2017,10,1,INE674K01013,10\r\n" + 
				"ABFRL,Aditya Birla Fashion and Retail Limited,EQ,17-JUL-2013,10,1,INE647O01011,10\r\n" + 
				"ABGSHIP,ABG Shipyard Limited,BZ,11-APR-2007,10,1,INE067H01016,10\r\n" + 
				"ABMINTLTD,ABM International Limited,BE,14-JUN-2016,10,1,INE251C01017,10\r\n" + 
				"ACC,ACC Limited,EQ,20-NOV-1996,10,1,INE012A01025,10\r\n" + 
				"ACCELYA,Accelya Kale Solutions Limited,EQ,01-DEC-1999,10,1,INE793A01012,10\r\n" + 
				"ACE,Action Construction Equipment Limited,EQ,26-SEP-2006,2,1,INE731H01025,2\r\n" + 
				"ADANIENT,Adani Enterprises Limited,EQ,04-JUN-1997,1,1,INE423A01024,1\r\n" + 
				"ADANIPORTS,Adani Ports and Special Economic Zone Limited,EQ,27-NOV-2007,2,1,INE742F01042,2\r\n" + 
				"ADANIPOWER,Adani Power Limited,EQ,20-AUG-2009,10,1,INE814H01011,10\r\n" + 
				"ADANITRANS,Adani Transmission Limited,EQ,31-JUL-2015,10,1,INE931S01010,10\r\n" + 
				"ADFFOODS,ADF Foods Limited,EQ,15-SEP-2010,10,1,INE982B01019,10\r\n" + 
				"ADHUNIK,Adhunik Metaliks Limited,EQ,05-APR-2006,10,1,INE400H01019,10\r\n" + 
				"ADHUNIKIND,Adhunik Industries Limited,BE,01-JUL-2016,10,1,INE452L01012,10\r\n" + 
				"ADLABS,Adlabs Entertainment Limited,EQ,06-APR-2015,10,1,INE172N01012,10\r\n" + 
				"ADORWELD,Ador Welding Limited,EQ,10-MAY-1995,10,1,INE045A01017,10\r\n" + 
				"ADSL,Allied Digital Services Limited,EQ,25-JUL-2007,5,1,INE102I01027,5\r\n" + 
				"ADVANIHOTR,Advani Hotels & Resorts (India) Limited,EQ,25-JUN-2007,2,1,INE199C01026,2\r\n" + 
				"ADVENZYMES,Advanced Enzyme Technologies Limited,EQ,01-AUG-2016,2,1,INE837H01020,2\r\n" + 
				"AEGISCHEM,Aegis Logistics Limited,EQ,03-APR-1996,1,1,INE208C01025,1\r\n" + 
				"AFL,Accel Frontline Limited,EQ,30-OCT-2006,10,1,INE020G01017,10\r\n" + 
				"AGARIND,Agarwal Industrial Corporation Limited,BE,26-MAY-2014,10,1,INE204E01012,10\r\n" + 
				"AGCNET,AGC Networks Limited,EQ,22-JUL-2003,10,1,INE676A01019,10\r\n" + 
				"AGLSL,Artemis Global Life Sciences Limited,EQ,20-JUL-2017,2,1,INE517U01013,2\r\n" + 
				"AGRITECH,Agri-Tech (India) Limited,EQ,28-JAN-2014,10,1,INE449G01018,10\r\n" + 
				"AHLEAST,Asian Hotels (East) Limited,BE,11-AUG-2010,10,1,INE926K01017,10\r\n" + 
				"AHLUCONT,Ahluwalia Contracts (India) Limited,EQ,14-DEC-2009,2,1,INE758C01029,2\r\n" + 
				"AHLWEST,Asian Hotels (West) Limited,EQ,05-AUG-2010,10,1,INE915K01010,10\r\n" + 
				"AIAENG,AIA Engineering Limited,EQ,14-DEC-2005,2,1,INE212H01026,2\r\n" + 
				"AICHAMP,AI Champdany Industries Limited,BE,14-FEB-2007,5,1,INE768E01024,5\r\n" + 
				"AIFL,Ashapura Intimates Fashion Limited,EQ,02-DEC-2015,10,1,INE428O01016,10\r\n" + 
				"AJANTPHARM,Ajanta Pharma Limited,EQ,29-MAY-2000,2,1,INE031B01049,2\r\n" + 
				"AJMERA,Ajmera Realty & Infra India Limited,EQ,16-JUN-2009,10,1,INE298G01027,10\r\n" + 
				"AKSHARCHEM,AksharChem India Limited,EQ,28-MAR-2017,10,1,INE542B01011,10\r\n" + 
				"AKSHOPTFBR,Aksh Optifibre Limited,EQ,18-AUG-2000,5,1,INE523B01011,5\r\n" + 
				"AKZOINDIA,Akzo Nobel India Limited,EQ,28-JUN-2001,10,1,INE133A01011,10\r\n" + 
				"ALANKIT,Alankit Limited,EQ,30-JUN-2015,1,1,INE914E01040,1\r\n" + 
				"ALBERTDAVD,Albert David Limited,BE,14-JUN-2016,10,1,INE155C01010,10\r\n" + 
				"ALBK,Allahabad Bank,EQ,29-NOV-2002,10,1,INE428A01015,10\r\n" + 
				"ALCHEM,Alchemist Limited,BE,31-JUL-2007,10,1,INE964B01033,10\r\n" + 
				"ALEMBICLTD,Alembic Limited,EQ,22-SEP-1999,2,1,INE426A01027,2\r\n" + 
				"ALICON,Alicon Castalloy Limited,EQ,29-SEP-2006,5,1,INE062D01024,5\r\n" + 
				"ALKALI,Alkali Metals Limited,EQ,06-NOV-2008,10,1,INE773I01017,10\r\n" + 
				"ALKEM,Alkem Laboratories Limited,EQ,23-DEC-2015,2,1,INE540L01014,2\r\n" + 
				"ALKYLAMINE,Alkyl Amines Chemicals Limited,EQ,26-NOV-2007,5,1,INE150B01021,5\r\n" + 
				"ALLCARGO,Allcargo Logistics Limited,EQ,23-JUN-2006,2,1,INE418H01029,2\r\n" + 
				"ALLSEC,Allsec Technologies Limited,EQ,09-MAY-2005,10,1,INE835G01018,10\r\n" + 
				"ALMONDZ,Almondz Global Securities Limited,EQ,16-JUN-2008,6,1,INE326B01027,6\r\n" + 
				"ALOKTEXT,Alok Industries Limited,EQ,10-APR-1996,10,1,INE270A01011,10\r\n" + 
				"ALPA,Alpa Laboratories Limited,EQ,06-AUG-2007,10,1,INE385I01010,10\r\n" + 
				"ALPHAGEO,Alphageo (India) Limited,EQ,11-MAY-2007,10,1,INE137C01018,10\r\n" + 
				"ALPSINDUS,Alps Industries Limited,BE,24-APR-1996,10,1,INE093B01015,10\r\n" + 
				"AMARAJABAT,Amara Raja Batteries Limited,EQ,05-SEP-2003,1,1,INE885A01032,1\r\n" + 
				"AMBER,Amber Enterprises India Limited,EQ,30-JAN-2018,10,1,INE371P01015,10\r\n" + 
				"AMBIKCO,Ambika Cotton Mills Limited,EQ,29-JAN-2008,10,1,INE540G01014,10\r\n" + 
				"AMBUJACEM,Ambuja Cements Limited,EQ,18-FEB-1998,2,1,INE079A01024,2\r\n" + 
				"AMDIND,AMD Industries Limited,BE,19-MAR-2007,10,1,INE005I01014,10\r\n" + 
				"AMJLAND,Amj Land Holdings Limited,EQ,08-FEB-1995,2,1,INE606A01024,2\r\n" + 
				"AMRUTANJAN,Amrutanjan Health Care Limited,EQ,02-JAN-2015,2,1,INE098F01023,2\r\n" + 
				"AMTEKAUTO,Amtek Auto Limited,BZ,02-MAR-2005,2,1,INE130C01021,2\r\n" + 
				"ANANTRAJ,Anant Raj Limited,EQ,27-SEP-2006,2,1,INE242C01024,2\r\n" + 
				"ANDHRABANK,Andhra Bank,EQ,04-APR-2001,10,1,INE434A01013,10\r\n" + 
				"ANDHRACEMT,Andhra Cements Limited,EQ,08-NOV-2010,10,1,INE666E01012,10\r\n" + 
				"ANDHRSUGAR,The Andhra Sugars Limited,EQ,01-NOV-1995,10,1,INE715B01013,10\r\n" + 
				"ANGIND,ANG Industries Limited,BE,12-FEB-2007,10,1,INE017D01010,10\r\n" + 
				"ANIKINDS,Anik Industries Limited,EQ,21-MAY-2008,10,1,INE087B01017,10\r\n" + 
				"ANSALAPI,Ansal Properties & Infrastructure Limited,EQ,27-JAN-2006,5,1,INE436A01026,5\r\n" + 
				"ANSALHSG,Ansal Housing and Construction Limited,EQ,06-OCT-2006,10,1,INE880B01015,10\r\n" + 
				"ANTGRAPHIC,Antarctica Limited,BE,31-DEC-1997,1,1,INE414B01021,1\r\n" + 
				"APARINDS,Apar Industries Limited,EQ,12-JUL-2004,10,1,INE372A01015,10\r\n" + 
				"APCL,Anjani Portland Cement Limited,EQ,10-APR-2017,10,1,INE071F01012,10\r\n" + 
				"APCOTEXIND,Apcotex Industries Limited,EQ,06-SEP-1995,5,1,INE116A01024,5\r\n" + 
				"APEX,Apex Frozen Foods Limited,EQ,04-SEP-2017,10,1,INE346W01013,10\r\n" + 
				"APLAPOLLO,APL Apollo Tubes Limited,EQ,14-DEC-2011,10,1,INE702C01019,10\r\n" + 
				"APLLTD,Alembic Pharmaceuticals Limited,EQ,20-SEP-2011,2,1,INE901L01018,2\r\n" + 
				"APOLLO,Apollo Micro Systems Limited,EQ,22-JAN-2018,10,1,INE713T01010,10\r\n" + 
				"APOLLOHOSP,Apollo Hospitals Enterprise Limited,EQ,10-JAN-1996,5,1,INE437A01024,5\r\n" + 
				"APOLLOTYRE,Apollo Tyres Limited,EQ,31-MAY-1995,1,1,INE438A01022,1\r\n" + 
				"APOLSINHOT,Apollo Sindoori Hotels Limited,EQ,28-JAN-2015,10,1,INE451F01016,10\r\n" + 
				"APTECHT,Aptech Limited,EQ,27-SEP-2002,10,1,INE266F01018,10\r\n" + 
				"ARCHIDPLY,Archidply Industries Limited,EQ,04-JUL-2008,10,1,INE877I01016,10\r\n" + 
				"ARCHIES,Archies Limited,EQ,02-SEP-1998,2,1,INE731A01020,2\r\n" + 
				"ARCOTECH,Arcotech Limited,EQ,16-APR-2014,2,1,INE574I01035,2\r\n" + 
				"ARENTERP,Rajdarshan Industries Limited,EQ,18-OCT-1995,10,100,INE610C01014,10\r\n" + 
				"ARIES,Aries Agro Limited,EQ,11-JAN-2008,10,1,INE298I01015,10\r\n" + 
				"ARIHANT,Arihant Foundations & Housing Limited,BE,26-DEC-2006,10,1,INE413D01011,10\r\n" + 
				"ARIHANTSUP,Arihant Superstructures Limited,EQ,28-MAR-2017,10,1,INE643K01018,10\r\n" + 
				"ARMANFIN,Arman Financial Services Limited,EQ,14-JUN-2016,10,1,INE109C01017,10\r\n" + 
				"AROGRANITE,Aro Granite Industries Limited,EQ,24-APR-2007,10,1,INE210C01013,10\r\n" + 
				"ARROWGREEN,Arrow Greentech Limited,EQ,21-MAY-2015,10,1,INE570D01018,10\r\n" + 
				"ARROWTEX,Arrow Textiles Limited,EQ,11-MAY-2009,10,1,INE933J01015,10\r\n" + 
				"ARSHIYA,Arshiya Limited,EQ,14-DEC-2009,2,1,INE968D01022,2\r\n" + 
				"ARSSINFRA,ARSS Infrastructure Projects Limited,BE,03-MAR-2010,10,1,INE267I01010,10\r\n" + 
				"ARVIND,Arvind Limited,EQ,08-FEB-1995,10,1,INE034A01011,10\r\n" + 
				"ARVSMART,Arvind SmartSpaces Limited,EQ,26-AUG-2015,10,1,INE034S01021,10\r\n" + 
				"ASAHIINDIA,Asahi India Glass Limited,EQ,18-MAR-1998,1,1,INE439A01020,1\r\n" + 
				"ASAHISONG,Asahi Songwon Colors Limited,EQ,29-AUG-2011,10,1,INE228I01012,10\r\n" + 
				"ASAL,Automotive Stampings and Assemblies Limited,EQ,12-MAR-2002,10,1,INE900C01027,10\r\n" + 
				"ASHAPURMIN,Ashapura Minechem Limited,EQ,20-SEP-1995,2,1,INE348A01023,2\r\n" + 
				"ASHIANA,Ashiana Housing Limited,EQ,29-JUN-2011,2,1,INE365D01021,2\r\n" + 
				"ASHIMASYN,Ashima Limited,EQ,27-JUL-1995,10,1,INE440A01010,10\r\n" + 
				"ASHOKA,Ashoka Buildcon Limited,EQ,14-OCT-2010,5,1,INE442H01029,5\r\n" + 
				"ASHOKLEY,Ashok Leyland Limited,EQ,25-MAY-1995,1,1,INE208A01029,1\r\n" + 
				"ASIANHOTNR,Asian Hotels (North) Limited,BE,07-APR-2010,10,1,INE363A01022,10\r\n" + 
				"ASIANPAINT,Asian Paints Limited,EQ,31-MAY-1995,1,1,INE021A01026,1\r\n" + 
				"ASIANTILES,Asian Granito India Limited,EQ,23-AUG-2007,10,1,INE022I01019,10\r\n" + 
				"ASPINWALL,Aspinwall and Company Limited,EQ,14-JUN-2016,10,1,INE991I01015,10\r\n" + 
				"ASSAMCO,Assam Company India Limited,EQ,29-SEP-2006,1,1,INE442A01024,1\r\n" + 
				"ASTEC,Astec LifeSciences Limited,EQ,25-NOV-2009,10,1,INE563J01010,10\r\n" + 
				"ASTERDM,Aster DM Healthcare Limited,EQ,26-FEB-2018,10,1,INE914M01019,10\r\n" + 
				"ASTRAL,Astral Poly Technik Limited,EQ,20-MAR-2007,1,1,INE006I01046,1\r\n" + 
				"ASTRAMICRO,Astra Microwave Products Limited,EQ,01-NOV-2004,2,1,INE386C01029,2\r\n" + 
				"ASTRAZEN,AstraZeneca Pharma India Limited,EQ,04-MAY-2001,2,1,INE203A01020,2\r\n" + 
				"ASTRON,Astron Paper & Board Mill Limited,EQ,29-DEC-2017,10,1,INE646X01014,10\r\n" + 
				"ATFL,Agro Tech Foods Limited,EQ,06-DEC-2002,10,1,INE209A01019,10\r\n" + 
				"ATLANTA,Atlanta  Limited,EQ,25-SEP-2006,2,1,INE285H01022,2\r\n" + 
				"ATLASCYCLE,Atlas Cycles (Haryana) Limited,BE,23-OCT-1996,5,1,INE446A01025,5\r\n" + 
				"ATUL,Atul Limited,EQ,06-MAY-1998,10,1,INE100A01010,10\r\n" + 
				"ATULAUTO,Atul Auto Limited,EQ,26-JUN-2013,5,1,INE951D01028,5\r\n" + 
				"AUBANK,AU Small Finance Bank Limited,EQ,10-JUL-2017,10,1,INE949L01017,10\r\n" + 
				"AURIONPRO,Aurionpro Solutions Limited,EQ,25-OCT-2005,10,1,INE132H01018,10\r\n" + 
				"AUROPHARMA,Aurobindo Pharma Limited,EQ,19-JUL-2000,1,1,INE406A01037,1\r\n" + 
				"AUSOMENT,Ausom Enterprise Limited,EQ,17-APR-1996,10,1,INE218C01016,10\r\n" + 
				"AUTOAXLES,Automotive Axles Limited,EQ,29-MAY-2003,10,1,INE449A01011,10\r\n" + 
				"AUTOIND,Autoline Industries Limited,EQ,31-JAN-2007,10,1,INE718H01014,10\r\n" + 
				"AUTOLITIND,Autolite (India) Limited,EQ,31-MAY-1995,10,1,INE448A01013,10\r\n" + 
				"AVADHSUGAR,Avadh Sugar & Energy Limited,EQ,28-JUL-2017,10,1,INE349W01017,10\r\n" + 
				"AVANTIFEED,Avanti Feeds Limited,EQ,15-APR-2015,2,1,INE871C01020,2\r\n" + 
				"AVTNPL,AVT Natural Products Limited,EQ,10-JAN-2007,1,1,INE488D01021,1\r\n" + 
				"AXISBANK,Axis Bank Limited,EQ,16-NOV-1998,2,1,INE238A01034,2\r\n" + 
				"AXISCADES,AXISCADES Engineering Technologies Limited,EQ,21-DEC-2000,5,1,INE555B01013,5\r\n" + 
				"AYMSYNTEX,AYM Syntex Limited,EQ,14-AUG-2015,10,1,INE193B01039,10\r\n" + 
				"BAFNAPHARM,Bafna Pharmaceuticals Limited,EQ,12-NOV-2012,10,1,INE878I01014,10\r\n" + 
				"BAGFILMS,B.A.G Films and Media Limited,EQ,17-OCT-2003,2,1,INE116D01028,2\r\n" + 
				"BAJAJ-AUTO,Bajaj Auto Limited,EQ,26-MAY-2008,10,1,INE917I01010,10\r\n" + 
				"BAJAJCORP,Bajaj Corp Limited,EQ,18-AUG-2010,1,1,INE933K01021,1\r\n" + 
				"BAJAJELEC,Bajaj Electricals Limited,EQ,02-NOV-2007,2,1,INE193E01025,2\r\n" + 
				"BAJAJFINSV,Bajaj Finserv Limited,EQ,26-MAY-2008,5,1,INE918I01018,5\r\n" + 
				"BAJAJHIND,Bajaj Hindusthan Sugar Limited,EQ,10-MAY-1995,1,1,INE306A01021,1\r\n" + 
				"BAJAJHLDNG,Bajaj Holdings & Investment Limited,EQ,15-MAR-1995,10,1,INE118A01012,10\r\n" + 
				"BAJFINANCE,Bajaj Finance Limited,EQ,01-APR-2003,2,1,INE296A01024,2\r\n" + 
				"BALAJITELE,Balaji Telefilms Limited,EQ,22-NOV-2000,2,1,INE794B01026,2\r\n" + 
				"BALAMINES,Balaji Amines Limited,EQ,05-APR-2007,2,1,INE050E01027,2\r\n" + 
				"BALAXI,Balaxi Ventures Limited,BE,30-NOV-2015,10,1,INE618N01014,10\r\n" + 
				"BALKRISHNA,Balkrishna Paper Mills Limited,EQ,28-JUL-2015,10,1,INE875R01011,10\r\n" + 
				"BALKRISIND,Balkrishna Industries Limited,EQ,27-JAN-2006,2,1,INE787D01026,2\r\n" + 
				"BALLARPUR,Ballarpur Industries Limited,EQ,31-MAR-2008,2,1,INE294A01037,2\r\n" + 
				"BALMLAWRIE,Balmer Lawrie & Company Limited,EQ,06-JUL-1995,10,1,INE164A01016,10\r\n" + 
				"BALPHARMA,Bal Pharma Limited,EQ,08-MAY-2006,10,1,INE083D01012,10\r\n" + 
				"BALRAMCHIN,Balrampur Chini Mills Limited,EQ,08-FEB-1995,1,1,INE119A01028,1\r\n" + 
				"BANARBEADS,Banaras Beads Limited,EQ,07-JUL-1995,10,100,INE655B01011,10\r\n" + 
				"BANARISUG,Bannari Amman Sugars Limited,EQ,28-MAY-2003,10,1,INE459A01010,10\r\n" + 
				"BANCOINDIA,Banco Products (I) Limited,EQ,22-DEC-2006,2,1,INE213C01025,2\r\n" + 
				"BANDHANBNK,Bandhan Bank Limited,EQ,27-MAR-2018,10,1,INE545U01014,10\r\n" + 
				"BANG,Bang Overseas Limited,EQ,20-FEB-2008,10,1,INE863I01016,10\r\n" + 
				"BANKBARODA,Bank of Baroda,EQ,19-FEB-1997,2,1,INE028A01039,2\r\n" + 
				"BANKINDIA,Bank of India,EQ,30-APR-1997,10,1,INE084A01016,10\r\n" + 
				"BANSWRAS,Banswara Syntex Limited,EQ,11-APR-2007,10,1,INE629D01012,10\r\n" + 
				"BARTRONICS,Bartronics India Limited,EQ,12-JAN-2006,10,1,INE855F01034,10\r\n" + 
				"BASF,BASF India Limited,EQ,17-MAY-1995,10,1,INE373A01013,10\r\n" + 
				"BASML,Bannari Amman Spinning Mills Limited,EQ,14-NOV-2005,10,1,INE186H01014,10\r\n" + 
				"BATAINDIA,Bata India Limited,EQ,18-JUN-2003,5,1,INE176A01028,5\r\n" + 
				"BAYERCROP,Bayer Cropscience Limited,EQ,08-JAN-2010,10,1,INE462A01022,10\r\n" + 
				"BBL,Bharat Bijlee Limited,EQ,21-NOV-2006,10,1,INE464A01028,10\r\n" + 
				"BBTC,Bombay Burmah Trading Corporation Limited,EQ,03-APR-1996,2,1,INE050A01025,2\r\n" + 
				"BDL,Bharat Dynamics Limited,EQ,23-MAR-2018,10,1,INE171Z01018,10\r\n" + 
				"BEARDSELL,Beardsell Limited,EQ,13-JAN-2015,2,1,INE520H01022,2\r\n" + 
				"BEDMUTHA,Bedmutha Industries Limited,EQ,14-OCT-2010,10,1,INE844K01012,10\r\n" + 
				"BEL,Bharat Electronics Limited,EQ,19-JUL-2000,1,1,INE263A01024,1\r\n" + 
				"BEML,BEML Limited,EQ,05-NOV-2003,10,1,INE258A01016,10\r\n" + 
				"BEPL,Bhansali Engineering Polymers Limited,EQ,21-MAR-2005,1,1,INE922A01025,1\r\n" + 
				"BERGEPAINT,Berger Paints (I) Limited,EQ,24-NOV-1999,1,1,INE463A01038,1\r\n" + 
				"BFINVEST,BF Investment Limited,EQ,14-JAN-2011,5,1,INE878K01010,5\r\n" + 
				"BFUTILITIE,BF Utilities Limited,EQ,03-MAY-2007,5,1,INE243D01012,5\r\n" + 
				"BGLOBAL,Bharatiya Global Infomedia Limited,BE,28-JUL-2011,10,1,INE224M01013,10\r\n" + 
				"BGRENERGY,BGR Energy Systems Limited,EQ,03-JAN-2008,10,1,INE661I01014,10\r\n" + 
				"BHAGERIA,Bhageria Industries Limited,EQ,02-MAR-2016,5,1,INE354C01027,5\r\n" + 
				"BHAGYANGR,Bhagyanagar India Limited,EQ,17-MAY-2017,2,1,INE458B01036,2\r\n" + 
				"BHAGYAPROP,Bhagyanagar Properties Limited,EQ,20-JUL-2017,2,1,INE363W01018,2\r\n" + 
				"BHANDARI,Bhandari Hosiery Exports Limited,EQ,30-JAN-2017,1,1,INE474E01029,1\r\n" + 
				"BHARATFIN,Bharat Financial Inclusion Limited,EQ,16-AUG-2010,10,1,INE180K01011,10\r\n" + 
				"BHARATFORG,Bharat Forge Limited,EQ,04-APR-2003,2,1,INE465A01025,2\r\n" + 
				"BHARATGEAR,Bharat Gears Limited,EQ,03-APR-1996,10,1,INE561C01019,10\r\n" + 
				"BHARATIDIL,Bharati Defence and Infrastructure Limited,BZ,30-DEC-2004,10,1,INE673G01013,10\r\n" + 
				"BHARATRAS,Bharat Rasayan Limited,EQ,11-OCT-1995,10,1,INE838B01013,10\r\n" + 
				"BHARATWIRE,Bharat Wire Ropes Limited,EQ,01-APR-2016,10,1,INE316L01019,10\r\n" + 
				"BHARTIARTL,Bharti Airtel Limited,EQ,15-FEB-2002,5,1,INE397D01024,5\r\n" + 
				"BHEL,Bharat Heavy Electricals Limited,EQ,11-NOV-2003,2,1,INE257A01026,2\r\n" + 
				"BHUSANSTL,Bhushan Steel Limited,EQ,21-NOV-2003,2,1,INE824B01021,2\r\n" + 
				"BIGBLOC,Bigbloc Construction Limited,EQ,02-SEP-2016,10,1,INE412U01017,10\r\n" + 
				"BIL,Bhartiya International Limited,EQ,12-APR-2000,10,1,INE828A01016,10\r\n" + 
				"BILENERGY,Bil Energy Systems Limited,EQ,15-FEB-2011,1,1,INE607L01029,1\r\n" + 
				"BILPOWER,Bilpower  Limited,EQ,29-JAN-2007,10,1,INE952D01018,10\r\n" + 
				"BINANIIND,Binani Industries Limited,EQ,27-SEP-2006,10,1,INE071A01013,10\r\n" + 
				"BINDALAGRO,Oswal Chemicals & Fertilizers Limited,EQ,28-AUG-1996,10,1,INE143A01010,10\r\n" + 
				"BIOCON,Biocon Limited,EQ,07-APR-2004,5,1,INE376G01013,5\r\n" + 
				"BIOFILCHEM,Biofil Chemicals & Pharmaceuticals Limited,BE,12-JUN-1996,10,1,INE829A01014,10\r\n" + 
				"BIRLACABLE,Birla Cable Limited,EQ,06-DEC-1995,10,1,INE800A01015,10\r\n" + 
				"BIRLACORPN,Birla Corporation Limited,EQ,12-APR-1995,10,1,INE340A01012,10\r\n" + 
				"BIRLAMONEY,Aditya Birla Money Limited,EQ,07-FEB-2008,1,1,INE865C01022,1\r\n" + 
				"BKMINDST,Bkm Industries Limited,EQ,30-MAR-2015,1,1,INE831Q01016,1\r\n" + 
				"BLBLIMITED,BLB Limited,EQ,31-MAY-2000,1,1,INE791A01024,1\r\n" + 
				"BLISSGVS,Bliss GVS Pharma Limited,EQ,26-JUL-2010,1,1,INE416D01022,1\r\n" + 
				"BLKASHYAP,B. L. Kashyap and Sons Limited,EQ,17-MAR-2006,1,1,INE350H01032,1\r\n" + 
				"BLS,BLS International Services Limited,EQ,14-JUN-2016,1,1,INE153T01027,1\r\n" + 
				"BLUEBLENDS,Blue Blends (I) Limited,EQ,08-FEB-1995,10,1,INE113O01014,10\r\n" + 
				"BLUECHIP,Blue Chip India Limited,BE,12-MAR-1997,2,1,INE657B01025,2\r\n" + 
				"BLUECOAST,Blue Coast Hotels Limited,EQ,16-FEB-2000,10,1,INE472B01011,10\r\n" + 
				"BLUEDART,Blue Dart Express Limited,EQ,12-DEC-2002,10,1,INE233B01017,10\r\n" + 
				"BLUESTARCO,Blue Star Limited,EQ,15-JUN-2000,2,1,INE472A01039,2\r\n" + 
				"BODALCHEM,Bodal Chemicals Limited,EQ,22-AUG-2011,2,1,INE338D01028,2\r\n" + 
				"BOMDYEING,Bombay Dyeing & Mfg Company Limited,EQ,26-APR-1995,2,1,INE032A01023,2\r\n" + 
				"BOSCHLTD,Bosch Limited,EQ,12-MAY-2003,10,1,INE323A01026,10\r\n" + 
				"BPCL,Bharat Petroleum Corporation Limited,EQ,13-SEP-1995,10,1,INE029A01011,10\r\n" + 
				"BPL,BPL Limited,EQ,14-JUN-1995,10,1,INE110A01019,10\r\n" + 
				"BRFL,Bombay Rayon Fashions Limited,EQ,05-DEC-2005,10,1,INE589G01011,10\r\n" + 
				"BRIGADE,Brigade Enterprises Limited,EQ,31-DEC-2007,10,1,INE791I01019,10\r\n" + 
				"BRITANNIA,Britannia Industries Limited,EQ,05-NOV-1998,2,1,INE216A01022,2\r\n" + 
				"BRNL,Bharat Road Network Limited,EQ,18-SEP-2017,10,1,INE727S01012,10\r\n" + 
				"BROOKS,Brooks Laboratories Limited,EQ,05-SEP-2011,10,1,INE650L01011,10\r\n" + 
				"BSE,BSE Limited,EQ,03-FEB-2017,2,1,INE118H01025,2\r\n" + 
				"BSELINFRA,BSEL Infrastructure Realty Limited,EQ,07-FEB-2001,10,1,INE395A01016,10\r\n" + 
				"BSL,BSL Limited,EQ,27-JUL-1995,10,1,INE594B01012,10\r\n" + 
				"BSLIMITED,BS Limited,BZ,27-OCT-2010,1,1,INE043K01029,1\r\n" + 
				"BURNPUR,Burnpur Cement Limited,EQ,03-JAN-2008,10,1,INE817H01014,10\r\n" + 
				"BUTTERFLY,Butterfly Gandhimathi Appliances Limited,EQ,28-APR-2014,10,1,INE295F01017,10\r\n" + 
				"BVCL,Barak Valley Cements Limited,BE,23-NOV-2007,10,1,INE139I01011,10\r\n" + 
				"BYKE,The Byke Hospitality Ltd,EQ,15-APR-2015,10,1,INE319B01014,10\r\n" + 
				"CADILAHC,Cadila Healthcare Limited,EQ,18-APR-2000,1,1,INE010B01027,1\r\n" + 
				"CALSOFT,California Software Company Limited,BZ,28-JUN-2000,10,1,INE526B01014,10\r\n" + 
				"CALSOFT,California Software Company Limited,EQ,28-JUN-2000,10,1,INE526B01014,10\r\n" + 
				"CAMLINFINE,Camlin Fine Sciences Limited,EQ,20-JAN-2015,1,1,INE052I01032,1\r\n" + 
				"CANBK,Canara Bank,EQ,23-DEC-2002,10,1,INE476A01014,10\r\n" + 
				"CANDC,C & C Constructions Limited,EQ,26-FEB-2007,10,1,INE874H01015,10\r\n" + 
				"CANFINHOME,Can Fin Homes Limited,EQ,10-MAY-1995,2,1,INE477A01020,2\r\n" + 
				"CANTABIL,Cantabil Retail India Limited,EQ,12-OCT-2010,10,1,INE068L01016,10\r\n" + 
				"CAPACITE,Capacit'e Infraprojects Limited,EQ,25-SEP-2017,10,1,INE264T01014,10\r\n" + 
				"CAPF,Capital First Limited,EQ,01-FEB-2008,10,1,INE688I01017,10\r\n" + 
				"CAPLIPOINT,Caplin Point Laboratories Limited,EQ,23-JUN-2014,2,1,INE475E01026,2\r\n" + 
				"CAPTRUST,Capital Trust Limited,EQ,16-JAN-2017,10,1,INE707C01018,10\r\n" + 
				"CARBORUNIV,Carborundum Universal Limited,EQ,03-APR-1996,1,1,INE120A01034,1\r\n" + 
				"CAREERP,Career Point Limited,EQ,06-OCT-2010,10,1,INE521J01018,10\r\n" + 
				"CARERATING,CARE Ratings Limited,EQ,26-DEC-2012,10,1,INE752H01013,10\r\n" + 
				"CASTEXTECH,Castex Technologies Limited,EQ,27-JUN-2005,2,1,INE068D01021,2\r\n" + 
				"CASTROLIND,Castrol India Limited,EQ,14-MAR-2014,5,1,INE172A01027,5\r\n" + 
				"CCCL,Consolidated Construction Consortium Limited,EQ,15-OCT-2007,2,1,INE429I01024,2\r\n" + 
				"CCHHL,Country Club Hospitality & Holidays Limited,EQ,03-FEB-2015,2,1,INE652F01027,2\r\n" + 
				"CCL,CCL Products (India) Limited,EQ,07-JUN-2004,2,1,INE421D01022,2\r\n" + 
				"CDSL,Central Depository Services (India) Limited,EQ,30-JUN-2017,10,1,INE736A01011,10\r\n" + 
				"CEATLTD,CEAT Limited,EQ,01-FEB-2008,10,1,INE482A01020,10\r\n" + 
				"CEBBCO,Commercial Engineers & Body Builders Co Limited,EQ,18-OCT-2010,10,1,INE209L01016,10\r\n" + 
				"CELEBRITY,Celebrity Fashions Limited,EQ,12-JAN-2006,10,1,INE185H01016,10\r\n" + 
				"CELESTIAL,Celestial Biolabs Limited,EQ,17-JUL-2007,10,1,INE221I01017,10\r\n" + 
				"CENTENKA,Century Enka Limited,EQ,10-MAY-1995,10,1,INE485A01015,10\r\n" + 
				"CENTEXT,Century Extrusions Limited,EQ,20-JUL-2004,1,1,INE281A01026,1\r\n" + 
				"CENTRALBK,Central Bank of India,EQ,21-AUG-2007,10,1,INE483A01010,10\r\n" + 
				"CENTUM,Centum Electronics Limited,EQ,05-OCT-2007,10,1,INE320B01020,10\r\n" + 
				"CENTURYPLY,Century Plyboards (India) Limited,EQ,23-MAR-2006,1,1,INE348B01021,1\r\n" + 
				"CENTURYTEX,Century Textiles & Industries Limited,EQ,27-JUN-2003,10,1,INE055A01016,10\r\n" + 
				"CERA,Cera Sanitaryware Limited,EQ,02-NOV-2007,5,1,INE739E01017,5\r\n" + 
				"CEREBRAINT,Cerebra Integrated Technologies Limited,EQ,26-JUN-2013,10,1,INE345B01019,10\r\n" + 
				"CESC,CESC Limited,EQ,08-FEB-1995,10,1,INE486A01013,10\r\n" + 
				"CGCL,Capri Global Capital Limited,EQ,29-OCT-2010,2,1,INE180C01026,2\r\n" + 
				"CGPOWER,CG Power and Industrial Solutions Limited,EQ,01-MAR-1995,2,1,INE067A01029,2\r\n" + 
				"CHAMBLFERT,Chambal Fertilizers & Chemicals Limited,EQ,14-JUN-1995,10,1,INE085A01013,10\r\n" + 
				"CHENNPETRO,Chennai Petroleum Corporation Limited,EQ,07-JUN-2000,10,1,INE178A01016,10\r\n" + 
				"CHOLAFIN,Cholamandalam Investment and Finance Company Limited,EQ,15-MAY-1996,10,1,INE121A01016,10\r\n" + 
				"CHROMATIC,Chromatic India Limited,BE,29-MAY-2012,10,1,INE662C01015,10\r\n" + 
				"CIGNITITEC,Cigniti Technologies Limited,BE,13-OCT-2014,10,1,INE675C01017,10\r\n" + 
				"CIMMCO,Cimmco Limited,EQ,08-SEP-2011,10,1,INE184C01028,10\r\n" + 
				"CINELINE,Cineline India Limited,EQ,13-JUN-2012,5,1,INE704H01022,5\r\n" + 
				"CINEVISTA,Cinevista Limited,EQ,02-MAY-2000,2,1,INE039B01026,2\r\n" + 
				"CIPLA,Cipla Limited,EQ,08-FEB-1995,2,1,INE059A01026,2\r\n" + 
				"CLEDUCATE,CL Educate Limited,EQ,31-MAR-2017,10,1,INE201M01011,10\r\n" + 
				"CLNINDIA,Clariant Chemicals (India) Limited,EQ,14-JUN-1995,10,1,INE492A01029,10\r\n" + 
				"CMICABLES,CMI Limited,EQ,29-NOV-2016,10,1,INE981B01011,10\r\n" + 
				"CNOVAPETRO,CIL Nova Petrochemicals Limited,EQ,01-JAN-2014,10,1,INE672K01025,10\r\n" + 
				"COALINDIA,Coal India Limited,EQ,04-NOV-2010,10,1,INE522F01014,10\r\n" + 
				"COCHINSHIP,Cochin Shipyard Limited,EQ,11-AUG-2017,10,1,INE704P01017,10\r\n" + 
				"COFFEEDAY,Coffee Day Enterprises Limited,EQ,02-NOV-2015,10,1,INE335K01011,10\r\n" + 
				"COLPAL,Colgate Palmolive (India) Limited,EQ,17-DEC-2007,1,1,INE259A01022,1\r\n" + 
				"COMPINFO,Compuage Infocom Limited,EQ,07-JUL-2016,2,1,INE070C01037,2\r\n" + 
				"COMPUSOFT,Compucom Software Limited,EQ,02-MAR-2012,2,1,INE453B01029,2\r\n" + 
				"CONCOR,Container Corporation of India Limited,EQ,07-MAY-1997,10,1,INE111A01017,10\r\n" + 
				"CONSOFINVT,Consolidated Finvest & Holdings Limited,EQ,29-MAR-2005,10,1,INE025A01027,10\r\n" + 
				"CONTROLPR,Control Print Limited,EQ,24-JUN-2016,10,1,INE663B01015,10\r\n" + 
				"CORALFINAC,Coral India Finance & Housing Limited,EQ,25-MAR-1996,2,100,INE558D01021,2\r\n" + 
				"CORDSCABLE,Cords Cable Industries Limited,EQ,13-FEB-2008,10,1,INE792I01017,10\r\n" + 
				"COROMANDEL,Coromandel International Limited,EQ,31-MAY-1995,1,1,INE169A01031,1\r\n" + 
				"CORPBANK,Corporation Bank,EQ,01-DEC-1997,2,1,INE112A01023,2\r\n" + 
				"COSMOFILMS,Cosmo Films Limited,EQ,25-MAY-1995,10,1,INE757A01017,10\r\n" + 
				"COUNCODOS,Country Condo's Limited,EQ,22-JAN-2009,1,1,INE695B01025,1\r\n" + 
				"COX&KINGS,Cox & Kings Limited,EQ,11-DEC-2009,5,1,INE008I01026,5\r\n" + 
				"CREATIVEYE,Creative Eye Limited,EQ,20-DEC-2000,5,1,INE230B01021,5\r\n" + 
				"CREST,Crest Ventures Limited,EQ,27-DEC-2006,10,1,INE559D01011,10\r\n" + 
				"CRISIL,CRISIL Limited,EQ,28-JUN-1995,1,1,INE007A01025,1\r\n" + 
				"CROMPTON,Crompton Greaves Consumer Electricals Limited,EQ,13-MAY-2016,2,1,INE299U01018,2\r\n" + 
				"CTE,Cambridge Technology Enterprises Limited,EQ,07-FEB-2007,10,1,INE627H01017,10\r\n" + 
				"CUB,City Union Bank Limited,EQ,25-AUG-1998,1,1,INE491A01021,1\r\n" + 
				"CUBEXTUB,Cubex Tubings Limited,BE,24-APR-1996,10,1,INE144D01012,10\r\n" + 
				"CUMMINSIND,Cummins India Limited,EQ,29-MAR-1995,2,1,INE298A01020,2\r\n" + 
				"CUPID,Cupid Limited,EQ,16-SEP-2016,10,1,INE509F01011,10\r\n" + 
				"CURATECH,Cura Technologies Limited,BE,30-MAY-2000,10,1,INE117B01012,10\r\n" + 
				"CYBERMEDIA,Cyber Media (India) Limited,BE,10-JUN-2005,10,1,INE278G01037,10\r\n" + 
				"CYBERTECH,Cybertech Systems And Software Limited,EQ,27-JAN-1999,10,1,INE214A01019,10\r\n" + 
				"CYIENT,Cyient Limited,EQ,30-SEP-1998,5,1,INE136B01020,5\r\n" + 
				"DAAWAT,LT Foods Limited,EQ,18-DEC-2006,1,1,INE818H01020,1\r\n" + 
				"DABUR,Dabur India Limited,EQ,28-APR-1999,1,1,INE016A01026,1\r\n" + 
				"DALMIABHA,Dalmia Bharat Limited,EQ,27-JAN-2011,2,1,INE439L01019,2\r\n" + 
				"DALMIASUG,Dalmia Bharat Sugar and Industries Limited,EQ,17-JAN-1996,2,1,INE495A01022,2\r\n" + 
				"DAMODARIND,Damodar Industries Limited,EQ,04-JUL-2016,10,1,INE497D01014,10\r\n" + 
				"DATAMATICS,Datamatics Global Services Limited,EQ,07-MAY-2004,5,1,INE365B01017,5\r\n" + 
				"DBCORP,D.B.Corp Limited,EQ,06-JAN-2010,10,1,INE950I01011,10\r\n" + 
				"DBL,Dilip Buildcon Limited,EQ,11-AUG-2016,10,1,INE917M01012,10\r\n" + 
				"DBREALTY,D B Realty Limited,EQ,24-FEB-2010,10,1,INE879I01012,10\r\n" + 
				"DBSTOCKBRO,DB (International) Stock Brokers Limited,EQ,29-FEB-2012,2,1,INE921B01025,2\r\n" + 
				"DCAL,Dishman Carbogen Amcis Limited,EQ,21-SEP-2017,2,1,INE385W01011,2\r\n" + 
				"DCBBANK,DCB Bank Limited,EQ,27-OCT-2006,10,1,INE503A01015,10\r\n" + 
				"DCM,DCM  Limited,EQ,29-MAR-1995,10,1,INE498A01018,10\r\n" + 
				"DCMFINSERV,DCM Financial Services Limited,BE,21-MAY-1997,10,1,INE891B01012,10\r\n" + 
				"DCMSHRIRAM,DCM Shriram Limited,EQ,12-APR-1995,2,1,INE499A01024,2\r\n" + 
				"DCW,DCW Limited,EQ,25-MAY-1995,2,1,INE500A01029,2\r\n" + 
				"DECCANCE,Deccan Cements Limited,EQ,02-AUG-2007,5,1,INE583C01021,5\r\n" + 
				"DEEPAKFERT,Deepak Fertilizers and Petrochemicals Corporation Limited,EQ,17-JAN-2003,10,1,INE501A01019,10\r\n" + 
				"DEEPAKNTR,Deepak Nitrite Limited,EQ,29-SEP-2010,2,1,INE288B01029,2\r\n" + 
				"DEEPIND,Deep Industries Limited,EQ,09-MAR-2010,10,1,INE677H01012,10\r\n" + 
				"DELTACORP,Delta Corp Limited,EQ,02-NOV-2007,1,1,INE124G01033,1\r\n" + 
				"DELTAMAGNT,Delta Magnets Limited,BE,18-OCT-1995,10,1,INE393A01011,10\r\n" + 
				"DEN,Den Networks Limited,EQ,24-NOV-2009,10,1,INE947J01015,10\r\n" + 
				"DENABANK,Dena Bank,EQ,15-JAN-1997,10,1,INE077A01010,10\r\n" + 
				"DENORA,De Nora India Limited,BE,07-AUG-1997,10,1,INE244A01016,10\r\n" + 
				"DFMFOODS,DFM Foods Limited,EQ,29-DEC-2016,10,1,INE456C01012,10\r\n" + 
				"DHAMPURSUG,Dhampur Sugar Mills Limited,EQ,29-MAR-1995,10,1,INE041A01016,10\r\n" + 
				"DHANBANK,Dhanlaxmi Bank Limited,EQ,01-APR-2004,10,1,INE680A01011,10\r\n" + 
				"DHANUKA,Dhanuka Agritech Limited,EQ,29-JUN-2011,2,1,INE435G01025,2\r\n" + 
				"DHARSUGAR,Dharani Sugars & Chemicals Limited,EQ,22-MAY-1996,10,1,INE988C01014,10\r\n" + 
				"DHFL,Dewan Housing Finance Corporation Limited,EQ,01-OCT-2002,10,1,INE202B01012,10\r\n" + 
				"DHUNINV,Dhunseri Investments Limited,EQ,18-MAR-2011,10,1,INE320L01011,10\r\n" + 
				"DIAMONDYD,Prataap Snacks Limited,EQ,05-OCT-2017,5,1,INE393P01035,5\r\n" + 
				"DIAPOWER,Diamond Power Infra Ltd,EQ,29-SEP-2010,10,1,INE989C01012,10\r\n" + 
				"DICIND,DIC India Limited,EQ,30-AUG-1995,10,1,INE303A01010,10\r\n" + 
				"DIGJAMLTD,Digjam Limited,EQ,13-JUL-2016,10,1,INE731U01010,10\r\n" + 
				"DISHTV,Dish TV India Limited,EQ,18-APR-2007,1,1,INE836F01026,1\r\n" + 
				"DIVISLAB,Divi's Laboratories Limited,EQ,12-MAR-2003,2,1,INE361B01024,2\r\n" + 
				"DIXON,Dixon Technologies (India) Limited,EQ,18-SEP-2017,10,1,INE935N01012,10\r\n" + 
				"DLF,DLF Limited,EQ,05-JUL-2007,2,1,INE271C01023,2\r\n" + 
				"DLINKINDIA,D-Link (India) Limited,EQ,18-DEC-2009,2,1,INE250K01012,2\r\n" + 
				"DMART,Avenue Supermarts Limited,EQ,21-MAR-2017,10,1,INE192R01011,10\r\n" + 
				"DNAMEDIA,Diligent Media Corporation Limited,EQ,11-DEC-2017,1,1,INE016M01021,1\r\n" + 
				"DOLLAR,Dollar Industries Limited,EQ,21-APR-2017,2,1,INE325C01035,2\r\n" + 
				"DOLPHINOFF,Dolphin Offshore Enterprises (India) Limited,EQ,06-OCT-2006,10,1,INE920A01011,10\r\n" + 
				"DONEAR,Donear Industries Limited,EQ,20-DEC-2006,2,1,INE668D01028,2\r\n" + 
				"DPL,Dhunseri Petrochem Limited,EQ,11-JAN-2008,10,1,INE477B01010,10\r\n" + 
				"DPSCLTD,DPSC Limited,EQ,21-APR-2008,1,1,INE360C01024,1\r\n" + 
				"DQE,DQ Entertainment (International) Limited,EQ,20-JUN-2011,10,1,INE656K01010,10\r\n" + 
				"DREDGECORP,Dredging Corporation of India Limited,EQ,15-JAN-2004,10,1,INE506A01018,10\r\n" + 
				"DRREDDY,Dr. Reddy's Laboratories Limited,EQ,30-MAY-2003,5,1,INE089A01023,5\r\n" + 
				"DSSL,Dynacons Systems & Solutions Limited,EQ,01-DEC-2011,10,1,INE417B01040,10\r\n" + 
				"DTIL,Dhunseri Tea & Industries Limited,EQ,20-JAN-2015,10,1,INE341R01014,10\r\n" + 
				"DUCON,Ducon Infratechnologies Limited,EQ,09-OCT-2012,1,1,INE741L01018,1\r\n" + 
				"DWARKESH,Dwarikesh Sugar Industries Limited,EQ,31-DEC-2004,1,1,INE366A01041,1\r\n" + 
				"DYNAMATECH,Dynamatic Technologies Limited,EQ,14-SEP-2006,10,1,INE221B01012,10\r\n" + 
				"DYNPRO,Dynemic Products Limited,EQ,19-JUL-2017,10,1,INE256H01015,10\r\n" + 
				"EASTSILK,Eastern Silk Industries Limited,EQ,03-JUL-1996,2,1,INE962C01027,2\r\n" + 
				"EASUNREYRL,Easun Reyrolle Limited,EQ,23-JUL-1997,2,1,INE268C01029,2\r\n" + 
				"ECEIND,ECE Industries Limited,EQ,24-SEP-2007,10,1,INE588B01014,10\r\n" + 
				"ECLERX,eClerx Services Limited,EQ,31-DEC-2007,10,1,INE738I01010,10\r\n" + 
				"EDELWEISS,Edelweiss Financial Services Limited,EQ,12-DEC-2007,1,1,INE532F01054,1\r\n" + 
				"EDL,Empee Distilleries Limited,BE,26-NOV-2007,10,1,INE180G01019,10\r\n" + 
				"EDUCOMP,Educomp Solutions Limited,BZ,13-JAN-2006,2,1,INE216H01027,2\r\n" + 
				"EICHERMOT,Eicher Motors Limited,EQ,07-SEP-2004,10,1,INE066A01013,10\r\n" + 
				"EIDPARRY,EID Parry India Limited,EQ,10-MAY-1995,1,1,INE126A01031,1\r\n" + 
				"EIHAHOTELS,EIH Associated Hotels Limited,EQ,08-APR-2008,10,1,INE276C01014,10\r\n" + 
				"EIHOTEL,EIH Limited,EQ,08-FEB-1995,2,1,INE230A01023,2\r\n" + 
				"EIMCOELECO,Eimco Elecon (India) Limited,EQ,17-APR-1996,10,1,INE158B01016,10\r\n" + 
				"EKC,Everest Kanto Cylinder Limited,EQ,15-DEC-2005,2,1,INE184H01027,2\r\n" + 
				"ELAND,E-Land Apparel Limited,EQ,09-MAR-2007,10,1,INE311H01018,10\r\n" + 
				"ELECON,Elecon Engineering Company Limited,EQ,29-SEP-2006,2,1,INE205B01023,2\r\n" + 
				"ELECTCAST,Electrosteel Castings Limited,EQ,20-JUN-2003,1,1,INE086A01029,1\r\n" + 
				"ELECTHERM,Electrotherm (India) Limited,EQ,20-AUG-2007,10,1,INE822G01016,10\r\n" + 
				"ELGIEQUIP,Elgi Equipments Limited,EQ,22-NOV-1995,1,1,INE285A01027,1\r\n" + 
				"ELGIRUBCO,Elgi Rubber Company Limited,EQ,10-AUG-2011,1,1,INE819L01012,1\r\n" + 
				"EMAMIINFRA,Emami Infrastructure Limited,EQ,28-JUL-2010,2,1,INE778K01012,2\r\n" + 
				"EMAMILTD,Emami Limited,EQ,03-AUG-2006,1,1,INE548C01032,1\r\n" + 
				"EMCO,Emco Limited,EQ,15-DEC-2005,2,1,INE078A01026,2\r\n" + 
				"EMKAY,Emkay Global Financial Services Limited,EQ,28-APR-2006,10,1,INE296H01011,10\r\n" + 
				"EMMBI,Emmbi Industries Limited,EQ,24-FEB-2010,10,1,INE753K01015,10\r\n" + 
				"ENDURANCE,Endurance Technologies Limited,EQ,19-OCT-2016,10,1,INE913H01037,10\r\n" + 
				"ENERGYDEV,Energy Development Company Limited,EQ,02-NOV-2007,10,1,INE306C01019,10\r\n" + 
				"ENGINERSIN,Engineers India Limited,EQ,20-AUG-1997,5,1,INE510A01028,5\r\n" + 
				"ENIL,Entertainment Network (India) Limited,EQ,15-FEB-2006,10,1,INE265F01028,10\r\n" + 
				"EON,Eon Electric Limited,EQ,07-JUN-2012,5,1,INE076H01025,5\r\n" + 
				"EQUITAS,Equitas Holdings Limited,EQ,21-APR-2016,10,1,INE988K01017,10\r\n" + 
				"EQUITAS,Equitas Holdings Limited,IL,21-APR-2016,10,1,INE988K01017,10\r\n" + 
				"ERIS,Eris Lifesciences Limited,EQ,29-JUN-2017,1,1,INE406M01024,1\r\n" + 
				"EROSMEDIA,Eros International Media Limited,EQ,06-OCT-2010,10,1,INE416L01017,10\r\n" + 
				"ESABINDIA,Esab India Limited,EQ,01-NOV-1995,10,1,INE284A01012,10\r\n" + 
				"ESCORTS,Escorts Limited,EQ,01-MAR-1995,10,1,INE042A01014,10\r\n" + 
				"ESL,Electrosteel Steels Limited,EQ,08-OCT-2010,10,1,INE481K01013,10\r\n" + 
				"ESSARSHPNG,Essar Shipping Limited,EQ,15-NOV-2011,10,1,INE122M01019,10\r\n" + 
				"ESSDEE,Ess Dee Aluminium Limited,BE,28-DEC-2006,10,1,INE825H01017,10\r\n" + 
				"ESSELPACK,Essel Propack Limited,EQ,11-FEB-2002,2,1,INE255A01020,2\r\n" + 
				"ESTER,Ester Industries Limited,EQ,20-JUN-2011,5,1,INE778B01029,5\r\n" + 
				"EUROCERA,Euro Ceramics Limited,EQ,09-MAR-2007,10,1,INE649H01011,10\r\n" + 
				"EUROMULTI,Euro Multivision Limited,EQ,15-OCT-2009,10,1,INE063J01011,10\r\n" + 
				"EUROTEXIND,Eurotex Industries and Exports Limited,EQ,31-JAN-1996,10,1,INE022C01012,10\r\n" + 
				"EVEREADY,Eveready Industries India Limited,EQ,27-APR-2005,5,1,INE128A01029,5\r\n" + 
				"EVERESTIND,Everest Industries Limited,EQ,29-MAR-1995,10,1,INE295A01018,10\r\n" + 
				"EXCEL,Excel Realty N Infra Limited,EQ,03-AUG-2009,10,1,INE688J01015,10\r\n" + 
				"EXCELCROP,Excel Crop Care Limited,EQ,16-JUN-2004,5,1,INE223G01017,5\r\n" + 
				"EXCELINDUS,Excel Industries Limited,EQ,16-JUN-2004,5,1,INE369A01029,5\r\n" + 
				"EXIDEIND,Exide Industries Limited,EQ,17-JUN-2003,1,1,INE302A01020,1\r\n" + 
				"FACT,Fertilizers and Chemicals Travancore Limited,EQ,12-APR-1995,10,1,INE188A01015,10\r\n" + 
				"FAIRCHEM,Fairchem Speciality Limited,EQ,08-MAY-2015,10,1,INE959A01019,10\r\n" + 
				"FCL,Fineotex Chemical Limited,EQ,15-JAN-2015,2,1,INE045J01026,2\r\n" + 
				"FCONSUMER,Future Consumer Limited,EQ,04-JUL-2013,6,1,INE220J01025,6\r\n" + 
				"FCSSOFT,FCS Software Solutions Limited,BE,21-SEP-2005,1,1,INE512B01022,1\r\n" + 
				"FDC,FDC Limited,EQ,07-AUG-1997,1,1,INE258B01022,1\r\n" + 
				"FEDDERELEC,Fedders Electric and Engineering Limited,EQ,15-SEP-2005,10,1,INE249C01011,10\r\n" + 
				"FEDERALBNK,The Federal Bank  Limited,EQ,08-FEB-1995,2,1,INE171A01029,2\r\n" + 
				"FEL,Future Enterprises Limited,EQ,05-NOV-2001,2,1,INE623B01027,2\r\n" + 
				"FELDVR,Future Enterprises Limited,EQ,13-FEB-2009,2,1,IN9623B01058,2\r\n" + 
				"FIEMIND,Fiem Industries Limited,EQ,19-OCT-2006,10,1,INE737H01014,10\r\n" + 
				"FILATEX,Filatex India Limited,EQ,29-AUG-2011,10,1,INE816B01019,10\r\n" + 
				"FINCABLES,Finolex Cables Limited,EQ,15-FEB-1995,2,1,INE235A01022,2\r\n" + 
				"FINPIPE,Finolex Industries Limited,EQ,08-FEB-1995,10,1,INE183A01016,10\r\n" + 
				"FIRSTWIN,First Winner Industries Limited,BE,08-JUL-2008,10,1,INE315J01015,10\r\n" + 
				"FLEXITUFF,Flexituff International Limited,EQ,19-OCT-2011,10,1,INE060J01017,10\r\n" + 
				"FLFL,Future Lifestyle Fashions Limited,EQ,01-OCT-2013,2,1,INE452O01016,2\r\n" + 
				"FMGOETZE,Federal-Mogul Goetze (India) Limited.,EQ,08-FEB-1995,10,1,INE529A01010,10\r\n" + 
				"FMNL,Future Market Networks Limited,EQ,31-DEC-2010,10,1,INE360L01017,10\r\n" + 
				"FORTIS,Fortis Healthcare Limited,EQ,09-MAY-2007,10,1,INE061F01013,10\r\n" + 
				"FORTUNEFIN,Fortune Financial Services (India) Limited,EQ,02-AUG-2017,10,1,INE924D01017,10\r\n" + 
				"FOSECOIND,Foseco India Limited,EQ,05-MAY-2003,10,1,INE519A01011,10\r\n" + 
				"FRETAIL,Future Retail Limited,EQ,29-AUG-2016,2,1,INE752P01024,2\r\n" + 
				"FSC,Future Supply Chain Solutions Limited,EQ,18-DEC-2017,10,1,INE935Q01015,10\r\n" + 
				"FSL,Firstsource Solutions Limited,EQ,22-FEB-2007,10,1,INE684F01012,10\r\n" + 
				"GABRIEL,Gabriel India Limited,EQ,20-APR-2005,1,1,INE524A01029,1\r\n" + 
				"GAEL,Gujarat Ambuja Exports Limited,EQ,11-OCT-2000,2,1,INE036B01022,2\r\n" + 
				"GAIL,GAIL (India) Limited,EQ,02-APR-1997,10,1,INE129A01019,10\r\n" + 
				"GAL,Gyscoal Alloys Limited,BE,27-OCT-2010,1,1,INE482J01021,1\r\n" + 
				"GALAXYSURF,Galaxy Surfactants Limited,EQ,08-FEB-2018,10,1,INE600K01018,10\r\n" + 
				"GALLANTT,Gallantt Metal Limited,BE,04-APR-2006,10,1,INE297H01019,10\r\n" + 
				"GALLISPAT,Gallantt Ispat Limited,EQ,11-OCT-2010,10,1,INE528K01011,10\r\n" + 
				"GAMMNINFRA,Gammon Infrastructure Projects Limited,EQ,03-APR-2008,2,1,INE181G01025,2\r\n" + 
				"GANDHITUBE,Gandhi Special Tubes Limited,EQ,31-JAN-2007,5,1,INE524B01027,5\r\n" + 
				"GANECOS,Ganesha Ecosphere Limited,EQ,09-MAR-2015,10,1,INE845D01014,10\r\n" + 
				"GANESHHOUC,Ganesh Housing Corporation Limited,EQ,02-MAR-2007,10,1,INE460C01014,10\r\n" + 
				"GANGESSECU,Ganges Securities Limited,EQ,28-JUL-2017,10,1,INE335W01016,10\r\n" + 
				"GARDENSILK,Garden Silk Mills Limited,EQ,01-APR-2003,10,1,INE526A01016,10\r\n" + 
				"GARWALLROP,Garware  Wall Ropes Limited,EQ,03-APR-2007,10,1,INE276A01018,10\r\n" + 
				"GATI,GATI Limited,EQ,10-OCT-2006,2,1,INE152B01027,2\r\n" + 
				"GAYAPROJ,Gayatri Projects Limited,EQ,22-AUG-2011,2,1,INE336H01023,2\r\n" + 
				"GDL,Gateway Distriparks Limited,EQ,31-MAR-2005,10,1,INE852F01015,10\r\n" + 
				"GEECEE,GeeCee Ventures Limited,EQ,04-OCT-2006,10,1,INE916G01016,10\r\n" + 
				"GEMINI,Gemini Communication Limited,BE,18-JAN-2007,1,1,INE878C01033,1\r\n" + 
				"GENESYS,Genesys International Corporation Limited,EQ,23-JAN-2003,5,1,INE727B01026,5\r\n" + 
				"GENUSPAPER,Genus Paper & Boards Limited,EQ,16-FEB-2015,1,1,INE949P01018,1\r\n" + 
				"GENUSPOWER,Genus Power Infrastructures Limited,EQ,08-JUL-2005,1,1,INE955D01029,1\r\n" + 
				"GEOJITFSL,Geojit Financial Services Limited,EQ,01-JUL-2005,1,1,INE007B01023,1\r\n" + 
				"GEPIL,GE Power India Limited,EQ,19-APR-2000,10,1,INE878A01011,10\r\n" + 
				"GESHIP,The Great Eastern Shipping Company Limited,EQ,27-NOV-2006,10,1,INE017A01032,10\r\n" + 
				"GET&D,GE T&D India Limited,EQ,30-JUN-2008,2,1,INE200A01026,2\r\n" + 
				"GHCL,GHCL Limited,EQ,31-JUL-2003,10,1,INE539A01019,10\r\n" + 
				"GICHSGFIN,GIC Housing Finance Limited,EQ,08-MAY-1996,10,1,INE289B01019,10\r\n" + 
				"GICRE,General Insurance Corporation of India,EQ,25-OCT-2017,5,1,INE481Y01014,5\r\n" + 
				"GILLANDERS,Gillanders Arbuthnot & Company Limited,EQ,14-DEC-2009,10,1,INE047B01011,10\r\n" + 
				"GILLETTE,Gillette India Limited,EQ,30-JUL-2003,10,1,INE322A01010,10\r\n" + 
				"GINNIFILA,Ginni Filaments Limited,EQ,10-MAY-1995,10,1,INE424C01010,10\r\n" + 
				"GIPCL,Gujarat Industries Power Company Limited,EQ,08-FEB-1995,10,1,INE162A01010,10\r\n" + 
				"GISOLUTION,GI Engineering Solutions Limited,EQ,30-JAN-2009,10,1,INE065J01016,10\r\n" + 
				"GITANJALI,Gitanjali Gems Limited,EQ,10-MAR-2006,10,1,INE346H01014,10\r\n" + 
				"GKWLIMITED,GKW Limited,EQ,20-JUL-2009,10,1,INE528A01020,10\r\n" + 
				"GLAXO,GlaxoSmithKline Pharmaceuticals Limited,EQ,15-DEC-2000,10,1,INE159A01016,10\r\n" + 
				"GLENMARK,Glenmark Pharmaceuticals Limited,EQ,07-FEB-2000,1,1,INE935A01035,1\r\n" + 
				"GLOBALVECT,Global Vectra Helicorp Limited,EQ,27-OCT-2006,10,1,INE792H01019,10\r\n" + 
				"GLOBOFFS,Global Offshore Services Limited,EQ,03-MAY-2007,10,1,INE446C01013,10\r\n" + 
				"GLOBUSSPR,Globus Spirits Limited,EQ,23-SEP-2009,10,1,INE615I01010,10\r\n" + 
				"GMBREW,GM Breweries Limited,EQ,23-AUG-1995,10,1,INE075D01018,10\r\n" + 
				"GMDCLTD,Gujarat Mineral Development Corporation Limited,EQ,17-DEC-1997,2,1,INE131A01031,2\r\n" + 
				"GMMPFAUDLR,GMM Pfaudler Limited,EQ,05-MAR-2018,2,1,INE541A01023,2\r\n" + 
				"GMRINFRA,GMR Infrastructure Limited,EQ,21-AUG-2006,1,1,INE776C01039,1\r\n" + 
				"GNA,GNA Axles Limited,EQ,26-SEP-2016,10,1,INE934S01014,10\r\n" + 
				"GNFC,Gujarat Narmada Valley Fertilizers and Chemicals Limited,EQ,17-MAY-1995,10,1,INE113A01013,10\r\n" + 
				"GOACARBON,Goa Carbon Limited,EQ,05-JUN-2007,10,1,INE426D01013,10\r\n" + 
				"GOCLCORP,GOCL Corporation Limited,EQ,26-JUN-2014,2,1,INE077F01035,2\r\n" + 
				"GODFRYPHLP,Godfrey Phillips India Limited,EQ,24-JUL-1996,2,1,INE260B01028,2\r\n" + 
				"GODREJAGRO,Godrej Agrovet Limited,EQ,16-OCT-2017,10,1,INE850D01014,10\r\n" + 
				"GODREJCP,Godrej Consumer Products Limited,EQ,20-JUN-2001,1,1,INE102D01028,1\r\n" + 
				"GODREJIND,Godrej Industries Limited,EQ,25-FEB-2003,1,1,INE233A01035,1\r\n" + 
				"GODREJPROP,Godrej Properties Limited,EQ,05-JAN-2010,5,1,INE484J01027,5\r\n" + 
				"GOENKA,Goenka Diamond and Jewels Limited,BZ,16-APR-2010,1,1,INE516K01024,1\r\n" + 
				"GOKEX,Gokaldas Exports Limited,EQ,27-APR-2005,5,1,INE887G01027,5\r\n" + 
				"GOKUL,Gokul Refoils and Solvent Limited,EQ,04-JUN-2008,2,1,INE020J01029,2\r\n" + 
				"GOKULAGRO,Gokul Agro Resources Limited,EQ,11-MAR-2016,2,1,INE314T01025,2\r\n" + 
				"GOLDIAM,Goldiam International Limited,EQ,29-AUG-2005,10,1,INE025B01017,10\r\n" + 
				"GOLDINFRA,Goldstone Infratech Limited,EQ,20-MAR-2002,4,1,INE260D01016,4\r\n" + 
				"GOLDTECH,Goldstone Technologies Limited,EQ,11-APR-2001,10,1,INE805A01014,10\r\n" + 
				"GOODLUCK,Goodluck India Limited,BE,08-JAN-2015,2,1,INE127I01024,2\r\n" + 
				"GPIL,Godawari Power And Ispat limited,EQ,25-APR-2006,10,1,INE177H01013,10\r\n" + 
				"GPPL,Gujarat Pipavav Port Limited,EQ,09-SEP-2010,10,1,INE517F01014,10\r\n" + 
				"GPTINFRA,GPT Infraprojects Limited,EQ,11-JUL-2016,10,1,INE390G01014,10\r\n" + 
				"GRANULES,Granules India Limited,EQ,20-JUN-2005,1,1,INE101D01020,1\r\n" + 
				"GRAPHITE,Graphite India Limited,EQ,07-FEB-2003,2,1,INE371A01025,2\r\n" + 
				"GRASIM,Grasim Industries Limited,EQ,10-MAY-1995,2,1,INE047A01021,2\r\n" + 
				"GRAVITA,Gravita India Limited,EQ,16-NOV-2010,2,1,INE024L01027,2\r\n" + 
				"GREAVESCOT,Greaves Cotton Limited,EQ,09-SEP-2004,2,1,INE224A01026,2\r\n" + 
				"GREENLAM,Greenlam Industries Limited,EQ,02-MAR-2015,5,1,INE544R01013,5\r\n" + 
				"GREENPLY,Greenply Industries Limited,EQ,06-MAR-1996,1,1,INE461C01038,1\r\n" + 
				"GREENPOWER,Orient Green Power Company Limited,EQ,08-OCT-2010,10,1,INE999K01014,10\r\n" + 
				"GRINDWELL,Grindwell Norton Limited,EQ,11-SEP-2006,5,1,INE536A01023,5\r\n" + 
				"GROBTEA,The Grob Tea Company Limited,BE,14-JUL-2016,10,1,INE646C01018,10\r\n" + 
				"GRPLTD,GRP Limited,EQ,12-FEB-2015,10,1,INE137I01015,10\r\n" + 
				"GRUH,Gruh Finance Limited,EQ,10-SEP-2004,2,1,INE580B01029,2\r\n" + 
				"GSCLCEMENT,Gujarat Sidhee Cement Limited,EQ,15-MAY-2013,10,1,INE542A01039,10\r\n" + 
				"GSFC,Gujarat State Fertilizers & Chemicals Limited,EQ,06-SEP-1995,2,1,INE026A01025,2\r\n" + 
				"GSFC,Gujarat State Fertilizers & Chemicals Limited,IL,06-SEP-1995,2,1,INE026A01025,2\r\n" + 
				"GSKCONS,GlaxoSmithKline Consumer Healthcare Limited,EQ,16-JUN-2003,10,1,INE264A01014,10\r\n" + 
				"GSPL,Gujarat State Petronet Limited,EQ,16-FEB-2006,10,1,INE246F01010,10\r\n" + 
				"GSS,GSS Infotech Limited,EQ,07-MAR-2008,10,1,INE871H01011,10\r\n" + 
				"GTL,GTL Limited,EQ,29-MAR-1995,10,1,INE043A01012,10\r\n" + 
				"GTLINFRA,GTL Infrastructure Limited,EQ,09-NOV-2006,10,1,INE221H01019,10\r\n" + 
				"GTNIND,GTN Industries Limited,EQ,02-AUG-1995,10,1,INE537A01013,10\r\n" + 
				"GTNTEX,GTN Textiles Limited,EQ,18-MAY-2006,10,1,INE302H01017,10\r\n" + 
				"GTPL,GTPL Hathway Limited,EQ,04-JUL-2017,10,1,INE869I01013,10\r\n" + 
				"GUFICBIO,Gufic Biosciences Limited,EQ,19-OCT-2004,1,1,INE742B01025,1\r\n" + 
				"GUJALKALI,Gujarat Alkalies and Chemicals Limited,EQ,07-AUG-1997,10,1,INE186A01019,10\r\n" + 
				"GUJAPOLLO,Gujarat Apollo Industries Limited,EQ,04-JUN-2007,10,1,INE826C01016,10\r\n" + 
				"GUJFLUORO,Gujarat Fluorochemicals Limited,EQ,25-MAY-1995,1,1,INE538A01037,1\r\n" + 
				"GUJGASLTD,Gujarat Gas Limited,EQ,15-SEP-2015,10,1,INE844O01022,10\r\n" + 
				"GUJRAFFIA,Gujarat Raffia Industries Limited,BE,09-OCT-1996,10,1,INE610B01024,10\r\n" + 
				"GULFOILLUB,Gulf Oil Lubricants India Limited,EQ,31-JUL-2014,2,1,INE635Q01029,2\r\n" + 
				"GULFPETRO,GP Petroleums Limited,EQ,24-SEP-2004,5,1,INE586G01017,5\r\n" + 
				"GULPOLY,Gulshan Polyols Limited,EQ,28-JAN-2015,1,1,INE255D01024,1\r\n" + 
				"GVKPIL,GVK Power & Infrastructure Limited,EQ,27-FEB-2006,1,1,INE251H01024,1\r\n" + 
				"HAL,Hindustan Aeronautics Limited,EQ,28-MAR-2018,10,1,INE066F01012,10\r\n" + 
				"HANUNG,Hanung Toys and Textiles Limited,BE,20-OCT-2006,10,1,INE648H01013,10\r\n" + 
				"HARITASEAT,Harita Seating Systems Limited,EQ,06-APR-2009,10,1,INE939D01015,10\r\n" + 
				"HARRMALAYA,Harrisons  Malayalam Limited,EQ,08-FEB-1995,10,1,INE544A01019,10\r\n" + 
				"HATHWAY,Hathway Cable & Datacom Limited,EQ,25-FEB-2010,2,1,INE982F01036,2\r\n" + 
				"HATSUN,Hatsun Agro Product Limited,EQ,20-JUN-2014,1,1,INE473B01035,1\r\n" + 
				"HAVELLS,Havells India Limited,EQ,21-MAR-2001,1,1,INE176B01034,1\r\n" + 
				"HBLPOWER,HBL Power Systems Limited,EQ,04-JAN-2007,1,1,INE292B01021,1\r\n" + 
				"HCC,Hindustan Construction Company Limited,EQ,01-APR-2003,1,1,INE549A01026,1\r\n" + 
				"HCG,Healthcare Global Enterprises Limited,EQ,30-MAR-2016,10,1,INE075I01017,10\r\n" + 
				"HCL-INSYS,HCL Infosystems Limited,EQ,01-JAN-1997,2,1,INE236A01020,2\r\n" + 
				"HCLTECH,HCL Technologies Limited,EQ,06-JAN-2000,2,1,INE860A01027,2\r\n" + 
				"HDFC,Housing Development Finance Corporation Limited,EQ,23-OCT-1996,2,1,INE001A01036,2\r\n" + 
				"HDFCBANK,HDFC Bank Limited,EQ,08-NOV-1995,2,1,INE040A01026,2\r\n" + 
				"HDFCBANK,HDFC Bank Limited,IL,08-NOV-1995,2,1,INE040A01026,2\r\n" + 
				"HDFCLIFE,HDFC Standard Life Insurance Company Limited,EQ,17-NOV-2017,10,1,INE795G01014,10\r\n" + 
				"HDIL,Housing Development and Infrastructure Limited,EQ,24-JUL-2007,10,1,INE191I01012,10\r\n" + 
				"HEG,HEG Limited,EQ,10-MAY-1995,10,1,INE545A01016,10\r\n" + 
				"HEIDELBERG,HeidelbergCement India Limited,EQ,15-MAR-1995,10,1,INE578A01017,10\r\n" + 
				"HERCULES,Hercules Hoists Limited,EQ,19-FEB-2008,1,1,INE688E01024,1\r\n" + 
				"HERITGFOOD,Heritage Foods Limited,EQ,27-NOV-1996,5,1,INE978A01027,5\r\n" + 
				"HEROMOTOCO,Hero MotoCorp Limited,EQ,11-APR-2003,2,1,INE158A01026,2\r\n" + 
				"HESTERBIO,Hester Biosciences Limited,EQ,13-MAR-2015,10,1,INE782E01017,10\r\n" + 
				"HEXATRADEX,Hexa Tradex Limited,BE,20-APR-2012,2,1,INE750M01017,2\r\n" + 
				"HEXAWARE,Hexaware Technologies Limited,EQ,14-JUN-2002,2,1,INE093A01033,2\r\n" + 
				"HFCL,Himachal Futuristic Communications Limited,EQ,09-MAR-2011,1,1,INE548A01028,1\r\n" + 
				"HGINFRA,H.G. Infra Engineering Limited,EQ,09-MAR-2018,10,1,INE926X01010,10\r\n" + 
				"HGS,Hinduja Global Solutions Limited,EQ,19-JUN-2007,10,1,INE170I01016,10\r\n" + 
				"HIGHGROUND,High Ground Enterprise Limited,EQ,24-NOV-2016,1,1,INE361M01021,1\r\n" + 
				"HIKAL,Hikal Limited,EQ,14-FEB-2001,2,1,INE475B01022,2\r\n" + 
				"HIL,HIL Limited,EQ,26-APR-1995,10,1,INE557A01011,10\r\n" + 
				"HILTON,Hilton Metal Forging Limited,EQ,24-MAY-2007,10,1,INE788H01017,10\r\n" + 
				"HIMATSEIDE,Himatsingka Seide Limited,EQ,08-FEB-1995,5,1,INE049A01027,5\r\n" + 
				"HINDALCO,Hindalco Industries Limited,EQ,08-JAN-1997,1,1,INE038A01020,1\r\n" + 
				"HINDCOMPOS,Hindustan Composites Limited,EQ,08-MAY-1996,5,1,INE310C01029,5\r\n" + 
				"HINDCOPPER,Hindustan Copper Limited,EQ,15-SEP-2010,5,1,INE531E01026,5\r\n" + 
				"HINDDORROL,Hindustan Dorr-Oliver Limited,BE,06-DEC-1995,2,1,INE551A01022,2\r\n" + 
				"HINDMOTORS,Hindustan Motors Limited,BE,21-FEB-2011,5,1,INE253A01025,5\r\n" + 
				"HINDNATGLS,Hindusthan National Glass & Industries Limited,EQ,15-APR-2009,2,1,INE952A01022,2\r\n" + 
				"HINDOILEXP,Hindustan Oil Exploration Company Limited,EQ,23-SEP-2003,10,1,INE345A01011,10\r\n" + 
				"HINDPETRO,Hindustan Petroleum Corporation Limited,EQ,17-JUN-1998,10,1,INE094A01015,10\r\n" + 
				"HINDSYNTEX,Hind Syntex Limited,BE,08-FEB-1995,10,1,INE155B01012,10\r\n" + 
				"HINDUJAVEN,Hinduja Ventures Limited,EQ,24-APR-2007,10,1,INE353A01023,10\r\n" + 
				"HINDUNILVR,Hindustan Unilever Limited,EQ,06-JUL-1995,1,1,INE030A01027,1\r\n" + 
				"HINDZINC,Hindustan Zinc Limited,EQ,21-NOV-2006,2,1,INE267A01025,2\r\n" + 
				"HIRECT,Hind Rectifiers Limited,EQ,26-DEC-2006,2,1,INE835D01023,2\r\n" + 
				"HISARMETAL,Hisar Metal Industries Limited,EQ,05-JAN-2017,10,1,INE598C01011,10\r\n" + 
				"HITECHCORP,Hitech Corporation Limited,EQ,20-DEC-2007,10,1,INE120D01012,10\r\n" + 
				"HITECHGEAR,The Hi-Tech Gears Limited,EQ,21-JAN-2002,10,1,INE127B01011,10\r\n" + 
				"HMT,HMT Limited,BZ,29-AUG-2003,10,1,INE262A01018,10\r\n" + 
				"HMVL,Hindustan Media Ventures Limited,EQ,21-JUL-2010,10,1,INE871K01015,10\r\n" + 
				"HONAUT,Honeywell Automation India Limited,EQ,18-JUL-2003,10,1,INE671A01010,10\r\n" + 
				"HONDAPOWER,Honda Siel Power Products Limited,EQ,01-APR-2003,10,1,INE634A01018,10\r\n" + 
				"HOTELEELA,Hotel Leela Venture Limited,EQ,19-JUL-1995,2,1,INE102A01024,2\r\n" + 
				"HOTELRUGBY,Hotel Rugby Limited,BE,03-APR-1996,10,1,INE275F01019,10\r\n" + 
				"HOVS,HOV Services Limited,EQ,27-SEP-2006,10,1,INE596H01014,10\r\n" + 
				"HPL,HPL Electric & Power Limited,EQ,04-OCT-2016,10,1,INE495S01016,10\r\n" + 
				"HSCL,Himadri Speciality Chemical Limited,EQ,02-MAR-2007,1,1,INE019C01026,1\r\n" + 
				"HSIL,HSIL Limited,EQ,31-MAY-2000,2,1,INE415A01038,2\r\n" + 
				"HTMEDIA,HT Media Limited,EQ,01-SEP-2005,2,1,INE501G01024,2\r\n" + 
				"HUBTOWN,Hubtown Limited,EQ,07-FEB-2007,10,1,INE703H01016,10\r\n" + 
				"HUDCO,Housing & Urban Development Corporation Limited,EQ,19-MAY-2017,10,1,INE031A01017,10\r\n" + 
				"IBREALEST,Indiabulls Real Estate Limited,EQ,23-MAR-2007,2,1,INE069I01010,2\r\n" + 
				"IBULHSGFIN,Indiabulls Housing Finance Limited,EQ,23-JUL-2013,2,1,INE148I01020,2\r\n" + 
				"IBVENTURES,Indiabulls Ventures Limited,EQ,02-APR-2008,2,1,INE274G01010,2\r\n" + 
				"ICICIBANK,ICICI Bank Limited,EQ,17-SEP-1997,2,1,INE090A01021,2\r\n" + 
				"ICICIGI,ICICI Lombard General Insurance Company Limited,EQ,27-SEP-2017,10,1,INE765G01017,10\r\n" + 
				"ICICIPRULI,ICICI Prudential Life Insurance Company Limited,EQ,29-SEP-2016,10,1,INE726G01019,10\r\n" + 
				"ICIL,Indo Count Industries Limited,EQ,12-SEP-2005,2,1,INE483B01026,2\r\n" + 
				"ICRA,ICRA Limited,EQ,13-APR-2007,10,1,INE725G01011,10\r\n" + 
				"ICSA,ICSA (India) Limited,BE,28-SEP-2006,2,1,INE306B01029,2\r\n" + 
				"IDBI,IDBI Bank Limited,EQ,20-SEP-1995,10,1,INE008A01015,10\r\n" + 
				"IDEA,Idea Cellular Limited,EQ,09-MAR-2007,10,1,INE669E01016,10\r\n" + 
				"IDFC,IDFC Limited,EQ,12-AUG-2005,10,1,INE043D01016,10\r\n" + 
				"IDFCBANK,IDFC Bank Limited,EQ,06-NOV-2015,10,1,INE092T01019,10\r\n" + 
				"IEX,Indian Energy Exchange Limited,EQ,23-OCT-2017,10,1,INE022Q01012,10\r\n" + 
				"IFBAGRO,IFB Agro Industries Limited,EQ,03-APR-1996,10,1,INE076C01018,10\r\n" + 
				"IFBIND,IFB Industries Limited,EQ,29-MAR-1995,10,1,INE559A01017,10\r\n" + 
				"IFCI,IFCI Limited,EQ,26-APR-1995,10,1,INE039A01010,10\r\n" + 
				"IFGLEXPOR,IFGL Refractories Limited,EQ,14-NOV-2017,10,1,INE133Y01011,10\r\n" + 
				"IGARASHI,Igarashi Motors India Limited,EQ,09-OCT-2003,10,1,INE188B01013,10\r\n" + 
				"IGL,Indraprastha Gas Limited,EQ,26-DEC-2003,2,1,INE203G01027,2\r\n" + 
				"IGPL,IG Petrochemicals Limited,EQ,29-JAN-2007,10,1,INE204A01010,10\r\n" + 
				"IIFL,IIFL Holdings Limited,EQ,17-MAY-2005,2,1,INE530B01024,2\r\n" + 
				"IITL,Industrial Investment Trust Limited,EQ,17-AUG-2010,10,1,INE886A01014,10\r\n" + 
				"IL&FSENGG,IL&FS Engineering and Construction Company Limited,EQ,25-OCT-2007,10,1,INE369I01014,10\r\n" + 
				"IL&FSTRANS,IL&FS Transportation Networks Limited,EQ,30-MAR-2010,10,1,INE975G01012,10\r\n" + 
				"IMFA,Indian Metals & Ferro Alloys Limited,EQ,23-JUL-2010,10,1,INE919H01018,10\r\n" + 
				"IMPAL,India Motor Parts and Accessories Limited,EQ,07-OCT-2005,10,1,INE547E01014,10\r\n" + 
				"IMPEXFERRO,Impex Ferro Tech Limited,BE,03-FEB-2005,10,1,INE691G01015,10\r\n" + 
				"INDBANK,Indbank Merchant Banking Services Limited,BE,08-OCT-2008,10,1,INE841B01017,10\r\n" + 
				"INDHOTEL,The Indian Hotels Company Limited,EQ,03-JUL-1996,1,1,INE053A01029,1\r\n" + 
				"INDIACEM,The India Cements Limited,EQ,31-MAY-2000,10,1,INE383A01012,10\r\n" + 
				"INDIAGLYCO,India Glycols Limited,EQ,01-JUL-2005,10,1,INE560A01015,10\r\n" + 
				"INDIANB,Indian Bank,EQ,01-MAR-2007,10,1,INE562A01011,10\r\n" + 
				"INDIANCARD,Indian Card Clothing Company Limited,EQ,08-JAN-1997,10,1,INE061A01014,10\r\n" + 
				"INDIANHUME,Indian Hume Pipe Company Limited,EQ,30-AUG-1995,2,1,INE323C01030,2\r\n" + 
				"INDIGO,InterGlobe Aviation Limited,EQ,10-NOV-2015,10,1,INE646L01027,10\r\n" + 
				"INDLMETER,IMP Powers Limited,EQ,10-JAN-1996,10,1,INE065B01013,10\r\n" + 
				"INDNIPPON,India Nippon Electricals Limited,EQ,07-MAY-1997,5,1,INE092B01025,5\r\n" + 
				"INDOCO,Indoco Remedies Limited,EQ,14-JAN-2005,2,1,INE873D01024,2\r\n" + 
				"INDORAMA,Indo Rama Synthetics (India) Limited,EQ,20-JUN-2003,10,1,INE156A01020,10\r\n" + 
				"INDOSOLAR,Indosolar Limited,BE,29-SEP-2010,10,1,INE866K01015,10\r\n" + 
				"INDOTECH,Indo Tech Transformers Limited,EQ,16-MAR-2006,10,1,INE332H01014,10\r\n" + 
				"INDOTHAI,Indo Thai Securities Limited,EQ,02-NOV-2011,10,1,INE337M01013,10\r\n" + 
				"INDOWIND,Indowind Energy Limited,BE,14-SEP-2007,10,1,INE227G01018,10\r\n" + 
				"INDRAMEDCO,Indraprastha Medical Corporation Limited,EQ,17-APR-1997,10,1,INE681B01017,10\r\n" + 
				"INDSWFTLAB,Ind-Swift Laboratories Limited,EQ,02-JUL-1997,10,1,INE915B01019,10\r\n" + 
				"INDSWFTLTD,Ind-Swift Limited,EQ,18-OCT-2004,2,1,INE788B01028,2\r\n" + 
				"INDTERRAIN,Indian Terrain Fashions Limited,EQ,11-MAR-2011,2,1,INE611L01021,2\r\n" + 
				"INDUSINDBK,IndusInd Bank Limited,EQ,28-JAN-1998,10,1,INE095A01012,10\r\n" + 
				"INEOSSTYRO,INEOS Styrolution India Limited,EQ,29-MAR-1995,10,1,INE189B01011,10\r\n" + 
				"INFIBEAM,Infibeam Incorporation Limited,EQ,04-APR-2016,1,1,INE483S01020,1\r\n" + 
				"INFINITE,Infinite Computer Solutions (India) Limited,EQ,03-FEB-2010,10,1,INE486J01014,10\r\n" + 
				"INFRATEL,Bharti Infratel Limited,EQ,28-DEC-2012,10,1,INE121J01017,10\r\n" + 
				"INFY,Infosys Limited,EQ,08-FEB-1995,5,1,INE009A01021,5\r\n" + 
				"INGERRAND,Ingersoll Rand (India) Limited,EQ,15-APR-1999,10,1,INE177A01018,10\r\n" + 
				"INOXLEISUR,INOX Leisure Limited,EQ,23-FEB-2006,10,1,INE312H01016,10\r\n" + 
				"INOXWIND,Inox Wind Limited,EQ,09-APR-2015,10,1,INE066P01011,10\r\n" + 
				"INSECTICID,Insecticides (India) Limited,EQ,30-MAY-2007,10,1,INE070I01018,10\r\n" + 
				"INTEGRA,Integra Garments and Textiles Limited,BE,20-AUG-2013,3,1,INE418N01027,3\r\n" + 
				"INTELLECT,Intellect Design Arena Limited,EQ,18-DEC-2014,5,1,INE306R01017,5\r\n" + 
				"INTENTECH,Intense Technologies Limited,EQ,23-MAR-2017,2,1,INE781A01025,2\r\n" + 
				"INVENTURE,Inventure Growth & Securities Limited,BE,04-AUG-2011,10,1,INE878H01016,10\r\n" + 
				"IOB,Indian Overseas Bank,EQ,07-DEC-2000,10,1,INE565A01014,10\r\n" + 
				"IOC,Indian Oil Corporation Limited,EQ,24-JUL-1996,10,1,INE242A01010,10\r\n" + 
				"IOLCP,IOL Chemicals and Pharmaceuticals Limited,EQ,08-NOV-2010,10,1,INE485C01011,10\r\n" + 
				"IPAPPM,International Paper APPM Limited,EQ,13-MAY-2004,10,1,INE435A01028,10\r\n" + 
				"IPCALAB,IPCA Laboratories Limited,EQ,08-FEB-1995,2,1,INE571A01020,2\r\n" + 
				"IRB,IRB Infrastructure Developers Limited,EQ,25-FEB-2008,10,1,INE821I01014,10\r\n" + 
				"ISFT,Intrasoft Technologies Limited,EQ,12-APR-2010,10,1,INE566K01011,10\r\n" + 
				"ISMTLTD,ISMT Limited,EQ,28-AUG-2007,5,1,INE732F01019,5\r\n" + 
				"ITC,ITC Limited,EQ,23-AUG-1995,1,1,INE154A01025,1\r\n" + 
				"ITDC,India Tourism Development Corporation Limited,EQ,30-DEC-2016,10,1,INE353K01014,10\r\n" + 
				"ITDCEM,ITD Cementation India Limited,EQ,10-FEB-1999,1,1,INE686A01026,1\r\n" + 
				"ITI,ITI Limited,EQ,15-SEP-2003,10,1,INE248A01017,10\r\n" + 
				"IVC,IL&FS Investment Managers Limited,EQ,15-SEP-1999,2,1,INE050B01023,2\r\n" + 
				"IVP,IVP Limited,EQ,13-SEP-1995,10,1,INE043C01018,10\r\n" + 
				"IVRCLINFRA,IVRCL Limited,EQ,08-MAR-2000,2,1,INE875A01025,2\r\n" + 
				"IZMO,IZMO Limited,EQ,05-FEB-2007,10,1,INE848A01014,10\r\n" + 
				"J&KBANK,The Jammu & Kashmir Bank Limited,EQ,22-JUL-1998,1,1,INE168A01041,1\r\n" + 
				"JAGRAN,Jagran Prakashan Limited,EQ,22-FEB-2006,2,1,INE199G01027,2\r\n" + 
				"JAGSNPHARM,Jagsonpal Pharmaceuticals Limited,EQ,01-MAR-2000,5,1,INE048B01027,5\r\n" + 
				"JAIBALAJI,Jai Balaji Industries Limited,EQ,09-DEC-2003,10,1,INE091G01018,10\r\n" + 
				"JAICORPLTD,Jai Corp Limited,EQ,26-NOV-1997,1,1,INE070D01027,1\r\n" + 
				"JAIHINDPRO,Jaihind Projects Limited,EQ,29-FEB-2012,10,1,INE343D01010,10\r\n" + 
				"JAINSTUDIO,Jain Studios Limited,BE,19-NOV-1997,10,1,INE486B01011,10\r\n" + 
				"JAMNAAUTO,Jamna Auto Industries Limited,EQ,10-DEC-2010,1,1,INE039C01032,1\r\n" + 
				"JAYAGROGN,Jayant Agro Organics Limited,EQ,17-APR-1996,5,1,INE785A01026,5\r\n" + 
				"JAYBARMARU,Jay Bharat Maruti Limited,EQ,03-JAN-1996,5,1,INE571B01028,5\r\n" + 
				"JAYNECOIND,Jayaswal Neco Industries Limited,EQ,10-MAY-1995,10,1,INE854B01010,10\r\n" + 
				"JAYSREETEA,Jayshree Tea & Industries Limited,EQ,15-FEB-1995,5,1,INE364A01020,5\r\n" + 
				"JBCHEPHARM,JB Chemicals & Pharmaceuticals Limited,EQ,29-APR-2003,2,1,INE572A01028,2\r\n" + 
				"JBFIND,JBF Industries Limited,EQ,25-FEB-2004,10,1,INE187A01017,10\r\n" + 
				"JBMA,JBM Auto Limited,EQ,17-DEC-2004,5,1,INE927D01028,5\r\n" + 
				"JCHAC,Johnson Controls – Hitachi Air Conditioning India Limited,EQ,03-JAN-2000,10,1,INE782A01015,10\r\n" + 
				"JETAIRWAYS,Jet Airways (India) Limited,EQ,14-MAR-2005,10,1,INE802G01018,10\r\n" + 
				"JHS,JHS Svendgaard Laboratories Limited,EQ,21-OCT-2006,10,1,INE544H01014,10\r\n" + 
				"JINDALPHOT,Jindal Photo Limited,EQ,07-APR-2005,10,1,INE796G01012,10\r\n" + 
				"JINDALPOLY,Jindal Poly Films Limited,EQ,21-JAN-2002,10,1,INE197D01010,10\r\n" + 
				"JINDALSAW,Jindal Saw Limited,EQ,29-APR-2003,2,1,INE324A01024,2\r\n" + 
				"JINDALSTEL,Jindal Steel & Power Limited,EQ,29-DEC-1999,1,1,INE749A01030,1\r\n" + 
				"JINDCOT,Jindal Cotex Limited,BZ,22-SEP-2009,10,1,INE904J01016,10\r\n" + 
				"JINDRILL,Jindal Drilling And Industries Limited,EQ,22-DEC-2006,5,1,INE742C01031,5\r\n" + 
				"JINDWORLD,Jindal Worldwide Limited,EQ,25-NOV-2010,5,1,INE247D01021,5\r\n" + 
				"JISLDVREQS,Jain Irrigation Systems Limited,EQ,30-NOV-2011,2,1,IN9175A01010,2\r\n" + 
				"JISLJALEQS,Jain Irrigation Systems Limited,EQ,13-AUG-2001,2,1,INE175A01038,2\r\n" + 
				"JITFINFRA,JITF Infralogistics Limited,BE,27-FEB-2017,2,1,INE863T01013,2\r\n" + 
				"JKCEMENT,JK Cement Limited,EQ,14-MAR-2006,10,1,INE823G01014,10\r\n" + 
				"JKIL,J.Kumar Infraprojects Limited,EQ,12-FEB-2008,5,1,INE576I01022,5\r\n" + 
				"JKLAKSHMI,JK Lakshmi Cement Limited,EQ,19-JUN-2006,5,1,INE786A01032,5\r\n" + 
				"JKPAPER,JK Paper Limited,EQ,16-JUN-2005,10,1,INE789E01012,10\r\n" + 
				"JKTYRE,JK Tyre & Industries Limited,EQ,19-MAR-2007,2,1,INE573A01042,2\r\n" + 
				"JMA,Jullundur Motor Agency (Delhi) Limited,EQ,16-MAR-2015,10,1,INE412C01015,10\r\n" + 
				"JMCPROJECT,JMC Projects (India)  Limited,EQ,26-NOV-2007,10,1,INE890A01016,10\r\n" + 
				"JMFINANCIL,JM Financial Limited,EQ,10-OCT-2006,1,1,INE780C01023,1\r\n" + 
				"JMTAUTOLTD,JMT Auto Limited,EQ,02-APR-2007,1,1,INE988E01036,1\r\n" + 
				"JOCIL,Jocil Limited,EQ,08-OCT-2008,10,1,INE839G01010,10\r\n" + 
				"JPASSOCIAT,Jaiprakash Associates Limited,EQ,14-JUN-2004,2,1,INE455F01025,2\r\n" + 
				"JPINFRATEC,Jaypee Infratech Limited,EQ,21-MAY-2010,10,1,INE099J01015,10\r\n" + 
				"JPOLYINVST,Jindal Poly Investment and Finance Company Limited,EQ,11-NOV-2013,10,1,INE147P01019,10\r\n" + 
				"JPPOWER,Jaiprakash Power Ventures Limited,EQ,18-APR-2005,10,1,INE351F01018,10\r\n" + 
				"JSL,Jindal Stainless Limited,EQ,17-NOV-2003,2,1,INE220G01021,2\r\n" + 
				"JSLHISAR,Jindal Stainless (Hisar) Limited,EQ,28-JAN-2016,2,1,INE455T01018,2\r\n" + 
				"JSWENERGY,JSW Energy Limited,EQ,04-JAN-2010,10,1,INE121E01018,10\r\n" + 
				"JSWHL,JSW Holdings Limited,EQ,21-JUN-2005,10,1,INE824G01012,10\r\n" + 
				"JSWSTEEL,JSW Steel Limited,EQ,23-MAR-2005,1,1,INE019A01038,1\r\n" + 
				"JUBILANT,Jubilant Life Sciences Limited,EQ,16-JUN-2003,1,1,INE700A01033,1\r\n" + 
				"JUBLFOOD,Jubilant Foodworks Limited,EQ,08-FEB-2010,10,1,INE797F01012,10\r\n" + 
				"JUBLINDS,Jubilant Industries Limited,EQ,14-FEB-2011,10,1,INE645L01011,10\r\n" + 
				"JUSTDIAL,Just Dial Limited,EQ,05-JUN-2013,10,1,INE599M01018,10\r\n" + 
				"JVLAGRO,JVL Agro Industries Limited,EQ,17-JUN-2011,1,1,INE430G01026,1\r\n" + 
				"JYOTHYLAB,Jyothy Laboratories Limited,EQ,19-DEC-2007,1,1,INE668F01031,1\r\n" + 
				"JYOTISTRUC,Jyoti Structures Limited,BZ,19-JUL-1995,2,1,INE197A01024,2\r\n" + 
				"KABRAEXTRU,Kabra Extrusion Technik Limited,EQ,06-SEP-1995,5,1,INE900B01029,5\r\n" + 
				"KAJARIACER,Kajaria Ceramics Limited,EQ,01-JUN-2004,1,1,INE217B01036,1\r\n" + 
				"KAKATCEM,Kakatiya Cement Sugar & Industries Limited,EQ,13-DEC-1995,10,1,INE437B01014,10\r\n" + 
				"KALPATPOWR,Kalpataru Power Transmission Limited,EQ,15-DEC-2000,2,1,INE220B01022,2\r\n" + 
				"KALYANI,Kalyani Commercials Limited,BE,13-FEB-2017,10,1,INE610E01010,10\r\n" + 
				"KALYANIFRG,Kalyani Forge Limited,BE,20-DEC-2007,10,1,INE314G01014,10\r\n" + 
				"KAMATHOTEL,Kamat Hotels (I) Limited,EQ,29-MAY-1996,10,1,INE967C01018,10\r\n" + 
				"KAMDHENU,Kamdhenu Limited,EQ,09-MAY-2006,10,1,INE390H01012,10\r\n" + 
				"KANANIIND,Kanani Industries Limited,EQ,14-DEC-2011,1,1,INE879E01037,1\r\n" + 
				"KANORICHEM,Kanoria Chemicals & Industries Limited,EQ,08-FEB-1995,5,1,INE138C01024,5\r\n" + 
				"KANSAINER,Kansai Nerolac Paints Limited,EQ,15-SEP-2003,1,1,INE531A01024,1\r\n" + 
				"KARDA,Karda Constructions Limited,BE,02-APR-2018,10,1,INE278R01018,10\r\n" + 
				"KARMAENG,Karma Energy Limited,EQ,28-JUN-2011,10,1,INE725L01011,10\r\n" + 
				"KARURVYSYA,Karur Vysya Bank Limited,EQ,26-JUL-2000,2,1,INE036D01028,2\r\n" + 
				"KAUSHALYA,Kaushalya Infrastructure Development Corporation Limited,EQ,14-DEC-2007,10,1,INE234I01010,10\r\n" + 
				"KAVVERITEL,Kavveri Telecom Products Limited,EQ,29-JAN-2008,10,1,INE641C01019,10\r\n" + 
				"KAYA,Kaya Limited,EQ,14-AUG-2015,10,1,INE587G01015,10\r\n" + 
				"KCP,KCP Limited,EQ,09-APR-1997,1,1,INE805C01028,1\r\n" + 
				"KCPSUGIND,KCP Sugar and Industries Corporation Limited,EQ,11-JUN-1997,1,1,INE790B01024,1\r\n" + 
				"KDDL,KDDL Limited,EQ,23-MAR-2016,10,1,INE291D01011,10\r\n" + 
				"KEC,KEC International Limited,EQ,10-MAR-2006,2,1,INE389H01022,2\r\n" + 
				"KECL,Kirloskar Electric Company Limited,EQ,09-MAR-2010,10,1,INE134B01017,10\r\n" + 
				"KEI,KEI Industries Limited,EQ,23-MAR-2006,2,1,INE878B01027,2\r\n" + 
				"KELLTONTEC,Kellton Tech Solutions Limited,EQ,02-MAR-2016,5,1,INE164B01022,5\r\n" + 
				"KERNEX,Kernex Microsystems (India) Limited,BZ,20-DEC-2005,10,1,INE202H01019,10\r\n" + 
				"KESARENT,Kesar Enterprises Limited,EQ,02-JAN-2007,10,1,INE133B01019,10\r\n" + 
				"KESORAMIND,Kesoram Industries Limited,EQ,06-SEP-1995,10,1,INE087A01019,10\r\n" + 
				"KEYCORPSER,Keynote Corporate Services Limited,EQ,26-JUN-1996,10,1,INE681C01015,10\r\n" + 
				"KGL,Karuturi Global Limited,BE,03-MAY-2007,1,1,INE299C01024,1\r\n" + 
				"KHADIM,Khadim India Limited,EQ,14-NOV-2017,10,1,INE834I01025,10\r\n" + 
				"KHAITANLTD,Khaitan (India) Limited,BE,20-DEC-1995,10,1,INE731C01018,10\r\n" + 
				"KHANDSE,Khandwala Securities Limited,EQ,07-FEB-2001,10,1,INE060B01014,10\r\n" + 
				"KICL,Kalyani Investment Company Limited,EQ,14-JAN-2011,10,1,INE029L01018,10\r\n" + 
				"KILITCH,Kilitch Drugs (India) Limited,EQ,29-SEP-2010,10,1,INE729D01010,10\r\n" + 
				"KINGFA,Kingfa Science & Technology (India) Limited,BE,15-NOV-2016,10,1,INE473D01015,10\r\n" + 
				"KIOCL,KIOCL Limited,EQ,29-NOV-2016,10,1,INE880L01014,10\r\n" + 
				"KIRIINDUS,Kiri Industries Limited,EQ,22-APR-2008,10,1,INE415I01015,10\r\n" + 
				"KIRLOSBROS,Kirloskar Brothers Limited,EQ,20-APR-2010,2,1,INE732A01036,2\r\n" + 
				"KIRLOSENG,Kirloskar Oil Engines Limited,EQ,24-DEC-2010,2,1,INE146L01010,2\r\n" + 
				"KIRLOSIND,Kirloskar Industries Limited,EQ,24-JUN-2010,10,1,INE250A01039,10\r\n" + 
				"KITEX,Kitex Garments Limited,EQ,25-SEP-2012,1,1,INE602G01020,1\r\n" + 
				"KKCL,Kewal Kiran Clothing Limited,EQ,13-APR-2006,10,1,INE401H01017,10\r\n" + 
				"KMSUGAR,K.M.Sugar Mills Limited,EQ,31-MAY-2007,2,1,INE157H01023,2\r\n" + 
				"KNRCON,KNR Constructions Limited,EQ,18-FEB-2008,2,1,INE634I01029,2\r\n" + 
				"KOHINOOR,Kohinoor Foods Limited,EQ,20-OCT-1999,10,1,INE080B01012,10\r\n" + 
				"KOKUYOCMLN,Kokuyo Camlin Limited,EQ,28-JUL-2008,1,1,INE760A01029,1\r\n" + 
				"KOLTEPATIL,Kolte - Patil Developers Limited,EQ,13-DEC-2007,10,1,INE094I01018,10\r\n" + 
				"KOPRAN,Kopran Limited,EQ,09-JUN-1999,10,1,INE082A01010,10\r\n" + 
				"KOTAKBANK,Kotak Mahindra Bank Limited,EQ,20-DEC-1995,5,1,INE237A01028,5\r\n" + 
				"KOTARISUG,Kothari Sugars And Chemicals Limited,EQ,13-DEC-2004,10,1,INE419A01022,10\r\n" + 
				"KOTHARIPET,Kothari Petrochemicals Limited,EQ,02-NOV-1996,10,1,INE720A01015,10\r\n" + 
				"KOTHARIPRO,Kothari Products Limited,EQ,03-JUN-1998,10,1,INE823A01017,10\r\n" + 
				"KPIT,KPIT Technologies Limited,EQ,24-NOV-1999,2,1,INE836A01035,2\r\n" + 
				"KPRMILL,K.P.R. Mill Limited,EQ,28-AUG-2007,5,1,INE930H01023,5\r\n" + 
				"KRBL,KRBL Limited,EQ,21-JAN-2002,1,1,INE001B01026,1\r\n" + 
				"KREBSBIO,Krebs Biochemicals and Industries Limited,BE,03-JAN-1996,10,1,INE268B01013,10\r\n" + 
				"KRIDHANINF,Kridhan Infra Limited,EQ,11-DEC-2015,2,1,INE524L01026,2\r\n" + 
				"KSBPUMPS,KSB Pumps Limited,EQ,08-FEB-1995,10,1,INE999A01015,10\r\n" + 
				"KSCL,Kaveri Seed Company Limited,EQ,04-OCT-2007,2,1,INE455I01029,2\r\n" + 
				"KSERASERA,KSS Limited,BE,05-OCT-2006,1,1,INE216D01026,1\r\n" + 
				"KSK,KSK Energy Ventures Limited,BE,14-JUL-2008,10,1,INE143H01015,10\r\n" + 
				"KSL,Kalyani Steels Limited,EQ,19-MAY-2010,5,1,INE907A01026,5\r\n" + 
				"KTIL,Kesar Terminals & Infrastructure Limited,EQ,22-DEC-2010,5,1,INE096L01025,5\r\n" + 
				"KTKBANK,The Karnataka Bank Limited,EQ,10-MAY-2000,10,1,INE614B01018,10\r\n" + 
				"KWALITY,kwality limited,EQ,05-JUL-2011,1,1,INE775B01025,1\r\n" + 
				"L&TFH,L&T Finance Holdings Limited,EQ,12-AUG-2011,10,1,INE498L01015,10\r\n" + 
				"LAKPRE,Lakshmi Precision Screws Limited,EQ,26-SEP-2006,10,1,INE651C01018,10\r\n" + 
				"LAKSHMIEFL,Lakshmi Energy and Foods Limited,EQ,06-FEB-2007,2,1,INE992B01026,2\r\n" + 
				"LAKSHVILAS,Lakshmi Vilas Bank Limited,EQ,21-JUN-2000,10,1,INE694C01018,10\r\n" + 
				"LALPATHLAB,Dr. Lal Path Labs Ltd.,EQ,23-DEC-2015,10,1,INE600L01024,10\r\n" + 
				"LAMBODHARA,Lambodhara Textiles Limited,EQ,04-FEB-2015,5,1,INE112F01022,5\r\n" + 
				"LAOPALA,La Opala RG Limited,EQ,16-MAR-2007,2,1,INE059D01020,2\r\n" + 
				"LASA,Lasa Supergenerics Limited,EQ,21-SEP-2017,10,1,INE670X01014,10\r\n" + 
				"LAURUSLABS,Laurus Labs Limited,EQ,19-DEC-2016,10,1,INE947Q01010,10\r\n" + 
				"LAXMIMACH,Lakshmi Machine Works Limited,EQ,29-MAR-1995,10,1,INE269B01029,10\r\n" + 
				"LCCINFOTEC,LCC Infotech Limited,BZ,02-MAR-2000,2,1,INE938A01021,2\r\n" + 
				"LEEL,LEEL Electricals Limited,EQ,30-APR-1997,10,1,INE245C01019,10\r\n" + 
				"LFIC,Lakshmi Finance & Industrial Corporation Limited,BE,15-APR-2015,10,1,INE850E01012,10\r\n" + 
				"LGBBROSLTD,LG Balakrishnan & Bros Limited,EQ,30-MAR-2010,10,1,INE337A01034,10\r\n" + 
				"LIBERTSHOE,Liberty Shoes Limited,EQ,27-SEP-1995,10,1,INE557B01019,10\r\n" + 
				"LICHSGFIN,LIC Housing Finance Limited,EQ,29-JUL-1998,2,1,INE115A01026,2\r\n" + 
				"LINCOLN,Lincoln Pharmaceuticals Limited,EQ,17-DEC-2015,10,1,INE405C01035,10\r\n" + 
				"LINCPEN,Linc Pen & Plastics Limited,EQ,09-MAR-2015,10,1,INE802B01019,10\r\n" + 
				"LINDEINDIA,Linde India Limited,EQ,16-JUN-1999,10,1,INE473A01011,10\r\n" + 
				"LITL,Lanco Infratech Limited,BE,27-NOV-2006,1,1,INE785C01048,1\r\n" + 
				"LML,LML Limited,EQ,15-MAR-1995,10,1,INE862A01015,10\r\n" + 
				"LOKESHMACH,Lokesh Machines Limited,EQ,05-MAY-2006,10,1,INE397H01017,10\r\n" + 
				"LOTUSEYE,Lotus Eye Hospital and Institute Limited,EQ,11-JUL-2008,10,1,INE947I01017,10\r\n" + 
				"LOVABLE,Lovable Lingerie Limited,EQ,24-MAR-2011,10,1,INE597L01014,10\r\n" + 
				"LPDC,Landmark Property Development Company Limited,EQ,12-AUG-2008,1,1,INE197J01017,1\r\n" + 
				"LSIL,Lloyds Steels Industries Limited,BE,18-JUL-2016,1,1,INE093R01011,1\r\n" + 
				"LT,Larsen & Toubro Limited,EQ,23-JUN-2004,2,1,INE018A01030,2\r\n" + 
				"LTI,Larsen & Toubro Infotech Limited,EQ,21-JUL-2016,1,1,INE214T01019,1\r\n" + 
				"LTTS,L&T Technology Services Limited,EQ,23-SEP-2016,2,1,INE010V01017,2\r\n" + 
				"LUMAXIND,Lumax Industries Limited,EQ,06-SEP-1995,10,1,INE162B01018,10\r\n" + 
				"LUMAXTECH,Lumax Auto Technologies Limited,EQ,16-JAN-2007,10,1,INE872H01019,10\r\n" + 
				"LUPIN,Lupin Limited,EQ,10-SEP-2001,2,1,INE326A01037,2\r\n" + 
				"LUXIND,Lux Industries Limited,EQ,30-NOV-2015,2,1,INE150G01020,2\r\n" + 
				"LYCOS,Lycos Internet Limited,BE,08-MAY-2015,2,1,INE425B01027,2\r\n" + 
				"LYKALABS,Lyka Labs Limited,EQ,08-FEB-1995,10,1,INE933A01014,10\r\n" + 
				"LYPSAGEMS,Lypsa Gems & Jewellery Limited,EQ,05-NOV-2013,10,1,INE142K01011,10\r\n" + 
				"M&M,Mahindra & Mahindra Limited,EQ,03-JAN-1996,5,1,INE101A01026,5\r\n" + 
				"M&MFIN,Mahindra & Mahindra Financial Services Limited,EQ,17-MAR-2006,2,1,INE774D01024,2\r\n" + 
				"MAANALU,Maan Aluminium Limited,EQ,22-OCT-2007,10,1,INE215I01019,10\r\n" + 
				"MADHAV,Madhav Marbles and Granites Limited,EQ,20-DEC-2007,10,1,INE925C01016,10\r\n" + 
				"MADHUCON,Madhucon Projects Limited,EQ,05-OCT-2006,1,1,INE378D01032,1\r\n" + 
				"MADRASFERT,Madras Fertilizers Limited,EQ,25-JUL-1997,10,1,INE414A01015,10\r\n" + 
				"MAGADSUGAR,Magadh Sugar & Energy Limited,EQ,28-JUL-2017,10,1,INE347W01011,10\r\n" + 
				"MAGMA,Magma Fincorp Limited,EQ,27-APR-2004,2,1,INE511C01022,2\r\n" + 
				"MAGNUM,Magnum Ventures Limited,EQ,20-SEP-2007,10,1,INE387I01016,10\r\n" + 
				"MAHABANK,Bank of Maharashtra,EQ,12-APR-2004,10,1,INE457A01014,10\r\n" + 
				"MAHASTEEL,Mahamaya Steel Industries Limited,EQ,01-JUL-2016,10,1,INE451L01014,10\r\n" + 
				"MAHINDCIE,Mahindra CIE Automotive Limited,EQ,30-AUG-2007,10,1,INE536H01010,10\r\n" + 
				"MAHLIFE,Mahindra Lifespace Developers Limited,EQ,10-MAY-2000,10,1,INE813A01018,10\r\n" + 
				"MAHLOG,Mahindra Logistics Limited,EQ,10-NOV-2017,10,1,INE766P01016,10\r\n" + 
				"MAHSCOOTER,Maharashtra Scooters Limited,EQ,08-FEB-1995,10,1,INE288A01013,10\r\n" + 
				"MAHSEAMLES,Maharashtra Seamless Limited,EQ,25-AUG-2004,5,1,INE271B01025,5\r\n" + 
				"MAITHANALL,Maithan Alloys Limited,EQ,05-JUL-2011,10,1,INE683C01011,10\r\n" + 
				"MAJESCO,Majesco Limited,EQ,19-AUG-2015,5,1,INE898S01029,5\r\n" + 
				"MALUPAPER,Malu Paper Mills Limited,EQ,05-APR-2006,10,1,INE383H01017,10\r\n" + 
				"MANAKALUCO,Manaksia Aluminium Company Limited,EQ,30-MAR-2015,1,1,INE859Q01017,1\r\n" + 
				"MANAKCOAT,Manaksia Coated Metals & Industries Limited,EQ,30-MAR-2015,1,1,INE830Q01018,1\r\n" + 
				"MANAKSIA,Manaksia Limited,EQ,08-JAN-2008,2,1,INE015D01022,2\r\n" + 
				"MANAKSTEEL,Manaksia Steels Limited,EQ,30-MAR-2015,1,1,INE824Q01011,1\r\n" + 
				"MANALIPETC,Manali Petrochemicals Limited,EQ,06-DEC-2006,5,1,INE201A01024,5\r\n" + 
				"MANAPPURAM,Manappuram Finance Limited,EQ,01-DEC-2014,2,1,INE522D01027,2\r\n" + 
				"MANDHANA,Mandhana Industries Limited,EQ,19-MAY-2010,10,1,INE087J01010,10\r\n" + 
				"MANGALAM,Mangalam Drugs And Organics Limited,EQ,23-MAY-2005,10,1,INE584F01014,10\r\n" + 
				"MANGCHEFER,Mangalore Chemicals & Fertilizers Limited,EQ,22-OCT-2007,10,1,INE558B01017,10\r\n" + 
				"MANGLMCEM,Mangalam Cement Limited,EQ,03-JAN-1996,10,1,INE347A01017,10\r\n" + 
				"MANGTIMBER,Mangalam Timber Products Limited,EQ,27-JUL-1995,10,1,INE805B01012,10\r\n" + 
				"MANINDS,Man Industries (India) Limited,EQ,24-JUN-2005,5,1,INE993A01026,5\r\n" + 
				"MANINFRA,Man Infraconstruction Limited,EQ,11-MAR-2010,2,1,INE949H01023,2\r\n" + 
				"MANPASAND,Manpasand Beverages Limited,EQ,09-JUL-2015,10,1,INE122R01018,10\r\n" + 
				"MANUGRAPH,Manugraph India Limited,EQ,14-SEP-2006,2,1,INE867A01022,2\r\n" + 
				"MARALOVER,Maral Overseas Limited,EQ,08-FEB-1995,10,1,INE882A01013,10\r\n" + 
				"MARATHON,Marathon Nextgen Realty Limited,EQ,29-SEP-2016,10,1,INE182D01012,10\r\n" + 
				"MARICO,Marico Limited,EQ,01-MAY-1996,1,1,INE196A01026,1\r\n" + 
				"MARKSANS,Marksans Pharma Limited,EQ,21-JAN-2002,1,1,INE750C01026,1\r\n" + 
				"MARUTI,Maruti Suzuki India Limited,EQ,09-JUL-2003,5,1,INE585B01010,5\r\n" + 
				"MASFIN,MAS Financial Services Limited,EQ,18-OCT-2017,10,1,INE348L01012,10\r\n" + 
				"MASKINVEST,Mask Investments Limited,BE,14-OCT-2016,10,1,INE885F01015,10\r\n" + 
				"MASTEK,Mastek Limited,EQ,10-MAY-1995,5,1,INE759A01021,5\r\n" + 
				"MATRIMONY,Matrimony.Com Limited,EQ,21-SEP-2017,5,1,INE866R01028,5\r\n" + 
				"MAWANASUG,Mawana Sugars Limited,EQ,20-MAR-2009,10,1,INE636A01039,10\r\n" + 
				"MAXINDIA,Max India Limited,EQ,14-JUL-2016,2,1,INE153U01017,2\r\n" + 
				"MAXVIL,Max Ventures and Industries Limited,EQ,22-JUN-2016,10,1,INE154U01015,10\r\n" + 
				"MAYURUNIQ,Mayur Uniquoters Ltd,EQ,25-SEP-2012,5,1,INE040D01038,5\r\n" + 
				"MAZDA,Mazda Limited,EQ,01-NOV-2016,10,1,INE885E01034,10\r\n" + 
				"MBECL,Mcnally Bharat Engineering Company Limited,EQ,06-OCT-2006,10,1,INE748A01016,10\r\n" + 
				"MBLINFRA,MBL Infrastructures Limited,EQ,11-JAN-2010,10,1,INE912H01013,10\r\n" + 
				"MCDHOLDING,McDowell Holdings Limited,EQ,30-MAY-2007,10,1,INE836H01014,10\r\n" + 
				"MCDOWELL-N,United Spirits Limited,EQ,27-SEP-2001,10,1,INE854D01016,10\r\n" + 
				"MCLEODRUSS,Mcleod Russel India Limited,EQ,29-JUL-2005,5,1,INE942G01012,5\r\n" + 
				"MCX,Multi Commodity Exchange of India Limited,EQ,09-MAR-2012,10,1,INE745G01035,10\r\n" + 
				"MEGASOFT,Megasoft Limited,EQ,19-JUL-2007,10,1,INE933B01012,10\r\n" + 
				"MEGH,Meghmani Organics Limited,EQ,28-JUN-2007,1,1,INE974H01013,1\r\n" + 
				"MELSTAR,Melstar Information Technologies Limited,BE,07-MAR-2000,10,1,INE817A01019,10\r\n" + 
				"MENONBE,Menon Bearings Limited,EQ,09-MAR-2015,1,1,INE071D01033,1\r\n" + 
				"MEP,MEP Infrastructure Developers Limited,EQ,06-MAY-2015,10,1,INE776I01010,10\r\n" + 
				"MERCATOR,Mercator Limited,EQ,20-JUN-2005,1,1,INE934B01028,1\r\n" + 
				"MERCK,Merck Limited,EQ,24-APR-1996,10,1,INE199A01012,10\r\n" + 
				"METALFORGE,Metalyst Forgings Limited,EQ,23-AUG-1995,10,1,INE425A01011,10\r\n" + 
				"METKORE,Metkore Alloys & Industries Limited,EQ,30-JUN-2008,2,1,INE592I01029,2\r\n" + 
				"MFSL,Max Financial Services Limited,EQ,17-MAY-2000,2,1,INE180A01020,2\r\n" + 
				"MGL,Mahanagar Gas Limited,EQ,01-JUL-2016,10,1,INE002S01010,10\r\n" + 
				"MHRIL,Mahindra Holidays & Resorts India Limited,EQ,16-JUL-2009,10,1,INE998I01010,10\r\n" + 
				"MIC,MIC Electronics Limited,EQ,30-MAY-2007,2,1,INE287C01029,2\r\n" + 
				"MINDACORP,Minda Corporation Limited,EQ,16-OCT-2014,2,1,INE842C01021,2\r\n" + 
				"MINDAIND,Minda Industries Limited,EQ,02-FEB-2007,2,1,INE405E01023,2\r\n" + 
				"MINDTECK,Mindteck (India) Limited,EQ,02-AUG-2016,10,1,INE110B01017,10\r\n" + 
				"MINDTREE,MindTree Limited,EQ,07-MAR-2007,10,1,INE018I01017,10\r\n" + 
				"MIRCELECTR,MIRC Electronics Limited,EQ,24-MAY-2004,1,1,INE831A01028,1\r\n" + 
				"MIRZAINT,Mirza International Limited,EQ,28-APR-1999,2,1,INE771A01026,2\r\n" + 
				"MMFL,MM Forgings Limited,EQ,20-DEC-2006,10,1,INE227C01017,10\r\n" + 
				"MMTC,MMTC Limited,EQ,09-APR-2012,1,1,INE123F01029,1\r\n" + 
				"MOHITIND,Mohit Industries Limited,EQ,14-MAR-2013,10,1,INE954E01012,10\r\n" + 
				"MOHOTAIND,Mohota Industries Limited,EQ,10-APR-1996,10,100,INE313D01013,10\r\n" + 
				"MOIL,MOIL Limited,EQ,15-DEC-2010,10,1,INE490G01020,10\r\n" + 
				"MOLDTECH,Mold-Tek Technologies Limited,EQ,07-JUL-2016,2,1,INE835B01035,2\r\n" + 
				"MOLDTKPAC,Mold-Tek Packaging Limited,EQ,23-FEB-2015,5,1,INE893J01029,5\r\n" + 
				"MONNETISPA,Monnet Ispat and Energy Limited,EQ,14-JUN-2004,10,1,INE743C01013,10\r\n" + 
				"MONSANTO,Monsanto India Limited,EQ,19-JAN-2000,10,1,INE274B01011,10\r\n" + 
				"MONTECARLO,Monte Carlo Fashions Limited,EQ,19-DEC-2014,10,1,INE950M01013,10\r\n" + 
				"MORARJEE,Morarjee Textiles Limited,EQ,14-SEP-2012,7,1,INE161G01027,7\r\n" + 
				"MOREPENLAB,Morepen Laboratories Limited,EQ,24-NOV-1999,2,1,INE083A01026,2\r\n" + 
				"MOSERBAER,Moser-Baer (I) Limited,BE,02-MAY-2003,10,1,INE739A01015,10\r\n" + 
				"MOTHERSUMI,Motherson Sumi Systems Limited,EQ,14-AUG-1996,1,1,INE775A01035,1\r\n" + 
				"MOTILALOFS,Motilal Oswal Financial Services Limited,EQ,11-SEP-2007,1,1,INE338I01027,1\r\n" + 
				"MOTOGENFIN,The Motor & General Finance Limited,EQ,08-FEB-1995,10,1,INE861B01015,10\r\n" + 
				"MPHASIS,MphasiS Limited,EQ,04-JUN-2004,10,1,INE356A01018,10\r\n" + 
				"MPSLTD,MPS Limited,EQ,21-JAN-2002,10,1,INE943D01017,10\r\n" + 
				"MRF,MRF Limited,EQ,18-SEP-1996,10,1,INE883A01011,10\r\n" + 
				"MRO-TEK,MRO-TEK Realty Limited,BE,01-NOV-2000,5,1,INE398B01018,5\r\n" + 
				"MRPL,Mangalore Refinery and Petrochemicals Limited,EQ,07-JAN-2005,10,1,INE103A01014,10\r\n" + 
				"MSPL,MSP Steel & Power Limited,EQ,18-JUL-2005,10,1,INE752G01015,10\r\n" + 
				"MTEDUCARE,MT Educare Limited,EQ,12-APR-2012,10,1,INE472M01018,10\r\n" + 
				"MTNL,Mahanagar Telephone Nigam Limited,EQ,17-FEB-1999,10,1,INE153A01019,10\r\n" + 
				"MUKANDENGG,Mukand Engineers Limited,EQ,28-JUN-2000,10,1,INE022B01014,10\r\n" + 
				"MUKANDLTD,Mukand Limited,EQ,23-FEB-2004,10,1,INE304A01026,10\r\n" + 
				"MUKTAARTS,Mukta Arts Limited,EQ,12-SEP-2000,5,1,INE374B01019,5\r\n" + 
				"MUNJALAU,Munjal Auto Industries Limited,EQ,19-JUL-2006,2,1,INE672B01032,2\r\n" + 
				"MUNJALSHOW,Munjal Showa Limited,EQ,12-MAY-2003,2,1,INE577A01027,2\r\n" + 
				"MURUDCERA,Murudeshwar Ceramics Limited,EQ,28-MAY-2004,10,1,INE692B01014,10\r\n" + 
				"MUTHOOTCAP,Muthoot Capital Services Limited,EQ,24-AUG-2015,10,1,INE296G01013,10\r\n" + 
				"MUTHOOTFIN,Muthoot Finance Limited,EQ,06-MAY-2011,10,1,INE414G01012,10\r\n" + 
				"MVL,MVL Limited,EQ,30-JUN-2008,1,1,INE744I01034,1\r\n" + 
				"NACLIND,NACL Industries Limited,EQ,07-APR-2017,1,1,INE295D01020,1\r\n" + 
				"NAGAFERT,Nagarjuna Fertilizers and Chemicals Limited,EQ,15-JUN-2016,1,1,INE454M01024,1\r\n" + 
				"NAGAROIL,Nagarjuna Oil Refinery Limited,EQ,28-MAR-2012,1,1,INE453M01018,1\r\n" + 
				"NAGREEKCAP,Nagreeka Capital & Infrastructure Limited,EQ,18-SEP-2007,5,1,INE245I01016,5\r\n" + 
				"NAGREEKEXP,Nagreeka Exports Limited,EQ,18-JUN-2007,5,1,INE123B01028,5\r\n" + 
				"NAHARCAP,Nahar Capital and Financial Services Limited,EQ,11-MAR-2008,5,1,INE049I01012,5\r\n" + 
				"NAHARINDUS,Nahar Industrial Enterprises Limited,EQ,15-DEC-2005,10,1,INE289A01011,10\r\n" + 
				"NAHARPOLY,Nahar Poly Films Limited,EQ,23-MAR-2007,5,1,INE308A01027,5\r\n" + 
				"NAHARSPING,Nahar Spinning Mills Limited,EQ,23-MAR-2007,5,1,INE290A01027,5\r\n" + 
				"NAKODA,Nakoda Limited,BE,14-MAR-2013,5,1,INE559B01023,5\r\n" + 
				"NATCOPHARM,Natco Pharma Limited,EQ,27-DEC-1995,2,1,INE987B01026,2\r\n" + 
				"NATHBIOGEN,Nath Bio-Genes (India) Limited,EQ,28-JAN-2014,10,1,INE448G01010,10\r\n" + 
				"NATIONALUM,National Aluminium Company Limited,EQ,28-APR-1999,5,1,INE139A01034,5\r\n" + 
				"NATNLSTEEL,National Steel And Agro Industries Limited,EQ,26-SEP-2002,10,1,INE088B01015,10\r\n" + 
				"NAUKRI,Info Edge (India) Limited,EQ,21-NOV-2006,10,1,INE663F01024,10\r\n" + 
				"NAVINFLUOR,Navin Fluorine International Limited,EQ,01-JUN-2007,2,1,INE048G01026,2\r\n" + 
				"NAVKARCORP,Navkar Corporation Limited,EQ,09-SEP-2015,10,1,INE278M01019,10\r\n" + 
				"NAVNETEDUL,Navneet Education Limited,EQ,08-FEB-1995,2,1,INE060A01024,2\r\n" + 
				"NBCC,NBCC (India) Limited,EQ,12-APR-2012,2,1,INE095N01023,2\r\n" + 
				"NBIFIN,N. B. I. Industrial Finance Company Limited,EQ,23-NOV-2016,5,1,INE365I01020,5\r\n" + 
				"NBVENTURES,Nava Bharat Ventures Limited,EQ,03-APR-1996,2,1,INE725A01022,2\r\n" + 
				"NCC,NCC Limited,EQ,14-OCT-2003,2,1,INE868B01028,2\r\n" + 
				"NCLIND,NCL Industries Limited,EQ,03-APR-2007,10,1,INE732C01016,10\r\n" + 
				"NDGL,Naga Dhunseri Group Limited,EQ,29-AUG-2016,10,1,INE756C01015,10\r\n" + 
				"NDL,Nandan Denim Limited,EQ,23-MAR-2012,10,1,INE875G01030,10\r\n" + 
				"NDTV,New Delhi Television Limited,EQ,19-MAY-2004,4,1,INE155G01029,4\r\n" + 
				"NECCLTD,North Eastern Carrying Corporation Limited,EQ,02-MAR-2016,10,1,INE553C01016,10\r\n" + 
				"NECLIFE,Nectar Lifesciences Limited,EQ,18-JUL-2005,1,1,INE023H01027,1\r\n" + 
				"NELCAST,Nelcast Limited,EQ,27-JUN-2007,2,1,INE189I01024,2\r\n" + 
				"NELCO,NELCO Limited,EQ,28-MAY-2003,10,1,INE045B01015,10\r\n" + 
				"NESCO,Nesco Limited,EQ,08-APR-2008,2,1,INE317F01035,2\r\n" + 
				"NESTLEIND,Nestle India Limited,EQ,08-JAN-2010,10,1,INE239A01016,10\r\n" + 
				"NETWORK18,Network18 Media & Investments Limited,EQ,02-FEB-2007,5,1,INE870H01013,5\r\n" + 
				"NEULANDLAB,Neuland Laboratories Limited,EQ,13-OCT-2008,10,1,INE794A01010,10\r\n" + 
				"NEWGEN,Newgen Software Technologies Limited,EQ,29-JAN-2018,10,1,INE619B01017,10\r\n" + 
				"NEXTMEDIA,Next Mediaworks Limited,EQ,04-APR-2001,10,1,INE747B01016,10\r\n" + 
				"NFL,National Fertilizers Limited,EQ,28-DEC-2006,10,1,INE870D01012,10\r\n" + 
				"NH,Narayana Hrudayalaya Ltd.,EQ,06-JAN-2016,10,1,INE410P01011,10\r\n" + 
				"NHPC,NHPC Limited,EQ,01-SEP-2009,10,1,INE848E01016,10\r\n" + 
				"NIACL,The New India Assurance Company Limited,EQ,13-NOV-2017,5,1,INE470Y01017,5\r\n" + 
				"NIBL,NRB Industrial Bearings Limited,EQ,09-APR-2013,2,1,INE047O01014,2\r\n" + 
				"NIITLTD,NIIT Limited,EQ,16-AUG-2004,2,1,INE161A01038,2\r\n" + 
				"NIITTECH,NIIT Technologies Limited,EQ,30-AUG-2004,10,1,INE591G01017,10\r\n" + 
				"NILAINFRA,Nila Infrastructures Limited,EQ,21-MAY-2015,1,1,INE937C01029,1\r\n" + 
				"NILKAMAL,Nilkamal Limited,EQ,01-NOV-1995,10,1,INE310A01015,10\r\n" + 
				"NIPPOBATRY,Indo-National Limited,EQ,06-OCT-1999,10,1,INE567A01010,10\r\n" + 
				"NIRAJISPAT,Niraj Ispat Industries Limited,BE,27-OCT-2016,10,1,INE326T01011,10\r\n" + 
				"NITCO,Nitco Limited,EQ,21-MAR-2006,10,1,INE858F01012,10\r\n" + 
				"NITESHEST,Nitesh Estates Limited,BE,13-MAY-2010,10,1,INE639K01016,10\r\n" + 
				"NITINFIRE,Nitin Fire Protection Industries Limited,EQ,05-JUN-2007,2,1,INE489H01020,2\r\n" + 
				"NITINSPIN,Nitin Spinners Limited,EQ,02-FEB-2006,10,1,INE229H01012,10\r\n" + 
				"NKIND,NK Industries Limited,EQ,07-JUL-1995,10,1,INE542C01019,10\r\n" + 
				"NLCINDIA,NLC India Limited,EQ,23-AUG-2000,10,1,INE589A01014,10\r\n" + 
				"NMDC,NMDC Limited,EQ,03-MAR-2008,1,1,INE584A01023,1\r\n" + 
				"NOCIL,NOCIL Limited,EQ,17-JAN-1996,10,1,INE163A01018,10\r\n" + 
				"NOIDATOLL,Noida Toll Bridge Company Limited,EQ,06-DEC-2002,10,1,INE781B01015,10\r\n" + 
				"NORBTEAEXP,Norben Tea & Exports Limited,BE,26-JUN-1996,10,1,INE369C01017,10\r\n" + 
				"NRAIL,N R Agarwal Industries Limited,EQ,05-APR-2017,10,1,INE740D01017,10\r\n" + 
				"NRBBEARING,NRB Bearing Limited,EQ,08-MAR-2000,2,1,INE349A01021,2\r\n" + 
				"NSIL,Nalwa Sons Investments Limited,EQ,17-NOV-2003,10,1,INE023A01030,10\r\n" + 
				"NTL,Neueon Towers Limited,EQ,11-SEP-2013,10,1,INE333I01036,10\r\n" + 
				"NTPC,NTPC Limited,EQ,05-NOV-2004,10,1,INE733E01010,10\r\n" + 
				"NUCLEUS,Nucleus Software Exports Limited,EQ,19-DEC-2002,10,1,INE096B01018,10\r\n" + 
				"NUTEK,Nu Tek India Limited,EQ,27-AUG-2008,5,1,INE318J01027,5\r\n" + 
				"OBEROIRLTY,Oberoi Realty Limited,EQ,20-OCT-2010,10,1,INE093I01010,10\r\n" + 
				"OCCL,Oriental Carbon & Chemicals Limited,EQ,27-JAN-2016,10,1,INE321D01016,10\r\n" + 
				"OCL,OCL India Limited,EQ,15-SEP-2004,2,1,INE290B01025,2\r\n" + 
				"OFSS,Oracle Financial Services Software Limited,EQ,28-JUN-2002,5,1,INE881D01027,5\r\n" + 
				"OIL,Oil India Limited,EQ,30-SEP-2009,10,1,INE274J01014,10\r\n" + 
				"OILCOUNTUB,Oil Country Tubular Limited,EQ,30-AUG-1995,10,1,INE591A01010,10\r\n" + 
				"OISL,OCL Iron and Steel Limited,EQ,01-AUG-2008,1,1,INE196J01019,1\r\n" + 
				"OMAXAUTO,Omax Autos Limited,BE,20-FEB-2003,10,1,INE090B01011,10\r\n" + 
				"OMAXE,Omaxe Limited,EQ,09-AUG-2007,10,1,INE800H01010,10\r\n" + 
				"OMKARCHEM,Omkar Speciality Chemicals Limited,EQ,10-FEB-2011,10,1,INE474L01016,10\r\n" + 
				"OMMETALS,OM Metals Infraprojects Limited,EQ,17-JUN-2011,1,1,INE239D01028,1\r\n" + 
				"ONELIFECAP,Onelife Capital Advisors Limited,EQ,17-OCT-2011,10,1,INE912L01015,10\r\n" + 
				"ONGC,Oil & Natural Gas Corporation Limited,EQ,19-JUL-1995,5,1,INE213A01029,5\r\n" + 
				"ONMOBILE,OnMobile Global Limited,EQ,19-FEB-2008,10,1,INE809I01019,10\r\n" + 
				"ONWARDTEC,Onward Technologies Limited,EQ,07-MAR-2001,10,1,INE229A01017,10\r\n" + 
				"OPTIEMUS,Optiemus Infracom Limited,BE,08-AUG-2017,10,1,INE350C01017,10\r\n" + 
				"OPTOCIRCUI,Opto Circuits (India) Limited,EQ,25-AUG-2003,10,1,INE808B01016,10\r\n" + 
				"ORBTEXP,Orbit Exports Limited,EQ,05-NOV-2013,10,1,INE231G01010,10\r\n" + 
				"ORCHIDPHAR,Orchid Pharma Limited,BZ,02-JUL-1997,10,1,INE191A01019,10\r\n" + 
				"ORICONENT,Oricon Enterprises Limited,EQ,24-JUL-2015,2,1,INE730A01022,2\r\n" + 
				"ORIENTABRA,Orient Abrasives Limited,EQ,15-DEC-2005,1,1,INE569C01020,1\r\n" + 
				"ORIENTALTL,Oriental Trimex Limited,EQ,07-MAR-2007,10,1,INE998H01012,10\r\n" + 
				"ORIENTBANK,Oriental Bank of Commerce,EQ,02-JUL-1997,10,1,INE141A01014,10\r\n" + 
				"ORIENTBELL,Orient Bell Limited,EQ,14-FEB-2007,10,1,INE607D01018,10\r\n" + 
				"ORIENTCEM,Orient Cement Limited,EQ,12-JUL-2013,1,1,INE876N01018,1\r\n" + 
				"ORIENTHOT,Oriental Hotels Limited,EQ,27-AUG-1998,1,1,INE750A01020,1\r\n" + 
				"ORIENTLTD,Orient Press Limited,EQ,03-MAR-2010,10,1,INE609C01024,10\r\n" + 
				"ORIENTPPR,Orient Paper & Industries Limited,EQ,29-MAR-1995,1,1,INE592A01026,1\r\n" + 
				"ORIENTREF,Orient Refractories Limited,EQ,12-MAR-2012,1,1,INE743M01012,1\r\n" + 
				"ORISSAMINE,The Orissa Minerals Development Company Limited,EQ,29-SEP-2010,1,1,INE725E01024,1\r\n" + 
				"ORTEL,Ortel Communications Limited,EQ,19-MAR-2015,10,1,INE849L01019,10\r\n" + 
				"ORTINLABSS,Ortin Laboratories Limited,EQ,21-AUG-2015,10,1,INE749B01012,10\r\n" + 
				"OSWALAGRO,Oswal Agro Mills Limited,BE,29-MAR-1995,10,1,INE142A01012,10\r\n" + 
				"PAEL,PAE Limited,BE,12-APR-1995,10,1,INE766A01018,10\r\n" + 
				"PAGEIND,Page Industries Limited,EQ,16-MAR-2007,10,1,INE761H01022,10\r\n" + 
				"PAISALO,Paisalo Digital Limited,EQ,17-OCT-2011,10,1,INE420C01042,10\r\n" + 
				"PALASHSECU,Palash Securities Limited,EQ,28-JUL-2017,10,1,INE471W01019,10\r\n" + 
				"PALREDTEC,Palred Technologies Limited,EQ,09-MAY-2016,10,1,INE218G01033,10\r\n" + 
				"PANACEABIO,Panacea Biotec Limited,EQ,17-APR-1996,1,1,INE922B01023,1\r\n" + 
				"PANAMAPET,Panama Petrochem Limited,EQ,30-SEP-2011,2,1,INE305C01029,2\r\n" + 
				"PANORAMUNI,Panoramic Universal Limited,EQ,03-JAN-2007,5,1,INE194B01029,5\r\n" + 
				"PAPERPROD,Huhtamaki PPL Limited,EQ,01-OCT-2004,2,1,INE275B01026,2\r\n" + 
				"PARABDRUGS,Parabolic Drugs Limited,EQ,01-JUL-2010,10,1,INE618H01016,10\r\n" + 
				"PARACABLES,Paramount Communications Limited,EQ,03-JAN-2007,2,1,INE074B01023,2\r\n" + 
				"PARAGMILK,Parag Milk Foods Limited,EQ,19-MAY-2016,10,1,INE883N01014,10\r\n" + 
				"PARSVNATH,Parsvnath Developers Limited,EQ,30-NOV-2006,5,1,INE561H01026,5\r\n" + 
				"PATELENG,Patel Engineering Limited,EQ,24-FEB-2005,1,1,INE244B01030,1\r\n" + 
				"PATINTLOG,Patel Integrated Logistics Limited,EQ,11-JAN-2008,10,1,INE529D01014,10\r\n" + 
				"PATSPINLTD,Patspin India Limited,EQ,10-MAY-1995,10,1,INE790C01014,10\r\n" + 
				"PBAINFRA,PBA Infrastructure Limited,EQ,24-NOV-2005,10,1,INE160H01019,10\r\n" + 
				"PCJEWELLER,PC Jeweller Limited,EQ,27-DEC-2012,10,1,INE785M01013,10\r\n" + 
				"PDMJEPAPER,Pudumjee Paper Products Limited,EQ,30-MAR-2016,1,1,INE865T01018,1\r\n" + 
				"PDPL,Parenteral Drugs (India) Limited,EQ,19-AUG-2010,10,1,INE904D01019,10\r\n" + 
				"PDSMFL,PDS Multinational Fashions Limited,EQ,21-OCT-2014,10,1,INE111Q01013,10\r\n" + 
				"PDUMJEIND,Pudumjee Industries Limited,EQ,19-JUL-1995,2,1,INE105C01023,2\r\n" + 
				"PEARLPOLY,Pearl Polymers Limited,BE,11-OCT-1995,10,1,INE844A01013,10\r\n" + 
				"PEL,Piramal Enterprises Limited,EQ,08-FEB-1995,2,1,INE140A01024,2\r\n" + 
				"PENIND,Pennar Industries Limited,EQ,25-NOV-2010,5,1,INE932A01024,5\r\n" + 
				"PENINLAND,Peninsula Land Limited,EQ,08-FEB-1995,2,1,INE138A01028,2\r\n" + 
				"PENPEBS,Pennar Engineered Building Systems Limited,EQ,10-SEP-2015,10,1,INE455O01019,10\r\n" + 
				"PERSISTENT,Persistent Systems Limited,EQ,06-APR-2010,10,1,INE262H01013,10\r\n" + 
				"PETRONENGG,Petron Engineering Construction Limited,EQ,27-DEC-1995,10,1,INE742A01019,10\r\n" + 
				"PETRONET,Petronet LNG Limited,EQ,26-MAR-2004,10,1,INE347G01014,10\r\n" + 
				"PFC,Power Finance Corporation Limited,EQ,23-FEB-2007,10,1,INE134E01011,10\r\n" + 
				"PFIZER,Pfizer Limited,EQ,28-APR-1999,10,1,INE182A01018,10\r\n" + 
				"PFOCUS,Prime Focus Limited,EQ,20-JUN-2006,1,1,INE367G01038,1\r\n" + 
				"PFS,PTC India Financial Services Limited,EQ,30-MAR-2011,10,1,INE560K01014,10\r\n" + 
				"PGEL,PG Electroplast Limited,EQ,26-SEP-2011,10,1,INE457L01011,10\r\n" + 
				"PGHH,Procter & Gamble Hygiene and Health Care Limited,EQ,07-JUL-2004,10,1,INE179A01014,10\r\n" + 
				"PGIL,Pearl Global Industries Limited,EQ,15-FEB-2007,10,1,INE940H01014,10\r\n" + 
				"PHILIPCARB,Phillips Carbon Black Limited,EQ,29-MAR-1995,10,1,INE602A01015,10\r\n" + 
				"PHOENIXLTD,The Phoenix Mills Limited,EQ,23-APR-2007,2,1,INE211B01039,2\r\n" + 
				"PIDILITIND,Pidilite Industries Limited,EQ,29-MAR-1995,1,1,INE318A01026,1\r\n" + 
				"PIIND,PI Industries Limited,EQ,15-JUN-2011,1,1,INE603J01030,1\r\n" + 
				"PILANIINVS,Pilani Investment and Industries Corporation Limited,BE,08-DEC-2015,10,1,INE417C01014,10\r\n" + 
				"PILITA,PIL ITALICA LIFESTYLE LIMITED,BE,07-OCT-2013,1,1,INE600A01035,1\r\n" + 
				"PINCON,Pincon Spirit Limited,EQ,15-JUN-2016,10,1,INE675G01018,10\r\n" + 
				"PIONDIST,Pioneer Distilleries Limited,EQ,15-JUN-2010,10,1,INE889E01010,10\r\n" + 
				"PIONEEREMB,Pioneer Embroideries Limited,EQ,16-MAY-2006,10,1,INE156C01018,10\r\n" + 
				"PITTILAM,Pitti Laminations Limited,EQ,02-FEB-2007,5,1,INE450D01021,5\r\n" + 
				"PKTEA,The Peria Karamalai Tea & Produce Company Limited,BE,19-AUG-2015,10,1,INE431F01018,10\r\n" + 
				"PLASTIBLEN,Plastiblends India Limited,EQ,28-DEC-2006,5,1,INE083C01022,5\r\n" + 
				"PNB,Punjab National Bank,EQ,24-APR-2002,2,1,INE160A01022,2\r\n" + 
				"PNBGILTS,PNB Gilts Limited,EQ,18-SEP-2000,10,1,INE859A01011,10\r\n" + 
				"PNBHOUSING,PNB Housing Finance Limited,EQ,07-NOV-2016,10,1,INE572E01012,10\r\n" + 
				"PNC,Pritish Nandy Communications Limited,EQ,11-DEC-2000,10,1,INE392B01011,10\r\n" + 
				"PNCINFRA,PNC Infratech Limited,EQ,26-MAY-2015,2,1,INE195J01029,2\r\n" + 
				"POCHIRAJU,Pochiraju Industries Limited,BE,09-FEB-2007,10,1,INE332G01032,10\r\n" + 
				"PODDARHOUS,Poddar Housing and Development Limited,EQ,10-APR-2017,10,1,INE888B01018,10\r\n" + 
				"PODDARMENT,Poddar Pigments Limited,EQ,22-NOV-2016,10,1,INE371C01013,10\r\n" + 
				"POKARNA,Pokarna Limited,EQ,07-JUL-2016,2,1,INE637C01025,2\r\n" + 
				"POLARIS,POLARIS CONSULTING & SERVICES LIMITED,EQ,24-NOV-1999,5,1,INE763A01023,5\r\n" + 
				"POLYMED,Poly Medicure Limited,EQ,07-DEC-2011,5,1,INE205C01021,5\r\n" + 
				"POLYPLEX,Polyplex Corporation Limited,EQ,11-APR-2003,10,1,INE633B01018,10\r\n" + 
				"PONNIERODE,Ponni Sugars (Erode) Limited,EQ,16-APR-2002,10,1,INE838E01017,10\r\n" + 
				"POWERGRID,Power Grid Corporation of India Limited,EQ,05-OCT-2007,10,1,INE752E01010,10\r\n" + 
				"POWERMECH,Power Mech Projects Limited,EQ,26-AUG-2015,10,1,INE211R01019,10\r\n" + 
				"PPAP,PPAP Automotive Limited,EQ,11-JAN-2008,10,1,INE095I01015,10\r\n" + 
				"PRABHAT,Prabhat Dairy Limited,EQ,21-SEP-2015,10,1,INE302M01033,10\r\n" + 
				"PRADIP,Pradip Overseas Limited,BE,05-APR-2010,10,1,INE495J01015,10\r\n" + 
				"PRAENG,Prajay Engineers Syndicate Limited,EQ,02-JAN-2007,10,1,INE505C01016,10\r\n" + 
				"PRAJIND,Praj Industries Limited,EQ,11-OCT-1995,2,1,INE074A01025,2\r\n" + 
				"PRAKASH,Prakash Industries Limited,EQ,10-MAY-1995,10,1,INE603A01013,10\r\n" + 
				"PRAKASHCON,Prakash Constrowell Limited,EQ,04-OCT-2011,1,1,INE023M01027,1\r\n" + 
				"PRATIBHA,Pratibha Industries Limited,EQ,16-MAR-2006,2,1,INE308H01022,2\r\n" + 
				"PRAXIS,Praxis Home Retail Limited,EQ,31-JAN-2018,5,1,INE546Y01022,5\r\n" + 
				"PRECAM,Precision Camshafts Limited,EQ,08-FEB-2016,10,1,INE484I01029,10\r\n" + 
				"PRECOT,Precot Meridian Limited,EQ,19-AUG-2005,10,1,INE283A01014,10\r\n" + 
				"PRECWIRE,Precision Wires India Limited,EQ,06-SEP-1995,5,1,INE372C01029,5\r\n" + 
				"PREMEXPLN,Premier Explosives Limited,EQ,17-JUN-2016,10,1,INE863B01011,10\r\n" + 
				"PREMIER,Premier Limited,EQ,03-APR-1996,10,1,INE342A01018,10\r\n" + 
				"PREMIERPOL,Premier Polyfilm Limited,EQ,13-DEC-1995,5,1,INE309M01012,5\r\n" + 
				"PRESSMN,Pressman Advertising Limited,EQ,05-JAN-2005,2,1,INE980A01023,2\r\n" + 
				"PRESTIGE,Prestige Estates Projects Limited,EQ,27-OCT-2010,10,1,INE811K01011,10\r\n" + 
				"PRICOLLTD,Pricol Limited,EQ,10-FEB-2017,1,1,INE726V01018,1\r\n" + 
				"PRIMESECU,Prime Securities Limited,EQ,17-JUN-2005,5,1,INE032B01021,5\r\n" + 
				"PRISMCEM,Prism Cement Limited,EQ,20-AUG-2003,10,1,INE010A01011,10\r\n" + 
				"PROVOGE,Provogue (India) Limited,EQ,26-MAR-2012,1,1,INE968G01033,1\r\n" + 
				"PROZONINTU,Prozone Intu Properties Limited,EQ,12-SEP-2012,2,1,INE195N01013,2\r\n" + 
				"PSB,Punjab & Sind Bank,EQ,30-DEC-2010,10,1,INE608A01012,10\r\n" + 
				"PSL,PSL Limited,BE,29-MAY-2003,10,1,INE474B01017,10\r\n" + 
				"PSPPROJECT,PSP Projects Limited,EQ,29-MAY-2017,10,1,INE488V01015,10\r\n" + 
				"PTC,PTC India Limited,EQ,07-APR-2004,10,1,INE877F01012,10\r\n" + 
				"PTL,PTL Enterprises Limited,EQ,29-JAN-2007,2,1,INE034D01031,2\r\n" + 
				"PUNJABCHEM,Punjab Chemicals & Crop Protection Limited,EQ,08-MAR-2007,10,1,INE277B01014,10\r\n" + 
				"PUNJLLOYD,Punj Lloyd Limited,EQ,06-JAN-2006,2,1,INE701B01021,2\r\n" + 
				"PURVA,Puravankara Limited,EQ,30-AUG-2007,5,1,INE323I01011,5\r\n" + 
				"PVP,PVP Ventures Limited,EQ,03-APR-1996,10,1,INE362A01016,10\r\n" + 
				"PVR,PVR Limited,EQ,04-JAN-2006,10,1,INE191H01014,10\r\n" + 
				"QUESS,Quess Corp Limited,EQ,12-JUL-2016,10,1,INE615P01015,10\r\n" + 
				"QUICKHEAL,Quick Heal Technologies Limited,EQ,18-FEB-2016,10,1,INE306L01010,10\r\n" + 
				"QUINTEGRA,Quintegra Solutions Limited,EQ,20-DEC-2000,10,1,INE033B01011,10\r\n" + 
				"RADAAN,Radaan Mediaworks India Limited,EQ,27-FEB-2003,2,1,INE874F01027,2\r\n" + 
				"RADICO,Radico Khaitan Limited,EQ,18-JUN-2003,2,1,INE944F01028,2\r\n" + 
				"RADIOCITY,Music Broadcast Limited,EQ,17-MAR-2017,10,1,INE919I01016,10\r\n" + 
				"RAIN,Rain Industries Limited,EQ,03-MAR-2008,2,1,INE855B01025,2\r\n" + 
				"RAINBOWPAP,Rainbow Papers Limited,BE,02-JUN-2010,2,1,INE028D01025,2\r\n" + 
				"RAJESHEXPO,Rajesh Exports Limited,EQ,09-FEB-2000,1,1,INE343B01030,1\r\n" + 
				"RAJOIL,Raj Oil Mills Limited,BZ,12-AUG-2009,10,1,INE294G01018,10\r\n" + 
				"RAJRAYON,Raj Rayon Industries Limited,BE,04-JAN-2007,1,1,INE533D01024,1\r\n" + 
				"RAJSREESUG,Rajshree Sugars & Chemicals Limited,EQ,29-MAR-1995,10,1,INE562B01019,10\r\n" + 
				"RAJTV,Raj Television Network Limited,EQ,16-MAR-2007,5,1,INE952H01027,5\r\n" + 
				"RAJVIR,Rajvir Industries Limited,BE,20-SEP-2005,10,1,INE011H01014,10\r\n" + 
				"RALLIS,Rallis India Limited,EQ,01-APR-1999,1,1,INE613A01020,1\r\n" + 
				"RAMANEWS,Shree Rama Newsprint Limited,EQ,20-SEP-2006,10,1,INE278B01020,10\r\n" + 
				"RAMASTEEL,Rama Steel Tubes Limited,BE,19-AUG-2015,5,1,INE230R01027,5\r\n" + 
				"RAMCOCEM,The Ramco Cements Limited,EQ,09-APR-1997,1,1,INE331A01037,1\r\n" + 
				"RAMCOIND,Ramco Industries Limited,EQ,06-NOV-1996,1,1,INE614A01028,1\r\n" + 
				"RAMCOSYS,Ramco Systems Limited,EQ,12-APR-2000,10,1,INE246B01019,10\r\n" + 
				"RAMGOPOLY,Ramgopal Polytex Limited,BE,29-MAR-1995,10,1,INE410D01017,10\r\n" + 
				"RAMKY,Ramky Infrastructure Limited,EQ,08-OCT-2010,10,1,INE874I01013,10\r\n" + 
				"RAMSARUP,Ramsarup Industries Limited,BE,09-JUL-2007,10,1,INE005D01015,10\r\n" + 
				"RANASUG,Rana Sugars Limited,EQ,24-FEB-2005,10,1,INE625B01014,10\r\n" + 
				"RANEENGINE,Rane Engine Valve Limited,EQ,24-JUN-2008,10,1,INE222J01013,10\r\n" + 
				"RANEHOLDIN,Rane Holdings Limited,EQ,24-SEP-1997,10,1,INE384A01010,10\r\n" + 
				"RATNAMANI,Ratnamani Metals & Tubes Limited,EQ,09-MAY-2006,2,1,INE703B01027,2\r\n" + 
				"RAYMOND,Raymond Limited,EQ,18-OCT-1995,10,1,INE301A01014,10\r\n" + 
				"RBL,Rane Brake Lining Limited,EQ,20-JUN-2008,10,1,INE244J01017,10\r\n" + 
				"RBLBANK,RBL Bank Limited,EQ,31-AUG-2016,10,1,INE976G01028,10\r\n" + 
				"RCF,Rashtriya Chemicals and Fertilizers Limited,EQ,07-JAN-1998,10,1,INE027A01015,10\r\n" + 
				"RCOM,Reliance Communications Limited,EQ,06-MAR-2006,5,1,INE330H01018,5\r\n" + 
				"RECLTD,Rural Electrification Corporation Limited,EQ,12-MAR-2008,10,1,INE020B01018,10\r\n" + 
				"REDINGTON,Redington (India) Limited,EQ,15-FEB-2007,2,1,INE891D01026,2\r\n" + 
				"REFEX,Refex Industries Limited,EQ,03-DEC-2009,10,1,INE056I01017,10\r\n" + 
				"REGENCERAM,Regency Ceramics Limited,BE,05-JUN-1996,10,1,INE277C01012,10\r\n" + 
				"RELAXO,Relaxo Footwears Limited,EQ,17-JUN-2011,1,1,INE131B01039,1\r\n" + 
				"RELCAPITAL,Reliance Capital Limited,EQ,29-NOV-1995,10,1,INE013A01015,10\r\n" + 
				"RELIANCE,Reliance Industries Limited,EQ,29-NOV-1995,10,1,INE002A01018,10\r\n" + 
				"RELIGARE,Religare Enterprises Limited,EQ,21-NOV-2007,10,1,INE621H01010,10\r\n" + 
				"RELINFRA,Reliance Infrastructure Limited,EQ,08-FEB-1995,10,1,INE036A01016,10\r\n" + 
				"REMSONSIND,Remsons Industries Limited,EQ,31-JAN-1996,10,1,INE474C01015,10\r\n" + 
				"RENUKA,Shree Renuka Sugars Limited,EQ,31-OCT-2005,1,1,INE087H01022,1\r\n" + 
				"REPCOHOME,Repco Home Finance Limited,EQ,01-APR-2013,10,1,INE612J01015,10\r\n" + 
				"REPRO,Repro India Limited,EQ,22-DEC-2005,10,1,INE461B01014,10\r\n" + 
				"RESPONIND,Responsive Industries Limited,EQ,29-OCT-2010,1,1,INE688D01026,1\r\n" + 
				"REVATHI,Revathi Equipment Limited,EQ,11-AUG-2005,10,1,INE617A01013,10\r\n" + 
				"RHFL,Reliance Home Finance Limited,EQ,22-SEP-2017,10,1,INE217K01011,10\r\n" + 
				"RICOAUTO,Rico Auto Industries Limited,EQ,12-MAY-2003,1,1,INE209B01025,1\r\n" + 
				"RIIL,Reliance Industrial Infrastructure Limited,EQ,29-NOV-1995,10,1,INE046A01015,10\r\n" + 
				"RJL,Renaissance Jewellery Limited,EQ,12-DEC-2007,10,1,INE722H01016,10\r\n" + 
				"RKDL,Ravi Kumar Distilleries Limited,EQ,27-DEC-2010,10,1,INE722J01012,10\r\n" + 
				"RKFORGE,Ramkrishna Forgings Limited,EQ,05-MAY-2004,10,1,INE399G01015,10\r\n" + 
				"RMCL,Radha Madhav Corporation Limited,EQ,26-NOV-2007,10,1,INE172H01014,10\r\n" + 
				"RML,Rane (Madras) Limited,EQ,30-AUG-2005,10,1,INE050H01012,10\r\n" + 
				"RNAM,Reliance Nippon Life Asset Management Limited,EQ,06-NOV-2017,10,1,INE298J01013,10\r\n" + 
				"RNAVAL,Reliance Naval and Engineering Limited,EQ,09-OCT-2009,10,1,INE542F01012,10\r\n" + 
				"ROHITFERRO,Rohit Ferro-Tech Limited,EQ,13-APR-2006,10,1,INE248H01012,10\r\n" + 
				"ROHLTD,Royal Orchid Hotels Limited,EQ,06-FEB-2006,10,1,INE283H01019,10\r\n" + 
				"ROLLT,Rollatainers Limited,EQ,22-NOV-2016,1,1,INE927A01040,1\r\n" + 
				"ROLTA,Rolta India Limited,EQ,01-MAR-1995,10,1,INE293A01013,10\r\n" + 
				"ROSSELLIND,Rossell India Limited,EQ,25-SEP-2012,2,1,INE847C01020,2\r\n" + 
				"RPGLIFE,RPG Life Sciences Limited,EQ,10-JUN-2008,8,1,INE105J01010,8\r\n" + 
				"RPOWER,Reliance Power Limited,EQ,11-FEB-2008,10,1,INE614G01033,10\r\n" + 
				"RPPINFRA,R.P.P. Infra Projects Limited,EQ,06-DEC-2010,10,1,INE324L01013,10\r\n" + 
				"RSSOFTWARE,R. S. Software (India) Limited,EQ,19-MAY-1999,5,1,INE165B01029,5\r\n" + 
				"RSWM,RSWM Limited,EQ,15-FEB-1995,10,1,INE611A01016,10\r\n" + 
				"RSYSTEMS,R Systems International Limited,EQ,26-APR-2006,1,1,INE411H01032,1\r\n" + 
				"RTNINFRA,RattanIndia Infrastructure Limited,EQ,30-JUL-2012,2,1,INE834M01019,2\r\n" + 
				"RTNPOWER,RattanIndia Power Limited,EQ,30-OCT-2009,10,1,INE399K01017,10\r\n" + 
				"RUBYMILLS,The Ruby Mills Limited,EQ,29-MAR-1995,5,1,INE301D01026,5\r\n" + 
				"RUCHINFRA,Ruchi Infrastructure Limited,BE,16-OCT-1996,1,1,INE413B01023,1\r\n" + 
				"RUCHIRA,Ruchira Papers Limited,EQ,20-DEC-2006,10,1,INE803H01014,10\r\n" + 
				"RUCHISOYA,Ruchi Soya Industries Limited,EQ,02-JAN-2003,2,1,INE619A01027,2\r\n" + 
				"RUPA,Rupa & Company Limited,EQ,07-DEC-2011,1,1,INE895B01021,1\r\n" + 
				"RUSHIL,Rushil Decor Limited,EQ,07-JUL-2011,10,1,INE573K01017,10\r\n" + 
				"SABEVENTS,Sab Events & Governance Now Media Limited,BE,15-SEP-2016,10,1,INE860T01019,10\r\n" + 
				"SABTN,Sri Adhikari Brothers Television Network Limited,BE,16-NOV-2007,10,1,INE416A01036,10\r\n" + 
				"SADBHAV,Sadbhav Engineering Limited,EQ,01-MAR-2006,1,1,INE226H01026,1\r\n" + 
				"SADBHIN,Sadbhav Infrastructure Project Limited,EQ,16-SEP-2015,10,1,INE764L01010,10\r\n" + 
				"SAGCEM,Sagar Cements Limited,EQ,29-JAN-2007,10,1,INE229C01013,10\r\n" + 
				"SAIL,Steel Authority of India Limited,EQ,06-JUL-1995,10,1,INE114A01011,10\r\n" + 
				"SAKHTISUG,Sakthi Sugars Limited,EQ,06-SEP-1995,10,1,INE623A01011,10\r\n" + 
				"SAKSOFT,Saksoft Limited,EQ,09-MAY-2005,10,1,INE667G01015,10\r\n" + 
				"SAKUMA,Sakuma Exports Limited,EQ,08-MAR-2006,10,1,INE190H01016,10\r\n" + 
				"SALASAR,Salasar Techno Engineering Limited,EQ,25-JUL-2017,10,1,INE170V01019,10\r\n" + 
				"SALONA,Salona Cotspin Limited,EQ,16-JUN-2016,10,1,INE498E01010,10\r\n" + 
				"SALORAINTL,Salora International Limited,EQ,15-FEB-1995,10,1,INE924A01013,10\r\n" + 
				"SALSTEEL,S.A.L. Steel Limited,EQ,24-NOV-2004,10,1,INE658G01014,10\r\n" + 
				"SALZERELEC,Salzer Electronics Limited,EQ,02-DEC-2015,10,1,INE457F01013,10\r\n" + 
				"SAMBHAAV,Sambhaav Media Limited,EQ,05-JUN-1996,1,1,INE699B01027,1\r\n" + 
				"SAMTEL,Samtel Color Limited,BZ,23-FEB-2005,10,1,INE381A01016,10\r\n" + 
				"SANCO,Sanco Industries Limited,EQ,22-NOV-2016,10,1,INE782L01012,10\r\n" + 
				"SANDESH,The Sandesh Limited,EQ,26-NOV-2002,10,1,INE583B01015,10\r\n" + 
				"SANDHAR,Sandhar Technologies Limited,EQ,02-APR-2018,10,1,INE278H01035,10\r\n" + 
				"SANGAMIND,Sangam (India) Limited,EQ,17-JUL-1996,10,1,INE495C01010,10\r\n" + 
				"SANGHIIND,Sanghi Industries Limited,EQ,10-MAY-1995,10,1,INE999B01013,10\r\n" + 
				"SANGHVIFOR,Sanghvi Forging and Engineering Limited,EQ,23-MAY-2011,10,1,INE263L01013,10\r\n" + 
				"SANGHVIMOV,Sanghvi Movers Limited,EQ,24-JAN-2007,2,1,INE989A01024,2\r\n" + 
				"SANOFI,Sanofi India Limited,EQ,19-MAY-2003,10,1,INE058A01010,10\r\n" + 
				"SANWARIA,Sanwaria Consumer Limited,EQ,27-MAR-2006,1,1,INE890C01046,1\r\n" + 
				"SARDAEN,Sarda Energy & Minerals Limited,EQ,03-DEC-2009,10,1,INE385C01013,10\r\n" + 
				"SAREGAMA,Saregama India Limited,EQ,30-JUL-1997,10,1,INE979A01017,10\r\n" + 
				"SARLAPOLY,Sarla Performance Fibers Limited,EQ,19-JAN-2007,1,1,INE453D01025,1\r\n" + 
				"SASKEN,Sasken Technologies Limited,EQ,09-SEP-2005,10,1,INE231F01020,10\r\n" + 
				"SASTASUNDR,Sastasundar Ventures Limited,EQ,05-OCT-2010,10,1,INE019J01013,10\r\n" + 
				"SATHAISPAT,Sathavahana Ispat Limited,EQ,27-DEC-2006,10,1,INE176C01016,10\r\n" + 
				"SATIN,Satin Creditcare Network Limited,EQ,26-AUG-2015,10,1,INE836B01017,10\r\n" + 
				"SBILIFE,SBI Life Insurance Company Limited,EQ,03-OCT-2017,10,1,INE123W01016,10\r\n" + 
				"SBIN,State Bank of India,EQ,01-MAR-1995,1,1,INE062A01020,1\r\n" + 
				"SCAPDVR,Stampede Capital Limited,BE,10-OCT-2017,1,1,INE224E01036,1\r\n" + 
				"SCHAEFFLER,Schaeffler India Limited,EQ,29-NOV-2000,10,1,INE513A01014,10\r\n" + 
				"SCHAND,S Chand And Company Limited,EQ,09-MAY-2017,5,1,INE807K01035,5\r\n" + 
				"SCHNEIDER,Schneider Electric Infrastructure Limited,EQ,20-MAR-2012,2,1,INE839M01018,2\r\n" + 
				"SCI,Shipping Corporation Of India Limited,EQ,13-AUG-1997,10,1,INE109A01011,10\r\n" + 
				"SDBL,Som Distilleries & Breweries Limited,EQ,18-MAR-2014,10,1,INE480C01012,10\r\n" + 
				"SEAMECLTD,Seamec Limited,EQ,28-JUN-1995,10,1,INE497B01018,10\r\n" + 
				"SELAN,Selan Exploration Technology Limited,EQ,26-SEP-2006,10,1,INE818A01017,10\r\n" + 
				"SELMCL,SEL Manufacturing Company Limited,EQ,21-AUG-2007,10,1,INE105I01012,10\r\n" + 
				"SEPOWER,S.E. Power Limited,EQ,27-JUL-2012,10,1,INE735M01018,10\r\n" + 
				"SEQUENT,Sequent Scientific Limited,EQ,10-MAR-2016,2,1,INE807F01027,2\r\n" + 
				"SERVALL,Servalakshmi Paper Limited,BZ,12-MAY-2011,10,1,INE431L01016,10\r\n" + 
				"SESHAPAPER,Seshasayee Paper and Boards Limited,EQ,29-MAR-1995,10,1,INE630A01016,10\r\n" + 
				"SETCO,Setco Automotive Limited,EQ,01-JUL-2016,2,1,INE878E01021,2\r\n" + 
				"SEZAL,Sezal Glass Limited,BZ,22-NOV-2011,10,1,INE955I01036,10\r\n" + 
				"SFL,Sheela Foam Limited,EQ,09-DEC-2016,5,1,INE916U01025,5\r\n" + 
				"SGFL,Shree Ganesh Forgings Limited,BE,22-MAY-2007,10,1,INE883G01018,10\r\n" + 
				"SGL,STL Global Limited,EQ,10-APR-2006,10,1,INE353H01010,10\r\n" + 
				"SHAHALLOYS,Shah Alloys Limited,EQ,16-JUN-2005,10,1,INE640C01011,10\r\n" + 
				"SHAKTIPUMP,Shakti Pumps (India) Limited,EQ,29-JAN-2015,10,1,INE908D01010,10\r\n" + 
				"SHALBY,Shalby Limited,EQ,15-DEC-2017,10,1,INE597J01018,10\r\n" + 
				"SHALPAINTS,Shalimar Paints Limited,EQ,03-MAR-2008,2,1,INE849C01026,2\r\n" + 
				"SHANKARA,Shankara Building Products Limited,EQ,05-APR-2017,10,1,INE274V01019,10\r\n" + 
				"SHANTIGEAR,Shanthi Gears Limited,EQ,17-JAN-1996,1,1,INE631A01022,1\r\n" + 
				"SHARDACROP,Sharda Cropchem Limited,EQ,23-SEP-2014,10,1,INE221J01015,10\r\n" + 
				"SHARDAMOTR,Sharda Motor Industries Limited,EQ,03-SEP-2015,10,1,INE597I01010,10\r\n" + 
				"SHARONBIO,Sharon Bio-Medicine Limited,BZ,07-DEC-2011,2,1,INE028B01029,2\r\n" + 
				"SHEMAROO,Shemaroo Entertainment Limited,EQ,01-OCT-2014,10,1,INE363M01019,10\r\n" + 
				"SHILPAMED,Shilpa Medicare Limited,EQ,03-DEC-2009,1,1,INE790G01031,1\r\n" + 
				"SHILPI,Shilpi Cable Technologies Limited,EQ,08-APR-2011,10,1,INE510K01019,10\r\n" + 
				"SHIRPUR-G,Shirpur Gold Refinery Limited,EQ,21-MAR-2001,10,1,INE196B01016,10\r\n" + 
				"SHIVAMAUTO,Shivam Autotech Limited,EQ,21-NOV-2006,2,1,INE637H01024,2\r\n" + 
				"SHIVAMILLS,Shiva Mills Limited,EQ,26-FEB-2018,10,1,INE644Y01017,10\r\n" + 
				"SHIVATEX,Shiva Texyarn Limited,EQ,26-DEC-2017,10,1,INE705C01020,10\r\n" + 
				"SHK,S H Kelkar and Company Limited,EQ,16-NOV-2015,10,1,INE500L01026,10\r\n" + 
				"SHOPERSTOP,Shoppers Stop Limited,EQ,23-MAY-2005,5,1,INE498B01024,5\r\n" + 
				"SHREECEM,SHREE CEMENT LIMITED,EQ,26-APR-1995,10,1,INE070A01015,10\r\n" + 
				"SHREEPUSHK,Shree Pushkar Chemicals & Fertilisers Limited,EQ,10-SEP-2015,10,1,INE712K01011,10\r\n" + 
				"SHREERAMA,Shree Rama Multi-Tech Limited,EQ,13-MAR-2000,5,1,INE879A01019,5\r\n" + 
				"SHREYANIND,Shreyans Industries Limited,EQ,06-NOV-1996,10,1,INE231C01019,10\r\n" + 
				"SHREYAS,Shreyas Shipping & Logistics Limited,EQ,01-MAR-1995,10,1,INE757B01015,10\r\n" + 
				"SHRIPISTON,Shriram Pistons & Rings Limited,BE,02-JUN-2016,10,1,INE526E01018,10\r\n" + 
				"SHRIRAMCIT,Shriram City Union Finance Limited,EQ,04-APR-2005,10,1,INE722A01011,10\r\n" + 
				"SHRIRAMEPC,Shriram EPC Limited,EQ,20-FEB-2008,10,1,INE964H01014,10\r\n" + 
				"SHYAMCENT,Shyam Century Ferrous Limited,EQ,28-JUL-2015,1,1,INE979R01011,1\r\n" + 
				"SHYAMTEL,Shyam Telecom Limited,EQ,06-NOV-2006,10,1,INE635A01023,10\r\n" + 
				"SICAGEN,Sicagen India Limited,EQ,21-AUG-2008,10,1,INE176J01011,10\r\n" + 
				"SICAL,Sical Logistics Limited,EQ,28-APR-1999,10,1,INE075B01012,10\r\n" + 
				"SIEMENS,Siemens Limited,EQ,06-SEP-1995,2,1,INE003A01024,2\r\n" + 
				"SIGNET,Signet Industries Limited,EQ,13-MAR-2015,1,1,INE529F01027,1\r\n" + 
				"SIL,Standard Industries Limited,BE,27-JAN-2004,5,1,INE173A01025,5\r\n" + 
				"SILINV,SIL Investments Limited,EQ,22-MAY-1996,10,1,INE923A01015,10\r\n" + 
				"SIMBHALS,Simbhaoli Sugars Limited,EQ,14-MAR-2016,10,1,INE748T01016,10\r\n" + 
				"SIMPLEX,Simplex Projects Limited,EQ,03-AUG-2007,10,1,INE898F01018,10\r\n" + 
				"SIMPLEXINF,Simplex Infrastructures Limited,EQ,09-MAR-2004,2,1,INE059B01024,2\r\n" + 
				"SINTEX,Sintex Industries Limited,EQ,05-NOV-1998,1,1,INE429C01035,1\r\n" + 
				"SIS,Security and Intelligence Services (India) Limited,EQ,10-AUG-2017,10,1,INE285J01010,10\r\n" + 
				"SITASHREE,Sita Shree Food Products Limited,BE,07-APR-2008,10,1,INE686I01011,10\r\n" + 
				"SITINET,Siti Networks Limited,EQ,10-JAN-2007,1,1,INE965H01011,1\r\n" + 
				"SIYSIL,Siyaram Silk Mills Limited,EQ,29-JAN-2007,2,1,INE076B01028,2\r\n" + 
				"SJVN,SJVN Limited,EQ,20-MAY-2010,10,1,INE002L01015,10\r\n" + 
				"SKFINDIA,SKF India Limited,EQ,27-JAN-1999,10,1,INE640A01023,10\r\n" + 
				"SKIL,SKIL Infrastructure Limited,BE,09-OCT-1996,10,1,INE429F01012,10\r\n" + 
				"SKIPPER,Skipper Limited,EQ,27-MAY-2015,1,1,INE439E01022,1\r\n" + 
				"SKMEGGPROD,SKM Egg Products Export (India) Limited,EQ,14-MAR-1997,10,1,INE411D01015,10\r\n" + 
				"SMARTLINK,Smartlink Network Systems Limited,EQ,11-APR-2001,2,1,INE178C01020,2\r\n" + 
				"SMLISUZU,SML Isuzu Limited,EQ,29-AUG-2003,10,1,INE294B01019,10\r\n" + 
				"SMPL,Splendid Metal Products Limited,EQ,09-MAR-2010,5,1,INE215G01021,5\r\n" + 
				"SMSLIFE,SMS Lifesciences India Limited,EQ,17-AUG-2017,10,1,INE320X01016,10\r\n" + 
				"SMSPHARMA,SMS Pharmaceuticals Limited,EQ,28-FEB-2007,1,1,INE812G01025,1\r\n" + 
				"SNOWMAN,Snowman Logistics Limited,EQ,12-SEP-2014,10,1,INE734N01019,10\r\n" + 
				"SOBHA,Sobha Limited,EQ,20-DEC-2006,10,1,INE671H01015,10\r\n" + 
				"SOLARINDS,Solar Industries India Limited,EQ,03-APR-2006,2,1,INE343H01029,2\r\n" + 
				"SOMANYCERA,Somany Ceramics Limited,EQ,22-NOV-1995,2,1,INE355A01028,2\r\n" + 
				"SOMATEX,Soma Textiles & Industries Limited,EQ,14-AUG-1996,10,1,INE314C01013,10\r\n" + 
				"SOMICONVEY,Somi Conveyor Beltings Limited,EQ,18-JUL-2016,10,1,INE323J01019,10\r\n" + 
				"SONASTEER,Sona Koyo Steering Systems Limited,EQ,12-JAN-2004,1,1,INE643A01035,1\r\n" + 
				"SONATSOFTW,Sonata Software Limited,EQ,28-JUL-1999,1,1,INE269A01021,1\r\n" + 
				"SORILHOLD,SORIL Holdings and Ventures Limited,EQ,18-AUG-2011,2,1,INE126M01010,2\r\n" + 
				"SORILINFRA,SORIL Infra Resources Limited,EQ,06-DEC-2005,10,1,INE034H01016,10\r\n" + 
				"SOTL,Savita Oil Technologies Limited,EQ,28-JUN-1995,10,1,INE035D01012,10\r\n" + 
				"SOUTHBANK,The South Indian Bank Limited,EQ,08-DEC-1998,1,1,INE683A01023,1\r\n" + 
				"SPAL,S. P. Apparels Limited,EQ,12-AUG-2016,10,1,INE212I01016,10\r\n" + 
				"SPARC,Sun Pharma Advanced Research Company Limited,EQ,18-JUL-2007,1,1,INE232I01014,1\r\n" + 
				"SPECIALITY,Speciality Restaurants Limited,EQ,30-MAY-2012,10,1,INE247M01014,10\r\n" + 
				"SPENTEX,Spentex Industries Limited,BE,20-DEC-2006,10,1,INE376C01020,10\r\n" + 
				"SPHEREGSL,Sphere Global Services Limited,EQ,13-AUG-1997,10,1,INE737B01033,10\r\n" + 
				"SPIC,Southern Petrochemicals Industries Corporation  Limited,EQ,10-JAN-1996,10,1,INE147A01011,10\r\n" + 
				"SPICEMOBI,Spice Mobility Limited,EQ,27-MAY-2008,3,1,INE927C01020,3\r\n" + 
				"SPLIL,SPL Industries Limited,EQ,26-JUL-2005,10,1,INE978G01016,10\r\n" + 
				"SPMLINFRA,SPML Infra Limited,EQ,14-FEB-1996,2,1,INE937A01023,2\r\n" + 
				"SPTL,Sintex Plastics Technology Limited,EQ,08-AUG-2017,1,1,INE501W01021,1\r\n" + 
				"SPYL,Shekhawati Poly-Yarn Limited,BE,12-JAN-2011,1,1,INE268L01020,1\r\n" + 
				"SQSBFSI,SQS India BFSI Limited,EQ,26-OCT-2009,10,1,INE201K01015,10\r\n" + 
				"SREEL,Sreeleathers Limited,EQ,01-JAN-2014,10,1,INE099F01013,10\r\n" + 
				"SREINFRA,SREI Infrastructure Finance Limited,EQ,20-DEC-1995,10,1,INE872A01014,10\r\n" + 
				"SRF,SRF Limited,EQ,18-AUG-2003,10,1,INE647A01010,10\r\n" + 
				"SRHHYPOLTD,Sree Rayalaseema Hi-Strength Hypo Limited,EQ,08-MAY-2007,10,1,INE917H01012,10\r\n" + 
				"SRIPIPES,Srikalahasthi Pipes Limited,EQ,28-AUG-2007,10,1,INE943C01027,10\r\n" + 
				"SRSLTD,SRS Limited,EQ,16-SEP-2011,10,1,INE219H01039,10\r\n" + 
				"SRTRANSFIN,Shriram Transport Finance Company Limited,EQ,11-DEC-1996,10,1,INE721A01013,10\r\n" + 
				"SSWL,Steel Strips Wheels Limited,EQ,06-JUN-2005,10,1,INE802C01017,10\r\n" + 
				"STAMPEDE,Stampede Capital Limited,BE,25-JUL-2016,1,1,INE224E01028,1\r\n" + 
				"STAR,Strides Shasun Limited,EQ,02-FEB-2000,10,1,INE939A01011,10\r\n" + 
				"STARCEMENT,Star Cement Limited,EQ,16-JUN-2017,1,1,INE460H01021,1\r\n" + 
				"STARPAPER,Star Paper Mills Limited,EQ,13-SEP-1995,10,1,INE733A01018,10\r\n" + 
				"STCINDIA,The State Trading Corporation of India Limited,EQ,01-APR-2003,10,1,INE655A01013,10\r\n" + 
				"STEELXIND,STEEL EXCHANGE INDIA LIMITED,EQ,20-JUL-2017,10,1,INE503B01013,10\r\n" + 
				"STEL,Stel Holdings Limited,EQ,09-FEB-2011,10,1,INE577L01016,10\r\n" + 
				"STERLINBIO,Sterling Biotech Limited,BE,12-MAY-2003,1,1,INE324C01038,1\r\n" + 
				"STERLINBIO,Sterling Biotech Limited,BZ,12-MAY-2003,1,1,INE324C01038,1\r\n" + 
				"STERTOOLS,Sterling Tools Limited,EQ,02-FEB-2006,2,1,INE334A01023,2\r\n" + 
				"STINDIA,STI India Limited,EQ,06-DEC-1995,10,1,INE090C01019,10\r\n" + 
				"STRTECH,Sterlite Technologies Limited,EQ,08-DEC-2000,2,1,INE089C01029,2\r\n" + 
				"SUBEX,Subex Limited,EQ,05-SEP-2003,10,1,INE754A01014,10\r\n" + 
				"SUBROS,Subros Limited,EQ,13-JUL-2005,2,1,INE287B01021,2\r\n" + 
				"SUDARSCHEM,Sudarshan Chemical Industries Limited,EQ,25-MAY-1995,2,1,INE659A01023,2\r\n" + 
				"SUJANAUNI,Sujana Universal Industries Limited,BE,19-FEB-2008,10,1,INE216G01011,10\r\n" + 
				"SUMEETINDS,Sumeet Industries Limited,EQ,10-DEC-2010,10,1,INE235C01010,10\r\n" + 
				"SUMMITSEC,Summit Securities Limited,EQ,28-JAN-2011,10,1,INE519C01017,10\r\n" + 
				"SUNCLAYLTD,Sundaram Clayton Limited,EQ,23-OCT-2012,5,1,INE105A01035,5\r\n" + 
				"SUNDARAM,Sundaram Multi Pap Limited,EQ,02-JUN-2010,1,1,INE108E01023,1\r\n" + 
				"SUNDARMFIN,Sundaram Finance Limited,EQ,07-JAN-1998,10,1,INE660A01013,10\r\n" + 
				"SUNDARMHLD,Sundaram Finance Holdings Limited,BE,26-MAR-2018,5,1,INE202Z01029,5\r\n" + 
				"SUNDRMBRAK,Sundaram Brake Linings Limited,EQ,17-JUL-1996,10,1,INE073D01013,10\r\n" + 
				"SUNDRMFAST,Sundram Fasteners Limited,EQ,07-JUN-2000,1,1,INE387A01021,1\r\n" + 
				"SUNFLAG,Sunflag Iron And Steel Company Limited,EQ,29-SEP-2005,10,1,INE947A01014,10\r\n" + 
				"SUNILHITEC,Sunil Hitech Engineers Limited,EQ,02-MAR-2006,1,1,INE305H01028,1\r\n" + 
				"SUNPHARMA,Sun Pharmaceutical Industries Limited,EQ,08-FEB-1995,1,1,INE044A01036,1\r\n" + 
				"SUNTECK,Sunteck Realty Limited,EQ,13-NOV-2009,1,1,INE805D01034,1\r\n" + 
				"SUNTV,Sun TV Network Limited,EQ,24-APR-2006,5,1,INE424H01027,5\r\n" + 
				"SUPERHOUSE,Superhouse Limited,EQ,26-SEP-2014,10,1,INE712B01010,10\r\n" + 
				"SUPERSPIN,Super Spinning Mills Limited,EQ,08-JUL-2004,1,1,INE662A01027,1\r\n" + 
				"SUPPETRO,Supreme Petrochem Limited,EQ,13-OCT-1999,10,1,INE663A01017,10\r\n" + 
				"SUPRAJIT,Suprajit Engineering Limited,EQ,18-FEB-2005,1,1,INE399C01030,1\r\n" + 
				"SUPREMEIND,Supreme Industries Limited,EQ,19-JUL-1995,2,1,INE195A01028,2\r\n" + 
				"SUPREMEINF,Supreme Infrastructure India Limited,EQ,18-OCT-2007,10,1,INE550H01011,10\r\n" + 
				"SUPREMETEX,Supreme Tex Mart Limited,BE,14-MAR-2007,5,1,INE651G01027,5\r\n" + 
				"SURANACORP,Surana Corporation Limited,BE,27-MAY-2008,10,1,INE357D01010,10\r\n" + 
				"SURANAIND,Surana Industries Limited,BE,28-DEC-2006,10,1,INE659D01019,10\r\n" + 
				"SURANASOL,Surana Solar Limited,EQ,07-JAN-2011,5,1,INE272L01022,5\r\n" + 
				"SURANAT&P,Surana Telecom and Power Limited,EQ,22-MAY-2002,1,1,INE130B01031,1\r\n" + 
				"SURYALAXMI,Suryalakshmi Cotton Mills Limited,EQ,15-JUN-2005,10,1,INE713B01026,10\r\n" + 
				"SURYAROSNI,Surya Roshni Limited,EQ,10-MAY-1995,10,1,INE335A01012,10\r\n" + 
				"SUTLEJTEX,Sutlej Textiles and Industries Limited,EQ,14-DEC-2006,1,1,INE645H01027,1\r\n" + 
				"SUVEN,Suven Life Sciences Limited,EQ,23-OCT-2003,1,1,INE495B01038,1\r\n" + 
				"SUZLON,Suzlon Energy Limited,EQ,19-OCT-2005,2,1,INE040H01021,2\r\n" + 
				"SWANENERGY,Swan Energy Limited,EQ,29-MAY-2012,1,1,INE665A01038,1\r\n" + 
				"SWARAJENG,Swaraj Engines Limited,EQ,06-DEC-1995,10,1,INE277A01016,10\r\n" + 
				"SWELECTES,Swelect Energy Systems Limited,EQ,09-MAY-2006,10,1,INE409B01013,10\r\n" + 
				"SYMPHONY,Symphony Limited,EQ,15-JUN-2011,2,1,INE225D01027,2\r\n" + 
				"SYNCOM,Syncom Healthcare Limited,EQ,15-FEB-2010,10,1,INE602K01014,10\r\n" + 
				"SYNDIBANK,Syndicate Bank,EQ,22-DEC-1999,10,1,INE667A01018,10\r\n" + 
				"SYNGENE,Syngene International Limited,EQ,11-AUG-2015,10,1,INE398R01022,10\r\n" + 
				"TAINWALCHM,Tainwala Chemical and Plastic (I) Limited,EQ,27-JUL-1995,10,1,INE123C01018,10\r\n" + 
				"TAJGVK,Taj GVK Hotels & Resorts Limited,EQ,20-DEC-2000,2,1,INE586B01026,2\r\n" + 
				"TAKE,Take Solutions Limited,EQ,27-AUG-2007,1,1,INE142I01023,1\r\n" + 
				"TALBROAUTO,Talbros Automotive Components Limited,EQ,29-SEP-2006,10,1,INE187D01011,10\r\n" + 
				"TALWALKARS,Talwalkars Better Value Fitness Limited,BE,10-MAY-2010,10,1,INE502K01016,10\r\n" + 
				"TANLA,Tanla Solutions Limited,EQ,05-JAN-2007,1,1,INE483C01032,1\r\n" + 
				"TANTIACONS,Tantia Constructions Limited,BE,19-FEB-2008,10,1,INE388G01018,10\r\n" + 
				"TARAJEWELS,Tara Jewels Limited,EQ,06-DEC-2012,10,1,INE799L01016,10\r\n" + 
				"TARAPUR,Tarapur Transformers Limited,EQ,18-MAY-2010,10,1,INE747K01017,10\r\n" + 
				"TARMAT,Tarmat Limited,EQ,09-JUL-2007,10,1,INE924H01018,10\r\n" + 
				"TASTYBITE,Tasty Bite Eatables Limited,EQ,23-MAR-2017,10,1,INE488B01017,10\r\n" + 
				"TATACHEM,Tata Chemicals Limited,EQ,01-APR-1999,10,1,INE092A01019,10\r\n" + 
				"TATACHEM,Tata Chemicals Limited,IL,01-APR-1999,10,1,INE344201012,10\r\n" + 
				"TATACOFFEE,Tata Coffee Limited,EQ,16-FEB-2000,1,1,INE493A01027,1\r\n" + 
				"TATACOMM,Tata Communications Limited,EQ,12-APR-1995,10,1,INE151A01013,10\r\n" + 
				"TATAELXSI,Tata Elxsi Limited,EQ,17-SEP-2003,10,1,INE670A01012,10\r\n" + 
				"TATAGLOBAL,Tata Global Beverages Limited,EQ,18-NOV-1998,1,1,INE192A01025,1\r\n" + 
				"TATAINVEST,Tata Investment Corporation Limited,EQ,24-JUN-1998,10,1,INE672A01018,10\r\n" + 
				"TATAMETALI,Tata Metaliks Limited,EQ,27-MAY-2003,10,1,INE056C01010,10\r\n" + 
				"TATAMOTORS,Tata Motors Limited,EQ,22-JUL-1998,2,1,INE155A01022,2\r\n" + 
				"TATAMTRDVR,Tata Motors Limited,EQ,05-NOV-2008,2,1,IN9155A01020,2\r\n" + 
				"TATAPOWER,Tata Power Company Limited,EQ,03-APR-1996,1,1,INE245A01021,1\r\n" + 
				"TATASPONGE,Tata Sponge Iron Limited,EQ,24-FEB-2003,10,1,INE674A01014,10\r\n" + 
				"TATASTEEL,Tata Steel Limited,EQ,18-NOV-1998,10,1,INE081A01012,10\r\n" + 
				"TBZ,Tribhovandas Bhimji Zaveri Limited,EQ,09-MAY-2012,10,1,INE760L01018,10\r\n" + 
				"TCI,Transport Corporation of India Limited,EQ,21-JAN-2002,2,1,INE688A01022,2\r\n" + 
				"TCIDEVELOP,TCI Developers Limited,BE,19-APR-2011,10,1,INE662L01016,10\r\n" + 
				"TCIEXP,TCI Express Limited,EQ,15-DEC-2016,2,1,INE586V01016,2\r\n" + 
				"TCIFINANCE,TCI Finance Limited,EQ,21-MAY-1997,10,1,INE911B01018,10\r\n" + 
				"TCPLPACK,TCPL Packaging Limited,EQ,17-OCT-2017,10,1,INE822C01015,10\r\n" + 
				"TCS,Tata Consultancy Services Limited,EQ,25-AUG-2004,1,1,INE467B01029,1\r\n" + 
				"TDPOWERSYS,TD Power Systems Limited,EQ,08-SEP-2011,10,1,INE419M01019,10\r\n" + 
				"TEAMLEASE,Teamlease Services Limited,EQ,12-FEB-2016,10,1,INE985S01024,10\r\n" + 
				"TECHIN,Techindia Nirman Limited,BE,08-SEP-2011,10,1,INE778A01021,10\r\n" + 
				"TECHM,Tech Mahindra Limited,EQ,28-AUG-2006,5,1,INE669C01036,5\r\n" + 
				"TECHNO,Techno Electric & Engineering Company Limited,EQ,10-NOV-2010,2,1,INE286K01024,2\r\n" + 
				"TECHNOFAB,Technofab Engineering Limited,EQ,16-JUL-2010,10,1,INE509K01011,10\r\n" + 
				"TEJASNET,Tejas Networks Limited,EQ,27-JUN-2017,10,1,INE010J01012,10\r\n" + 
				"TERASOFT,Tera Software Limited,EQ,29-DEC-2016,10,1,INE482B01010,10\r\n" + 
				"TEXINFRA,Texmaco Infrastructure & Holdings Limited,EQ,09-SEP-2004,1,1,INE435C01024,1\r\n" + 
				"TEXMOPIPES,Texmo Pipes and Products Limited,EQ,10-MAR-2010,10,1,INE141K01013,10\r\n" + 
				"TEXRAIL,Texmaco Rail & Engineering Limited,EQ,03-MAR-2011,1,1,INE621L01012,1\r\n" + 
				"TFCILTD,Tourism Finance Corporation of India Limited,EQ,26-JUL-2000,10,1,INE305A01015,10\r\n" + 
				"TFL,Transwarranty Finance Limited,EQ,26-FEB-2007,10,1,INE804H01012,10\r\n" + 
				"TGBHOTELS,TGB Banquets And Hotels Limited,EQ,17-MAY-2007,10,1,INE797H01018,10\r\n" + 
				"THANGAMAYL,Thangamayil Jewellery Limited,EQ,19-FEB-2010,10,1,INE085J01014,10\r\n" + 
				"THEMISMED,Themis Medicare Limited,EQ,02-APR-2007,10,1,INE083B01016,10\r\n" + 
				"THERMAX,Thermax Limited,EQ,30-AUG-1995,2,1,INE152A01029,2\r\n" + 
				"THIRUSUGAR,Thiru Arooran Sugars Limited,EQ,02-MAY-1995,10,1,INE409A01015,10\r\n" + 
				"THOMASCOOK,Thomas Cook  (India)  Limited,EQ,07-JUN-2000,1,1,INE332A01027,1\r\n" + 
				"THOMASCOTT,Thomas Scott (India) Limited,BE,30-JAN-2012,10,1,INE480M01011,10\r\n" + 
				"THYROCARE,Thyrocare Technologies Limited,EQ,09-MAY-2016,10,1,INE594H01019,10\r\n" + 
				"TI,Tilaknagar Industries Limited,EQ,16-JUL-2010,10,1,INE133E01013,10\r\n" + 
				"TIDEWATER,Tide Water Oil Company (India) Limited,EQ,16-JAN-2007,5,1,INE484C01022,5\r\n" + 
				"TIFIN,TI Financial Holdings Limited,EQ,25-SEP-2017,1,1,INE149A01033,1\r\n" + 
				"TIIL,Technocraft Industries (India) Limited,EQ,12-FEB-2007,10,1,INE545H01011,10\r\n" + 
				"TIINDIA,Tube Investments of India Limited,EQ,02-NOV-2017,1,1,INE974X01010,1\r\n" + 
				"TIJARIA,Tijaria Polypipes Limited,BE,14-OCT-2011,10,1,INE440L01017,10\r\n" + 
				"TIL,TIL Limited,EQ,27-SEP-1995,10,1,INE806C01018,10\r\n" + 
				"TIMESGTY,Times Guaranty Limited,EQ,11-JUN-2002,10,1,INE289C01025,10\r\n" + 
				"TIMETECHNO,Time Technoplast Limited,EQ,13-JUN-2007,1,1,INE508G01029,1\r\n" + 
				"TIMKEN,Timken India Limited,EQ,06-FEB-2007,10,1,INE325A01013,10\r\n" + 
				"TINPLATE,The Tinplate Company of India Limited,EQ,27-JAN-2006,10,1,INE422C01014,10\r\n" + 
				"TIPSINDLTD,TIPS Industries Limited,EQ,10-NOV-2000,10,1,INE716B01011,10\r\n" + 
				"TIRUMALCHM,Thirumalai Chemicals Limited,EQ,14-MAY-2003,10,1,INE338A01016,10\r\n" + 
				"TITAN,Titan Company Limited,EQ,24-SEP-2004,1,1,INE280A01028,1\r\n" + 
				"TMRVL,The Mandhana Retail Ventures Limited,EQ,14-DEC-2016,10,1,INE759V01019,10\r\n" + 
				"TNPETRO,Tamilnadu PetroProducts Limited,EQ,27-OCT-1999,10,1,INE148A01019,10\r\n" + 
				"TNPL,Tamil Nadu Newsprint & Papers Limited,EQ,14-FEB-1996,10,1,INE107A01015,10\r\n" + 
				"TNTELE,Tamilnadu Telecommunication Limited,BE,04-FEB-2003,10,1,INE141D01018,10\r\n" + 
				"TODAYS,Todays Writing Instruments Limited,BZ,08-OCT-2001,10,1,INE944B01019,10\r\n" + 
				"TOKYOPLAST,Tokyo Plast International Limited,EQ,11-OCT-1995,10,1,INE932C01012,10\r\n" + 
				"TORNTPHARM,Torrent Pharmaceuticals Limited,EQ,25-NOV-2002,5,1,INE685A01028,5\r\n" + 
				"TORNTPOWER,Torrent Power Limited,EQ,28-NOV-2006,10,1,INE813H01021,10\r\n" + 
				"TPLPLASTEH,TPL Plastech Limited,EQ,20-MAY-2015,10,1,INE413G01014,10\r\n" + 
				"TREEHOUSE,Tree House Education & Accessories Limited,EQ,26-AUG-2011,10,1,INE040M01013,10\r\n" + 
				"TRENT,Trent Limited,EQ,07-JUN-2004,1,1,INE849A01020,1\r\n" + 
				"TRENT,Trent Limited,IL,07-JUN-2004,1,1,INE849A01020,1\r\n" + 
				"TRF,TRF Limited,EQ,26-MAR-2010,10,1,INE391D01019,10\r\n" + 
				"TRIDENT,Trident Limited,EQ,21-FEB-2001,10,1,INE064C01014,10\r\n" + 
				"TRIGYN,Trigyn Technologies Limited,EQ,09-APR-1998,10,1,INE948A01012,10\r\n" + 
				"TRIL,Transformers And Rectifiers (India) Limited,EQ,28-DEC-2007,1,1,INE763I01026,1\r\n" + 
				"TRITURBINE,Triveni Turbine Limited,EQ,28-OCT-2011,1,1,INE152M01016,1\r\n" + 
				"TRIVENI,Triveni Engineering & Industries Limited,EQ,13-DEC-2005,1,1,INE256C01024,1\r\n" + 
				"TTKHLTCARE,TTK Healthcare Limited,EQ,02-DEC-2015,10,1,INE910C01018,10\r\n" + 
				"TTKPRESTIG,TTK Prestige Limited,EQ,22-DEC-1999,10,1,INE690A01010,10\r\n" + 
				"TTL,T T Limited,EQ,22-FEB-2007,10,1,INE592B01016,10\r\n" + 
				"TTML,Tata Teleservices (Maharashtra) Limited,EQ,20-OCT-2000,10,1,INE517B01013,10\r\n" + 
				"TULSI,Tulsi Extrusions Limited,BE,25-FEB-2008,10,1,INE474I01012,10\r\n" + 
				"TV18BRDCST,TV18 Broadcast Limited,EQ,08-FEB-2007,2,1,INE886H01027,2\r\n" + 
				"TVSELECT,TVS Electronics Limited,EQ,26-DEC-2003,10,1,INE236G01019,10\r\n" + 
				"TVSMOTOR,TVS Motor Company Limited,EQ,02-AUG-2000,1,1,INE494B01023,1\r\n" + 
				"TVSSRICHAK,TVS Srichakra Limited,EQ,13-FEB-2007,10,1,INE421C01016,10\r\n" + 
				"TVTODAY,TV Today Network Limited,EQ,16-JAN-2004,5,1,INE038F01029,5\r\n" + 
				"TVVISION,TV Vision Limited,EQ,15-SEP-2016,10,1,INE871L01013,10\r\n" + 
				"TWL,Titagarh Wagons Limited,EQ,21-APR-2008,2,1,INE615H01020,2\r\n" + 
				"UBL,United Breweries Limited,EQ,28-JUL-2008,1,1,INE686F01025,1\r\n" + 
				"UCALFUEL,Ucal Fuel Systems Limited,EQ,13-SEP-1995,10,1,INE139B01016,10\r\n" + 
				"UCOBANK,UCO Bank,EQ,09-OCT-2003,10,1,INE691A01018,10\r\n" + 
				"UFLEX,UFLEX Limited,EQ,23-AUG-1995,10,1,INE516A01017,10\r\n" + 
				"UFO,UFO Moviez India Limited,EQ,14-MAY-2015,10,1,INE527H01019,10\r\n" + 
				"UGARSUGAR,The Ugar Sugar Works Limited,EQ,23-AUG-2010,1,1,INE071E01023,1\r\n" + 
				"UJAAS,Ujaas Energy Limited,EQ,20-OCT-2011,1,1,INE899L01022,1\r\n" + 
				"UJJIVAN,Ujjivan Financial Services Limited,EQ,10-MAY-2016,10,1,INE334L01012,10\r\n" + 
				"UJJIVAN,Ujjivan Financial Services Limited,IL,10-MAY-2016,10,1,INE334L01012,10\r\n" + 
				"ULTRACEMCO,UltraTech Cement Limited,EQ,24-AUG-2004,10,1,INE481G01011,10\r\n" + 
				"UMANGDAIRY,Umang Dairies Limited,EQ,02-DEC-2015,5,1,INE864B01027,5\r\n" + 
				"UMESLTD,Usha Martin Education & Solutions Limited,EQ,12-JUL-2010,1,1,INE240C01028,1\r\n" + 
				"UNICHEMLAB,Unichem Laboratories Limited,EQ,07-FEB-2001,2,1,INE351A01035,2\r\n" + 
				"UNIENTER,Uniphos Enterprises Limited,EQ,23-JAN-2004,2,1,INE037A01022,2\r\n" + 
				"UNIONBANK,Union Bank of India,EQ,24-SEP-2002,10,1,INE692A01016,10\r\n" + 
				"UNIPLY,Uniply Industries Limited,EQ,08-MAR-2007,10,1,INE950G01015,10\r\n" + 
				"UNITECH,Unitech Limited,EQ,08-SEP-1999,2,1,INE694A01020,2\r\n" + 
				"UNITEDBNK,United Bank of India,EQ,18-MAR-2010,10,1,INE695A01019,10\r\n" + 
				"UNITEDTEA,The United Nilgiri Tea Estates Company Limited,EQ,28-JAN-2015,10,1,INE458F01011,10\r\n" + 
				"UNITY,Unity Infraprojects Limited,EQ,12-JUN-2006,2,1,INE466H01028,2\r\n" + 
				"UNIVCABLES,Universal Cables Limited,EQ,17-MAY-1995,10,1,INE279A01012,10\r\n" + 
				"UPL,UPL Limited,EQ,23-JAN-2004,2,1,INE628A01036,2\r\n" + 
				"URJA,Urja Global Limited,BE,28-MAR-2017,1,1,INE550C01020,1\r\n" + 
				"USHAMART,Usha Martin Limited,EQ,11-OCT-2000,1,1,INE228A01035,1\r\n" + 
				"USHERAGRO,Usher Agro Limited,EQ,30-JUL-2010,10,1,INE235G01011,10\r\n" + 
				"UTTAMSTL,Uttam Galva Steels Limited,BE,25-MAY-1995,10,1,INE699A01011,10\r\n" + 
				"UTTAMSUGAR,Uttam Sugar Mills Limited,EQ,10-APR-2006,10,1,INE786F01031,10\r\n" + 
				"UVSL,Uttam Value Steels Limited,BE,24-JUN-2016,1,1,INE292A01023,1\r\n" + 
				"V2RETAIL,V2 Retail Limited,EQ,04-JUL-2007,10,1,INE945H01013,10\r\n" + 
				"VADILALIND,Vadilal Industries Limited,EQ,15-JUN-2011,10,1,INE694D01016,10\r\n" + 
				"VAIBHAVGBL,Vaibhav Global Limited,EQ,05-APR-2004,10,1,INE884A01019,10\r\n" + 
				"VAKRANGEE,Vakrangee Limited,EQ,03-APR-2006,1,1,INE051B01021,1\r\n" + 
				"VARDHACRLC,Vardhman Acrylics Limited,EQ,30-SEP-2003,10,1,INE116G01013,10\r\n" + 
				"VARDMNPOLY,Vardhman Polytex Limited,EQ,12-MAY-2003,10,1,INE835A01011,10\r\n" + 
				"VASCONEQ,Vascon Engineers Limited,EQ,15-FEB-2010,10,1,INE893I01013,10\r\n" + 
				"VASWANI,Vaswani Industries Limited,EQ,20-SEP-2011,10,1,INE590L01019,10\r\n" + 
				"VBL,Varun Beverages Limited,EQ,08-NOV-2016,10,1,INE200M01013,10\r\n" + 
				"VEDL,Vedanta Limited,EQ,13-MAY-1998,1,1,INE205A01025,1\r\n" + 
				"VENKEYS,Venky's (India) Limited,EQ,28-JUL-2003,10,1,INE398A01010,10\r\n" + 
				"VENUSREM,Venus Remedies Limited,EQ,20-DEC-2006,10,1,INE411B01019,10\r\n" + 
				"VESUVIUS,Vesuvius India Limited,EQ,04-OCT-2002,10,1,INE386A01015,10\r\n" + 
				"VETO,Veto Switchgears And Cables Limited,EQ,29-APR-2015,10,1,INE918N01018,10\r\n" + 
				"VGUARD,V-Guard Industries Limited,EQ,13-MAR-2008,1,1,INE951I01027,1\r\n" + 
				"VHL,Vardhman Holdings Limited,EQ,30-JUN-2005,10,1,INE701A01023,10\r\n" + 
				"VICEROY,Viceroy Hotels Limited,EQ,21-AUG-2007,10,1,INE048C01017,10\r\n" + 
				"VIDHIING,Vidhi Specialty Food Ingredients Limited,EQ,02-MAR-2016,1,1,INE632C01026,1\r\n" + 
				"VIJAYABANK,Vijaya Bank,EQ,10-JAN-2001,10,1,INE705A01016,10\r\n" + 
				"VIJIFIN,Viji Finance Limited,BE,11-JUL-2016,1,1,INE159N01027,1\r\n" + 
				"VIJSHAN,Vijay Shanthi Builders Limited,EQ,21-MAY-2008,10,1,INE806F01011,10\r\n" + 
				"VIKASECO,Vikas EcoTech Limited,EQ,12-DEC-2011,1,1,INE806A01020,1\r\n" + 
				"VIMALOIL,Vimal Oil & Foods Limited,BE,21-MAY-2013,10,1,INE067D01015,10\r\n" + 
				"VIMTALABS,Vimta Labs Limited,BE,15-DEC-2005,2,1,INE579C01029,2\r\n" + 
				"VINATIORGA,Vinati Organics Limited,EQ,28-JUL-2009,2,1,INE410B01029,2\r\n" + 
				"VINDHYATEL,Vindhya Telelinks Limited,EQ,08-FEB-1995,10,1,INE707A01012,10\r\n" + 
				"VINYLINDIA,Vinyl Chemicals (India) Limited,EQ,21-JUL-2008,1,1,INE250B01029,1\r\n" + 
				"VIPCLOTHNG,VIP Clothing Limited,EQ,06-AUG-2007,2,1,INE450G01024,2\r\n" + 
				"VIPIND,VIP Industries Limited,EQ,02-MAR-2005,2,1,INE054A01027,2\r\n" + 
				"VIPULLTD,Vipul Limited,EQ,23-APR-2015,1,1,INE946H01037,1\r\n" + 
				"VISAKAIND,Visaka Industries Limited,EQ,28-AUG-1996,10,1,INE392A01013,10\r\n" + 
				"VISASTEEL,Visa Steel Limited,EQ,17-MAR-2006,10,1,INE286H01012,10\r\n" + 
				"VISESHINFO,Visesh Infotecnics Limited,BE,14-JAN-2000,1,1,INE861A01058,1\r\n" + 
				"VISHNU,Vishnu Chemicals Limited,EQ,05-MAR-2015,10,1,INE270I01014,10\r\n" + 
				"VIVIDHA,Visagar Polytex Limited,EQ,21-MAY-2013,1,1,INE370E01029,1\r\n" + 
				"VIVIMEDLAB,Vivimed Labs Limited,EQ,17-AUG-2005,2,1,INE526G01021,2\r\n" + 
				"VLSFINANCE,VLS Finance Limited,EQ,25-MAY-1995,10,1,INE709A01018,10\r\n" + 
				"VMART,V-Mart Retail Limited,EQ,20-FEB-2013,10,1,INE665J01013,10\r\n" + 
				"VOLTAMP,Voltamp Transformers Limited,EQ,20-SEP-2006,10,1,INE540H01012,10\r\n" + 
				"VOLTAMP,Voltamp Transformers Limited,IL,20-SEP-2006,10,1,INE540H01012,10\r\n" + 
				"VOLTAS,Voltas Limited,EQ,12-APR-1995,1,1,INE226A01021,1\r\n" + 
				"VRLLOG,VRL Logistics Limited,EQ,30-APR-2015,10,1,INE366I01010,10\r\n" + 
				"VSSL,Vardhman Special Steels Limited,EQ,17-MAY-2012,10,1,INE050M01012,10\r\n" + 
				"VSTIND,VST Industries Limited,EQ,05-SEP-2003,10,1,INE710A01016,10\r\n" + 
				"VSTTILLERS,V.S.T Tillers Tractors Limited,EQ,20-JUN-2011,10,1,INE764D01017,10\r\n" + 
				"VTL,Vardhman Textiles Limited,EQ,14-JAN-2003,10,1,INE825A01012,10\r\n" + 
				"WABAG,VA Tech Wabag Limited,EQ,13-OCT-2010,2,1,INE956G01038,2\r\n" + 
				"WABCOINDIA,WABCO India Limited,EQ,01-OCT-2008,5,1,INE342J01019,5\r\n" + 
				"WALCHANNAG,Walchandnagar Industries Limited,EQ,18-SEP-1996,2,1,INE711A01022,2\r\n" + 
				"WANBURY,Wanbury Limited,BE,29-JAN-2007,10,1,INE107F01022,10\r\n" + 
				"WEBELSOLAR,Websol Energy System Limited,EQ,15-MAY-2007,10,1,INE855C01015,10\r\n" + 
				"WEIZFOREX,Weizmann Forex Limited,EQ,28-JUN-2011,10,1,INE726L01019,10\r\n" + 
				"WEIZMANIND,Weizmann Limited,EQ,10-MAY-1995,10,1,INE080A01014,10\r\n" + 
				"WELCORP,Welspun Corp Limited,EQ,24-MAY-2005,5,1,INE191B01025,5\r\n" + 
				"WELENT,Welspun Enterprises Limited,EQ,04-NOV-2004,10,1,INE625G01013,10\r\n" + 
				"WELINV,Welspun Investments and Commercials Limited,EQ,20-SEP-2010,10,1,INE389K01018,10\r\n" + 
				"WELSPUNIND,Welspun India Limited,EQ,04-DEC-2003,1,1,INE192B01031,1\r\n" + 
				"WENDT,Wendt (India) Limited,EQ,07-AUG-2006,10,1,INE274C01019,10\r\n" + 
				"WHEELS,Wheels India Limited,EQ,07-APR-2000,10,1,INE715A01015,10\r\n" + 
				"WHIRLPOOL,Whirlpool of India Limited,EQ,06-APR-2010,10,1,INE716A01013,10\r\n" + 
				"WILLAMAGOR,Williamson Magor & Company Limited,BE,08-FEB-1995,10,1,INE210A01017,10\r\n" + 
				"WINDMACHIN,Windsor Machines Limited,EQ,17-AUG-2011,2,1,INE052A01021,2\r\n" + 
				"WINSOME,Winsome Yarns Limited,BE,25-AUG-2011,10,1,INE784B01035,10\r\n" + 
				"WIPL,The Western India Plywoods Limited,BE,17-APR-2017,10,1,INE215F01023,10\r\n" + 
				"WIPRO,Wipro Limited,EQ,08-NOV-1995,2,1,INE075A01022,2\r\n" + 
				"WOCKPHARMA,Wockhardt Limited,EQ,23-FEB-2000,5,1,INE049B01025,5\r\n" + 
				"WONDERLA,Wonderla Holidays Limited,EQ,09-MAY-2014,10,1,INE066O01014,10\r\n" + 
				"WSI,W S Industries (I) Limited,EQ,01-AUG-2007,10,1,INE100D01014,10\r\n" + 
				"WSTCSTPAPR,West Coast Paper Mills Limited,EQ,17-JAN-2001,2,1,INE976A01021,2\r\n" + 
				"XCHANGING,Xchanging Solutions Limited,EQ,09-MAR-2005,10,1,INE692G01013,10\r\n" + 
				"XLENERGY,XL Energy Limited,BE,28-DEC-2006,10,1,INE183H01011,10\r\n" + 
				"XPROINDIA,Xpro India Limited,EQ,27-APR-2004,10,1,INE445C01015,10\r\n" + 
				"YESBANK,Yes Bank Limited,EQ,12-JUL-2005,2,1,INE528G01027,2\r\n" + 
				"ZANDUREALT,Zandu Realty Limited,EQ,03-FEB-1999,100,1,INE719A01017,100\r\n" + 
				"ZEEL,Zee Entertainment Enterprises Limited,EQ,09-SEP-1998,1,1,INE256A01028,1\r\n" + 
				"ZEELEARN,Zee Learn Limited,EQ,20-DEC-2010,1,1,INE565L01011,1\r\n" + 
				"ZEEMEDIA,Zee Media Corporation Limited,EQ,10-JAN-2007,1,1,INE966H01019,1\r\n" + 
				"ZENITHBIR,Zenith Birla (India) Limited,BE,30-APR-2007,10,1,INE318D01020,10\r\n" + 
				"ZENITHEXPO,Zenith Exports Limited,EQ,10-JUL-1996,10,1,INE058B01018,10\r\n" + 
				"ZENSARTECH,Zensar Technologies Limited,EQ,09-JUL-2003,10,1,INE520A01019,10\r\n" + 
				"ZENTEC,Zen Technologies Limited,EQ,30-MAR-2015,1,1,INE251B01027,1\r\n" + 
				"ZICOM,Zicom Electronic Security Systems Limited,EQ,18-APR-2006,10,1,INE871B01014,10\r\n" + 
				"ZODIACLOTH,Zodiac Clothing Company Limited,EQ,27-SEP-1995,10,1,INE206B01013,10\r\n" + 
				"ZODJRDMKJ,Zodiac JRD- MKJ Limited,EQ,19-JUL-1995,10,1,INE077B01018,10\r\n" + 
				"ZUARI,Zuari Agro Chemicals Limited,EQ,27-NOV-2012,10,1,INE840M01016,10\r\n" + 
				"ZUARIGLOB,Zuari Global Limited,EQ,12-APR-1995,10,1,INE217A01012,10\r\n" + 
				"ZYDUSWELL,Zydus Wellness Limited,EQ,13-NOV-2009,10,1,INE768C01010,10\r\n" + 
				"ZYLOG,Zylog Systems Limited,BE,17-AUG-2007,5,1,INE225I01026,5\r\n" 				;
		
		List<Security> lstSecurities = new ArrayList<>();
		String [] arrSec = resp.split("\n");
		for(int i=1 ;i<arrSec.length ; i++) { // ignore first line as its column name
			Security s = new Security();
			String [] fields = arrSec[i].split(",");
			s.setSymbol(StringUtils.trimToEmpty(fields[0]));
			s.setNameOfCompany(StringUtils.trimToEmpty(fields[1]));
			s.setSeries(StringUtils.trimToEmpty(fields[2]));
			
			try {
				//StringBuilder excpetionAt = new StringBuilder();
				//excpetionAt.append("setDateOfListing");
			s.setDateOfListing(Util.getLocalDate(StringUtils.trimToEmpty(fields[3]), Constants.NSE_EQ_OHLC_DATE_FORMAT));
			s.setPaidUpValue(Float.parseFloat(StringUtils.trimToEmpty(fields[4])));
			s.setMarketLot(Integer.parseInt(StringUtils.trimToEmpty(fields[5])));
			s.setFaceValue(Integer.parseInt(StringUtils.trimToEmpty(fields[7])));		
			//excpetionAt.no("setDateOfListing");			
			}catch(Exception e) {
				System.out.println("Exception while parsing ");
				e.printStackTrace();
				System.exit(0);
			}
			s.setIsinNumber(StringUtils.trimToEmpty(fields[6]));
			// add each security to list
			lstSecurities.add(s);
			
		}
		
		System.out.println(lstSecurities.size());
		lstSecurities.forEach(p->System.out.println(p));
		//return lstSecurities;
		
		*/
		
		Map<String,String> keyValuepair = new HashMap<String,String>();
		keyValuepair.put(Constants.$URL_NAME$, "NSE_STOCK_QUOTE_URL");
		keyValuepair.put(Constants.$SCRIP_SYMBOL$, "SCHAEFFLER");
		
		//System.out.println(LocalDate.now().week());
		
		/*System.out.println("#############start");
		NseStockQuoteExtractorImpl e = new NseStockQuoteExtractorImpl();
		e.getStockQuote(keyValuepair);
		System.out.println("#############END");*/
	}

}
