# Programming –opdracht Methode parameters 1 - Getallen raden

Je gaat een spelletje programmeren: Getallen raden. Voor deze opdracht heb je alle stof nodig die je tijdens dit blok hebt geleerd. Lees voordat je begint de gehele opdracht goed door.

## Beschrijving
De te programmeren applicatie genereert drie verschillende random gehele getallen tussen 1 en 10¹. De gebruiker kan vervolgens herhaaldelijk raden welke getallen dit zijn. Bij elke poging geeft de applicatie terug hoeveel getallen de gebruiker correct heeft geraden. Heeft de gebruiker alle drie de getallen goed, dan geeft de applicatie terug hoeveel pogingen de gebruiker nodig had om de getallen te raden.

## Stappenplan
1. Schrijf een methode die een array van 3 verschillende random getallen tussen 1 en 10 genereert. Geef de methode als signatuur:
   ```
   public static int[] genereerGetallen()
   ```
2. Schrijf een methode met de volgende signatuur:
   ```
   public static boolean komtVoorIn(int mpZoekgetal, int[] mpLijst)
   ```
   Deze methode geeft true terug als het zoekgetal in de lijst voorkomt en false als het zoekgetal niet in de lijst voorkomt.

Nu je deze methodes af hebt, kun je beginnen met het schrijven van de main methode:

3. Maak een array van 3 verschillende random getallen met behulp van de methode genereerGetallen().

Stap 4 en 5 moeten herhaald worden totdat de gebruiker alle drie de getallen correct heeft geraden.

4. Vraag de gebruiker om drie verschillende gehele getallen tussen 1 en 10, gescheiden door een spatie. Lees deze getallen in. Je hoeft niet te controleren of de invoer van de gebruiker correct is.
5. Bepaal hoeveel getallen de gebruiker correct heeft geraden. Gebruik hierbij de methode komtVoorIn(). De volgorde waarin de gebruiker de getallen ingeeft is niet van belang. Druk het aantal correct geraden getallen af.

Nadat de gebruiker alle drie de getallen correct heeft volgen de laatste stappen:

6. Bepaal hoeveel pogingen de gebruiker nodig had om de 3 getallen te raden en druk dit af.
7. Druk de te raden getallen uit de array af.

## Tips
- Er zijn diverse manieren om te zorgen dat de drie getallen die de methode genereerGetallen() teruggeeft verschillend zijn. Een eenvoudige manier is om net zo lang drie getallen te genereren tot de getallen verschillend zijn. Een andere manier is om een array met daarin de nummers 1 tot en met 10 aan te maken, deze te shuffelen en vervolgens de eerste drie elementen van de array te gebruiken, zoals bij het voorbeeld Deck of Cards in § 7.4 in het boek.
- Het is wel zo netjes om de gegeneerde getallen in oplopende volgorde weer te geven. Hiervoor kun je de sort methode uit de Array klasse gebruiken (zie § 7.12 in het boek).

## Outputvoorbeeld
Voor de duidelijkheid zijn in het outputvoorbeeld op de volgende pagina de gegevens die de gebruiker heeft ingevoerd schuin en onderstreept. Jouw programma hoeft dus niets schuin en onderstreept af te drukken.

```
Geef 3 verschillende getallen tussen 1 en 10, gescheiden door spaties: 1 2 3
Aantal correcte getallen = 1
Geef 3 verschillende getallen tussen 1 en 10, gescheiden door spaties: 4 5 6
Aantal correcte getallen = 1
Geef 3 verschillende getallen tussen 1 en 10, gescheiden door spaties: 7 8 9
Aantal correcte getallen = 1
Geef 3 verschillende getallen tussen 1 en 10, gescheiden door spaties: 4 1 7
Aantal correcte getallen = 1
Geef 3 verschillende getallen tussen 1 en 10, gescheiden door spaties: 5 1 8
Aantal correcte getallen = 2
Geef 3 verschillende getallen tussen 1 en 10, gescheiden door spaties: 5 1 9
Aantal correcte getallen = 1
Geef 3 verschillende getallen tussen 1 en 10, gescheiden door spaties: 5 2 7
Aantal correcte getallen = 0
Geef 3 verschillende getallen tussen 1 en 10, gescheiden door spaties: 6 1 8
Aantal correcte getallen = 3
U heeft 8 keer geraden.
De te raden getallen waren: 1 6 8
```

## Richtlijnen bij coderen (zie ook MIW code conventions)
- Zorg dat je naam en het doel van het programma bovenin staan (ICC #1).
- Gebruik de juiste inspringing (indentation) bij de lay-out (ICC #2).
- Let op juist gebruik hoofdletters en kleine letters (ICC #3).
- Gebruik goede namen (ICC #4).
- Voeg waar nodig commentaar toe dat inzicht geeft in je code (ICC#7)

¹ In deze tekst wordt met tussen 1 en 10 bedoeld: inclusief de getallen 1 en 10.