package com.example.freitag.data

class Datasource {

    fun loadTechnics(): List<Technik> {
        return listOf(
            Technik("PC",0,999.23,0),
            Technik("Zahnbürste",0,23.99,0),
            Technik("Raketen getriebenes Fahrradschloss",0,1943.88,0),
            Technik("Solar-Radkappen für Bobbycars",0,12.99,0),
            Technik("Akku Stacheldraht WLAN Verstärker",0,379.12,0),
            Technik("Magisches Dingens mit Strom",0,27.33,0)
        )
    }

    fun loadLifeWishes(): List<ForMyLife> {
        return listOf(
            ForMyLife("Lottogewinn",0,0.00,0),
            ForMyLife("Die richtige Frau",0,0.00,0),
            ForMyLife("Möglichkeit zum Zeitreisen",0,0.00,0),
            ForMyLife("Ein schnelles schmerzloses Ende",0,0.00,0),
            ForMyLife("Unsterblichkeit",0,0.00,0)
        )

    }

    fun loadWorldWishes(): List<RestOfTheWorld>{
        return listOf(
            RestOfTheWorld("Frieden auf Erden",0,0.00,0),
            RestOfTheWorld("Einen Kometen",0,0.00,0),
            RestOfTheWorld("Unerschöpfliche freie Energie",0,0.00,0),
            RestOfTheWorld("Erstkontakt mit Aliens (friedlich)",0,0.00,0),
            RestOfTheWorld("Erstkontakt mit Aliens (nicht so friedlich)",0,0.00,0),
            RestOfTheWorld("Technischer Durchbruch",0,0.00,0)
        )
    }
}
