# Uputstvo

## Servisi
Servis poverenika, servis organa vlasti i email servis mozete pokrenuti pomocu Maven-a ili importom svakog od projekata u razvojno okruzenje kao sto su
IntelliJ/Eclipse. Njihovi defaultni portovi su 8081(poverenik), 8082(organ vlasti), 8083(email). Ako zelite da promenite neki od portova, u svakom od servisa
se nalazi fajl application.properties na lokaciji src/main/resources u kojem se moze promeniti server.port na zeljeni port.

## Web aplikacije
Za pokretanje web aplikacija je pozeljno imati instaliran angular cli koji se moze skinuti komandom
```
npm install -g @angular/cli
```
nakon toga, iz direktorijuma web-apps je potrebno pokrenuti komandu
```
npm install
```
kako bi se skinuli potrebni paketi i nakon toga se pokrecu aplikacije komandama:
```
ng serve --project=commissioner --port=4201
ng serve --project=authority-body --port=4202
```
Pozeljno je pokrenuti aplikacije na ovim portovima jer neki linkovi iz jedne vode ka drugoj, kao i zbog CORS-a koji je u
servisima podesen da dopusta zahteve sa tih portova.


## Baze

### Docker
Ukoliko imate instaliran docker, baze se mogu vrlo lako pokrenuti uz pomoc dve komande iz root-a projekta.
```
docker build -t fuseki ./fuseki-image
```
kako bi se odradio build image-a za fuseki (potrebno jer je dodata mala konfiguracija nakon pokretanja originalnog image-a za fuseki koja ima bug vezan za persistiranje baze)
i zatim pokretanje svih kontejnera komandom
```
docker-compose up
```
Exist baze ce biti pokrenute na portovima 8091 za bazu poverenika i 8092 za bazu organa vlasti.
Fuseki baze ce biti pokrenute na portovima 3031 za bazu poverenika i 3032 za bazu organa vlasti. Kredencijali za fuseki baze su admin/admin za obe baze.

### Ne docker
Ukoliko ne zelite da koristite docker, baze mozete pokrenuti sami i podesiti kredencijale i portove uz pomoc exist.properties i fuseki.properties fajlova koji se u 
oba servisa nalaze u direktorijumu src/main/resources
